package com.educnsoln.page;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;

public class GoogleGmailLogin extends CommonFunctions {
	
	WebDriver driver;	

//@FindBy(className = "gb_d") WebElement gmail;
//@FindBy(className = "BHzsHc")  WebElement useanotheraccount;
//@FindBy(className = "whsOnd zHQkBf")  WebElement googlegmailloginid;identifierId
//@FindBy(id = "identifierId")  WebElement googlegmailloginid;
//@FindBy(linkText = "sabarad.jyoti@gmail.com")  WebElement googlegmailloginid;
//@FindBy(name = "password")  WebElement googlegmailpassword;
//@FindBy(tagName = "svg")  WebElement googlegmailloginbtn; xpath("//input[@name='password']")).a-class gb_d
 
	


//@FindBy(xpath = "//a[@class='gb_d']") WebElement gmail;
//@FindBy(tagName = "a") WebElement gmailsignin;  
	////tagname[@atrribute_name='attributeValue']
	//@FindBy(xpath = "//a[@class='gb_1 gb_2 gb_8d gb_4 gb_8c']")  
//class    BHzsHc
//@FindBy(css=".BHzsHc")  WebElement useanotheraccount;
 
	


 //@FindBy(xpath = "//div[@class='VfPpkd-vQzf8d']")  WebElement nextbutton;
//@FindBy(xpath = "Jyo@#2714*")  WebElement googlegmailpassword;
 
	
	//@FindBy(xpath = "//a[@class='gb_1 gb_2 gb_8d gb_4 gb_8c']") WebElement gmailsignin;
	//@FindBy(xpath = "//a[@class= 'button']") WebElement gmailsignin;
	@FindBy(xpath = "//div[@class='BHzsHc']")  WebElement useanotheraccount;
	//@FindBy(className = "BHzsHc")  WebElement useanotheraccount;
	//@FindBy(xpath = "//input[@id='identifierId']")  WebElement googlegmailloginid;  //xpath "//input[@id='identifierId']"));
	//@FindBy(xpath = "//div[@class='Xb9hP']/parent::div") WebElement googlegmailloginid;
	//@FindBy(xpath = "//div[@class='whsOnd zHQkBf']/child::input") WebElement googlegmailloginid;
	@FindBy(css = "//input[type='email'][class='whsOnd zHQkBf']") WebElement googlegmailloginid;
	//cssSelector("input[type='text'][name='emailid']"));
	//@FindBy(xpath = "//input[@class='whsOnd zHQkBf']")  WebElement googlegmailloginid;
	//@FindBy(className = "VfPpkd-vQzf8d")  WebElement nextbutton;  // driver.findElement(By.id("identifierNext")).click();
	//@FindBy(xpath  = "//span[@class= 'VfPpkd-vQzf8d']")  WebElement nextbutton; 
	@FindBy(xpath = "//div[@class='VfPpkd-LgbsSe']") WebElement nextbutton; 
	//@FindBy(xpath = "//input[@name='password']")  WebElement googlegmailpassword;  //xpath("//input[@name='password']"));whsOnd zHQkBf
	@FindBy(xpath = "//input[@class='whsOnd zHQkBf']") WebElement googlegmailpassword;
	//VfPpkd-Jh9lGc  VfPpkd-vQzf8d  VfPpkd-LgbsSe    VfPpkd-J1Ukfc-LhBDec
	
	


static Logger log=(Logger) LogManager.getLogger(GoogleGmailLogin.class);

public GoogleGmailLogin(WebDriver driver){
	this.driver=driver;		
	PageFactory.initElements(driver, this);		
}
public static void main(String[] args)  {
	launchBrowser1("chrome");
	
}

		
private static void launchBrowser1(String string) {
	
	
}
public void launchBrowser1(ExtentTest test, Map<Object, Object> data) {
	
//	{
		//System.setProperty("webdriver.chrome.driver", homepath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		
	//	driver=new ChromeDriver();
		//System.out.println(driver.getTitle());
		
				//driver.get("https://www.gmail.com");
				//driver.get("mail.google.com");
				//System.out.println(driver.getTitle());
				//driver.close();
				//driver.quit();
				
	
	}
 
		
		
	
public void btnclick4(ExtentTest test, Map<Object, Object> data) 
//public void test(String googlegmailloginid, String googlegmailpassword  )
{
	
	useanotheraccount.click();
	log.info("Google useanotheraccount is clicked");
	
	nextbutton.click();
	log.info("Next button is clicked");
	
	if (getStringData(data.get("Email or phone")).equalsIgnoreCase("Yes")) {

		Assert.assertTrue(googlegmailloginid.getText().equalsIgnoreCase("sabarad.jyoti@gmail.com"), " text mismatch");		
		//googlegmailloginid.click();
		//log.info("user is filled emailid");			
		googlegmailloginid.sendKeys(getStringData(data.get("sabarad.jyoti@gmail.com")));
		//googlegmailloginid.sendKeys(getStringData(data.get("Email or phone")));
		log.info("user is filled emailid");	
		googlegmailloginid.click();
		
		if (getStringData(data.get("Enter your password")).equalsIgnoreCase("Yes")) {
		Assert.assertTrue(googlegmailpassword.getText().equalsIgnoreCase("Jy@2714#**"), "text mismatch");		
		//googlegmailpassword.click();
		//log.info("user is filled password");			
		googlegmailpassword.sendKeys(getStringData(data.get("Jyo@#2714*")));
		//googlegmailpassword.sendKeys(getStringData(data.get("Enter your password")));
		log.info("user is filled password");
		googlegmailpassword.click();
		
		
		System.out.println("check execution ");
		test.log(Status.PASS, "GoogleGmailLogin is Succesful");
		
		
     //	signin.sendKeys(getStringData(data.get("Signin")));		
	//	log.info("Signin is clicked");
	//	signin.click();
		
		//useanotheraccount.sendKeys(getStringData(data.get("Use another account")));		
		//log.info("Use another account is clicked");
		//useanotheraccount.click();
		
		//next.sendKeys(getStringData(data.get("Next")));		
		//log.info("Next is clicked");
		//next.click();
		
		//Email_or_phone.sendKeys(getStringData(data.get("Email or phone")));		
		//log.info("email is entered");
		
				
		//password.sendKeys(getStringData(data.get("Enter your password")));
		//log.info("password is entered");
		
		

	
	
	
	/*driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("**********");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		driver.findElement(By.name("password")).sendKeys("*******");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		// click on the profile icon
		driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a")).click();
		// click on the sign out
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Test = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign out')]")));
		Test.click();
		 driver.quit();*/
		
	
		
	//gmailsignin.click();
	//log.info("Google signin is clicked");
	
	
	//googlegmailloginid.click();
	//log.info("Google gmail loginid is filled");
	
	
	
	
	//googlegmailpassword.click();
	//log.info("Google gmail loginpassword is filled");
	
	System.out.println("check execution ");
	test.log(Status.PASS, "GoogleGmailLogin is Succesful");
			
		
   }
	
}
}
}

	
		
	






