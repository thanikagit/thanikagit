package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Parent_POM extends BaseTest {
	
	public WebElement getFName() {
		return FName;
	}

	public void setFName(WebElement fName) {
		FName = fName;
	}

	public WebElement getLName() {
		return LName;
	}

	public void setLName(WebElement lName) {
		LName = lName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(WebElement email) {
		Email = email;
	}

	public WebElement getCountry() {
		return Country;
	}

	public void setCountry(WebElement country) {
		Country = country;
	}

	public WebElement getPName() {
		return PName;
	}

	public void setPName(WebElement pName) {
		PName = pName;
	}

	public WebElement getPPassword() {
		return PPassword;
	}

	public void setPPassword(WebElement pPassword) {
		PPassword = pPassword;
	}

	public WebElement getCPassword() {
		return CPassword;
	}

	public void setCPassword(WebElement cPassword) {
		CPassword = cPassword;
	}

	public WebElement getCreate() {
		return Create;
	}

	public void setCreate(WebElement create) {
		Create = create;
	}

	public  Parent_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'First name')]")
	private WebElement FName;
	
	@FindBy(xpath="//*[contains(text(),'Last name')]")
	private WebElement LName;
	
	@FindBy(xpath="//*[contains(text(),'Email address')]")
	private WebElement Email;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]")
	private WebElement Country;
	
	@FindBy(xpath="//*[contains(text(),'Create parent username')]")
	private WebElement PName;
	
	@FindBy(xpath="//*[contains(text(),'Create parent password')]")
	private WebElement PPassword;
	
	@FindBy(xpath="//*[contains(text(),'Confirm password')]")
	private WebElement CPassword;
	
	@FindBy(xpath="/html/body/div[1]/div/div[5]/div/button/div/div/span")
	private WebElement Create;
	
	@FindBy(xpath="//*[contains(text(),'CREATE A NEW ACCOUNT')]")
	private WebElement CreateAccount;
	
	
	
	@FindBy(xpath="//*[contains(text(),'Validate Captcha')]")
	private WebElement Captcha;

	public WebElement getCaptcha() {
		return Captcha;
	}

	public void setCaptcha(WebElement captcha) {
		Captcha = captcha;
	}

	public WebElement getCreateAccount() {
		return CreateAccount;
	}

	public void setCreateAccount(WebElement createAccount) {
		CreateAccount = createAccount;
	}
		
}
