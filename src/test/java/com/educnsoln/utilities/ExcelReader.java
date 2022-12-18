package com.educnsoln.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReader {

	static String homepath = System.getProperty("user.dir");
	static File file = new File(homepath + "\\src\\test\\resources\\TestData\\TestData5.xlsx");
	
	//static File file = new File("webdriver.chrome.driver", "C:\\Users\\Chandana\\eclipse-workspace\\Google_Assignment_2022\\src\\test\\resources\\TestData\\TestData4.xlsx");
	// System,setProperty("webdriver.chrome.driver", "C:\\Users\\Chandana\\eclipse-workspace\\Google_Assignment_2022\\src\\test\\resources\\TestData\\TestData4.xlsx");
	// driver=new ChromeDriver();
    // driver.get("https://www.google.com/");
   //  System.out.println(driver.getTitle());
	
	 static XSSFSheet sheet;



	public static Object[][] excelReader() throws IOException {
		Map <Object , Object > data;
		FileInputStream fis = new FileInputStream(file); // inputstream excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // get hold of excelfile
		sheet = workbook.getSheet("sheet1"); // get hold of Sheet

		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] finaldata=new Object[rowcount-1][1];   //2*2
		for (int i = 1; i < rowcount; i++) {
			data=new HashMap<Object, Object>();
			for (int j = 0; j < cellcount; j++) {
				Object value=getvalue(i,j);
				System.out.println(value);				
				data.put(getvalue(0,j), value);
				finaldata[i-1][0]=data;

			}

		}
		return finaldata;

	}

	public static Object getvalue(int rownum, int colnum) {
		Object value = null;
		Cell cell = sheet.getRow(rownum).getCell(colnum);
		if (cell.getCellType() == CellType.NUMERIC) {
			int k = (int) cell.getNumericCellValue();
			value = k;

		} else if (cell.getCellType() == CellType.STRING) {
			value = cell.getStringCellValue();

		}
		return value;
	}

}    



/*package com.educnsoln.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

// 	object [][] = {{[key=value],[key=value],...... },{2,3},{},{}}; 

	static String homepath = System.getProperty("user.dir");
	static XSSFSheet sheet;
	File file;
	static XSSFWorkbook workbook;
	FileInputStream fis;

	public ExcelReader() {

		//file = new File(homepath + "//src//test//resources//TestData//TestData5.xlsx");
		String homepath = System.getProperty("user.dir");
		File file = new File(homepath + "\\src\\test\\resources\\TestData\\TestData5.xlsx");

		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
			System.out.println("excelcel reader constructor is called ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public HashMap<String, String> getExcelData(int rowNum) {
		HashMap<String, String> map = new HashMap<String, String>(); // key value
	
		Object[][] exceldata = null;
		try {

			for (int colNum = 0; colNum < getCellCount(); colNum++) {
				String data = getvalueFromCell(rowNum, colNum);
				map.put(getvalueFromCell(0, colNum), data);
			}
			// exceldata[rowNum-1][0]=map;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;

	}

	public static String getvalueFromCell(int row, int col) {
		Cell cell = sheet.getRow(row).getCell(col);
		String value = "";
		if (cell.getCellType().equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else {
			Double nvalue = cell.getNumericCellValue();
			int num = nvalue.intValue();
			System.out.println("num" + num);

			value = String.valueOf(num);
		}

		return value;

	}

	public int getRowCount() {
		int rowcount = sheet.getPhysicalNumberOfRows();
		return rowcount;
	}

	public static int getCellCount() {
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		return cellcount;
	}

	public static Object[][] ExcelReader() {
		// TODO Auto-generated method stub
		return null;
	}

	 
	

}*/

































































/*package com.educnsoln.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static String homepath = System.getProperty("user.dir");
	static File file = new File(homepath + "\\src\\test\\resources\\TestData\\TestData5.xlsx");
	static XSSFSheet sheet;

	public static Object[][] excelReader() throws IOException {
		Map<Object, Object> data;
		FileInputStream fis = new FileInputStream(file); // inputstream excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // get hold of excelfile
		sheet = workbook.getSheet("sheet1"); // get hold of Sheet

		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] finaldata = new Object[rowcount - 1][1]; // 2*2
		for (int i = 1; i < rowcount; i++) {
			data = new HashMap<Object, Object>();
			for (int j = 0; j < cellcount; j++) {
				Object value = getvalue(i, j);
				System.out.println(value);
				data.put(getvalue(0, j), value);
				finaldata[i - 1][0] = data;

			}

		}
		return finaldata;

	}

	public static Object getvalue(int rownum, int colnum) {
		Object value = null;
		Cell cell = sheet.getRow(rownum).getCell(colnum);
		if (cell.getCellType() == CellType.NUMERIC) {
			int k = (int) cell.getNumericCellValue();
			value = k;

		} else if (cell.getCellType() == CellType.STRING) {
			value = cell.getStringCellValue();

		}
		return value;
	}
}*/
