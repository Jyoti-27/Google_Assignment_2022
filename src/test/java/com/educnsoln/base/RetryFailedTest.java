
package com.educnsoln.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer {

	int count = 0;
	int retrylimit = 2;

	@Override
	public boolean retry(ITestResult result) {
		if (count < retrylimit) {
			count++;  //2  i.e. // o/p count=1, next o/p count=1
			System.out.println("Retrying with attemt-"+count);
			return true;   //retry
		}
		return false;   // if o/p count>2 then false

	}

}



/*package com.educnsoln.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer {
	
	//class level
	//tesng.xml via listener 

	 
	  private int retryCount = 0;
	  private static final int maxRetryCount =2;
	 
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }

	  
}
*/