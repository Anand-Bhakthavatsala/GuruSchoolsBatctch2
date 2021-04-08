package com.indeedsearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.indeedsearch.Listeners.class)

public class TestListenerDemo {

	WebDriver driver;
	@Test

	public void loginParameters () {


		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_88v\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		driver.findElement(By.id("userName")).sendKeys("cthakkar");
		driver.findElement(By.id("password")).sendKeys("Cht1964$");
		driver.findElement(By.id("login")).click();
		driver.close();

	}

}
