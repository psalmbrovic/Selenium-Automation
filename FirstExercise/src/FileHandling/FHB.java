package FileHandling;

import java.io.IOException;

public class FHB {
	
	public static void main(String[] args) throws IOException {
		FH obj = new FH();
		obj.writeDataFromFile("C:/Users/SAMUEL PC/Desktop/Selenium Java", "test.txt", "This is a testing environment");
		//obj.readDataFromFile("ABC", "XYZ");
	}

}
