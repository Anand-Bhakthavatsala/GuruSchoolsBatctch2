package Seleniumexcercise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DragAndDrop {

		public static void main(String[] args) throws InterruptedException, IOException {
		// Adding the comment to test in git
			String browser="chrome";
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
			 
			String URL = "https://demoqa.com/droppable/";
			driver.get(URL);
		
			//Adding wait 
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

			Actions act = new Actions(driver);
			
			WebElement from = driver.findElement(By.id("draggable"));
			WebElement to = driver.findElement(By.id("droppable"));
			
			act.dragAndDrop(from, to).perform();
			
			String textValue = to.getText();
			
			if(textValue.equals("Dropped!"))
			{
				System.out.println("PASS: Source is dropped to target as expected!");
			}
			else
				System.out.println("FAIL: Source couldnot be dropped to target");
			
			
		//	Assert.assertTrue(textValue, true);
			//Screenshot to save
			File src=null;	
			src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("C:/Screenshot-local/"+"scr-"+System.currentTimeMillis()+".png"));
	
			Thread.sleep(2000);
			driver.close();
	}

}
