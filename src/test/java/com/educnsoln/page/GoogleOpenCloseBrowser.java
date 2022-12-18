package com.educnsoln.page;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.cast.Cast;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;

@SuppressWarnings("unused")
public class GoogleOpenCloseBrowser extends CommonFunctions {
	static String homepath = System.getProperty("user.dir");
	static WebDriver driver;
	// WebDriver driver;

	static Logger log = (Logger) LogManager.getLogger(GoogleOpenCloseBrowser.class);

	public GoogleOpenCloseBrowser(WebDriver driver) {
		GoogleOpenCloseBrowser.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) throws InterruptedException {
		launchBrowser1("chrome");
		//Thread.sleep(1000);
		//driver.quit();

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

	public void btnclick6(ExtentTest test, Map<Object, Object> data) {
		//driver.quit();
		log.info("GoogleOpenCloseBrowser is launched");
		System.out.println("check execution");
		test.log(Status.PASS, "GoogleOpenCloseBrowser is Succesful");

	}
}






		

				 
		
		

		
		


			    
			    
		   
