package pojo;

public class Team {
	private String name;

	
	public void win() {
		System.out.println("win");
	}
	
	public void lose() {
		System.out.println("lose");
	}
	
	public Team() {
		name="";
		System.out.println("Object created");
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
