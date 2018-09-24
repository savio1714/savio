package pojo;

public class Ball {
	private Integer size;
	private String color;
	private Integer weight;
	
	public Ball() {
		size=0;
		color="";
		weight=0;
		System.out.println("creating object");
	}
	
	public Ball(String color,Integer size,Integer weight) {
		this.color=color;
		this.size=size;
		this.weight=weight;
	}
	
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}


}
