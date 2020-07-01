package testToDo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import toDo.BasePackage.TestBase;
import toDo.Pagepackage.HomePage;

public class HomePageTest extends TestBase {

	HomePage homepage;// define object of HomePage class at the class level
	
// Create a constructor of HomePageTest class	
	
	public HomePageTest() {
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
	
	@Test(priority=1)
	public void ReactToDoMvc()
	{
		homepage.Reactbutton();
	
	}

	@Test(priority=2)
	public void addCharToDos() {
		
		homepage.Reactbutton();
		for(int i=1;i<5;i++)
		{		
		  homepage.ToDoEntry("ToDo"+i);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		}

	}
	
	@Test(priority=3)
	public void editingToDo() throws InterruptedException {
		
		homepage.Reactbutton();
		for(int i=1;i<5;i++)
		{		
		  homepage.ToDoEntry("ToDo"+i);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		}
		
	    Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//label)[2]"))).doubleClick()
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.sendKeys("Test")
		.build().perform();
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		  actions1.sendKeys(Keys.ENTER).perform();
		}
	
	@Test(priority=4)
	public void comboOfIntCharSpecCharToDo() throws InterruptedException {
		
		homepage.Reactbutton();
		homepage.ToDoEntry("ToDo"+"@123");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();

	}
	
	@Test(priority=5)
	public void toDoWithSpaceBar() throws InterruptedException {
		
		homepage.Reactbutton();
		homepage.ToDoEntry("Test"+" "+"The"+" "+"ToDo");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();

	}
	
	@Test(priority=6)
	public void DuplicateToDos() throws InterruptedException {
		
		homepage.Reactbutton();
		for(int i=1;i<3;i++)
		{		
		  homepage.ToDoEntry("ToDo1");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		}
	}
	
	@Test(priority=7)
	public void InfiniteCharToDo() throws InterruptedException {
		
		homepage.Reactbutton();
		homepage.ToDoEntry("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmvvvvvqwertyuiopasdfghjklzxcvbnmvvvqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmvqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfac");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
	}
 
	@Test(priority=8)
	public void deletionOfToDos() {
	
		homepage.Reactbutton();
		for(int i=1;i<5;i++)
		{		
		  homepage.ToDoEntry("ToDo"+i);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		}
		
		homepage.DeleteToDo();
		
	}	
	
	@Test(priority=9)
	public void DownWardArrowWithCompletedTab() {
		
		homepage.Reactbutton();
		for(int i=1;i<5;i++)
		{		
		  homepage.ToDoEntry("ToDo"+i);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		}
		
		driver.findElement(By.xpath("(//label)[1]")).click();
		driver.findElement(By.linkText("Completed")).click();
	
		
		
	}

	@Test(priority=10)
	public void downWardArrowWithActiveTab() {
		
		homepage.Reactbutton();
		for(int i=1;i<5;i++)
		{		
		  homepage.ToDoEntry("ToDo"+i);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		}
		
		driver.findElement(By.xpath("(//label)[1]")).click();
		driver.findElement(By.linkText("Active")).click();
	
		
		
	}
    
//	@AfterTest
 	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
	
	

