package com.david.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfig {
	private static final String URL = "jdbc:mysql://localhost:3306/springdata?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&useSSL=false";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USER = "david";
	private static final String PSW = "123456";

	public static Connection getConnection() throws Exception {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, USER, PSW);
	}

	public static void main(String[] args) throws Exception {
	}
}
