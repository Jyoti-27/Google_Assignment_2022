package com.educnsoln.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer {
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryFailedTest.class);
	}

}



/*package com.educnsoln.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListerner  implements  IAnnotationTransformer{
	@Override
	public void transform(ITestAnnotation annotation, 
                                                Class testClass, 
                                                Constructor testConstructor,
                                                Method testMethod) {
		annotation.setRetryAnalyzer(RetryFailed.class);
	}
}

*/