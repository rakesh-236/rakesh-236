package introduction;
//import java.awt.Dimension;
//import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakes\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(0);
		
		//To delete cookies
		driver.manage().deleteAllCookies();
		//driver.get("https://google.com");
		
		//To set the size of the window 
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//To set the position of the window 
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		//To maximize the window
		driver.manage().window().maximize();
		
//		driver.close();
//
//		driver.quit();
	}

}

//charminar
//four pillars
//warangle
//college
//shadnagar


















