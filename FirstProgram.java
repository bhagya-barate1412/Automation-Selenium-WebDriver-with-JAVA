import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chromedriver.driver", "/Users/BBARATE/Documents/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		
		
	      driver.get("https://rahulshettyacademy.com/locatorspractice");
	
		
	}

}
