package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.w3c.dom.UserDataHandler;

import com.juaracoding.telemarketing.pages.LoginAgent;
import com.juaracoding.telemarketing.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Then.Thens;
import io.cucumber.java.en.When;

public class TestLogin {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private LoginAgent loginAgent = new LoginAgent();
	
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
	
	@When("User go to Web Telemarketing invalid")
	public void user_go_to_web_telemarketing_invalid() {
		driver.get(Constants.URL_INVALID);
		extentTest.log(LogStatus.PASS, "User go to Web Telemarketing invalid");
	}
	
	
	@And("User enter username invalid")
	public void user_enter_username_invalid() {
		loginAgent.login("agent001", "1");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User enter password invalid")
	public void user_enter_password_invalid() {
		loginAgent.clickBtnClose();
		loginAgent.deleteLogin();
		loginAgent.login("agent1", "23");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User enter username null")
	public void user_enter_username_null() {
		loginAgent.clickBtnClose();
		loginAgent.deleteLogin();
		loginAgent.login("", "23");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User enter password null")
	public void user_enter_password_null() {
		loginAgent.clickBtnClose();
		loginAgent.deleteLogin();
		loginAgent.login("agent1", "");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	
	@And("User click button sign in")
	public void user_click_button_sign_in() {
		loginAgent.clickBtnSignin();
		extentTest.log(LogStatus.PASS, "User click button sign in");
		delay(2);
	}
	
	
	@Then("User invalid credentials")
	public void user_invalid_credentilas() {
	String actual = loginAgent.popUp();
	assertTrue(actual.contains("Username atau password tidak ditemukan atau akun anda tidak aktif"));
	extentTest.log(LogStatus.PASS, "User invalid credentials");
	delay(2);
	}
	
	@Then("User valid credentials")
	public void user_valid_credentilas() {
		String actual = loginAgent.popUp();
		assertTrue(actual.contains("Welcome"));
		extentTest.log(LogStatus.PASS, "User valid credentials");
		delay(2);
	}
	
//	@And("User enter {string} as username and {string} as password")
//	public void fillForm(String username, String password) {
//		loginAgent.login(username, password);		
//	}
	
	
	@And("User enter username and password valid" )
	public void user_enter_username_and_password_valid() {
		loginAgent.clickBtnClose();
		loginAgent.deleteLogin();		
		loginAgent.login("agent01", "1");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
		delay(2);
	}
	
	@And("User enter username ignore letter case and password valid" )
	public void user_enter_username_ignorelettercase_and_password_valid() {	
		loginAgent.login("aGeNT01", "1");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@And("User enter username uppercase and password valid" )
	public void user_enter_username_uppercase_and_password_valid() {		
		loginAgent.login("AGENT01", "1");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	

	@And("User click button ok")
	public void user_click_button_ok() {
		delay(2);
		loginAgent.clickBtnOkeValid();
		extentTest.log(LogStatus.PASS, "User click button ok");
	}
	
	@And("User click profile")
	public void user_click_profile() {
		loginAgent.clickProfile();
		delay(2);
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
