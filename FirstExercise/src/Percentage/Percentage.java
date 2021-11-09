package Percentage;

public class Percentage {
	
	public void Grade(int math ,int eng ,int comp ,int phy, int chem) 
	{
		int A = math + eng + comp + phy + chem;
		double sum = A;
		double percentage = (sum /500.0) * 100;
		 
	
		
		if (percentage >=90) 
		{
			System.out.println("Grade A");
		}
		else if(percentage >=80) 
		{
			System.out.println("Grade B");
		}
		else if(percentage >=70) 
		{
			System.out.println("Grade C");
		}
		else if(percentage >=60) 
		{
			System.out.println("Grade D");
		}
		else if(percentage >=40) 
		{
			System.out.println("Grade E");
		}
		else 
		{
			System.out.println("Grade F");
		}

	}
	
}
