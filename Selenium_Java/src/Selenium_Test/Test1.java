package Selenium_Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		
		//Selenium Manager
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://al-enterprise.youtrack.cloud/");
		
		WebElement SSO;
		SSO=driver.findElement(By.xpath("//img[@class='login-page__authmodules__module__icon']"));
		SSO.click();
		
		//driver.findElement(By.xpath(//*[contains(@id,'')]));
		//*[@id = ""];
		//*[contains(@id, "")];
		
		WebElement Username;
		Username=driver.findElement(By.xpath("//input[@placeholder='User Name']"));
		Username.sendKeys("mpalaniy");
		
		WebElement Signin1;
		Signin1=driver.findElement(By.xpath("//input[@id='loginButton_0']"));
		Signin1.click();
		
		WebElement Password;
		Password=driver.findElement(By.xpath("//*[@placeholder='Password']"));
		Password.sendKeys("Mohanpalani@24");
		
		WebElement Signin2;
		Signin2=driver.findElement(By.id("loginButton_0"));
		Signin2.click();
		
		WebElement MFA;
		MFA=driver.findElement(By.xpath("//label[@class='btn btn-default ']"));
	    MFA.click();
	    

	  		
		driver.manage().deleteAllCookies();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		//wait.until(ExpectedConditions.visibilityOfElementLocated());
		//wait.until(ExpectedConditions.elementToBeClickable());
		
		
		

	}

}
