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
	
	@FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]")
	private WebElement popUp;

	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']")
	private WebElement btnOke;

//	Logout
	@FindBy(xpath = "/html/body/div[8]/div[1]")
	private WebElement logout;
	
	//*[@id="nikita-form-dialog"]/p
	@FindBy(xpath = "//span[normalize-space()='Dian monica oktavia']")
	private WebElement agentProfile;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnYa;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[1]")
	private WebElement btnTidak;
	
	
	public void login(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickBtnSignin() {
		btnSignin.click();
	}
	
	
	public String appearGreeting() {
		return popUp.getText();
	}
	
	public void deleteLogin() {
		username.sendKeys(Keys.CONTROL+"A");
		username.sendKeys(Keys.BACK_SPACE);
		password.sendKeys(Keys.CONTROL+"A");
		password.sendKeys(Keys.BACK_SPACE);
	}
	
	public void clickBtnOke() {
		btnOke.click();
		delay(1);
	}
	
//	Logout
	public void logout() {
		agentProfile.click();
	}
	
	public String appearLogout() {
		return logout.getText();
	}
	
	public void clickBtnYa() {
		btnYa.click();
	}
	
	public void clickBtnTidak() {
		btnTidak.click();
		
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