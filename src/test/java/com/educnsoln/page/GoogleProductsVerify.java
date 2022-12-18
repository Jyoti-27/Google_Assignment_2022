package com.educnsoln.page;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;

public class GoogleProductsVerify extends CommonFunctions {
	static String homepath = System.getProperty("user.dir");
	static WebDriver driver;
	WebDriver chrome;

	// div class -glue-expansion-panel-content ; id-panel-1
	// ;("input[name*='mail']"));
	// "//input[@id='studentname']")) ;("//input[contains(@name,'father')]"))
	// @FindBy(id = "panel-1") WebElement googleproducts;
	// @FindBy(css = ".glue-expansion-panel-content") WebElement googleproducts;
	// @FindBy(css = "div[class*='glue-expansion-panel-content']") WebElement
	// googleproducts;
	// @FindBy(xpath = "//div[@class='glue-expansion-panel-content']") WebElement
	// googleproducts;

	@FindBy(xpath = "//div[contains(@class,'glue-expansion-panel-content')]")
	WebElement googleproducts;

	static Logger log = LogManager.getLogger(GoogleProductsVerify.class);

	@SuppressWarnings("static-access")
	public GoogleProductsVerify(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) {
		launchBrowser1("chrome");

	}

	private static void launchBrowser1(String string) {

	}

	public void launchBrowser1(ExtentTest test, Map<Object, Object> data) {

		{
			System.setProperty("webdriver.chrome.driver",
					homepath + "\\src\\test\\resources\\drivers\\chromedriver6.exe");

			driver = new ChromeDriver();
			// System.out.println(driver.getTitle());

			driver.get("https://about.google/intl/en/products/");
			System.out.println(driver.getTitle());
			// driver.close();
			// driver.quit();

		}
	}

	public void btnclick31(ExtentTest test, Map<Object, Object> data) {
		googleproducts.click();
		log.info("Google Products are displayed");

		System.out.println("check execution ");
		test.log(Status.PASS, "GoogleProductVerify is successful");

	}

	public void btnclick3(ExtentTest test, Map<Object, Object> data) {
		// TODO Auto-generated method stub
		
	}

}
