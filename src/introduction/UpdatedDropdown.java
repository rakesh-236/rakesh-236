package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.support.ui.Select;
//import/ org.testng.Assert;

import org.junit.Assert;
//import dev.failsafe.internal.util.Assert;

//import dev.failsafe.internal.util.Assert;




//package introduction;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rakes\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		
		/*int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}*/
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(2000);

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
		driver.quit();
	
	}

}
