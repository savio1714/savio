import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.mariadb.jdbc.Driver;

public class SqlApp {

	static final String DB_LINK="jdbc:mariadb://localhost/ooplabsession";
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		Connection con =null;
		try {
			new Driver();
			con = DriverManager.getConnection(DB_LINK,"root","savio");
			Statement smt=con.createStatement();
			String sampleQuery="Select* from student";
			ResultSet results= smt.executeQuery(sampleQuery);
				while(results.next()) {
					System.out.println("--->"+results.getString(2)+" "+results.getString(1));
				}
				
		}catch(Exception e) {
				e.printStackTrace();
			}finally {
				con.close();
			}
		}
		
}


