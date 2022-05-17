package jdbc;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
public class Filereader {
	public static void main(String[] args) throws Exception {
		String userName="root";
	      String url="jdbc:mysql://localhost:3306/world";
	      String password="Password@123";
	    //""
	      Connection con= DriverManager.getConnection(url, userName, password);
			String FilePath="courseList.csv";
			int batchsize=10;
			String sql ="insert into courselist(CourseName,StudentName)"+"values(?,?)";   
			PreparedStatement statement = con.prepareStatement(sql);
			
			
			
			BufferedReader lineReader = new BufferedReader(new FileReader(FilePath));
			String lineText=null;
			int count =0;
			lineReader.readLine();
			
			while((lineText = lineReader.readLine())!=null)
			{
				String[]data = lineText.split(",");
				String CourseName=data[0];
				String StudentName=data[1];
				statement.setString(1, CourseName);
				statement.setString(2, StudentName);
				statement.addBatch();
				if(count%batchsize==0)
				{
					statement.executeBatch();
				}
				
				lineReader.close();
				System.out.println("values inserted");
				con.close();
				
				
				
				
				
			}
	
	
	
	
	}




}
