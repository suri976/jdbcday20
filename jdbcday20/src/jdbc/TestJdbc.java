package jdbc;
import java.sql.*;



public class TestJdbc {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//" "

		
		//1. load driver class
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		
		
		
	//2. connect with drive manager
	//jdbc:mysql://localhost:3306/world
	
		String url="jdbc:mysql://localhost:3306/world";
		String username="root";
		String password="Password@123";
		try {
			Connection con =DriverManager.getConnection(url,username,password);
			System.out.println("Connected to database");
			Statement st =con.createStatement();
			String selectSQL = "Select* from country";
			ResultSet rs = st.executeQuery(selectSQL);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1) +"::" +rs.getString(2)+"::" +rs.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
