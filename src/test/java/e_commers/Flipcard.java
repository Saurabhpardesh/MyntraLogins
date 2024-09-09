package e_commers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcard {
  @Test
  public void FlipcardTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Downlods\\Chrome downlode file\\Chrome driver Selenium\\chromedriver-win64\\chromedriver.exe");
	  Reporter.log("Opening Flipcard",true);
	  WebDriver Driver =new ChromeDriver();
	  Driver.manage().window().maximize();
	  Driver.get("https://www.flipkart.com/");
	  
	  Driver.close();
		
  }
}
