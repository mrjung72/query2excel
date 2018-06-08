package com.query2excel.utils;

import org.apache.log4j.Logger;

import com.query2excel.jaxb.ExcelFile;

public class ValidateProperties {
	
	private ExcelFile EXCEL_FILE;
	
	protected final String DEFAULT_ENCODING_TYPE = "UTF-8";
	Logger log = Logger.getLogger(getClass().getName());
	
	public ValidateProperties(ExcelFile excelFile) {
		EXCEL_FILE = excelFile;
	}
	
	

}
