package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

//import io.cucumber.messages.types.Duration;

public class LoginDev {
	
	private WebDriver driver;
	
	public LoginDev() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"tl_login-1-51550_text\"]")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"tl_login-1-51551_text\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"51552_query\"]")
	private WebElement btnSignin;
	
	@FindBy(xpath = "//span[normalize-space()='DEVELOPER']")
	private WebElement developerProfile;
	
	@FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]")
	private WebElement logout;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnYa;

	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']")
	private WebElement btnOkeInvalid;
	
	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']")
	private WebElement btnOkeValid;
	
	@FindBy(css = "#nikita-form-dialog")
	private WebElement welcomePopup;
	
	@FindBy(xpath = "//*[@id='nikita-form-dialog']")
	private WebElement errorPopup;


	
	public void login(String username,String password) {
		this.username.sendKeys(username);
		delay(2);
		this.password.sendKeys(password);
	}
	
	public void clickBtnSignin() {
		btnSignin.click();
	}
	
	public void clickBtnOkeInvalid() {
		delay(2);
		btnOkeInvalid.click();
	}
	
	public void clickBtnOkevalid() {
		btnOkeValid.click();
	}
	
	public String msgSucces() {
		return welcomePopup.getText();
	}
	
	public String msgError() {
		return errorPopup.getText();
	}
	
	public String logoutPopup() {
		return logout.getText();
	}
	
	public void developerProfile() {
		developerProfile.click();
	}
	
	public void clickBtnYa() {
		delay(2);
		btnYa.click();
	}
	
	public void updateData(String username, String password){
		this.username.sendKeys(Keys.CONTROL,"A");
		this.username.sendKeys(Keys.BACK_SPACE);
		this.password.sendKeys(Keys.CONTROL,"A");
		this.password.sendKeys(Keys.BACK_SPACE);
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
