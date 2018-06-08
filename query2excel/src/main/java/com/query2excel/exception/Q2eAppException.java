package com.query2excel.exception;

import org.apache.log4j.Logger;

/**
 * 
 * @author sahara
 *
 */
public class Q2eAppException extends Exception {
	
	Logger log = Logger.getLogger(getClass().getName());
	
	public Q2eAppException(String errMsg) {
		
		super(errMsg);
		log.error("", new Exception(errMsg));
	}
	
}
