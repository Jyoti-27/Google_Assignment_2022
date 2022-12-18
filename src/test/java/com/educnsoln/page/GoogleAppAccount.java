package com.educnsoln.page;

import java.util.List;
//import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;


@SuppressWarnings("unused")
public class GoogleAppAccount extends CommonFunctions {
	

	WebDriver driver;
	//@FindBy(tagName = "svg")  List<WebElement> googleapps1; //class j1ei8c   j1ei8c
   //@FindBy(tagName = "div")  WebElement googleaccountapp;
  // @FindBy(className = "j1ei8c")  WebElement googleaccountapp;
 
	//@FindBy(className = "j1ei8c") List<WebElement> googleappaccount;
	//@FindBy(xpath = "//a[@data-pid ='192']") WebElement googleappaccount;
	//@FindBy(xpath = "//*[@data-pid ='192']//self::a") WebElement googleappaccount;
	@FindBy(xpath = "//*[@data-pid ='192']//parent::ul") WebElement googleappaccount;
	//tX9u1b

	
	static Logger log=LogManager.getLogger(GoogleAppAccount.class);
	
	public GoogleAppAccount(WebDriver driver){
		this.driver=driver;		
		PageFactory.initElements(driver, this);		
	}
	
	
	//@SuppressWarnings("unchecked")
	public void btnclick2(ExtentTest test, Map<Object, Object> data) {
	    googleappaccount.click();
		log.info("Google Account app is clicked");

		System.out.println("check execution ");
		test.log(Status.PASS, "Google account app is Successful");
				
			
	}
		
 }

	





