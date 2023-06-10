package com.jsp.jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

     class TestConnection{

	public static void main(String[] args) 
	{
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url=("jdbc:mysql://localhost:3306/wakanda");
		String user="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,user,password);
		Statement st=connection.createStatement();
		String quary="INSERT into coustmer(id,name,email,age,address)"+"VALUES(2,'siva','siva@123',23,'Nellore')";
		boolean res=st.execute(quary);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	

}
}
