package com.educnsoln.page;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Youtube_POM {
	
	WebDriver driver;
	
	static Logger log=LogManager.getLogger(Youtube_POM.class);
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[4]")
	WebElement youtube;
	
	public Youtube_POM(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}

public void youtubeMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		driver.switchTo().frame(1);
		youtube.click();
		Thread.sleep(2000);
	//	driver.navigate().back();
		
	}

public void btnclick11(ExtentTest test, Map<Object, Object> data) {
	log.info("Youtube_POM is clicked");
	test.log(Status.PASS,"Youtube_POM is clicked");
	
}
	

}