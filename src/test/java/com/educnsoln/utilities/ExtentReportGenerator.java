package com.educnsoln.utilities;

import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	static String homepath = System.getProperty("user.dir");
	static ExtentReports report;	
	public static ExtentReports extentReportsetup() {
		
		ExtentSparkReporter htmlreporter=new ExtentSparkReporter(homepath+"\\src\\test\\resources\\Reports\\Extentreport.html");
		htmlreporter.config().setDocumentTitle("Execution report");
		htmlreporter.config().setTheme(Theme.DARK);	
		
		report=new ExtentReports();
		report.attachReporter(htmlreporter);
		return report;	
	}
	
	
}



/*package com.educnsoln.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent=	new ExtentReports();
	public static ExtentTest test;
	
        public static ExtentReports extentReportsetup() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./src/test/resources/Reports/extent-report.html");
		reporter.config().setReportName("Edusolution Extent Report");		
		reporter.config().setTheme(Theme.DARK);
		 extent.attachReporter(reporter);
		 return extent;
	}
	
	

	public static ExtentTest startTest(String testName) {
		 ExtentTest test = extentReportsetup().createTest(testName);
		return test;
	}
}
*/