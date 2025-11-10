package Selenium_Test;

import java.io.FileInputStream;
import java.util.Properties;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Test2 {

	public static void main(String[] args) {
		
		//WebDriverManager
		//Selenium Manager
		
		WebDriver driver;
		driver = new EdgeDriver();
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		/*var alert = driver.switchTo().alert();
		alert.sendKeys("mtcl");
		alert.accept();
		*/
		
		
	    	driver.get("https://www.apple.com");
			driver.findElement(By.xpath("//*[@class=\"default button button-tertiary\"]")).click();
			

	        
	        System.out.println("Title: " + driver.getTitle());
	        driver.quit();

	}

}
