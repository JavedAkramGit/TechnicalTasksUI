package demoqa.project.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	



	public class LaunchPage {
		
		
		
		//Create object of WebDriver
		WebDriver ldriver;
		WebDriverWait wait;
		
		
		public LaunchPage(WebDriver rdriver )
		{
			
			ldriver = rdriver;
			
			PageFactory.initElements(rdriver, this);
			
			
		}
		
		
		//Find WebELements
		
		@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
		WebElement BookStoreBtn;
		
		
	
		
		//Identify action on Webelement
		public void clickBookStoreBtn()
		{
			wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]")));
			BookStoreBtn.click();
		}
		
		
	/*	public boolean verifylogin()
		{
			wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search_input")));
			
			if(searchFilter.isDisplayed())
			{
				return true;
			}
			
			else 
				
				return false;
		}
		*/
		
		
		

	}


