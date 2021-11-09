package Loop;

public class whileloop {
	//Not confirm number of times loop is going to run
	//increment/decrement is not constant
	
	public void printTableWhile(int inputNumber)
	{
		int i =1;
		while(i<=10) 
		{
			System.out.println(inputNumber + "*" + i + "=" + i * inputNumber);
		}
	}

	public void printReverseTable(int inputNumber) 
	{
		int i=10;
		while(i>=1);
		{
			System.out.println(inputNumber + "*" + i + "=" + i * inputNumber);
			i--;
		}
	}

}
