package demoqa.project.PageObjects;






import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProfilePage {

	





			

			
					
					
					
					//Create object of WebDriver
					WebDriver ldriver;
					WebDriverWait wait;
					
					
					public ProfilePage(WebDriver rdriver )
					{
						
						ldriver = rdriver;
						
						PageFactory.initElements(rdriver, this);
						
						
					}
					
					
					//Find WebELements
					
					@FindBy(id = "see-book-Git Pocket Guide")
					WebElement Gitpocketbook;
					
					
					@FindBy(xpath="//*[@id=\"delete-record-undefined\"]")
					WebElement deleteBook;

					@FindBy(className="modal-content")
					WebElement deletemodal;
					
					WebElement acceptok = deletemodal.findElement(By.id("closeSmallModal-ok")); 
					
					@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]")
					WebElement row;
					
				
					
				
					
					//Identify action on Webelement
					public String getbooktext()
					{
						wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
						wait.until(ExpectedConditions.presenceOfElementLocated(By.id("see-book-Git Pocket Guide")));
						return Gitpocketbook.getText();
					}
					
					
					public void deletecurrentbook()
					{
						wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"delete-record-undefined\\\"]")));
						deleteBook.click();
					}
					
					
					public void switchmodal()
					{
						wait = new WebDriverWait(ldriver, Duration.ofSeconds(5));
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
						acceptok.click();
						
					} 
					
					
					public String rowtext()
					{
						return row.getText();
					}
					
					public boolean checknobook()
					{
					
						if(rowtext().equalsIgnoreCase("git Book"))
						
							return true;
						
						
						else 
							return false;
					
					}
						
					
					public void clickEnter()
					{
						
						Actions builder = new Actions(ldriver);        
						builder.sendKeys(Keys.ENTER);
					}
					
				
					
			
					
					
					

				






	}
	


