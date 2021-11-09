package Month;

public class Nomonth {
	
	public void CheckNumberOfDays(int monthNumber) 
	{
		if(monthNumber<=0 || monthNumber>12) 
		{
			System.out.println("Invalid Month Number");
		}
		else if(monthNumber==3 || monthNumber==4 || monthNumber==6) 
		{
			System.out.println("30 Days");
		}
		else if(monthNumber==2) 
		{
			System.out.println("28 days");
			
		}
		else 
		{
			System.out.println("31 Days");
		}
	}

}
