package com.ust.ioc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection implements Connection {
	private String url;
	private String dbUsername;
	private String dbPassword;
	
public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

public  dbConnection getConnection() {
	try {
	 java.sql.Connection con=DriverManager.getConnection(url,dbUsername,dbPassword);
			 System.out.println("connected to mysql");
	}catch(SQLException e) {
		e.printStackTrace();
	}
	System.out.println("get connection called");
	return new dbConnection();

}
}
