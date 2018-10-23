import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.mariadb.jdbc.Driver;

public class SqlApp {

	static final String DB_LINK="jdbc:mariadb://localhost/ooplabsession";
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		Connection con =null;
		int input;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1.Insert into Table\n2.Update Table\n3.Delete record from table\n4.Display all record\n");
		System.out.println("Enter--->");
		
		 input = keyboard.nextInt();
		try {
			new Driver();
			con = DriverManager.getConnection(DB_LINK,"root","savio");
			Statement smt=con.createStatement();
			
			
			
			String sampleQuery; 
			
			
	        switch (input) { 
	        case 1: 
	        	sampleQuery ="insert into student values(5,'Mark','MCA')"; 
	    		ResultSet results= smt.executeQuery(sampleQuery);
	            break; 
	        case 2: 
	        	sampleQuery = "UPDATE student SET Name = 'Tony' WHERE ID = 2"; 
	        	ResultSet results2= smt.executeQuery(sampleQuery);
	            break; 
	        case 3: 
	        	sampleQuery = "DELETE FROM student WHERE ID=2"; 
	        	ResultSet results3= smt.executeQuery(sampleQuery);
	            break; 
	        case 4: 
	        	sampleQuery = "Select* from student"; 
	        	ResultSet results4= smt.executeQuery(sampleQuery);
	        	while(results4.next()) {
					System.out.println("--->"+results4.getString(1)+" "+results4.getString(2)+" "+results4.getString(3));
				}
	            break; 
	      
	        default: 
	        	sampleQuery = "Invalid input"; 
	            break; 
	        } 
	        
	        
	   
			
			
			
			
			
			
			/*new Driver();
			con = DriverManager.getConnection(DB_LINK,"root","savio");
			Statement smt=con.createStatement();
			String sampleQuery="Select* from student";
			//String sampleQuery4="insert into student values(2,'Mark','MCA')";
			String sampleQuery2="UPDATE student SET Name = 'Tony' WHERE ID = 3";
			String sampleQuery3="DELETE FROM student WHERE ID=2";
			
		
			ResultSet results2= smt.executeQuery(sampleQuery2);
			ResultSet results3= smt.executeQuery(sampleQuery3);
			//ResultSet results4= smt.executeQuery(sampleQuery4);
			ResultSet results= smt.executeQuery(sampleQuery);*/
			/*while(results.next()) {
				System.out.println("--->"+results.getString(1)+" "+results.getString(2)+" "+results.getString(3));
			}*/
				
		}catch(Exception e) {
				e.printStackTrace();
			}finally {
				con.close();
			}
		}
		
}