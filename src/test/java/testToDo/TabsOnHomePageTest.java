package testToDo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import toDo.BasePackage.TestBase;
import toDo.Pagepackage.HomePage;

public class TabsOnHomePageTest extends TestBase {

	HomePage homepage;// define object of HomePage class at the class level
	
// Create a constructor of HomePageTest class	
	
	//public TabsOnHomePageTest() {
	//	super(); // "super class constructor" will be 
		         // called using "Super" Keyword
	
//	}
//@BeforeTest	
@BeforeMethod
	public void setUp() {
	initialization();	
	
// Create object of HomePage Class	
	homepage=new HomePage();
	}

@Test(priority=11)

public void clearCompletedTab() throws InterruptedException {
	homepage.Reactbutton();
	for(int i=1;i<5;i++)
	{		
	  homepage.ToDoEntry("ToDo"+i);
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ENTER).perform();
	}
	homepage.ClearCompletedTab();
	Thread.sleep(5000);
	
	}

@Test(priority=12)
public void AllTab() throws InterruptedException {
	
	homepage.Reactbutton();
	for(int i=1;i<5;i++)
	{		
	  homepage.ToDoEntry("ToDo"+i);
	
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ENTER).perform();
	}
	
    WebElement Element=driver.findElement(By.xpath("(//label)[2]"));
	
	Actions actions = new Actions(driver);
	
	actions.moveToElement(Element).build().perform();
	
	driver.findElement(By.xpath("(//button)[1]")).click();

	WebElement Element1=driver.findElement(By.xpath("(//label)[3]"));
	
	Actions actions1 = new Actions(driver);
	
	actions1.moveToElement(Element1).build().perform();
	
	driver.findElement(By.xpath("(//button)[2]")).click();
	
	//driver.findElement(By.xpath("(//button)[3]")).click();
	
	driver.findElement(By.linkText("All")).click();
	Thread.sleep(5000);
}

@Test(priority=13)
public void ActiveTab() throws InterruptedException {
	
	homepage.Reactbutton();
	for(int i=1;i<5;i++)
	{		
	  homepage.ToDoEntry("ToDo"+i);
	
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ENTER).perform();
	}
	
WebElement Element=driver.findElement(By.xpath("(//label)[2]"));
	
	Actions actions = new Actions(driver);
	
	actions.moveToElement(Element).build().perform();
	
	driver.findElement(By.xpath("(//button)[1]")).click();

	WebElement Element1=driver.findElement(By.xpath("(//label)[3]"));
	
	Actions actions1 = new Actions(driver);
	
	actions1.moveToElement(Element1).build().perform();
	
	driver.findElement(By.xpath("(//button)[2]")).click();
	
	driver.findElement(By.linkText("Active")).click();
	Thread.sleep(3000);

}

@Test(priority=14)
public void CompletedTab() {
	
	homepage.Reactbutton();
	for(int i=1;i<5;i++)
	{		
	  homepage.ToDoEntry("ToDo"+i);
	
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ENTER).perform();
	}
	
	homepage.ClearCompletedTab();
}






//@AfterTest
@AfterMethod
public void tearDown() {
	driver.quit();
}








}


