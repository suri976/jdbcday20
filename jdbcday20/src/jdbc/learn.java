package jdbc;
import java.sql.*;

public class learn {
	//" "
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/world";
		String username="root";
		String password="Password@123";
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		String sql =" select * from customer";
		System.out.println();
	}

}
