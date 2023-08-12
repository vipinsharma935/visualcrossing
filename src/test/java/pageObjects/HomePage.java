package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	
	//@FindBy(xpath="//button[normalize-space()='Accept all cookies']")
	//button[text()='Accept all cookies']
	WebElement Acceptall ;
	@FindBy(xpath = "//a[@class='nav-link text-nowrap'][normalize-space()='Weather Data']")
	 WebElement weatherData;
    
	
	
	// Action Method
	public void acceptall()
	{
		Acceptall.click();
	}
	
	public void weatherData() 
	{
		weatherData.click();
	}

		
	}
	

