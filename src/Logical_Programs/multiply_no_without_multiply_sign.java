package Logical_Programs;

public class multiply_no_without_multiply_sign 
{
	//Multiply number without multiplication operation
	
	public static void main (String[]args)
	{
		
	int Num1=5;
	int Num2=2;
	
	int Sum=0;//2	4	6	8	10
	
		//i=1	1<=5	 2
			//	2<=5	 3
			//  3<=5     4
		    //  4<=5     5
			//  5<=5     6 
	
	for(int i=1; i<=Num1; i++)		
	{
		Sum=Sum + Num2; //2         2=0+2
					   // 4         4=2+2
					   //6			6=4+2
					   //8			8=6+2
				       //10			10=8+2
		
	}
	System.out.println(Sum);//10
	
	}
	
	

}
