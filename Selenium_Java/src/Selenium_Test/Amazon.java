package Selenium_Test;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		//Selenium Manager
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement IP;
		IP=driver.findElement(By.xpath("//*[@id='APjFqb']"));
		IP.sendKeys("iPhone");
		
		
	}

}
