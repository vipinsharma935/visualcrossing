package pageObjects;

	
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;

public class ViewWeatherData extends BasePage {

			public ViewWeatherData(WebDriver driver) {
				super(driver);
			}

			// Elements

			@FindBy(xpath="//*[@id='wxlocation']")	
			WebElement wcity;
			
			@FindBy(xpath="//button[text()='Search']")
			WebElement searchbtn;
			
			@FindBy(xpath="//div[normalize-space()='Max temp']")
			WebElement assertfeels;
			
			@FindBy(xpath="//*[text()='Historical weather data for New Delhi']")
			WebElement assertWeather;
			
			public void inputCityName(String cname)
			{
				wcity.sendKeys(cname);
			}
			

			public void clickSearchbtn()
			{
				searchbtn.click();
			}
			
			public String getConfirmationMsg()
			{
				try 
				{
					return (assertfeels.getText());
				}
				catch (Exception e)
				{
					return(e.getMessage());
				}
				
			}
			
			public String getConfirmationMsg2()
			{
				try 
				{
					return (assertWeather.getText());
				}
				catch (Exception e)
				{
					return(e.getMessage());
				}
				
			}	
			
	}


