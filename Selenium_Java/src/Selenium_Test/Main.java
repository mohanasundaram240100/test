package Selenium_Test;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main{


	public static void main(String[]args) throws IOException{
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://google.com");
		
	
	
		//File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screen, new File("./google.png"));
		
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("window.scrollBy(0,250)", "");
	
		
		File screenshot = (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("screenshot.png"));
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,1000)", "");
		
		WebElement selected= driver.findElement(Byte.xpath(""));
		Select selecteditems= new Select(selected);
		selecteditems.selectByVisibleText("");
		
		List<WebElement> Selected2 = (List<WebElement>) driver.findElement(By.xpath(""));
		for(WebElement select2:Selected2) {
			
			System.out.println(select2.getText());
		}
		
	}
}
	

	
