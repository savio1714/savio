package pojo;

public class Ground {
	private String name;
	private Integer lenght;
	private Integer breadth;
	
	public Ground() {
		name="";
		lenght=0;
		breadth=0;
		System.out.println("creating object.");
	}
	
	public Ground(String name,Integer lenght,Integer breadth) {
		this.name=name;
		this.lenght=lenght;
		this.breadth=breadth;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLenght() {
		return lenght;
	}
	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}
	public Integer getBreadth() {
		return breadth;
	}
	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}

}
