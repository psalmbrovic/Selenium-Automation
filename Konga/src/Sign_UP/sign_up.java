package Sign_UP;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sign_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMUEL PC\\Downloads\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  String URL="https://www.konga.com";

		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.cssSelector("body")).click();
		  
		//Click login
		  driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[1]/div/div/div[4]/a")).click();
		  
	
		  //Click Don’t have an account? Sign Up
		  driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[3]/div/a")).click();
		  
		//Enter First Name
		  driver.findElement(By.cssSelector("#firstname")).sendKeys("Samuel");
		  
		  //Enter Last Name
		  driver.findElement(By.cssSelector("#lastname")).sendKeys("Abatan");
		  
		  //Enter Email Address
		  driver.findElement(By.cssSelector("#email")).sendKeys("abatan88@gmail.com");

		  
		//Enter Phone Number
		  driver.findElement(By.cssSelector("#phone")).sendKeys("07062037543");
		  
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456789");

		//Enter Password
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("KOnga@TEST");
	

		 
		  //Click on show
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[5]/a")).click();

		//Click on Hide
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/div/div/div[1]/form/div[5]/a")).click();

		//Click on Create Account
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[1]/form/div[6]/button")).click();

		//userText.contains(""))

		// Validate that user has created
		  //if(Name.CONTENT_TYPE("Samuel")) {
		 //  System.out.println("User Verified,Test case Passed");
		 // }
		 /* else {
		   System.out.println("User Verification Failed,Test case Failed");
		  }*/

		 


	}

}
