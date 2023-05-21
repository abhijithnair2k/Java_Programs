package org.jsp.Demoapp;

import java.sql.*;


public class SaveAReacord {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt= null;
		String qry="insert into db.student values(4t ,'Ajith','app Support')";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=admin");
			stmt=con.createStatement();
			stmt.executeUpdate(qry);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(con!=null) {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} 
		}
		
	}

}
