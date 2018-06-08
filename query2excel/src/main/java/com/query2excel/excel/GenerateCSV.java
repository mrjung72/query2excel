package com.query2excel.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import javax.sql.rowset.CachedRowSet;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/** 
 * Create CSV file
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
	public void openExcel() throws IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openSheet() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeSheet() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeExcel() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appendData(CachedRowSet selectDataset, boolean isWriteTitle) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setExcelSheet(ExcelSheet excelSheet) {   
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateExcelFileProperties() throws FileNotFoundException {
		 
		ValidateExcelFileProperties validProp = new ValidateExcelFileProperties(EXCEL_FILE);
		
		
	}

}
