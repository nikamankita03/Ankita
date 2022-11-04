package Logical_Programs;

public class Pallendrome
{
	public static void main(String [] args )
	{
		
		String Org="madam";
		
		String rev= "";
		
		for (int i=Org.length()-1; i>=0; i--)
		{
			rev = rev +Org.charAt(i);
			
		}
		
		
		if(Org.equals(rev))
		{
			System.out.println("Given String is Pallendrome");
		}
		else
		{
			System.out.println("Given String is not Pallendrome");
		}
		
		
		
	}

}
