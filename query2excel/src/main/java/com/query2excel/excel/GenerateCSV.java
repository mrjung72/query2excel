package com.query2excel.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.rowset.CachedRowSet;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.query2excel.jaxb.ExcelFile;
import com.query2excel.jaxb.ExcelSheet;
import com.query2excel.utils.LoggingUtils;
import com.query2excel.utils.Utils;
import com.query2excel.validate.ValidateExcelFileProperties;

/** 
 * Create CSV file
 *  @author sahara
 *  @since 2014.9.12
*/
public class GenerateCSV implements GenerateExcelInterface {
	
	final String SEPERATE_DELIMETER = ",";
	final String DEFAULT_ENCODING_TYPE = "UTF-8";
	
	Logger log = Logger.getLogger(getClass().getName());
	
	private ExcelFile EXCEL_FILE;
	private ExcelSheet EXCEL_SHEET;
	private int ROW_NUM=0;
	
	FileOutputStream fos;
	
	private String RESULT_FILE_PATH;
	
	public GenerateCSV(ExcelFile excelFile) throws FileNotFoundException {
		EXCEL_FILE = excelFile;
	}
	
	@Override
	public void validateExcelFileProperties() throws FileNotFoundException {
		
		ValidateExcelFileProperties validProp = new ValidateExcelFileProperties(this.EXCEL_FILE);
		validProp.setDefaultEncodingType();
		validProp.validationResultFilePath();
		
	}


	/**
	 * apply sheet name to result excel filename
	 * @param resultExcelPath
	 * @return
	 */
	public String applySheetName(String resultExcelPath) {
		
		int extPos = resultExcelPath.lastIndexOf(".");
		
		String fileName = resultExcelPath.substring(0, extPos);
		String extStr = resultExcelPath.substring(extPos);
		
		String filePath = fileName + "_" + EXCEL_SHEET.getSheetName() + extStr;
		
		return filePath;
	}
	
	
	/**
	 * 데이터 1행을 반환한다.
	 * @param rowSet
	 * @param meta
	 * @return
	 * @throws SQLException
	 */
	public StringBuilder getDataRow(CachedRowSet rowSet, 
			ResultSetMetaData meta) throws SQLException {
		StringBuilder sb = new StringBuilder();
		
		for (int colNum = 1; colNum < meta.getColumnCount(); colNum++) {
			if(colNum == 1)
				sb.append(Utils.checkNull(rowSet.getObject(colNum)));
			else
				sb.append(SEPERATE_DELIMETER + Utils.checkNull(rowSet.getObject(colNum)));
		}
		sb.append("\n");
		
		return sb;
	}
	
	
	/**
	 * 타이틀 행을 반환한다.
	 * @param meta
	 * @return
	 * @throws SQLException
	 */
	public StringBuilder getTitleRow(ResultSetMetaData meta) throws SQLException {
		
		StringBuilder sb = new StringBuilder();
		
		for (int colNum = 1; colNum < meta.getColumnCount(); colNum++) {
			if(colNum == 1)
				sb.append(meta.getCatalogName(colNum));
			else
				sb.append(SEPERATE_DELIMETER + meta.getColumnName(colNum));
		}
		sb.append("\n");
		
		return sb;
	}


	@Override
	public void openExcel() throws IOException, InvalidFormatException {
		LoggingUtils.openExcelComment(EXCEL_FILE.getResultExcelPath());
	}
	

	@Override
	public void openSheet() throws FileNotFoundException {
		
		LoggingUtils.openSheetComment(EXCEL_SHEET.getSheetName());
		setCursorToFirstRowOfExcelSheet();
		this.RESULT_FILE_PATH = applySheetName(this.EXCEL_FILE.getResultExcelPath());
		fos = new FileOutputStream(RESULT_FILE_PATH);
	}


	@Override
	public void closeSheet() throws IOException {
		
		LoggingUtils.closeSheetComment(this.RESULT_FILE_PATH);
		
		fos.flush();
		fos.close();
	}


	/**
	 * 데이터셋의 첫행으로 커서를 되돌린다.
	 * @param selectDataSet
	 * @throws SQLException
	 */
	public void setCursorToFirstRowOfResultSet(CachedRowSet selectDataSet) throws SQLException {
		
		selectDataSet.last();
		log.info(String.format("\t==> %d rows selected! (Total %d rows )", 
				selectDataSet.getRow(), 
				this.ROW_NUM + selectDataSet.getRow()));
		selectDataSet.first();
	}


	public void setCursorToFirstRowOfExcelSheet() {
		ROW_NUM = 0;
	}
	

	@Override
	public void closeExcel() throws IOException {
		
		LoggingUtils.closeExcelComment(this.EXCEL_FILE.getResultExcelPath());
	}
	

	@Override
	public void appendData(CachedRowSet selectDataSet, boolean isWriteTitle) throws Exception {
		
		setCursorToFirstRowOfResultSet(selectDataSet);
		
		ResultSetMetaData meta = selectDataSet.getMetaData();
		
		if(isWriteTitle) {
			fos.write(getTitleRow(meta).toString().getBytes( this.EXCEL_FILE.getEncodingType()));
			ROW_NUM++;
		}
		
		while(selectDataSet.next()) {
			fos.write(getDataRow(selectDataSet, meta).toString().getBytes(this.EXCEL_FILE.getEncodingType()));
			ROW_NUM++;
		}
		fos.flush();
	}
	
	

	public void setExcelSheet(ExcelSheet excelSheet) {   
		this.EXCEL_SHEET = excelSheet;
		
	}


}
