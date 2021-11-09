package Super;

public class SuperB extends SuperA {
	int i=200;
	
	public SuperB(int a)
	{
		super(a);
		System.out.println("Value is --"+ a);
	}
	
	public void hello() 
	{
		System.out.println("Child Class Hello");
	}
	
	public void testing()
	{
		super.hello();
	}

}


//super--with the help of super keyword 