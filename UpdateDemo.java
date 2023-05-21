package org.jsp.updateApp;
import java.sql.*;
public class UpdateDemo{
	public static void main(String[] args) {
				Connection con=null;
				Statement stmt=null;
				String qry="Update btm.student set name='Anu' where id=3";
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver class loaded and registered");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
					System.out.println("Connection established with the database server");
					stmt=con.createStatement();
					System.out.println("Statement created");
					stmt.executeUpdate(qry);
					System.out.println("Record updated");
				} 
				catch (ClassNotFoundException | SQLException e) 
				{
					e.printStackTrace();
				}
				finally 
				{
					if(stmt!=null) 
					{
						try 
						{
							stmt.close();
						} catch (SQLException e) 
						{
							e.printStackTrace();
						}
					}
					if(con!=null) {
						try 
						{
							con.close();
						} catch (SQLException e) 
						{
							e.printStackTrace();
						}
					}
				}
		}
	}


