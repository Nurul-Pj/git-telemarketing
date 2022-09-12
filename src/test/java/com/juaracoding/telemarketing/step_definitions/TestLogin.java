package com.juaracoding.telemarketing.step_definitions;


import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.LoginDev;
import com.juaracoding.telemarketing.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private LoginDev loginDeveloper = new LoginDev();
	
	public TestLogin() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
//	Invalid Login
	@When("User go to Web Telemarketing")
	public void user_go_to_web_telemarketing() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web Telemarketing");
	}
	
	@And("User enter username invalid")
	public void user_enter_username_invalid() {
		loginDeveloper.login("developer1", "1");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User enter password invalid")
	public void user_enter_password_invalid() {
		loginDeveloper.clickBtnClose();
		loginDeveloper.deleteLogin();
		loginDeveloper.login("develope", "23");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User enter username null")
	public void user_enter_username_null() {
		loginDeveloper.clickBtnClose();
		loginDeveloper.deleteLogin();
		loginDeveloper.login("", "23");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User enter password null")
	public void user_enter_password_null() {
		loginDeveloper.clickBtnClose();
		loginDeveloper.deleteLogin();
		loginDeveloper.login("developer", "");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	
	@And("User click button sign in")
	public void user_click_button_sign_in() {
		loginDeveloper.clickBtnSignin();
		extentTest.log(LogStatus.PASS, "User click button sign in");
	}
	
	@And("User enter username and password valid" )
	public void user_enter_username_and_password_valid() {
		loginDeveloper.clickBtnClose();
		loginDeveloper.deleteLogin();		
		loginDeveloper.login("developer", "23");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@And("User enter username ignore letter case and password valid" )
	public void user_enter_username_ignorelettercase_and_password_valid() {	
		loginDeveloper.login("DeveLopeR", "23");
		delay(3);
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@And("User enter username uppercase and password valid" )
	public void user_enter_username_uppercase_and_password_valid() {		
		loginDeveloper.login("DEVELOPER", "23");
		delay(3);
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	

	@And("User click button ok")
	public void user_click_button_ok() {
		delay(3);
		loginDeveloper.clickBtnOkeValid();
		extentTest.log(LogStatus.PASS, "User click button ok");
	}
	
	@And("User click profile")
	public void user_click_profile() {
		loginDeveloper.developerProfile();
		delay(3);
		extentTest.log(LogStatus.PASS, "User click profile");
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
