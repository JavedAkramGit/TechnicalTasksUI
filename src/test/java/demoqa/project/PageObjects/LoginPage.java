package demoqa.project.PageObjects;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {




		

		
				
				
				
				//Create object of WebDriver
				WebDriver ldriver;
				WebDriverWait wait;
				
				
				public LoginPage(WebDriver rdriver )
				{
					
					ldriver = rdriver;
					
					PageFactory.initElements(rdriver, this);
					
					
				}
				
				
				//Find WebELements
				
				@FindBy(id = "userName")
				WebElement usernameBtn;
				
				@FindBy(id = "password")
				WebElement passwordBtn;
				
				@FindBy(id = "login")
				WebElement LoginButton;
				
				
			
				
				//Identify action on Webelement
				public void enteruserName(String UserName)
				{
					wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
					usernameBtn.sendKeys(UserName);
				}
				
				
				
				public void enterpassWord(String PassWord)
				{
					wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
					passwordBtn.sendKeys(PassWord);
				}
				
				
				public void clickLoginButton()
				{
					wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
					LoginButton.click();
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







