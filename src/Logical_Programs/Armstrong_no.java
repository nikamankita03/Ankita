package Logical_Programs;

public class Armstrong_no 
{
	public static void main(String[]args)
	{
		//Armstrong no= addition of  each digit cube of number is armstrong no. 153= 1³*5³*3³=153 
		
		int ag=153;
		
		int sum=0;
		
		for(int i=ag;	i>0;	i=i/10)
		{
			
			int rem= i % 10;
			
			sum= sum+ (rem*rem*rem);
			
		}
		
		if(ag==sum)
		{
			System.out.println("Given number is an Amstrong number.");
			
		}
		
		else
		{
			System.out.println("Given number is Not an Amstrong number.");
			
		}
		
		
		
		
		
	}

}
