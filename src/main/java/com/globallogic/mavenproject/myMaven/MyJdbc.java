package com.globallogic.mavenproject.myMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/FirstDb";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();

//
			//delete query starts
			String deleteQuery="delete from mytable where roll=42";
			st.executeUpdate(deleteQuery);
			System.out.println("execute");
			
//			String insertQuery="insert into mytable values ('sharma',45)";
//			st.execute(insertQuery);

//
//			// Select using executeQuery
//						String query = "select * from employee";
//
//						ResultSet rs = st.executeQuery(query);
//			while(rs.next())
//			{
//				//rs.getint() 
//				    //pass the index 
//				    //pass the columnname
//				System.out.println("id : "+" "+rs.getInt("id") +" name : "+rs.getString(2) +" fname :  "+rs.getString(3) +" salary : "+rs.getInt(4));
//
//			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
