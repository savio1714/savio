package fact;

public class factorial {
	private Integer num;
	
	public factorial() {
		num=0;
	}
	
	
	public factorial(Integer num) {
		this.num=num;
	}
	
	public void calfactorial(Integer num) {
		int i,n=num,fact=1;
		for (i=1;i<=n;i++)
		{
			fact=fact*i;
	
		}
		this.num = fact;
		//System.out.println("factorial of a number 5 is "+fact);
	}
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	 
}
