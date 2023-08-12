package testCases;


import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ViewWeatherData;



//Run All
public class TC_001_ViewWeatherCity extends BaseClass{
	
	@Test
	void test_weather_city()
	{
		try
		{
		HomePage homePage= new HomePage(driver);
		
		//homePage.acceptall();
		homePage.weatherData();
	
		ViewWeatherData viewWeather=new ViewWeatherData(driver);
		viewWeather.inputCityName("New Delhi");
		viewWeather.clickSearchbtn();
		String confmsg=viewWeather.getConfirmationMsg();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String confmsg2=viewWeather.getConfirmationMsg2();
		Assert.assertEquals(confmsg2, "Historical weather data for New Delhi");
		driver.quit();
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	
	
	}
	




