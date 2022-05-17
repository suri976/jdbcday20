package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example2 {
	//" "

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("inside class driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/fire";
		String username="root";
		String password="Password@123";
		
		try {
			
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("Connected to database");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("select * from emp");
				
				        System.out.println(rs.getFetchSize());
				     //   rs.
				       //       rs.setFetchSize(10);
				      rs.next();    
				      System.out.println( rs.getInt(1) + "," + rs.getInt(6));
				     // rs.last();
				      rs.absolute(-13);
				      System.out.println( rs.getInt(1) + "," + rs.getInt(6));
				      rs.first();    
				      System.out.println( rs.getInt(1) + "," + rs.getInt(6));
				     
				}
				
				
				catch(SQLException  | RuntimeException e ) {
				e.printStackTrace();
				// System.out.println(rs);
				}
			
	}

}
