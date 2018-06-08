package com.query2excel.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Object values logging class
 * @author sahara
 * @since 2018.6.3
 */
public class LoggingObjectValue {
	
	private String JAXB_PACKAGE_NAME;
	Logger log = Logger.getLogger(getClass().getName());
	
	public LoggingObjectValue(String topPackageName) {
		JAXB_PACKAGE_NAME = topPackageName;
	}
	
	/**
	 * 최상위 카테고리에 대한 하위 정의값을 로깅한다.
	 */
	public void loggingByCategory(List<?> objList, int depthLevel, String title) throws ClassNotFoundException {
		
		if(objList == null)
			return;
		
		for (Iterator<?> iter = objList.iterator(); iter.hasNext();) {
			Object obj = (Object) iter.next();
			LoggingFileValue(obj, depthLevel, title);
			
		}
	}
	
	/**
	 * 제목을 출력한다.
	 */
	public void loggingTitle(String title) throws ClassNotFoundException {
		this.log.debug("");
		this.log.debug("----------------------------------------------------");
		this.log.debug(title);
		this.log.debug("----------------------------------------------------");
		
	}
	
	/**
	 * 지정된 object에 포함된 값을 화면에 출력한다.
	 * @throws ClassNotFoundException 
	 */
	private void LoggingFileValue(Object obj, int depthLevel, String title) throws ClassNotFoundException {
		
		if(obj == null)
			return;
		
		if(title != null && title != "")
			loggingTitle(title);
		
		Method[] methods = obj.getClass().getMethods();
		
		for (int i = 0; i < methods.length; i++) {
			
			if(methods[i].getName().startsWith("get")
				&& !methods[i].getName().equals("getClass")) {
					
				String itemName = methods[i].getName().substring(3);
				
				whenGetMethod(obj, depthLevel, title, methods[i], itemName);
					
				}
		}
		
	}

	/**
	 * GET메소드를 호출하여 객체속성을 로깅하거나 재귀 호출한다.
	 * @param obj
	 * @param depthLevel
	 * @param title
	 * @param method
	 * @param itemName
	 */
	private void whenGetMethod(Object obj, int depthLevel, String title, Method method, String itemName) {
		
		String printTitle = title + "\t>\t" + itemName;
		if(title == null || title == "")
			printTitle = " " + itemName;
		
		try {
			
			if(method.getReturnType().getName().startsWith(JAXB_PACKAGE_NAME)) {
				this.log.debug(itemName + "=" + method.invoke(obj));
				LoggingFileValue(method.invoke(obj), depthLevel++, printTitle);
				
			}
			else if (method.getReturnType().getName().equals("java.util.List"))
				loggingByCategory((List<?>)method.invoke(obj), depthLevel++, printTitle);
			else
				this.log.debug(itemName + "=" + method.invoke(obj)); 
					
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		} catch(InvocationTargetException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	

}
