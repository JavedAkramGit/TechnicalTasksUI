package demoqa.project.TestCases;


	

	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import static org.testng.Assert.assertTrue;

	import java.time.Duration;

	import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	

	import org.testng.annotations.Test;


import demoqa.project.PageObjects.BookDetailsPage;
import demoqa.project.PageObjects.BookStorePage;
import demoqa.project.PageObjects.LaunchPage;
import demoqa.project.PageObjects.LoginPage;
import demoqa.project.PageObjects.ProfilePage;
import demoqa.projects.utilities.ReadConfig;
	



	
	public class TestCase_001_LoginAdd  extends BaseClass{
		
		
		ReadConfig readconfig = new ReadConfig();
	
		
		@Test()
		public void testAddBook()
		{
			
			/*username = readconfig.getUserName();
			password = readconfig.getPassWord(); */
			
			//Open the Url
			driver.get(Url);
			driver.manage().window().maximize();
			/* driver.manage().addCookie(new Cookie("MCPopupClosed", "yes")); */
            logger.info("Url opened");
			
			
			////Click on bookStoreBtn
			LaunchPage lp = new LaunchPage(driver);
			//driver.manage().addCookie(new Cookie("MCPopupClosed", "yes"));
			lp.clickBookStoreBtn();
            logger.info("Book Store Button clicked");
            
            
            
            //Click on Login from BookStorepage
            BookStorePage bsp = new BookStorePage(driver);
            bsp.clickloginBtn();
            logger.info("Book Store login Button clicked");
            
			
			//Enter email and password
			LoginPage login = new LoginPage(driver);
			login.enteruserName(readconfig.getUserName());
			login.enterpassWord(readconfig.getPassWord());
			login.clickLoginButton();
			logger.info("Email and password entered");
			logger.info("Login button clicked");
			
			
			
			//Add FirstBook to collection
			bsp.clickFirstBook();
			logger.info("First Book Added");
			
			
			
			
			//In book details page add book to collection
			BookDetailsPage bdp = new BookDetailsPage(driver);
			bdp.clickAddtocollection();
			logger.info("Add To Collection button clicked");
			
			bdp.clickEnter();
			logger.info("Enter clicked");
			
			
			//Navigate to profile page and validate Book Added to collection
			ProfilePage pp = new ProfilePage(driver);
			AssertJUnit.assertEquals(pp.getbooktext(), readconfig.getBookName());
			logger.info("Verified that the book has been added to collection");
			
			
			


			
			

			
			
			
			
			
			
			
		}
		
		
		
			
			
		
		
		
		
		
		
		
		
		

	}



