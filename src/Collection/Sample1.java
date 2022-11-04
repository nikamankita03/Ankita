package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Sample1 
{
	public static void main(String [] args)
	{
		HashSet h1=new HashSet();
		
		h1.add("Rahul");
		h1.add(100);
		h1.add('A');
		h1.add(12.9f);
		h1.add(100);// duplicate 
		h1.add(null);
		h1.add(null);
		
		System.out.println(h1);
		
		//Verify hashset is empty or not
		System.out.println(h1.isEmpty());
		
		//size /capacity
		System.out.println(h1.size());
		
		//To verify information is present or not
		System.out.println(h1.contains(100));
		
		//Remove information---->Left Shift Operation
		h1.remove(100);
		System.out.println(h1);
		
		System.out.println("-----------  For  each  Loop -----------");
		// For each Loop
		
		for(Object s1:h1)
		{
			System.out.println(s1);
			
		}
		
		
		System.out.println("-----------Using iterator curser-----------");
		
		Iterator itr=h1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
