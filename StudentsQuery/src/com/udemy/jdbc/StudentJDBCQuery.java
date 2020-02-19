package com.udemy.jdbc;

import java.sql.*;

public class StudentJDBCQuery {
	
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost/udemy";
	
	private static final String USER = "andre";
	
	private static final String PASSWORD = "loganzack";
	
	public void readDatabase() throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

		Statement statement = connection.createStatement();

		String sqlCommand = "SELECT * FROM students";
		ResultSet resultSet = statement.executeQuery(sqlCommand);

		while (resultSet.next())
		{
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");

			Student student = new Student(id, name, age);

			System.out.println(student);
		}

		resultSet.close();
		statement.close();
		connection.close();
	}

}
