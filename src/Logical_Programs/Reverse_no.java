package Logical_Programs;

public class Reverse_no 
{
	public static void main(String[] args)
	{
		
		//Reverse number
		
		int a=8954;
		
		int rev= 0;
		
		for(int i=a;	i>0;	i=i/10)
		{
			int rem=i % 10;
			
			rev= rev*10 + rem;
			
		}

		System.out.println(rev);
	}
}
