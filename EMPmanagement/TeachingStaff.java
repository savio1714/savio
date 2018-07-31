package EMPmanagement;

public abstract class TeachingStaff extends Staff {

	private Integer noofTeachingHours;
	public abstract void calculateSalary(); 
	
	public TeachingStaff() {
		super();
		noofTeachingHours=0;
	}
	public TeachingStaff(String name,Integer noofTeachingHours ) {
		super(name);
		this.noofTeachingHours=noofTeachingHours;
	}

	/*@Override
	public void calculateSalary() {
		System.out.println("Teaching Staff Salary");
		
	}*/

	@Override
	public void TypeOfJob() {
		System.out.println("Tacking Leacture");
		
	}
	public Integer getNoofTeachingHours() {
		return noofTeachingHours;
	}
	public void setNoofTeachingHours(Integer noofTeachingHours) {
		this.noofTeachingHours = noofTeachingHours;
	}

}
