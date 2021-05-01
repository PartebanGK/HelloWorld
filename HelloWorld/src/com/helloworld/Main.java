package com.helloworld;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		try 
		{
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hello","root","Admin@2021");  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from name");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
