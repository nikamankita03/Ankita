package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test1 
{
	public static void main(String [] args)
	{
		
		ArrayList al=new ArrayList();
		
		//Add Information
		al.add("Rahul");
		al.add(100);
		al.add('A');
		al.add(60.25f);
		al.add(100);
		al.add(null);
		al.add(null);

		System.out.println(al);
		
		//Verify ArrayList is empty or not
		System.out.println(al.isEmpty()); //false
		
		//size /capacity
		System.out.println(al.size()); //7
		
		//To verify information is present or not
		System.out.println(al.contains('A')); //true
		
		//Add information in between ArrayList---->Right shift operation
		al.add(4, 200);
		System.out.println(al);
		
		//Remove information---->Left Shift Operation
		al.remove(4);
		System.out.println(al);
		
		//Update information
		al.set(3, 80.25f);
		System.out.println(al);
		
		//To find index of data
		System.out.println(al.indexOf('A')); //2
		
		//To get data by providing index
		System.out.println(al.get(2)); //A
		
		//To find index of data
		System.out.println(al.indexOf(null));
		
		System.out.println("-----------  For  each  Loop -----------");
		// for each loop
		
		for(Object s1:al) //0-->Rahul
						  //1-->100
						 //2-->A
			
		{
			System.out.println(s1);  //0-->Rahul
									//1-->100
			 						//2-->A

		}
		
		
		System.out.println("----------Using iterator curser-----------");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		System.out.println("-----------Using Listiterator curser------------");
		ListIterator ltr=al.listIterator();
		
		while(ltr.hasNext())		// index 7----->false
		{
			System.out.println(ltr.next());		// Rahul		100		A
			
		}
		
		
		
	}
	
	

}
