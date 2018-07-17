package sorting;
//package sorting;
//
public class Bubblesort {
	
	private Integer data[]=null;
	
	
	//
	public static void sort(Integer data[]) {
		//int []data= {3,5,1,8,6,2,7};
		int i,j,temp;
		System.out.println("Bubble sort");
		for(i=0;i<data.length;i++) {
			
			for(j=0;j<data.length-1;j++) {
				
				if(data[j]>data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}	
				
			}	
		} 
			for(i=0;i<data.length;i++) {
				System.out.print("   "+data[i]);
			}
			
	}



}
