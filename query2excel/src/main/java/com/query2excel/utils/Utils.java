package com.query2excel.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Utils {

	/**
	 * 
	 * @param dateFormat
	 * @param offsetByToday
	 * @return
	 */
	public static String getDayOfFormat(String dateFormat, int offsetByToday) {
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, offsetByToday);
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());
	}
	
	public static String getToday(String dFormat) {
		return getDayOfFormat(dFormat, 0);
	}
	
	public static String getYesterday(String dFormat) {
		return getDayOfFormat(dFormat, -1);
	}
	
	
	/**
	 * 처리대상이 되는 파일리스트를 반환한다.
	 * @param dirPath
	 * @param fileExtention
	 * @return
	 * @throws Exception
	 */
	public static List<File> getFileList(String dirPath, String fileExtention) throws Exception {
		
		File filePath = new File(dirPath);
		if(!filePath.exists()) 
			throw new Exception(dirPath + " is not exists!");
		
		File[] files = new File(dirPath).listFiles();
		List<File> fList = new ArrayList<File>();
		
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			
			String fileExt = f.getName().substring(f.getName().lastIndexOf(".") + 1);
			
			if(fileExt.equals(fileExtention)) 
				fList.add(files[i]);
			
		}
		return fList;
	}
	
	/**
	 * 파일존재여부를 체크한다.
	 * @param dirPath
	 * @param xmlFileName
	 * @return
	 * @throws FileNotFoundException
	 */
	public static File checkExistFile(String dirPath, String xmlFileName) throws FileNotFoundException {
		
		if(dirPath == null || "".equals(dirPath))
			dirPath = "";
		else if(!dirPath.endsWith("/"))
			dirPath += "/";
		
		File xmlFile = new File("query/" + dirPath + xmlFileName);
		
		if(!xmlFile.exists()) {
			System.out.println(xmlFile.getAbsolutePath() + " is not found!");
			throw new FileNotFoundException(xmlFile.getAbsolutePath() + " is not found!");
		}
		
		return xmlFile;
	}
	
	/**
	 * 배열값을 지정된 구분자를 적용한 문자열로 변환한다.
	 * @param subVars
	 * @param delimeter
	 * @return
	 */
	public static String convertArrayToString(Object[] subVars, String delimeter) {
		List<Object> vars = Arrays.asList(subVars);
		StringBuilder sb = new StringBuilder();
		
		int cnt = 0;
		for(Object object : vars) {
			
			if(cnt > 0)
				sb.append(delimeter);
			
			sb.append( ((String)object).trim());
			cnt++;
			
		}
		
		return sb.toString();
	}
	
	/**
	 * 객체의 null값 여부를 판단한다.
	 * @param object
	 * @return
	 */
	public static Object checkNull(Object object) {
		
		if(object == null)
			return "";
		
		return object;
	}
	
	
}
