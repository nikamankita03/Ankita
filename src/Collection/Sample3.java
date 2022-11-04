package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Sample3
{
	
	public static void main(String[] args) 
	{
		TreeSet tr=new TreeSet();
		
		//add information
		
		tr.add(100);
		tr.add(200);
		tr.add(700);
		tr.add(8);
		tr.add(900);
		tr.add(30);
		tr.add(50);
		tr.add(2);

		System.out.println(tr);
		
		//Verify hashset is empty or not
		System.out.println(tr.isEmpty()); //false
		
		
		//size /capacity
		System.out.println(tr.size());
		
		//To verify information is present or not
		System.out.println(tr.contains(100));
		
		//Remove information---->Left Shift Operation
		tr.remove(100);
		System.out.println(tr);
		
		//Remove  last information
		tr.pollLast();
		System.out.println(tr);
		
		//Remove  first information
		tr.pollFirst();
		System.out.println(tr);
		
		//to print first information
		System.out.println(tr.first());
		
		//to print last information
		System.out.println(tr.last());
		
		System.out.println("-----------  For  each  Loop -----------");
		// For each Loop
		
		for(Object s1:tr)
		{
			System.out.println(s1);
			
		}
		
		
		System.out.println("-----------Using iterator curser-----------");
		
		Iterator itr=tr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
	}

}
