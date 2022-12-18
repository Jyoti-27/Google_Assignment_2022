package com.educnsoln.page;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;

public class GoogleWebPage extends CommonFunctions {
	static String homepath = System.getProperty("user.dir");
	static WebDriver driver;
	// WebDriver driver;

	static Logger log = (Logger) LogManager.getLogger(GoogleWebPage.class);

	public GoogleWebPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) throws InterruptedException {
		launchBrowser1("chrome");
		//Thread.sleep(1000);
		// driver.quit();

	}

	public static void launchBrowser1(String browser) {

		switch (browser) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver",
					homepath + "\\src\\test\\resources\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			// System.out.println(driver.getTitle());

			break;

		case "edge":

			System.setProperty("webdriver.edge.driver", homepath + "\\src\\test\\resources\\drivers\\msedgedriver.exe");

			driver = new EdgeDriver();

			break;
		}
	}

	public void btnclick(ExtentTest test, Map<Object, Object> data) {
		log.info("GoogleWebPage is launched");
		System.out.println("check execution ");
		test.log(Status.PASS, "GoogleWebPage is Succesful");

	}

}
