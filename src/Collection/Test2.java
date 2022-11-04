package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test2 
{
	
	public static void main(String[]args)
	{
		Vector v1=new Vector();
		
		v1.add("Rahul");
		v1.add(200);
		v1.add('A');
		v1.add(80.15f);
		v1.add(200);
		v1.add(null);
		v1.add(null);
		
		System.out.println(v1);
		
		//Verify ArrayList is empty or not
		System.out.println(v1.isEmpty()); //false
				
		//size /capacity
		System.out.println(v1.size()); //7
		
		//To verify information is present or not
		System.out.println(v1.contains(200)); //true
		
		//Add information in between ArrayList---->Right shift operation
		v1.add(2, 500);
		System.out.println(v1);
		
		//Remove information---->Left Shift Operation
		v1.remove(2);
		System.out.println(v1);
		
		//Update information
		v1.set(2,"Ankita");
		System.out.println(v1);

		//To find index of data
		System.out.println(v1.indexOf(null)); //5
		
		//To get data by providing index
		System.out.println(v1.get(3));
		
		System.out.println("-----------  For  each  Loop -----------");
		// For each Loop
		
		for(Object c1:v1)
		{
			System.out.println(c1);
			
		}
		
		
		System.out.println("-----------Using iterator curser-----------");
		
		Iterator itr=v1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------Using Listiterator curser----------");
		
		ListIterator ltr=v1.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("-------Using Enumeration curser----------");
		
		Enumeration er=v1.elements();
		
		while(er.hasMoreElements())
		{
			
			System.out.println(er.nextElement());
		}	
			
		
	}

}
