package HelloJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Javadatabase_Class {

	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "Bhavana@123";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			Statement stm = conn.createStatement();
			//System.out.println("Connected successfully");
			String query = "create database jdbcdemo";
			stm.execute(query);
			System.out.println("check output in sql commandline prompt");
			conn.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		
		}
		}

	}


