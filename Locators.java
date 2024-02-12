import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chromedriver.driver", "/Users/BBARATE/Documents/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5) );
    
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
   
    
   driver.findElement(By.id("inputUsername")).sendKeys("Priya");

	driver.findElement(By.name("inputPassword")).sendKeys("Pass#123");

	driver.findElement(By.className("signInBtn")).click();
	
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath ("//input[@placeholder='Name']")).sendKeys("Bhagya");

  //driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Bhaga@gmail.com");

  driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Bhaga@gmail.com");

  driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

  driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Priya@gmail.com");

  driver.findElement(By.xpath("//form/input[3]")).sendKeys("9970789090");
  
  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

 System.out.println(driver.findElement(By.cssSelector("form p")).getText());
 
 driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
 

	Thread.sleep(1000);


 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
 
 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

 driver.findElement(By.id("chkboxOne")).click();
 

 driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click(); 

	
	
	
	
	}
}
