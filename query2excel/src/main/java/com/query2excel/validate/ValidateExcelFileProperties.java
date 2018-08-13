package com.query2excel.validate;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.query2excel.exception.Q2eFileNotFoundException;
import com.query2excel.jaxb.ExcelFile;
import com.query2excel.utils.LoggingUtils;
import com.query2excel.utils.Utils;

public class ValidateExcelFileProperties {
	
	private ExcelFile EXCEL_FILE;
	
	protected final String DEFAULT_ENCODING_TYPE = "UTF-8";
	Logger log = Logger.getLogger(getClass().getName());
	
	public ValidateExcelFileProperties(ExcelFile excelFile) {
		EXCEL_FILE = excelFile;
	}
	
	/**
	 * validation result file path create if directory path is not exists.
	 */
	public void validationResultFilePath() {
		setDateValueToResultFilePath();
		
		EXCEL_FILE.setResultExcelPath(convertDirectoryDelimeter(EXCEL_FILE.getResultExcelPath(), true));
		
		String dirPath = EXCEL_FILE.getResultExcelPath().substring(0, EXCEL_FILE.getResultExcelPath().lastIndexOf("/"));
		
		createDirectoryIfNotExist(dirPath, true);
	}
	
	public boolean validationTempletExcelFilePath() throws Q2eFileNotFoundException {
		
		if(EXCEL_FILE.getTempletExcelPath() == null
				|| "".equals(EXCEL_FILE.getTempletExcelPath()))
			return false;
		
		EXCEL_FILE.setTempletExcelPath(convertDirectoryDelimeter(EXCEL_FILE.getTempletExcelPath(), true));
		
		File f = new File(EXCEL_FILE.getTempletExcelPath());
		if(!f.exists()) {
			throw new Q2eFileNotFoundException(String.format("Invalid templet excel file path! [%s]", EXCEL_FILE.getTempletExcelPath()));
		}
		
		return true;
		
	}
	
	

	private void createDirectoryIfNotExist(String dirPath, boolean isLogging) {
		
		File f = new File(dirPath);
		
		if(!f.exists()) {
			if(!isLogging)
				LoggingUtils.printWarningMessage(String.format(
						"Not exist directory [%s]\nCreating Directory [%s]...", dirPath, dirPath));
			
			createDirectory(dirPath);
		}
		
	}

	
	
	/**
	 * create specified directory path recusively
	 * @param dirPath
	 */
	public void createDirectory(String dirPath) {
		File f = new File(dirPath);
		if(!f.exists())
			createDirectory(dirPath.substring(0, dirPath.lastIndexOf("/")));
		f.mkdir();
	}
	

	/**
	 * apply Date value to result excel file path
	 */
	public void setDateValueToResultFilePath() {
		Pattern pattern = Pattern.compile("\\{[a-zA-Z-]{1,30}\\}");
		Matcher match = pattern.matcher(EXCEL_FILE.getResultExcelPath());
		
		StringBuffer sb = new StringBuffer();
		String dateFormat = "";
		while (match.find()) {
			
			dateFormat = match.group().replaceAll("[{}]", "");
			match.appendReplacement(sb, Utils.getDayOfFormat(dateFormat, 0));
		}
		match.appendTail(sb);
		
		EXCEL_FILE.setResultExcelPath(sb.toString());
	}
	
	

	private String convertDirectoryDelimeter(String dirPath, boolean isLogging) {
		
		if(dirPath.indexOf("\\") > 0) {
			String convertedPath = dirPath.replace('\\', '/');
			
			if(isLogging)
				LoggingUtils.printInfoMessage(
						String.format("[%s] \nDirectory path has '\\' character \nConvert to [%s]", dirPath, convertedPath));
			
			return convertedPath;
		}
		return dirPath;
	}
	
	
	/**
	 * set default encoding type if specified value not exists
	 */
	public void setDefaultEncodingType() {
		
		if(EXCEL_FILE.getEncodingType() == null
				|| "".equals(EXCEL_FILE.getEncodingType()))
			EXCEL_FILE.setEncodingType(DEFAULT_ENCODING_TYPE);
	}
	
	public ExcelFile getExcelFile() {
		return EXCEL_FILE;
	}

}
