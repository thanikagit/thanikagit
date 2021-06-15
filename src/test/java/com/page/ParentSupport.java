package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import pom.Parent_POM;

public class ParentSupport extends BaseTest {

	WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raji\\eclipse-workspace\\First\\OneKosmos\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	private void register() throws Throwable {
		Parent_POM driv = new Parent_POM(driver);
		SoftAssert asrt = new SoftAssert();
		driver.get("https://www.mypedia.pearson.com/login");
		Thread.sleep(10000);
		driver.manage().window().maximize();

		try {
			driver.switchTo().frame("contentIframe");
			System.out.println("Switching to iframe to handle popup");
			driver.findElement(By.xpath("//*[@id=\"spanDone\"]")).click();
			System.out.println("Intermediate popup is displaying and it is closed");
		} catch (Exception e) {
			System.out.println("No intermediate popup");

		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div/div/div[2]/a")).click();
		Thread.sleep(2000);
		BaseTest.click(driv.getCreateAccount());
		Thread.sleep(4000);
		boolean button=driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/button/div/div/span")).isEnabled();
		if(button==true) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driv.getFName());
		actions.click();
		String FName = BaseTest.getExcelData("Sheet2", 1, 0);
		actions.sendKeys(FName);
		actions.build().perform();
		}
		if(button==true) {
			Actions actions = new Actions(driver);
			actions.moveToElement(driv.getLName());
			actions.click();
			String LName = BaseTest.getExcelData("Sheet2", 1, 1);
			actions.sendKeys(LName);
			actions.build().perform();
			}
		if(button==true) {
			Actions actions = new Actions(driver);
			actions.moveToElement(driv.getEmail());
			actions.click();
			String EMail = BaseTest.getExcelData("Sheet2", 1, 2);
			actions.sendKeys(EMail);
			actions.build().perform();
			}
		
		if(button==true) {
			Actions actions = new Actions(driver);
			actions.moveToElement(driv.getPName());
			actions.click();
			String PName= BaseTest.getExcelData("Sheet2", 1, 3);
			actions.sendKeys(PName);
			actions.build().perform();
			}
		if(button==true) {
			Actions actions = new Actions(driver);
			actions.moveToElement(driv.getPPassword());
			actions.click();
			String CPass = BaseTest.getExcelData("Sheet2", 1, 4);
			actions.sendKeys(CPass);
			actions.build().perform();
			}
		if(button==true) {
			Actions actions = new Actions(driver);
			actions.moveToElement(driv.getCPassword());
			actions.click();
			String COPass = BaseTest.getExcelData("Sheet2", 1, 4);
			actions.sendKeys(COPass);
			actions.build().perform();
			}
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driv.getCaptcha());
		actions.click();
		actions.sendKeys("SOME");
		actions.build().perform();
		BaseTest.click(driv.getCreate());
		driver.close();
		
		
				
	
	}

}
