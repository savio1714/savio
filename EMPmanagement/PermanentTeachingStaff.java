package EMPmanagement;
//
public class PermanentTeachingStaff extends TeachingStaff implements Pay{
	 
	public PermanentTeachingStaff() {
		super();
		
		
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("Salary is 30000");
		
		
	}


	public void CalculatePay() {
		// TODO Auto-generated method stub
		System.out.println("Calculate Pay in permanent Teaching staff");
	}
	

}
