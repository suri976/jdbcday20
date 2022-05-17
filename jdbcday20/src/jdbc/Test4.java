package jdbc;
import java.sql.*;

public class Test4 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/fire";
		String username="root";
		String password="Password@123";
		

try {
		
		
	
		Connection con =DriverManager.getConnection(url,username,password);
		System.out.println("Connected to database");
		 
		Statement st = con.createStatement(); 
		ResultSet rs = st.executeQuery("select * from emp");
		PreparedStatement pst = PreparedStatement("select emp where id = (?,?) ");
	 pst.setInt(1, 103);
	 pst.setString(0, password);
	 pst.executeUpdate();
		
//        ResultSetMetaData rsmd =     rs.getMetaData();
//           System.out.println(rsmd.getColumnCount());
//           
//         //  System.out.println(rsmd.getTableName(0));
//          int colCount = rsmd.getColumnCount();
//           for(int i=1; i <= colCount; i++) {
//                       System.out.println(rsmd.getColumnName(i) + "::"+ rsmd.getColumnTypeName(i) );
//           }
//           
       //   System.out.println(rsmd.getSchemaName(2));
           

}
		catch(SQLException  | RuntimeException e ) {
			e.printStackTrace();
		}

// System.out.println(rs);
	
	


	}

	private static PreparedStatement PreparedStatement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
