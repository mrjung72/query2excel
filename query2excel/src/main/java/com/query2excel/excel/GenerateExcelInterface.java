package com.query2excel.excel;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sql.rowset.CachedRowSet;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.query2excel.jaxb.ExcelSheet;

public interface GenerateExcelInterface {
	
	void openExcel() throws IOException, InvalidFormatException;
	void openSheet() throws FileNotFoundException;
	void closeSheet() throws IOException;
	void closeExcel() throws IOException;
	
	void appendData(CachedRowSet selectDataset, boolean isWriteTitle) throws Exception;
	
	void setExcelSheet(ExcelSheet excelSheet);
	
	void validateExcelFileProperties() throws FileNotFoundException;
}
