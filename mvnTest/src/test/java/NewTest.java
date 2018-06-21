import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	 WebDriver driver;
  @Test
  public void f() {
	  WebElement element = driver.findElement(By.name("q"));
      element.sendKeys("Alok");
      element.submit();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "F:\\extra softwares\\chromedriver.exe");

      driver = new ChromeDriver(); 
     driver.get("https://www.google.com");  
  }

  @AfterClass
  public void afterClass() {
  }

}
