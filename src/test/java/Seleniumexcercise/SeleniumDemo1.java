package Seleniumexcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");  
	String browser="firefox";
	WebDriver driver=null;
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))	
	{
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();  
	}
	else
		System.out.println("This browser is not supported");
	     
	    driver.get("https://www.facebook.com/");
	    
	    WebElement username = driver.findElement(By.id("email"));
	    WebElement password = driver.findElement(By.id("pass"));
	    username.sendKeys("hello");
	  
	    Actions builder = new Actions(driver);//class Actions
	    Action seriesofActions = builder
	    		.moveToElement(password)
	    		.click()
	    		.keyDown(password,Keys.SHIFT)
	    		.sendKeys(password,"hello")
	    		.doubleClick(password)
	    		.contextClick()
	    		.build();
	    		
	    		

	}

}
