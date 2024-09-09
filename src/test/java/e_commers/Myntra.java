package e_commers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void Myntrap()  {
	  System.setProperty("webdriver.chrome.driver","D:\\Downlods\\Chrome downlode file\\Chrome driver Selenium\\chromedriver-win64\\chromedriver.exe");
	  Reporter.log("Opening Myntra",true);
	  WebDriver Driver =new ChromeDriver();
	  Driver.manage().window().maximize();
	  Driver.get("https://www.myntra.com/");
	  Driver.quit();
  }
  
}
