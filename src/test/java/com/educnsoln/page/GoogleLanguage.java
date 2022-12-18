/*package com.educnsoln.page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;

public class GoogleLanguage extends CommonFunctions {

	WebDriver driver;

	@FindBy(xpath = "//div[contains(@id,'SIvCob')]") List<WebElement> googlelanguageverify;
	
	
	// @FindBy(xpath = "//a[@href='/html/body/div[1]/div[4]/div/div/a[4]']/parent::div") WebElement googlelanguageverify;
	// @FindBy(xpath = "//div[contains(@id,'SIvCob')]")WebElement googlelanguageframe;

	static Logger log = LogManager.getLogger(GoogleLanguage.class);

	public GoogleLanguage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @SuppressWarnings("unchecked")
	public void btnclick2(ExtentTest test, Map<Object, Object> data) {
		
		
	                                            //	for (WebElement element : googlelanguageverify) {
			                                   // element.click();
			
		                                      // }
		
		
	//List<WebElement> list = driver.findElements(By.xpath("//div[contains(@id,'SIvCob')]"));
		
		
	//	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[1]"));
	//	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[2]"));
	//	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[3]"));
	//	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[4]"));
	//	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[5]"));
	//	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[6]"));
	//	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[7]"));   
		
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[8]"));
		
		
		//List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[4]/div/div/a[9]"));
	
		
		//*[@id="SIvCob"]/a[6]      /html/body/div[1]/div[4]/div/div/a[6]
			System.out.println(list.size());

			for (int i = 0; i<list.size(); i++) {
				@SuppressWarnings("unused")
				String listitem1 = list.get(i).getText();
				//if (listitem1.contains(""))    
				//{
					list.get(i).click();    
					break;
				//}     

			
		}  
	  
		
		// googlelanguageverify.click();
		log.info("Google Language is verified");

		System.out.println("check execution ");
		test.log(Status.PASS, "GoogleLanguageVerify is Successful");
	}

}     */



package com.educnsoln.page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.edusol.base.CommonMethods;



public class GoogleLanguage {

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[13]")
	WebElement translate;
	
	
	
	static Logger log = LogManager.getLogger(GoogleLanguage.class);
	public GoogleLanguage(WebDriver driver){
		
		this.driver=driver;
	    
		PageFactory.initElements(driver,this);
	
	}

public void translateMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		driver.switchTo().frame("app");
		//driver.switchTo().frame(1);
		//CommonMethods.jsScroll(driver, translate);
		Actions action=new Actions(driver);
		action.moveToElement(translate).perform();
		Thread.sleep(2000);
		translate.click();
		Thread.sleep(2000);
		//driver.navigate().back();
	
}

public void btnclick2(ExtentTest test, Map<Object, Object> data) {
	log.info("googlelanguage is clicked");			
	test.log(Status.PASS,"googlelanguage is clicked");
		}

private CharSequence getStringData(Object object) {
	// TODO Auto-generated method stub
	
	return null;
}
	
}


