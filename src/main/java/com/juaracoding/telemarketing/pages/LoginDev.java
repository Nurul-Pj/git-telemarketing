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
	
	@FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]")
	private WebElement logout;
	
	@FindBy(xpath = "//span[normalize-space()='YA']")
	private WebElement btnYa;

	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
	private WebElement btnOkeValid;
	
	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']")
	private WebElement btnOkInvalid;
	
	@FindBy(css = "#nikita-form-dialog")
	private WebElement popupPeringatan;


	@FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]")
	private WebElement welcome;
	
	@FindBy(xpath = "//span[normalize-space()='DEVELOPER']")
	private WebElement developerProfile;
	
	
	
	public void login(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickBtnSignin() {
		btnSignin.click();
	}
	
	public void clickBtnClose() {
		btnOkInvalid.click();
	}
	
	public String msgError() {
		return popupPeringatan.getText();
	}
	
	public String msgSuccess() {
		return welcome.getText();
	}
	
	public void deleteLogin() {
		username.sendKeys(Keys.CONTROL+"A");
		username.sendKeys(Keys.BACK_SPACE);
		password.sendKeys(Keys.CONTROL+"A");
		password.sendKeys(Keys.BACK_SPACE);
	}
	
	public void clickBtnOkeValid() {
		btnOkeValid.click();
	}
	
	public void developerProfile() {
		developerProfile.click();
		delay(2);
		btnYa.click();
		
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
