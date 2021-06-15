package com.page;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;

/*import base.BaseTest;
import pom.Login_POM;*/

public class LoginPage extends BaseTest {

	WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raji\\eclipse-workspace\\First\\OneKosmos\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	private void loginpage() throws Throwable {
		// Login_POM d1 = new Login_POM(driver);
		Thread.sleep(3000);
		SoftAssert asrt = new SoftAssert();
		driver.get("https://www.mypedia.pearson.com/login");

		Thread.sleep(10000);
		WebElement page = driver.findElement(By.id("SI_0001"));
		System.out.println("Page loaded properly");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		// switching to Iframe to close the intermediate popup
		try {
			driver.switchTo().frame("contentIframe");
			System.out.println("Switching to iframe to handle popup");
			driver.findElement(By.xpath("//*[@id=\"spanDone\"]")).click();
			System.out.println("Intermediate popup is displaying and it is closed");
		} catch (Exception e) {
			System.out.println("No intermediate popup");

		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[2]")).click();
		Thread.sleep(10000);
		System.out.println("Language dropdown is selected");

		List<WebElement> language = (List<WebElement>) driver.findElements(By.xpath("//span[@role='menuitem']"));
		int a = language.size();
		for (int i = 0; i < language.size(); i++) {
			String lang = language.get(i).getText();
			System.out.println("languages : " + lang);
		}
		Thread.sleep(2000);

		// Checking hindi is selected
		try {
			driver.findElement(By.xpath("//*[@id=\"main-body-container\"]/div[11]/div/div/div/div[2]/span")).click();
			Thread.sleep(5000);
			WebElement hindi = driver.findElement(By.xpath("//*[contains(text(),'अग्रसर रहें')]"));
			String Hinditext = driver.findElement(By.xpath("//*[contains(text(),'अग्रसर रहें')]")).getText();
			asrt.assertEquals(Hinditext, "अग्रसर रहें", "Button in Hindi");
			Thread.sleep(3000);
			if (hindi.isDisplayed()) {
				System.out.println("Continue button changed into hindi based on the language selection ");

			} else {
				System.out.println("Continue button not changed into hindi based on the language selection");
			}
		} catch (Exception e) {
			System.out.println("No Hindi xpath");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[2]")).click();

		// Checking Espansoel is selected
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@id=\"main-body-container\"]/div[11]/div/div/div/div[3]/span")).click();
			Thread.sleep(5000);
			WebElement ESpanol = driver.findElement(By.xpath("//*[contains(text(),'Continuar')]"));

			String Esptext = driver.findElement(By.xpath("//*[contains(text(),'Continuar')]")).getText();

			asrt.assertEquals(Esptext, "CONTINUAR", "Button in Espansoel");
			Thread.sleep(3000);
			if (ESpanol.isDisplayed()) {
				System.out.println("Continue button changed into Espanol based on the language selection");

			} else {
				System.out.println("Continue button not changed into Espanol based on the language selection");
			}
		} catch (Exception e) {
			System.out.println("No ESpanol xpath");
		}

		// Checking English is selected

		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[2]")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@id=\"main-body-container\"]/div[11]/div/div/div/div[1]/span")).click();
			Thread.sleep(5000);
			WebElement English = driver.findElement(By.xpath("//*[contains(text(),'Continue')]"));
			String engtextString = English.getText();
			asrt.assertEquals(engtextString, "CONTINUE", "Button in English");
			Thread.sleep(3000);
			if (English.isDisplayed()) {
				System.out.println("Continue button changed into English based on the language selection");

			} else {
				System.out.println("Continue button not changed into English based on the language selection");
			}
		} catch (Exception e) {
			System.out.println("No English xpath");
		}

		asrt.assertAll();
		driver.close();
	}

}