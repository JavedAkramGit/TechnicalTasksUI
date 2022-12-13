package demoqa.project.PageObjects;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage {
	

	
			
			
			
			//Create object of WebDriver
			WebDriver ldriver;
			WebDriverWait wait;
			
			
			public BookStorePage(WebDriver rdriver )
			{
				
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);
				
				
			}
			
			
			//Find WebELements
			
			@FindBy(id = "login")
			WebElement loginBtn;
			
			
			@FindBy(linkText = "Git Pocket Guide")
			WebElement FirstBook;
			
		
			
			//Identify action on Webelement
			public void clickloginBtn()
			{
				wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
				loginBtn.click();
			}
			
			public void clickFirstBook()
			{
				wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Git Pocket Guide")));
				FirstBook.click();
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





