package pojo;

public class Refree {
	private String name;
	private Integer age;
	private Integer height;
	
	public void foul() {
		System.out.println("Foul!!!!");
	}
	
	public void outs(){
		System.out.println("Out!!!");
	}
	public void thrown() {
		System.out.println("Thrown out.....");
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
