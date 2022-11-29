import org.junit.AfterClass;


import org.junit.Assert;
//import org.junit.BeforeClass;
import org.junit.Test;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import java.util.concurrent.TimeUnit;

public class TestJSP {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/frankf/Downloads/drivers/chromedriver");
	}
//	@Test
//	public void test_JUnit() {
//	System.out.println("This is the testcase in this class");
//	String str1="This is the testcase in this class";
//	assertEquals("This is the testcase in this class", str1); 
//	}
	

	@Test
	public void TestWebsiteAvailability(){
		ChromeOptions options = new ChromeOptions();options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options); 
		driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://cgihelloworldwebapp.azurewebsites.net/HelloWorldCGI.jsp");
				Assert.assertEquals("Hello World", driver.getTitle());
			    
				driver.quit();
				
		}
		//WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
//	      driver.get("https://trendoceans.com");
//	      assertEquals("Hello World", driver.getTitle());
 	  //Initialising the browser driver
////	browser = webdriver.Chrome(executable_path="./drivers/chromedriver")
   

	//String str = "Hello World";
     
	


	@AfterClass
	public static void closeBrowser(){
	//driver.quit(); //Closing the driver once the tests are executed
	}
	

		
}
