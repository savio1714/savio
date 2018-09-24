package pojo;

public class Team implements Cloneable {
	private String name;

	
 public Object clone() throws CloneNotSupportedException
 {
	 return super.clone();
 }
 
	public void win() {
		System.out.println("win");
	}
	
	public void lose() {
		System.out.println("lose");
	}
	
	public Team() {
		name="";
		//System.out.println("Object created");
	}
	
	public Team(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}