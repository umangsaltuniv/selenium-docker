package docker.selenium;

import static org.testng.Assert.assertEquals;

import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerSeleniumTest {
	

	
  @Test
  public void dstest() throws Exception {	
	  
	  
	  ChromeOptions options = new ChromeOptions();
	  
	  //Below ip address needs to be changed as per that machine where docker is running
	  URL url = new URL("http://34.234.86.77:5555/wd/hub");
  
	 
	  RemoteWebDriver driver = new RemoteWebDriver(url, options);
	  
	  driver.get("https://www.google.com/");
	  
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println(actualTitle);
	  
	  Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
  }
}
