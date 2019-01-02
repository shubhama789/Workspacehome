package com.capgemini.movie.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.capgemini.movie.exception.MovieException;


public class DBConnection {
	
	private static Properties properties= new Properties();
	private static Connection connection;

	public static Connection getConnection() throws MovieException{
		
		try {
			/*InputStream inputStream =new FileInputStream("resources/jdbc.properties");
			properties.load(inputStream);
			String url=properties.getProperty("dburl");
			String user=properties.getProperty("username");
			String password=properties.getProperty("password");
			inputStream.close();*/
			
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcacle", "sai", "sai");
			
		
		} catch (SQLException e) {
			throw new MovieException("Database connection problem.");
		}
		/* catch (FileNotFoundException e2) {
		throw new AssetException("Could not Find properties file to connect to database.");
	} catch (IOException e) {
		throw new AssetException("Could not read the database details from properties file.");*/
		return connection;
	
	}

} 
