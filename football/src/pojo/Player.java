package pojo;

public class Player {
	private Integer age;
	private String name;
	private String position;
	private Integer height;
	//
	public void kick() {
		System.out.println("Kick!!");
	}
	
	public void score_goal() {
		System.out.println("Score a goal");
	}
	public void save_goal() {
		System.out.println("Save a goal");
	}
	public void run() {
		System.out.println("Running");
	}
	
	public Player() {
		age=0;
		name="";
		position="";
		height=0;
		System.out.println("Player Info ......");
	}
	
	public Player(String name,Integer age,String position,Integer height) {
		this.name=name;
		this.age=age;
		this.position=position;
		this.height=height;
	}
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public Integer getHeight() {
		return height;
	}



	public void setHeight(Integer height) {
		this.height = height;
	}
}
