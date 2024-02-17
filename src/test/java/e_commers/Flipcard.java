package e_commers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcard {
  @Test
  public void FlipcardTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Chrome downlode file\\Chrome driver Selenium\\chromedriver-win64\\chromedriver.exe");
	  Reporter.log("Opening Flipcard",true);
	  WebDriver driver =new ChromeDriver ();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.close();
		
  }
}
