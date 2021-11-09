package Ifcondition;

public class IfB {
	
	public void checklargestnumber(int a, int b, int c)
	{

		if(a>b && a>c) 
		{
			System.out.println("This is the largest number-"+a);
		}
		else if(b>a && b>c) 
		{
			System.out.println("This is the largest number-"+b);
			
		}
		else 
		{
			System.out.println("This is the Largest number-"+c);
		} 
	}
	
		
}
