package com.educnsoln.runner;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.educnsoln.base.CommonFunctions;
import com.educnsoln.base.Constants;
import com.educnsoln.page.Account_POM;
import com.educnsoln.page.GoogleAppAccount;
import com.educnsoln.page.GoogleAppFrame;
import com.educnsoln.page.GoogleAppPage;
import com.educnsoln.page.GoogleGmailLogin;
import com.educnsoln.page.GoogleLanguage;
import com.educnsoln.page.GoogleOpenCloseBrowser;
import com.educnsoln.page.GoogleProductsVerify;
import com.educnsoln.page.GoogleSearchOperation;
import com.educnsoln.page.GoogleWebPage;
import com.educnsoln.page.Maps_POM;
import com.educnsoln.page.News_POM;
import com.educnsoln.page.Photos_POM;
import com.educnsoln.page.Play_POM;
import com.educnsoln.page.Youtube_POM;

/*import com.educnsoln.page.GoogleAccountApp;
import com.educnsoln.page.GoogleGmailLogin;
import com.educnsoln.page.GoogleIndividualApps;
import com.educnsoln.page.GoogleLanguageVerify;
import com.educnsoln.page.GoogleProductsVerify;
import com.educnsoln.page.GoogleSearchOperation;

//import com.educnsoln.pom.GoogleApps;
//import com.educnsoln.pom.GoogleAppsVerify;
//import com.educnsoln.pom.GoogleTestRunner;
//import com.educnsoln.pom.GoogleWebPage;
//import com.educnsoln.pom.LoginPage;   
 
 */

import com.educnsoln.utilities.ExcelReader;
import com.educnsoln.utilities.ExtentReportGenerator;
import com.educnsoln.utilities.PropertyReader;

@SuppressWarnings("unused")
public class TestRunnerG extends CommonFunctions {

	public static WebDriver driver;

	public static ExtentTest test;
	ExtentReports report;
	static Logger log = LogManager.getLogger(TestRunnerG.class);

	@BeforeTest
	public void beforeTest() {
		report = ExtentReportGenerator.extentReportsetup();
	}

	@DataProvider(name = "dp")
	public Object[][] datasupplier() throws IOException {

		Object[][] data = ExcelReader.excelReader();

		return data;
	}

	@BeforeMethod
	public void browserSetup() {
		driver = CommonFunctions.browserLaunch(PropertyReader.getProperty(Constants.BROWSER));
		driver.get(PropertyReader.getProperty(Constants.BASEURL));
	}

