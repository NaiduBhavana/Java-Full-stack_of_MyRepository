package jdbc_CRUD;

import java.sql.*;

public class Student 
{
	public void createdatabase() 
	{
		try 
		{
			String URL = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "Bhavana@123";
			
			Connection conn = DriverManager.getConnection(URL, userName, password);
			Statement stm = conn.createStatement();
			
			String query = "create database Student";
			stm.execute(query);
			System.out.println("Check for created database in sql command prompt");
			conn.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void createtable() 
	{
		try 
		{
			String URL = "jdbc:mysql://localhost:3306/Student";
			String userName = "root";
			String password = "Bhavana@123";
			
			Connection conn = DriverManager.getConnection(URL, userName, password);
			Statement stm = conn.createStatement();
			
			String query = "create table studentsrecord(sid int(3),Name varchar(20),subject varchar(30))";
			stm.execute(query);
			System.out.println("Table got created.Please check in sql commandprompt");
			conn.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void createdata() 
	{
		try 
		{
			String URL = "jdbc:mysql://localhost:3306/Student";
			String username = "root";
			String password = "Bhavana@123";
			
			Connection conn = DriverManager.getConnection(URL, username, password);
			Statement stm = conn.createStatement();
			
			String query = "Insert into studentsrecord values (5,'wrongdata','Sanskrit')";
					
			stm.execute(query);
			System.out.println("values got updated");
			conn.close();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readdata() 
	{
		try 
		{
			String URL = "jdbc:mysql://localhost:3306/Student";
			String username = "root";
			String password = "Bhavana@123";
			
			Connection conn = DriverManager.getConnection(URL, username, password);
			Statement stm = conn.createStatement();
			
			String query = "Select * from studentsrecord";
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("id = "+rs.getInt(1));
				System.out.println("Name = "+rs.getString(2));
				System.out.println("Subject = "+rs.getString(3));
			}
			System.out.println("values got executed successfully");
			conn.close();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updatedata() 
	{
		try 
		{
			String URL = "jdbc:mysql://localhost:3306/Student";
			String username = "root";
			String password = "Bhavana@123";
			
			Connection conn = DriverManager.getConnection(URL, username, password);
			Statement stm = conn.createStatement();
			
			String query = "update studentsrecord set sid = '3' where Name = 'Uma'";
					
			stm.execute(query);
			System.out.println("values got updated");
			conn.close();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void deletedata() 
	{
		
		try 
		{
			String URL = "jdbc:mysql://localhost:3306/Student";
			String username = "root";
			String password = "Bhavana@123";
			
			Connection conn = DriverManager.getConnection(URL, username, password);
			Statement stm = conn.createStatement();
			
			String query = "delete from studentsrecord where sid = '5' and Name = 'wrongdata'";
					
			stm.execute(query);
			System.out.println("values got deleted");
			conn.close();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
