package jdbc;
import java.sql.*; 

public class TestJdbc2 {
	
	



	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//" "

		
		//1. load driver class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	//2. connect with drive manager
	//jdbc:mysql://localhost:3306/world
	
		String url="jdbc:mysql://localhost:3306/world";
		String username="root";
		String password="Password@123";
		
		
		try {
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("Connected to database");
			DatabaseMetaData dmd = con.getMetaData();
			//dmd.
			System.out.println(dmd.getDriverName());
			System.out.println(dmd.getDriverMajorVersion());
			System.out.println(dmd.getDatabaseProductName());
			
			System.out.println(dmd.getDatabaseMajorVersion());
			System.out.println(dmd.getDatabaseMinorVersion());
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		
		
	}

}

