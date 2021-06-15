package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseTest {
	
	public static  WebDriver driver;
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void typedata(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void select_value(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
	}
	
	public static void select_text(WebElement element, String text) {
		Select s = new Select (element);
		s.selectByVisibleText(text);
	}
	
	public static void select_string(WebElement element, String text) {
		Select s = new Select (element);
		s.selectByValue(text);
	}
	
	public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
		FileInputStream fis = new FileInputStream("C:\\Users\\Raji\\eclipse-workspace\\First\\OneKosmos\\Data\\testdata.xls");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetName);
		 Row row = sh.getRow(rowNum);
		 String data = row.getCell(colNum).getStringCellValue();
		 wb.close();
			return data;
		
		
	}
	
	
}
