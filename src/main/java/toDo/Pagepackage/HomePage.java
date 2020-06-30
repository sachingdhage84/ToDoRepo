package toDo.Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import toDo.BasePackage.TestBase;

public class HomePage extends TestBase {

	 // page factory  OR Objcet Repository
	
	@FindBy(xpath="//a[@href='examples/react']")
	WebElement React;
	
	@FindBy(xpath="(//a)[22]")
    WebElement petehunt;
	
	@FindBy(xpath="(//a)[23]")
	WebElement TodoMVC;
	
	@FindBy(className="new-todo")
	WebElement ToDOTextBox;
	
	@FindBy(className="clear-completed")
	WebElement clearCompletedTab;
	
	@FindBy(linkText="All")
	WebElement AllTab ;
	
	@FindBy(linkText="Active")
	WebElement ActiveTab  ;
	
	@FindBy(linkText="Completed")
	WebElement CompletedTab ;
	
	@FindBy(xpath="(//label)[1]")
	By DownWardArrow ;
	
   @FindBy(xpath="(//label)[2]")
   By ToDo1Label;
   
   @FindBy(xpath="(//label)[3]")
   By ToDo3Label;
	
   @FindBy(xpath="(//button)[1]")
   By ToDo1Destroy;
   
   @FindBy(xpath="(//button)[3]")
   By ToDo3Destroy;
	
   @FindBy(xpath="(//div)[2]/input[@class='toggle']")
   WebElement Toggle1;
   
   @FindBy(xpath=("(//div)[4]/input[@class='toggle']"))
   WebElement Toggle3;


	
//  Create a Constructor of Class to initialize all above Object Repos	
	
	public HomePage() {
		
		PageFactory.initElements(driver,this);
	
		// Here "this" means current class objects
	
	}
	
// Actions available on Homepage :
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	
	}
	
	public void Reactbutton() {
		React.click();
	}
	
    public void doubleClick() {
    	
    	Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(ToDo1Label)).doubleClick();

	 }
    public void DeleteToDo() {
    	
        WebElement Element=driver.findElement(By.xpath("(//label)[2]"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(Element).build().perform();
		
		driver.findElement(By.xpath("(//button)[1]")).click();

		WebElement Element1=driver.findElement(By.xpath("(//label)[3]"));
		
		Actions actions1 = new Actions(driver);
		
		actions1.moveToElement(Element1).build().perform();
		
		driver.findElement(By.xpath("(//button)[2]")).click();
	  
	  }
	
     public void ClearCompletedTab()
     {
    	Toggle1.click();
    	
    	clearCompletedTab.click();

     }
    	
     public void Completedtab()
     {
  
    	 Toggle1.click();
    	 Toggle3.click();
    	 CompletedTab.click();

     }
     
     public void LinkonHomePage() throws InterruptedException {
    	 petehunt.click();
    	 Thread.sleep(5000);
    	 driver.navigate().back();
    	 TodoMVC.click();
    	 
    	 
     }
	public String ToDoEntry(String ToDo) {
		
		ToDOTextBox.sendKeys(ToDo);
		
	    return ToDo;
	
	}
	
	
}
