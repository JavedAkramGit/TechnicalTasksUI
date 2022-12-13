package demoqa.project.PageObjects;





import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookDetailsPage {



		

		
				
				
				
				//Create object of WebDriver
				WebDriver ldriver;
				WebDriverWait wait;
				
				
				public BookDetailsPage(WebDriver rdriver )
				{
					
					ldriver = rdriver;
					
					PageFactory.initElements(rdriver, this);
					
					
				}
				
				
				//Find WebELements
				
				@FindBy(id = "addNewRecordButton")
				WebElement AddToYourCollectionBtn;
				
				
			
				
			
				
				//Identify action on Webelement
				public void clickAddtocollection()
				{
					JavascriptExecutor js = (JavascriptExecutor) ldriver;
					js.executeScript("arguments[0].scrollIntoView();", AddToYourCollectionBtn);
					wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
					wait.until(ExpectedConditions.elementToBeClickable(By.id("addNewRecordButton")));
					AddToYourCollectionBtn.click();
				}
				
				public void clickalert()
				{
					wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
				    wait.until(ExpectedConditions.alertIsPresent());
				    Alert alert = ldriver.switchTo().alert();
					 alert.accept();
					
					
				}
				
				public void clickEnter()
				{
					
					Actions builder = new Actions(ldriver);        
					builder.sendKeys(Keys.ENTER);
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







