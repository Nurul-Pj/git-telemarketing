package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class LoginAgent {
	
	private WebDriver driver;
	
	public LoginAgent() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"tl_login-1-51550_text\"]")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"tl_login-1-51551_text\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"51552_query\"]")
	private WebElement btnSignin;
	
	@FindBy(xpath = "//span[normalize-space()='Dian monica oktavia']")
	private WebElement profile;
	
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
	private WebElement popupDashboard;
	

	
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
		return this.popupPeringatan.getText();
	}
	
	public String msgSuccess() {
		return this.popupDashboard.getText();
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
	
	public void clickProfile() {
		profile.click();
		btnYa.click();
	}
	
//	public String msgError() {
//		return msgError.getText();
//	}

}
