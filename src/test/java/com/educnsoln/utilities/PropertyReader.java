package com.educnsoln.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("unused")
public class PropertyReader {

	static String homepath = System.getProperty("user.dir");
	static File file = new File(homepath + "\\src\\test\\resources\\Config.properties");

	public static String getProperty(String key) {
		Properties prop = new Properties();
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
			prop.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = (String) prop.get(key);
		return value;

	}

}


/*package com.educnsoln.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import com.educnsoln.base.BrowserFactory;


public class PropertyReader {

	public static String readProperties(String key) {
	//	File file = new File(BrowserFactory.homepath + "/src/test/resources/Config.properties");
		String homepath = System.getProperty("user.dir");
		File file = new File(homepath + "\\src\\test\\resources\\Config.properties");
		FileInputStream fis;
		String value="";
		try {
			fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);   //chrome

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
	public static String readPropertiesOR(String key) {
		//File file = new File(BrowserFactory.homepath + "/src/test/resources/or.properties");
		String homepath = System.getProperty("user.dir");
		File file = new File(homepath + "\\src\\test\\resources\\Config.properties");
		FileInputStream fis;
		String value="";
		try {
			fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);   //chrome

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}
	public static String getProperty(String baseurl) {
		// TODO Auto-generated method stub
		return null;
	}
		

}
*/