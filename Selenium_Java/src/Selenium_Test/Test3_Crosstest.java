package Selenium_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test3_Crosstest {

	public static void main(String[] args) {
		//WebDriverManager
		//Selenium Manager
		
		WebDriver driver;
		driver = new EdgeDriver();
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.apple.com");
		driver.findElement(By.xpath("//*[@class=\"default button button-tertiary\"]")).click();
		WebElement IP;
		IP=driver.findElement(By.xpath("//[@type=\"text\"]"));
		IP.sendKeys("7397322050");

        System.out.println("Title: " + driver.getTitle());
        //driver.quit();

	}

}