	@Test(enabled = true, dataProvider = "dp")
	public void testcase(Map<Object, Object> data) throws InterruptedException {
		if (getStringData(data.get("Execute")).equalsIgnoreCase("Yes")) {
			test = report.createTest(getStringData(data.get("TestCase_Name")));

			GoogleWebPage launchBrowser1 = new GoogleWebPage(driver); // Iterate google web page method
			launchBrowser1.btnclick(test, data);
			driver.quit();
			Thread.sleep(1000);   
			
		   // GoogleAppPage display1 = new GoogleAppPage(driver); 
			GoogleAppPage login = new GoogleAppPage(driver); 
			//display1.btnclick1(test, data);
			login.btnclick1(test, data);
			Thread.sleep(1000);   
			
			
			//GoogleLanguage display2 = new GoogleLanguage(driver);
			GoogleLanguage translateMethod = new GoogleLanguage(driver); 
			//display2.btnclick2(test, data);
			translateMethod.btnclick2(test, data);
			Thread.sleep(1000);     
			
		/*	GoogleProductsVerify display3= new GoogleProductsVerify(driver);
			display3.btnclick3(test, data); 
			Thread.sleep(1000);   */   
			
		/*  GoogleGmailLogin display4= new GoogleGmailLogin(driver);
			display4.btnclick4(test, data); 
			Thread.sleep(1000);    */    
			
			//GoogleSearchOperation display5= new GoogleSearchOperation(driver);
			GoogleSearchOperation searchMethod= new GoogleSearchOperation(driver);
			//display5.click(test, data); 
			searchMethod.btnclick5(test, data); 
			Thread.sleep(1000);              
			
		/*	GoogleOpenCloseBrowser launchBrowser1= new GoogleOpenCloseBrowser(driver);
			launchBrowser1.btnclick6(test, data); 
			driver.quit();
			Thread.sleep(1000);    */    
			
			
			//GoogleAppFrame1 display4= new GoogleAppFrame1(driver);                     
			GoogleAppFrame display4= new GoogleAppFrame(driver);
			display4.btnclick4(test, data); 
			Thread.sleep(1000); 
			
			
			Account_POM accountMethod= new Account_POM(driver);
			accountMethod.btnclick6(test, data); 
			driver.quit();
			Thread.sleep(1000);
			
			
			Maps_POM mapsMethod= new Maps_POM(driver);
			mapsMethod.btnclick7(test, data); 
			driver.quit();
			Thread.sleep(1000);
			
			News_POM newsMethod= new News_POM(driver);
			newsMethod.btnclick8(test, data); 
			driver.quit();
			Thread.sleep(1000);
			
			Photos_POM photosMethod= new Photos_POM(driver);
			photosMethod.btnclick9(test, data); 
			driver.quit();
			Thread.sleep(1000);
			
			Play_POM playMethod= new Play_POM(driver);
			playMethod.btnclick10(test, data); 
			driver.quit();
			Thread.sleep(1000);
			
		    Youtube_POM youtubeMethod= new Youtube_POM(driver);
		    youtubeMethod.btnclick11(test, data); 
			driver.quit();
			Thread.sleep(1000);
			
			
			
			
			

		
			
			
			
			/*
			 * GoogleAppPage display = new GoogleAppPage(driver); //Iterate google web page
			 * method display.btnclick(test, data); Thread.sleep(1000);
			 * 
			 * GoogleAppFrame display1 = new GoogleAppFrame(driver); //Iterate google web
			 * page method display1.btnclick1(test, data); Thread.sleep(1000);
			 */

			// GoogleAppAccount display2 = new GoogleAppAccount(driver); //Iterate google
			// web page method
			// display2.btnclick2(test, data);
			// Thread.sleep(1000);

			/*
			 * GoogleAccountApp display1 = new GoogleAccountApp(driver); //
			 * display1.btnclick1(test, data); // Thread.sleep(2000);
			 * 
			 * GoogleLanguageVerify display2 = new GoogleLanguageVerify(driver) ;
			 * display2.btnclick2(test, data); Thread.sleep(2000);   */
			 

			/*
			 * GoogleIndividualApps display6= new GoogleIndividualApps(driver);
			 * display6.btnclick6(test, data); Thread.sleep(2000);
			 */

			/*
			 * 
			 * 
			 * GoogleGmailLogin display5= new GoogleGmailLogin(driver);
			 * display5.btnclick5(test, data); //Thread.sleep(2000);
			 */

			// System.out.println("GoogleOpenCloseBrowser is successful");
			// GoogleOpenCloseBrowser display3 = new GoogleOpenCloseBrowser(driver);
			// display3.launchBrowser1(test, data);
			// driver.quit();
			// Thread.sleep(2000);

			// softassert.assertAll("All soft assert executed");

		} else {
			log.debug("Test is Skipped:-" + getStringData(data.get("TestCase_Name")));
			throw new SkipException("Test is Skipped");

		}
	}

	@AfterMethod
	public void teardown() {
		// driver.quit();
	}

	@AfterTest
	public void afterTest() {
		report.flush();
	}

}




