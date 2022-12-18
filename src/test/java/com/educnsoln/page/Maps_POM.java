package com.educnsoln.page;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Maps_POM {
WebDriver driver;
    
static Logger log=LogManager.getLogger(Maps_POM.class);
	@FindBy(xpath = "//div[@class='gb_yf']  ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[3]")
	WebElement maps;
	
	@FindBy(xpath = "//button[@id='widget-zoom-in']")
	WebElement mapSearch;
	
	
	
	public Maps_POM(WebDriver driver){
		
		this.driver=driver;
	    
		PageFactory.initElements(driver,this);
	
	}

public void mapsMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		//driver.switchTo().frame(1);
		driver.switchTo().frame("app");
		maps.click();
		mapSearch.click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
	//	driver.navigate().back();
	}

public void btnclick7(ExtentTest test, Map<Object, Object> data) {
	log.info("Maps_POM is clicked");
	test.log(Status.PASS,"Maps_POM is clicked");
}
	

}


