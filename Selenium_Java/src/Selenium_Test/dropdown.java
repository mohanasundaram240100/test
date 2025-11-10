package Selenium_Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class dropdown {
	
	public static void main (String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement fruits = driver.findElement(By.xpath("//*[@id='fruits']")); 
		Select myfruit =new Select(fruits);
		myfruit.equals("Mango");
			
		WebElement heros = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select myheros = new Select(heros);
		myheros.selectByIndex(3);
		myheros.selectByVisibleText("Daredevil");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select mycountry = new Select(country);
		mycountry.selectByIndex(2);
		mycountry.selectByContainsVisibleText("Argentina");
		List<WebElement> selected = mycountry.getAllSelectedOptions();
		System.out.println(selected);
		
		
		
		//-----------------------------------------------------------------------
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		WebElement dummy = driver.findElement(By.xpath(""));
		Select dum = new Select(dummy);
		dum.selectByVisibleText("");
		dum.selectByIndex(0);
		
		
		List<WebElement> dummy1 = driver.findElements(By.xpath(""));
		for (WebElement dummy2:dummy1) {
			System.out.println(dummy2.getText());
			
			
		}
		
	}

}
