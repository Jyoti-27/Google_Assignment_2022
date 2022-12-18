package com.educnsoln.page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.educnsoln.base.CommonFunctions;


	@SuppressWarnings("unused")
	public class GoogleIndividualApps extends CommonFunctions {
		WebDriver driver;

		//@FindBy(name = "q") List<WebElement> googleindividualapp;
		
		//@FindBy(xpath = "//div[contains(@class,'aajZCb')]") googlesearch1; Rq5Gcb  j1ei8c
		//@FindBy(className="gNO89b") WebElement googlesearchbutton;
		
		@FindBy(className="j1ei8c") List<WebElement> googleindividualapp;
		
		//@FindBy(className="gb_Ue") List<WebElement> googleindividualapp;
		
		static Logger log=LogManager.getLogger(GoogleIndividualApps.class);
		
		public  GoogleIndividualApps(WebDriver driver){
			this.driver=driver;		
			PageFactory.initElements(driver, this);		
		}
		

			public void btnclick6(ExtentTest test, Map<Object, Object> data) {
				for (WebElement element : googleindividualapp) {
					element.click();
						
						
						}
						
					}

	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<>();
		List<WebElement> list = new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());


//To iterate Array List
		//for(int i=0;i<list.size();i++) {
		//	System.out.println(list.get(i));
		//}
		
		
	//	for (String k:list) {
	//		System.out.println(k);
		//}
		
		
		// Using Iterator
		//Iterator<String> itr=list.iterator();
		//while(itr.toString() != "Account")  {
		//	System.out.println(itr.next());
		//}  
		// TODO Auto-generated method stub
		
		Iterator<WebElement> itr=list.iterator();
		while(itr.hasNext())  {
			System.out.println(itr.next());
		}
		
		
		
        log.info("Google search is verified");
		

		System.out.println("check execution ");
	    //test.log(Status.PASS, "GoogleIndividualApps is verified suceessfully");

	}

}
