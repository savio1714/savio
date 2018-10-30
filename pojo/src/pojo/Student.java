package pojo;

import java.io.Serializable;

public class Student implements Serializable {
	private int Roll;
	private String Name;
	private String STD;
	
	public  Student(){
		this.Roll=Roll;
		this.Name=Name;
	}

	public Student(int Roll,String Name,String STD){
		this.Roll=Roll;
		this.Name=Name;
		this.STD=STD;
	}

	
	public String getSTD() {
		return STD;
	}

	public void setSTD(String sTD) {
		STD = sTD;
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		Roll = roll;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	

}
