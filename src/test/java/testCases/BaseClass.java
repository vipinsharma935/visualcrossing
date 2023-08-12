package testCases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	
	
	@BeforeClass
	
	void setup() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
	    options.setAcceptInsecureCerts(true);
	    options.addArguments("−−start-maximized");
	    options.addArguments("--remote-allow-origins=*");
	    options.addArguments("--disable-notifications");
	    
	   
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.visualcrossing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Accept all cookies']")).click();
		//Alert alertwindow=driver.switchTo().alert();
		//WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		//alertwindow.dismiss();
	}
	
	
//	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
}
