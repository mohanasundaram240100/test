package Selenium_Test;

import java.io.ObjectInputStream.GetField;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown2 {

	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'Pke')]")));	
        search.sendKeys("iphones");
        search.sendKeys(Keys.ENTER);
        
        List<WebElement> options = driver.findElements(By.xpath("//div[contains(text(), 'iPhone') and contains(@class,'KzDlHZ')]"));
        for (WebElement option:options) {
        	
        	System.out.println(option.getText());
        }
  
		
		
		
	}
	
}
