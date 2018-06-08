package com.query2excel.exception;

import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Q2eSQLException extends SQLException {
	
	Logger log = Logger.getLogger(getClass().getName());

	public Q2eSQLException(String errMsg) {
		super(errMsg);
		log.error("", new Q2eSQLException(errMsg));
	}


}
