package demoqa.project.TestCases;



	
	

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;


	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.apache.commons.io.FileUtils;
	import org.apache.logging.log4j.*;
	import org.openqa.selenium.Cookie;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	import demoqa.projects.utilities.ReadConfig;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		
		
		
		ReadConfig readConfig = new ReadConfig();
		String Url = readConfig.getBaseUrl();
	    String browser = readConfig.getbrowser();
		
		public static Logger logger;
		public static WebDriver driver;
		
		
		@BeforeClass
		public void setup()
		{
			
			switch(browser.toLowerCase())
			{
			
			case "chrome":
				
				
	        driver = new ChromeDriver();
	        break;
	        
	        
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "msedge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
				
				default:
					driver = null;
					break;
	        	
	        
	        
			}
			
			
			//implicit wait of ten seconds
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			//logging
			logger = LogManager.getLogger("demoqa.project");
//			driver.manage().addCookie(new Cookie("MCPopupClosed", "yes"));
			


			
			
		
			
		}
		
		@AfterClass
		public void teardown()
		{
			
			driver.close();
			driver.quit();
		}
		

		
		
		

	}
