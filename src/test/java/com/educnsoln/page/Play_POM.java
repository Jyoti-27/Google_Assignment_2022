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

public class Play_POM {
	WebDriver driver;
	
	static Logger log=LogManager.getLogger(Play_POM.class);
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[5]")
	WebElement play;
	
	public Play_POM(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}

public void playMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		driver.switchTo().frame(1);
		play.click();
		Thread.sleep(2000);
	//	driver.navigate().back();
		
	}

public void btnclick10(ExtentTest test, Map<Object, Object> data) {
	log.info("Play_POM is clicked");
	test.log(Status.PASS,"Play_POM is clicked");
}
	
}
