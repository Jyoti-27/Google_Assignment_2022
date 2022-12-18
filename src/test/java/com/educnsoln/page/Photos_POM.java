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

public class Photos_POM {
	WebDriver driver;
	
	static Logger log=LogManager.getLogger(Photos_POM.class);
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[14]")
	WebElement photos;
	
	public Photos_POM(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

public void photosMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		driver.switchTo().frame(1);
		photos.click();
		Thread.sleep(2000);
		//driver.navigate().back();
	
}
public void btnclick9(ExtentTest test, Map<Object, Object> data) {
	log.info("Photos_POM is clicked");
	test.log(Status.PASS,"Photos_POM is clicked");
 }

}