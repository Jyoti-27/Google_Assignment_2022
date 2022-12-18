
// package com.educnsoln.page;
 

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.educnsoln.base.CommonFunctions;

//public class GoogleAppFrame extends CommonFunctions {
//WebDriver driver;

                                                          //@FindBy(className = "LVal7b u4RcUd") WebElement googleappsframe;
                                                          //@FindBy(tagName = "ul") WebElement googleappsframe;
                                                         //@FindBy(jsName = 'k77Iif' and className = 'LVal7b u4RcUd') WebElement googleappsframe;
                                                        //@FindBy(xpath = "//*[className = 'LVal7b u4RcUd']//parent:: ul") WebElement googleappsframe;

                                                     //chain xpath- //tagname1[@attribute1=value1]//tagname2[@attribute2=value2]

//@FindBy(xpath="//ul[@class = 'LVal7b u4RcUd' and @jsname = 'k77Iif']") List<WebElement> googleappsframe;

                                                  //@FindBy(tagName = "[@class = 'LVal7b u4RcUd']") List<WebElement> googleappsframe;

                                                 //@FindBy(xpath = "//*[@data-pid ='192']//parent::ul") WebElement googleappaccount;

                                               //@FindBy(className = "j1ei8c") WebElement googleappaccount;

                                             //@FindBy(xpath ="//a[contains(@class,'j1ei8c')]") WebElement googleappaccount;

//@FindBy(xpath = "li[@class = 'j1ei8c']/parent::ul") WebElement googleappaccount; 

//static Logger log=(Logger) LogManager.getLogger(GoogleAppPage.class);

//public GoogleAppFrame(WebDriver driver){
//	this.driver=driver;		
//	PageFactory.initElements(driver, this);		
//}


//public void btnclick1(ExtentTest test, Map<Object, Object> data) {
	
	
//	driver.switchTo().frame("googleappsframe");
	                                                 //List<WebElement> headers = driver.findElements(By.id("sampleHeading"));
//	System.out.println(((List<WebElement>) googleappaccount).size());
//	System.out.println(((List<WebElement>) googleappaccount).get(0).getText());
	                      //driver.switchTo().frame("googleappsframe");
//	((WebElement) googleappsframe).click();
//	googleappaccount.click();
	
	
	
	
	// Using Iterator
	
	//Iterator<WebElement> itr=((List<WebElement>) test).iterator();
	//	while(itr.toString() != "googleappsframe")  {
	//			System.out.println(itr.next());
	//		}  
			
			
			                         //Iterator<WebElement> itr1=((List<WebElement>) test).iterator();
			                         //while(itr1.hasNext())  {
			                        //	System.out.println(itr1.next());
			                        //}
			 
	
	   
       //  googleappaccount.click();
	
	
	
	
	                                                                          //Using Array
	
	                                                                          //List<WebElement> list = new ArrayList<>();
	                                                                         //System.out.println(list);
	                                                                         //System.out.println(list.size());


                                                                            //To iterate Array List
	                                                                        //for(int i=0;i<list.size();i++) {
	                                                                            //	System.out.println(list.get(i));
                                                                                   	//}
	
	
	                                                                                  //for (WebElement k:list) {
	                                                                                 //	System.out.println(k);
                                                                                  	//}                                          
	
         
    
   
	
                                                                                	//log.info("Google app frame is clicked");
                                                                                	//log.info("Google app account is clicked");
	                                                                               //System.out.println("check execution ");
	                           //System.out.println(googleappsframe.size());
	                           //System.out.println(googleappsframe.get(0).getText());
                                                                          //	test.log(Status.PASS, "GoogleAppFrame is Succesful");

	                                                                                //}

                                                         //}  


package com.educnsoln.page;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class GoogleAppFrame {
	WebDriver driver;

	
	static Logger log = LogManager.getLogger(GoogleAppFrame.class);
	public GoogleAppFrame(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}


	@BeforeMethod
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse demo\\AssignmentOnGoogle\\src\\test\\resources\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	
	}

	
	@Test
	public void account() {
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
		element.get(0).click();
	    

		driver.switchTo().frame(1);
		
		WebElement account =driver.findElement(By.xpath("//li[@class='j1ei8c']"));
		account.click();
		
		
	}
	@Test
	public void search()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement search =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[2]"));
	search.click();
	
	}
	@Test
	public void maps()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement maps =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[3]"));
	maps.click();
	WebElement mapSearch =driver.findElement(By.xpath("//button[@id='widget-zoom-in']"));
	mapSearch.click();
	
	}
	@Test
	public void youtube()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement youtube =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[4]"));
	youtube.click();
	
	}
	@Test
	public void play()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement play =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[5]"));
	play.click();
	
	}
	@Test
	public void news()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement news =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[6]"));
	news.click();
	
	}
	@Test
	public void gmail()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement gmail =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[7]"));
	gmail.click();
	
	}
	@Test
	public void drive()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement drive =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[11]"));
	drive.click();
	
	}
	@Test
	public void photos()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement photos =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[14]"));
	photos.click();
	
	}
	@Test
	public void Translate()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement translate =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[13]"));
	translate.click();
	
	}

	@BeforeMethod
	public void Tearedowan() {
    
	}


	public void btnclick4(ExtentTest test, Map<Object, Object> data) {
		log.info("googleappframe1 is clicked");
		test.log(Status.PASS,"googleappframe1 is clicked");
		
	}

}









