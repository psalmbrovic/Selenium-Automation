package Divisible;

public class DivisibleA {
	public void divisible( int a) 
	{
		if (a%5==0 && a%11==0)
 
			{
				System.out.println("it is not divisible by both");
			}
		else if(a%5==0) 
		{
			System.out.println("It is divisible by 5 only");
		}
		else if(a%11==0) 
		{
			System.out.println("It is divisible by 11 only");
			
		}
		else 
		{
			System.out.println("Not divisible");
		}
		
	}
	
		
		
	
	
	

}
