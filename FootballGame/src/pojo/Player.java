package pojo;

public class Player implements Loan,Contractbase{
	private Integer age;
	private String name;
	private String position;
	private Integer height;
	private Integer contract,Loan,c;
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
	
	@Override
	public void Contractbase(Integer contract) {
		// TODO Auto-generated method stub
		c=this.contract=contract;
		System.out.println("Contract Bass for " +c +  "Years");
		
	}

	@Override
	public void Loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan Base");
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

	public Integer getContract() {
		return contract;
	}

	public void setContract(Integer contract) {
		this.contract = contract;
	}

	public Integer getLoan() {
		return Loan;
	}

	public void setLoan(Integer loan) {
		Loan = loan;
	}

	
}
