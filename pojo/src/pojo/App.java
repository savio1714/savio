package pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student s=new Student();
		s.setRoll(12);
		s.setName("Raj");
	System.out.println("-->"+s.getRoll() +" "+s.getName());*/

		Serial();
		deSerial();
				
	}

	private static void Serial() {
		FileOutputStream fout=null;
		ObjectOutputStream oot=null;
		try {
			fout=new FileOutputStream(new File("Stud.txt"));
			oot=new ObjectOutputStream(fout);
			Student s=new Student(101, "Raj", "MCA");
			oot.writeObject(s);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
				oot.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	private static void deSerial() {
		FileInputStream fin=null;
		ObjectInputStream oin=null;
		try {
			fin=new FileInputStream(new File("Stud.txt"));
			oin=new ObjectInputStream(fin);
			Student s= (Student) oin.readObject();
			System.out.println("Roll number :"+s.getRoll()+" " +"\nName : "+s.getName()+" " + "\nSTD : "+s.getSTD());
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
				oin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

}
