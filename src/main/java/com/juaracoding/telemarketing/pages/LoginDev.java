package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

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
	
	@FindBy(xpath = "//span[normalize-space()='YA']")
	private WebElement btnYa;

	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']")
	private WebElement btnOke;
	
	@FindBy(css = "#nikita-form-dialog")
	private WebElement popupPeringatan;
	
	@FindBy(css = "#nikita-form-dialog")
	private WebElement welcome;


//	@FindBy(xpath = "//*[@id=\"nikita-form-dialog\"")
//	private WebElement msgError;
//	/button[@type="button"]
	
	public void login(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickBtnSignin() {
		btnSignin.click();
	}
	
	public void clickBtnClose() {
		btnOke.click();
	}
	
	public String msgError() {
		return popupPeringatan.getText();
	}
	
	public String msgSuccess() {
		return welcome.getText();
	}
	
	public void developerProfile() {
		developerProfile.click();
		btnOke.click();
		btnYa.click();
		
	}
	
//	public String msgError() {
//		return msgError.getText();
//	}

}
