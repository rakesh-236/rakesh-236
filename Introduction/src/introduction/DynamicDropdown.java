package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class DynamicDropdown {

	public void main(String[] args) throws InterruptedException {
		
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakes\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //input[@value='Bengaluru (BLR)']")).click();
//		
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //input[@value='Chennai (MAA)']")).click();
//		driver.close();
//		driver.quit();
		
		
		
		
		
	driver.get("http://spicejet.com"); //URL in the browser

	//  //a[@value='MAA']  - Xpath for chennai

	//  //a[@value='BLR']

	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

	driver.findElement(By.xpath("//a[@value='BLR']")).click();

	Thread.sleep(2000);

	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}
}
