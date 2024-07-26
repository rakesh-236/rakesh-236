package introduction;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {

	public static void main(String[] args) throws InterruptedException {
		 //TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rakes\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.name("pass")).sendKeys("Hello");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.className("_9ay7")).getText());
		driver.findElement(By.linkText("Forgotten password?")).getText();
		driver.close();
		driver.quit();
		
		
//		//Working on Rahul shetty academy website, login page automation
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakes\\Documents\\chromedriver-win64\\.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/locatorspractice");
//		driver.findElement(By.id("inputUsername")).sendKeys("Hello");
//		driver.findElement(By.name("inputPassword")).sendKeys("Hello");
//		driver.findElement(By.className("signInBtn")).click();
//		System.out.println(driver.findElement(By.className("error")).getText());
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//input[@placeholder='Name'])")).sendKeys("John");
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();	
//		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Rahulshetty@rsa.com");
//		driver.findElement(By.xpath("//forms/input[3])")).sendKeys("12345678910");
//		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
//		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//		
		//driver.close();
		//driver.quit();
	}

}
