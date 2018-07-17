package fact;

public class factorial_main {

	public static void main(String[] args) {
		int num=5;
	factorial fact=new factorial(num);
	fact.calfactorial(num);
		System.out.println("factorial of a number 5 is "+fact.getNum());
	}

}
