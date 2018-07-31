package EMPmanagement;

public class App {
	public static void main(String args[]) {
		/*Staff staff=new Staff();
		Staff staff2=new TeachingStaff();
		Staff staff3=new NonTeachingstaff();
		Staff staff4=new TeachingStaff("mark",8);
		
		staff2.calculateSalary();
		staff2.TypeOfJob();
		staff3.TypeOfJob();
		staff4.setName("mark2");
		System.out.println(staff4.getName());
		*/
		Staff staff5=new PermanentTeachingStaff();
		TeachingStaff staff6=new PermanentTeachingStaff();
		staff5.setName("Viru");
		System.out.println(staff5.getName());
		staff6.calculateSalary();
		NonPermanentTeachingStaff Staff6=new NonPermanentTeachingStaff();
		Staff6.CalculatePay();
		
	}
}
