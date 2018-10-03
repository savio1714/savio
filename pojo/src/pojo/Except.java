package pojo;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		try {
			System.out.println(5/i);
			//System.out.println(5/0);
			int arr[]={1,2,3};
			System.out.println(arr[6]);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception has occured");
			e.printStackTrace();
			System.out.println(e.getMessage()); 
		}catch(Exception ex){
			System.out.println("Exception has occured");
		}

	}

}
