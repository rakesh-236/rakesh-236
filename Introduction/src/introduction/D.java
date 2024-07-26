package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit wait - 5seconds time out 
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rakes\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("Hello");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name'])")).sendKeys("Jhon");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();	
		//driver.close();
		//driver.quit();
		
		
		
		
		
		
		
	}

}
