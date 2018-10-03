package list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class GenericTest {
		public static void main(String []args) {
			List<String > stringlist=new ArrayList<>();
			List<Integer> integerlist=new ArrayList<>();
			
			stringlist.add("Hello");
			stringlist.add("Hi");
			stringlist.add("Yoo");
			integerlist.add(22);
			integerlist.add(2);
			integerlist.add(12);
			
			//printList(stringlist);
			printList(integerlist);
			
			
		}
		static <E extends Number> void printList(List<E> mylist) {
			
			Iterator<E> myItr=mylist.iterator();
			while(myItr.hasNext()) {
				System.out.println("..."+myItr.next());
			}
		}
		
/*
		 static <E> void printList(List<E> mylist) {
			// TODO Auto-generated method stub
			 for(E item:mylist) {
				 System.out.println("...."+item);
			 }
			
		}*/

}
