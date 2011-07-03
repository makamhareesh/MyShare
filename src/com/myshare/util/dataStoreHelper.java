package com.myshare.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.myshare.vo.PersonVO;
import com.vaadin.ui.Form;

public class dataStoreHelper {
	
	public Boolean checkUser(String username, String password){
	    Boolean userExists = false ;
		Connection dbconn = getConnection();
		Statement stmt = null;
		String sql = "select * from USERS where login_id='"+username+"'	 and password='"+password+"'";
		try {
			
			 stmt = dbconn.createStatement();
		      ResultSet rs = stmt.executeQuery(sql);
		      
		      while (rs.next()) {
		        String fullName = rs.getString("name");
		        System.out.println(fullName);
		        if(fullName.length() != 0){
		        	userExists = true;
		           } 
		      	}
		      }
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return userExists;
		
		
	}
	
	public Boolean checkUser(String username){
	    Boolean userExists = false ;
		Connection dbconn = getConnection();
		Statement stmt = null;
		String sql = "select * from USERS where login_id='"+username;
		try {
			
			 stmt = dbconn.createStatement();
		      ResultSet rs = stmt.executeQuery(sql);
		      
		      while (rs.next()) {
		        String fullName = rs.getString("name");
		        System.out.println(fullName);
		        if(fullName.length() != 0){
		        	userExists = true;
		           } 
		      	}
		      }
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return userExists;
		
		
	}
	
	public Boolean addUser(Form personForm){
		
		Boolean userAdded = false;
		
		
		
		
		return userAdded;
		
		
	}
	

	
	public Connection getConnection(){
		
		Connection connection = null;
		try {
		    // Load the JDBC driver
		    String driverName = "oracle.jdbc.driver.OracleDriver";
		    Class.forName(driverName);

		    // Create a connection to the database
		    String serverName = "localhost";
		    String portNumber = "1521";
		    String sid = "xe";
		    String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber+":"+sid;
		    String username = "myshare";
		    String password = "myshare";
		    connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();// Could not find the database driver
		} catch (SQLException e) {
			e.printStackTrace();// Could not connect to the database
		}
		
		return connection;
	}
}
