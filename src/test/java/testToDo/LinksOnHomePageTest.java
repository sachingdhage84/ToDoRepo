package testToDo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import toDo.BasePackage.TestBase;
import toDo.Pagepackage.HomePage;

public class LinksOnHomePageTest extends TestBase {

	HomePage homepage;// define object of HomePage class at the class level
	
	// Create a constructor of HomePageTest class	
		
		public LinksOnHomePageTest() {
			super(); // "super class constructor" will be 
			         // called using "Super" Keyword
		
		}
	//@BeforeTest	
	@BeforeMethod
		public void setUp() {
		initialization();	
		
	// Create object of HomePage Class	
		homepage=new HomePage();
		}
	

@Test(priority=15)
public void LinkOnHomePage() throws InterruptedException {
	homepage.LinkonHomePage();
}



//@AfterTest
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
