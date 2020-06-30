package toDo.BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import toDo.utils.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		
	  try {
		  prop=new Properties();
		  FileInputStream ip=new FileInputStream("C:\\Users\\Lenovo\\Eclipse-work\\toDoMvc\\src\\main\\java\\toDo\\configPackage\\config.properties");
	  
	  prop.load(ip);
	  
	  }catch(FileNotFoundException e) {
		  e.printStackTrace();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	}	   
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
	    if(browserName.equals("chrome")) {
	    	
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    }
	    
	    else if(browserName.equals("Firefox")) {
	    	WebDriverManager.firefoxdriver().setup();
	    	driver=new FirefoxDriver();
	    }
	    
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	
	   driver.get(prop.getProperty("url"));
	   
	   
	
	
	}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	


