/*package com.educnsoln.page;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;

@SuppressWarnings("unused")
public class GoogleSearchOperation extends CommonFunctions {
	WebDriver driver;

	@FindBy(name = "q") List<WebElement> googlesearch;
	//@FindBy(xpath = "//div[contains(@class,'aajZCb')]") googlesearch1;    
	// @FindBy(className="YacQv gsfi") List<WebElement> googlesearch;
	// @FindBy(xpath = "//div[contains(@class,'YacQv gsfi')]")List<WebElement> googlesearch;
	// @FindBy(xpath = "//input[contains(@class,'gLFyf gsfi')]")List<WebElement> googlesearch;
    // @FindBy(className="gLFyf gsfi") List<WebElement> googlesearch;
	// @FindBy(tagName="input") List<WebElement> googlesearch;
	 
	
	static Logger log=LogManager.getLogger(GoogleSearchOperation.class);
	
	public GoogleSearchOperation(WebDriver driver){
		this.driver=driver;		
		PageFactory.initElements(driver, this);		
	}
	

		public void btnclick5(ExtentTest test, Map<Object, Object> data) {
			for (WebElement element : googlesearch) {
				element.click();
				
				
				if (getStringData(data.get("googlesearch")).equalsIgnoreCase("Yes")) {

					Assert.assertTrue(((WebElement) googlesearch).getText().equalsIgnoreCase("Amitabh Bachchan"), "text mismatch");		
					((WebElement) googlesearch).click();
					log.info("googlesearch is clicked");			
					((WebElement) googlesearch).sendKeys(getStringData(data.get("Amitabh Bachchan")));
					
				
					
					}
					
				} */
				
			
            //	WebElement element1 = driver.findElement(By.name("q"));
			//	element1.sendKeys("Abdul Kalam");
				
			//	Thread.sleep(1000);

			//	List<WebElement> list1 = driver.findElements(By.xpath("//div[contains(@class,'aajZCb')]"));
			//	System.out.println(list1.size());

			                        //	for (int i = 0; i<List.size(); i++) {
				                   //	String listitem1 = List.get(i).getText();
				                	// if (listitem1.contains("abdul kalam birthday"))    
				                 	//{
						            // list1.get(i).click();
					                //	break;
				                   //	}     

				
			                      //      }  
		
	                           	//log.info("Google search is verified");
		

		                       // System.out.println("check execution ");
	                          // 	test.log(Status.PASS, "Google Search operaton is verified suceessfully");		
			
                             //	}
	
                             // }                



package com.educnsoln.page;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;









import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class GoogleSearchOperation {
    
	
	static Logger log = LogManager.getLogger(GoogleSearchOperation.class);
	WebDriver driver;

	@FindBy(xpath = "//div[@class='gb_yf']")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[2]")
	WebElement search;

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchBox;

	@FindBy(xpath = "//*[text()='Amitabh Bachchan']")
	WebElement Name;

	public GoogleSearchOperation(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void searchMethod(WebDriver driver) throws Exception {
		
		FirstClick.click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		//FirstClick.click();
		//Thread.sleep(2000);
		driver.switchTo().frame(1);
		search.click();

		searchBox.sendKeys("Amitabh bachchan");
		searchBox.sendKeys(Keys.ENTER);
		Name.isDisplayed();
		//driver.navigate().back();

	}

	public void btnclick5(ExtentTest test, Map<Object, Object> data) {
		
		log.info("googlesearch is clicked");			
		((WebElement) searchBox).sendKeys(getStringData(data.get("Amitabh Bachchan")));
		
		
			}

	private CharSequence getStringData(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}


		