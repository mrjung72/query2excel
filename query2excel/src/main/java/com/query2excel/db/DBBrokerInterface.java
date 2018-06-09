package com.query2excel.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;

public interface DBBrokerInterface {
	
	CachedRowSet executeQuery(Connection conn, Object[] bindValues, String sqlQuery) throws SQLException;
	
	CachedRowSet explainPlan(Connection conn, String sqlQuery) throws SQLException;
	
	String deleteLastSemiColonOfSql(String query) throws SQLException;
	
	CachedRowSet executeQuery(Connection conn, String sqlStr) throws SQLException;

}
