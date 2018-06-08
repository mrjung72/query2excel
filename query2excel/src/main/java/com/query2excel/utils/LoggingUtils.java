package com.query2excel.utils;

import java.util.StringTokenizer;

import org.apache.log4j.Logger;

public class LoggingUtils {
	
	Logger log = Logger.getLogger(getClass().getName());
	
	public void printWorkStep(String loggingTitle, String loggingContent,
			String prefixStr, boolean isUpperLine, boolean isBottomLine,
			String upperLineChar, String bottomLineChar) {
		
		int lineLength = getMaxLength(loggingContent);
		
		if(isUpperLine) {
			if(loggingTitle != null)
				log.info(getLineString(upperLineChar, (lineLength - loggingTitle.length())/2 - 1)
						+ " " + loggingTitle + " "
						+ getLineString(upperLineChar, (lineLength - loggingTitle.length())/2 - 1));
			else
				log.info(getLineString(upperLineChar, lineLength));
		}
		
		StringTokenizer st = new StringTokenizer(loggingContent, "\n");
		while (st.hasMoreElements()) {
			log.info(prefixStr + st.nextElement());
		}
		
		if(isBottomLine)
			log.info(getLineString(bottomLineChar, lineLength));
	}
	
	
	public void printWorkStep(String loggingValue, boolean isPrintLine, String lineChar) {
		printWorkStep(null, loggingValue, "", isPrintLine, isPrintLine, lineChar, lineChar);
	}
	

	public void printWorkStep(String loggingValue, boolean isUpperLine, boolean isBottomLine, String lineChar) {
		printWorkStep(null, loggingValue, "", isUpperLine, isBottomLine, lineChar, lineChar);
	}
	
	public static int getMaxLength(String loggingValue) {
		int len = 0;
		int tempLen = 0;
		
		StringTokenizer st = new StringTokenizer(loggingValue, "\n");
		while (st.hasMoreElements()) {
			tempLen = ((String) st.nextElement()).length();
			
			if(tempLen > len)
				len = tempLen;
			
		}
		
		return len;
	}
	
	public static String getLineString(String upperLineChar, int count) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(upperLineChar);
		}
		return sb.toString();
	}
	
	private static LoggingUtils getInstant() {
		return new LoggingUtils();
	}
	
	public static void printWarningMessage(String warnMsg) {
		LoggingUtils.getInstant().printWorkStep("Warning", warnMsg,  "", true, true, ">", "<");
	}
	
	public static void printInfoMessage(String infoMsg) {
		LoggingUtils.getInstant().printWorkStep("Infomation", infoMsg,  "", true, true, ">", "<");
	}
	
	public static void openExcelComment(String excelFilePath) {
		LoggingUtils.getInstant().printWorkStep(
				String.format("Create Excel [%s] Start!", excelFilePath), true, true, "=");
	}

	public static void openSheetComment(String sheetName) {
		LoggingUtils.getInstant().printWorkStep(
				String.format("Sheet [%s] is creating ...", sheetName), true, true, "--");
	}

	public static void closeSheetComment(String sheetName) {
		LoggingUtils.getInstant().printWorkStep(
				String.format("Sheet [%s] was created!", sheetName), false, false, "--");
	}

	public static void closeExcelComment(String excelFilePath) {
		LoggingUtils.getInstant().printWorkStep(
				String.format("Excel [%s] was created!", excelFilePath), false, true, "=");
	}
	
	public static void printWorkStepForLevel1st(String processComment) {
		
		LoggingUtils.getInstant().printWorkStep(processComment, true, true, "==");
	}
	
	
	public static void printWorkStepForLevel2st(String processComment) {
		
		LoggingUtils.getInstant().printWorkStep(processComment, true, true, "==");
	}
}
