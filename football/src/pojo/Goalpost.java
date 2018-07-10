package pojo;

public class Goalpost {
	private Integer hight;
	private Integer lenght;
	
	public void goal() {
		System.out.println("Goal!!!!!!");
	}
	
	public void not_goal() {
		System.out.println("Not Goal.......");
	}
	public Integer getHight() {
		return hight;
	}
	public void setHight(Integer hight) {
		this.hight = hight;
	}
	public Integer getLenght() {
		return lenght;
	}
	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}

}
