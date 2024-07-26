package introduction;
//import java.awt.Dimension;
//import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rakes\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("India"))

		{

		option.click();

		break;

		}

		}
//<<<<<<< HEAD
//		
////		numbers
////		1 2 3 4 5 6 7 8 9 10
//=======
//		//Alphabets 
//		//a b c d e f g h i k l m n o p 
//		
//>>>>>>> d4a67498db37dbd2ec3c01d4499322ac89ca0305

//		I love india 
//		My name is Rakesh 
//		I  live in Hyderabad
		
		
		
		
		
	}

}
