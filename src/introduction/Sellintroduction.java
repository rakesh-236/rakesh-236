package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sellintroduction {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Browser
		

		// WebDriver  close  get

		//WebDriver methods + class methods

		
		// Chrome
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakes\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		driver.close();
//		driver.quit();



		//Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\rakes\\Documents\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\rakes\\Documents\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

}
}
