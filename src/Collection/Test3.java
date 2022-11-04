package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test3 
{
	public static void main(String [] args)
	{
		LinkedList  l1=new  LinkedList();
		
		l1.add("Rahul");
		l1.add(100);
		l1.add('A');
		l1.add(60.60f);
		l1.add(100);
		l1.add(null);
		l1.add(null);
		
		System.out.println(l1);
		
		//Verify ArrayList is empty or not
		System.out.println(l1.isEmpty());	//false
		
		//size /capacity
		System.out.println(l1.size());	//7
		
		//To verify information is present or not
		System.out.println(l1.contains(100));	//true
		
		//Add information in between ArrayList---->Right shift operation
		l1.add(4, 500);
		System.out.println(l1);
		
		//Remove information---->Left Shift Operation
		l1.remove(5);
		System.out.println(l1);
	
		//Update information
		l1.set(5, 95.95f);
		System.out.println(l1);
		
		//To find index of data
		System.out.println(l1.indexOf(95.95f));
		
		//To get data by providing index
		System.out.println(l1.get(2));
		
		
		
		System.out.println("-----------  For  each  Loop -----------");
		// For each Loop
		
		for(Object d1:l1)
		{
			System.out.println(d1);
			
		}
		
		
		System.out.println("-----------Using iterator curser-----------");
		
		Iterator itr=l1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------Using Listiterator curser----------");
		
		ListIterator ltr=l1.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		
		
	}

}
