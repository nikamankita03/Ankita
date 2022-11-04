package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample2 
{
	public static void main(String [] args)
	{
		LinkedHashSet l2=new LinkedHashSet();
		
		l2.add("Rahul");
		l2.add(100);
		l2.add('A');
		l2.add(12.9f);
		l2.add(100);// duplicate 
		l2.add(null);
		l2.add(null);
		
		System.out.println(l2);
		
		//Verify hashset is empty or not
		System.out.println(l2.isEmpty());
		
		//size /capacity
		System.out.println(l2.size());
		
		//To verify information is present or not
		System.out.println(l2.contains(100));
		
		//Remove information---->Left Shift Operation
		l2.remove(100);
		System.out.println(l2);
		
		System.out.println("-----------  For  each  Loop -----------");
		// For each Loop
		
		for(Object s1:l2)
		{
			System.out.println(s1);
			
		}
		
		
		System.out.println("-----------Using iterator curser-----------");
		
		Iterator itr=l2.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
