/*package com.educnsoln.page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
public class GoogleAppPage extends CommonFunctions {
	WebDriver driver;	
	
	@FindBy(tagName = "svg")  WebElement googleapps;
//	@FindBy(tagName = "LVal7b u4RcUd")  WebElement googleapps1;
//	@FindBy(className = "tX9u1b")  WebElement googleapps1;
	static Logger log=(Logger) LogManager.getLogger(GoogleAppPage.class);
	
	public GoogleAppPage(WebDriver driver){
		this.driver=driver;		
		PageFactory.initElements(driver, this);		
	}
	
	
	public void btnclick1(ExtentTest test, Map<Object, Object> data) {
		
	
	    
		//List<WebElement> list = driver.findElements(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a"));
		///html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a
		//LVal7b u4RcUd
		//System.out.println(list.size());

		//for (int i = 0; i<list.size(); i++) {
		//	@SuppressWarnings("unused")
		//	String listitem1 = list.get(i).getText();  
			//if (listitem1.contains(""))    
			//{
			//	list.get(i).click();    
			//	break;
			//}     

		
	}   
		
		        googleapps.click();
		      //  googleapps1.click();
		    
				log.info("Google app is clicked");
				System.out.println("check execution ");
				test.log(Status.PASS, "GoogleAppPage is Succesful");
		
	  }
}*/

	

package com.educnsoln.page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
import com.aventstack.extentreports.model.Log;
import com.educnsoln.base.CommonFunctions;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class GoogleAppPage {
	static WebDriver driver;
	static Logger log=LogManager.getLogger(Account_POM.class);
	public GoogleAppPage(WebDriver driver2) {
		
		//Logger log=(Logger) LogManager.getLogger(GoogleAppPage.class);
		// Logger log=(Logger) LogManager.getLogger(GoogleAppPage.class);
		
	//	public GoogleAppPage(WebDriver driver){
			this.driver=driver;		
			PageFactory.initElements(driver, this);		
		}
		
	

	@BeforeMethod
	public void bronch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	
		
	}
	
	@Test
	public void login() {
		
		
  WebElement googleApps =driver.findElement(By.className("gb_Se"));
  googleApps.click();
 // Log.info("googleApps is clicked");
  
  
	}

	public void btnclick1(ExtentTest test, Map<Object, Object> data) {
		log.info("googleApps is clicked");	
		test.log(Status.PASS,"googleApps is clicked");
	}
}
		
		
	
		
		
		
		
				
			
	
