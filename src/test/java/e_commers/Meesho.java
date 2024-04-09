package e_commers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void MeeshoTest()  {
	  System.setProperty("webdriver.chrome.driver","D:\\Downlods\\Chrome downlode file\\Chrome driver Selenium\\chromedriver-win64\\chromedriver.exe");
	  Reporter.log("Opening meesho",true);
	  WebDriver driver =new ChromeDriver ();
	  driver.manage().window().maximize();
	  driver.get("https://www.meesho.com/");
	  driver.close();
  }
}
