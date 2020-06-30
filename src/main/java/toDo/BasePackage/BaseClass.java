package toDo.BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static void main(String[] args) {
	
		
	}
	
	public static void doLoginPage()
	{
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       driver.get("http://www.todomvc.com");
	       driver.manage().window().maximize();
	       driver.findElement(By.linkText("React")).click();	
	}
}

