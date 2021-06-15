package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Login_POM extends BaseTest {
	
	public  Login_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"SI_0001\"]")
	private WebElement Logo;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div/div/div[2]/a")
	private WebElement ParentSupport;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/div[1]/div[2]")
	private WebElement Language;
	
	@FindBy(xpath="/html/body/div[8]/div/div[1]/div/div/div[2]/div/div/div[4]/button/div/div/span")
	private WebElement Popup;

	public WebElement getPopup() {
		return Popup;
	}

	public void setPopup(WebElement popup) {
		Popup = popup;
	}

	public WebElement getLogo() {
		return Logo;
	}

	public void setLogo(WebElement logo) {
		Logo = logo;
	}

	public WebElement getParentSupport() {
		return ParentSupport;
	}

	public void setParentSupport(WebElement parentSupport) {
		ParentSupport = parentSupport;
	}

	public WebElement getLanguage() {
		return Language;
	}

	public void setLanguage(WebElement language) {
		Language = language;
	}
	
	
}
