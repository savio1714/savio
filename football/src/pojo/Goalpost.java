package pojo;

public class Goalpost {
	private Integer height;
	private Integer lenght;
	
	public void goal() {
		System.out.println("Goal!!!!!");
	}
	
	public void not_goal() {
		System.out.println("Not Goal.......");
	}
	
	public Goalpost() {
		height=0;
		lenght=0;
		System.out.println("creating object.");
	}
	
	public Goalpost(Integer lenght,Integer height) {
		this.lenght=lenght;
		this.height=height;
	}
	
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer hight) {
		this.height = height;
	}
	public Integer getLenght() {
		return lenght;
	}
	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}

}
