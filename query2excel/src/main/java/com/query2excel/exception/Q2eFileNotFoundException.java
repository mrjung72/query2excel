package com.query2excel.exception;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;

public class Q2eFileNotFoundException  extends FileNotFoundException {
	
	Logger log = Logger.getLogger(getClass().getName());

	public Q2eFileNotFoundException(String errMsg) {
		super(errMsg);
		log.error("", new FileNotFoundException(errMsg));
	}
}
