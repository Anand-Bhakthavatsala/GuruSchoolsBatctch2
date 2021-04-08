package com.indeedsearch;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

//implements ITestNGListener class to use it's methods.
public class Listeners implements ITestNGListener{
	
	  public void onStart(ITestContext context) {

		  System.out.println("onStart method started");
	  }
	  
	  public void onFinish(ITestContext context) {
	  System.out.println("onFinish method started");
	 
		 }
		 
		 public void onTestStart(ITestResult result) {
		 System.out.println("Testcase started and Testcase details are" +result.getName());
		 }
		 
		 public void onTestSuccess(ITestResult result) {
		 System.out.println("onTestSuccess Method" +result.getName());
		 }
		 
		 public void onTestFailure(ITestResult result) {
		 System.out.println("onTestFailure Method" +result.getName());
		 }
		 
		 public void onTestSkipped(ITestResult result) {
		 System.out.println("onTestSkipped Method" +result.getName());
		 }	
		
	}
