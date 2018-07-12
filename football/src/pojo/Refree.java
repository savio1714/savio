package pojo;

public class Refree {
	private String name;
	private Integer age;
	private Integer height;
	
	public void foul() {
		System.out.println("Foul!!!");
	}
	
	public void outs(){
		System.out.println("Out!!!");
	}
	public void thrown() {
		System.out.println("Thrown out.....");
	}
	
	
	public Refree() {
		age=0;
		name="";
		height=0;
		System.out.println("creating object.");
	}
	
	public Refree(String name,Integer age,Integer height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	

}
