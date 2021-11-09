package StringHandling;

public class StringFunction {
	public static void main(String[] args) {
		String str1 = "Java string contains If else Example";
		String str2 = "Java string is in th store";
        // In If-else statements you can use the contains() method

        if (str1.contains("example")) {
            System.out.println("The Keyword :example: is found in given string");
        } else {
            System.out.println("The Keyword :example: is not found in the string");
        }

	}

}
