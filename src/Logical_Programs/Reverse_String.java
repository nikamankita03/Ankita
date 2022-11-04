package Logical_Programs;

public class Reverse_String
{
	// Reverse String
	public static void main(String []args)
	{
		
	String a1="Ankita";
	
	String N1= "";
	
	
	
	for(int i=a1.length()-1; i>=0; i--)
	{
		
		N1=N1 +a1.charAt(i);
		
	}
	
	
	System.out.println(N1);
	
	
	}

}
