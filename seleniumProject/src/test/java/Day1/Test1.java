package Day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Test1 {
  @Test
  public void f() {
	        // Setup ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();
	        
	        // Launch Chrome browser
	        WebDriver driver = new ChromeDriver();
	        
	        // Open Google
	        driver.get("https://www.google.com");

	        // Print Page Title
	        System.out.println("Page Title: " + driver.getTitle());
	        System.out.println("Line");

	        // Close browser
	        driver.quit();

  }
}
