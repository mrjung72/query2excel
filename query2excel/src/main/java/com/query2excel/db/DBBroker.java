package com.query2excel.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import org.apache.log4j.Logger;

public class DBBroker implements DBBrokerInterface {
	
	Logger log = Logger.getLogger(getClass().getName());
	

	public CachedRowSet executeQuery(Connection conn, Object[] bindValues, String sqlQuery) throws SQLException {
		
		if(bindValues == null)
			return executeQuery(conn, sqlQuery);
		
		PreparedStatement pstmt = conn.prepareStatement(deleteLastSemiColonOfSql(sqlQuery));
		pstmt.clearParameters();
		
		for (int i = 0; i < bindValues.length; i++) {
			pstmt.setObject(i+1, bindValues[i]);
		}
		
		ResultSet rs = pstmt.executeQuery();
		
//		JDBC드라이버에서 CachedRowSetImpl 클래스를 찾을수 없어서 RowSetProvider 클래스로 대체함.(2018.6.9)
//		CachedRowSet rowset = new CachedRowSetImpl();
		RowSetFactory factory = RowSetProvider.newFactory();
		CachedRowSet rowset = factory.createCachedRowSet();
		rowset.populate(rs);
		rs.close();
		pstmt.close();
		
		return rowset;
	}

	public CachedRowSet explainPlan(Connection conn, String sqlQuery) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * delete if semicolon exist in end of sql
	 * 
	 */
	public String deleteLastSemiColonOfSql(String query) throws SQLException {
		
		String tmpQuery = query.trim();
		
		if(tmpQuery == null || "".equals(tmpQuery))
			throw new SQLException("SQL query is null!");
		
		if(tmpQuery.lastIndexOf(";") == tmpQuery.length()-1) 
			return deleteLastSemiColonOfSql(tmpQuery.substring(0, tmpQuery.length()-1));

		return tmpQuery;
	}
	
	

	public CachedRowSet executeQuery(Connection conn, String sqlStr) throws SQLException {
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(deleteLastSemiColonOfSql(sqlStr));
		
//		JDBC드라이버에서 CachedRowSetImpl 클래스를 찾을수 없어서 RowSetProvider 클래스로 대체함.(2018.6.9)
//		CachedRowSet rowset = new CachedRowSetImpl();
		RowSetFactory factory = RowSetProvider.newFactory();
		CachedRowSet rowset = factory.createCachedRowSet();
		rowset.populate(rs);
		rs.close();
		stmt.close();
		
		return rowset;
	}

}
