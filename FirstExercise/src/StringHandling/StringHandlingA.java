package StringHandling;

public class StringHandlingA {
	String s ="This is testing World";
	String s1 = "this Testing world 7";
	
	public void stringHandling() 
	{
		//System.out.println("Lenght of String" + s.length());
		//System.out.println("Lenght of String after trim" + s.trim().length());
		//System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		//System.out.println(s.replace("Hello", "Testing"));
		//System.out.println(s +"" s1);
		//System.out.println(s.concat(" ").concat(s1));
		//System.out.println(s.contains("ABC"));
		//System.out.println(s.substring(2, 7));
		//String[] sArray = s.split("");
		//for(String s1 : sArray) 
		if(s.compareToIgnoreCase(s1)==0)
		{
			System.out.println("This is equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		{
			//System.out.println(s1);
		}
		
	}

}