/*
 * TestRunnerDBdata import java.io.IOException; import java.util.Map;
 * 
 * import org.apache.logging.log4j.LogManager; import
 * org.apache.logging.log4j.Logger; import
 * org.apache.logging.log4j.spi.LoggerAdapter; import
 * org.openqa.selenium.WebDriver; import org.testng.SkipException; import
 * org.testng.annotations.AfterMethod; import org.testng.annotations.AfterTest;
 * import org.testng.annotations.BeforeMethod; import
 * org.testng.annotations.BeforeTest; import
 * org.testng.annotations.DataProvider; import org.testng.annotations.Test;
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.Status; import
 * com.aventstack.extentreports.reporter.ExtentSparkReporter; import
 * com.aventstack.extentreports.reporter.configuration.Theme; import
 * com.educnsoln.base.CommonFunctions; import com.educnsoln.base.Constants;
 * //import com.educnsoln.pom.AssignLeavePage; //import
 * com.educnsoln.pom.LoginPage; import com.educnsoln.utilities.DBHelper; import
 * com.educnsoln.utilities.ExcelReader; import
 * com.educnsoln.utilities.ExtentReportGenerator; import
 * com.educnsoln.utilities.PropertyReader;
 * 
 * public class TestRunnerDBdata extends CommonFunctions {
 * 
 * public static WebDriver driver;
 * 
 * public static ExtentTest test; ExtentReports report; static Logger
 * log=LogManager.getLogger(TestRunnerDBdata.class);
 * 
 * @BeforeTest public void beforeTest() { report =
 * ExtentReportGenerator.extentReportsetup(); }
 * 
 * @DataProvider(name = "dp") public Object[][] datasupplier() throws
 * IOException {
 * 
 * Object[][] data = DBHelper.getDBdata();
 * 
 * return data; }
 * 
 * @BeforeMethod public void browserSetup() { driver =
 * CommonFunctions.browserLaunch(PropertyReader.getProperty(Constants.BROWSER));
 * driver.get(PropertyReader.getProperty(Constants.BASEURL)); }
 * 
 * 
 * @Test(dataProvider="dp") public void test(Map<String, String> data) {
 * System.out.println(data.get("UserID"));
 * System.out.println(data.get("Password"));
 * 
 * 
 * 
 * }
 * 
 * 
 * @AfterMethod public void teardown() { driver.quit(); }
 * 
 * @AfterTest public void afterTest() { report.flush(); }
 * 
 */

/*
 * TestRunner import java.io.IOException; import java.util.Map;
 * 
 * import org.apache.logging.log4j.LogManager; import
 * org.apache.logging.log4j.Logger; import
 * org.apache.logging.log4j.spi.LoggerAdapter; import
 * org.openqa.selenium.WebDriver; import org.testng.SkipException; import
 * org.testng.annotations.AfterMethod; import org.testng.annotations.AfterTest;
 * import org.testng.annotations.BeforeMethod; import
 * org.testng.annotations.BeforeTest; import
 * org.testng.annotations.DataProvider; import org.testng.annotations.Test;
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.Status; import
 * com.aventstack.extentreports.reporter.ExtentSparkReporter; import
 * com.aventstack.extentreports.reporter.configuration.Theme; import
 * com.educnsoln.base.CommonFunctions; import com.educnsoln.base.Constants;
 * import com.educnsoln.pom.AssignLeavePage; import com.educnsoln.pom.LoginPage;
 * import com.educnsoln.utilities.ExcelReader; import
 * com.educnsoln.utilities.ExtentReportGenerator; import
 * com.educnsoln.utilities.PropertyReader;
 * 
 * public class TestRunner extends CommonFunctions {
 * 
 * public static WebDriver driver;
 * 
 * public static ExtentTest test; ExtentReports report; static Logger
 * log=LogManager.getLogger(TestRunner.class);
 * 
 * @BeforeTest public void beforeTest() { report =
 * ExtentReportGenerator.extentReportsetup(); }
 * 
 * @DataProvider(name = "dp") public Object[][] datasupplier() throws
 * IOException {
 * 
 * Object[][] data = ExcelReader.excelReader();
 * 
 * return data; }
 * 
 * @BeforeMethod public void browserSetup() { driver =
 * CommonFunctions.browserLaunch(PropertyReader.getProperty(Constants.BROWSER));
 * driver.get(PropertyReader.getProperty(Constants.BASEURL)); }
 * 
 * 
 * @Test(enabled = true, dataProvider = "dp") public void testcase(Map<Object,
 * Object> data) {
 * if(getStringData(data.get("Execute")).equalsIgnoreCase("Yes")){ test =
 * report.createTest(getStringData(data.get("TestCase_Name"))); LoginPage login
 * = new LoginPage(driver); login.login(test, data); AssignLeavePage assignleave
 * = new AssignLeavePage(driver); assignleave.assignLeave(test, data);
 * softassert.assertAll("All soft assert executed"); } else {
 * log.debug("Test is Skipped:-"+getStringData(data.get("TestCase_Name")));
 * throw new SkipException("Test is Skipped");
 * 
 * 
 * } }
 * 
 * @AfterMethod public void teardown() { driver.quit(); }
 * 
 * @AfterTest public void afterTest() { report.flush(); }
 * 
 * }
 */
