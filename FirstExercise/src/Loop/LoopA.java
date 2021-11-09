package Loop;

public class LoopA {
	
	//if you are confirm number of times you want to run loop
	//if increment/decrement is constant go for this loop
	public void PrintTable(int inputNumber) 
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(inputNumber + "*" + i +"=" + i * inputNumber);
		}
	}
	
	public void returnTable(int inputNumber) 
	{
		for (int i=10;i>=1;i--) 
		{
			System.out.println(inputNumber + "*" + i + "="+ i*inputNumber);
		}
	}


}
