package com.juaracoding.telemarketing.step_definitions;

//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
//import org.w3c.dom.UserDataHandler;

import com.juaracoding.telemarketing.pages.LoginAgent;
//import com.juaracoding.telemarketing.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then.Thens;
import io.cucumber.java.en.When;

public class TestLoginAgent {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private LoginAgent loginAgent = new LoginAgent();
	
	public TestLoginAgent() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
//	Invalid Login
//	@When("User go to invalid Web Telemarketing")
//	public void user_go_to_web_telemarketing() {
//		driver.get(Constants.URL);
//		extentTest.log(LogStatus.PASS, "User go to invalid Web Telemarketing");
//	}
	
//	@When("User go to Web Telemarketing")
//	public void user_go_to_web_telemarketing_invalid() {
//		driver.get(Constants.URL_INVALID);
//		extentTest.log(LogStatus.PASS, "User go to Web Telemarketing");
//	}
	
	
	@And("User enter username invalid agent")
	public void user_enter_username_invalid_agent() {
		loginAgent.deleteLogin();
		delay(1);
		loginAgent.login("agent001", "1");
		delay(1);
		extentTest.log(LogStatus.PASS, "User enter username invalid agent");
	}
	
	@And("User enter username null agent")
	public void user_enter_username_null_agent() {
		loginAgent.deleteLogin();
		delay(1);
		loginAgent.login("", "");
		delay(1);
		extentTest.log(LogStatus.PASS, "User enter username null agent");
	}
	
//	@And("open appear greeting invalid")
//	public void open_appear_greeting_invalid() {
//		String actual = loginAgent.appearGreeting();
//		assertTrue(actual.contains("Username atau password"));
//		extentTest.log(LogStatus.PASS, "open appear greeting invalid");
//	}

	
//	Valid
	@And("User enter username and password valid login ignore lettercase agent" )
	public void user_enter_username_and_password_valid_login_ignore_lettercase_agent() {		
		loginAgent.deleteLogin();
		delay(1);
		loginAgent.login("AgeNt01", "1");
		extentTest.log(LogStatus.PASS, "User enter username and password valid login ignore lettercase_agent");
	}
	
	@And("User enter username and password valid login uppercase agent" )
	public void user_enter_username_and_password_valid_login_uppercase_agent() {
		loginAgent.deleteLogin();
		delay(1);
		loginAgent.login("AGENT01", "1");
		extentTest.log(LogStatus.PASS, "User enter username and password valid login uppercase agent");
	}
	
	@And("User enter username and password valid login agent" )
	public void user_enter_username_and_password_valid_login_agent() {
		loginAgent.deleteLogin();
		delay(1);
		loginAgent.login("agent01", "1");
		extentTest.log(LogStatus.PASS, "User enter username and password valid login agent");
	}
	
//	@And("click button sign in")
//	public void click_button_sign_in() {
//		loginAgent.clickBtnSignin();
//		delay(1);
//		extentTest.log(LogStatus.PASS, "click button sign in");
//	}
//
//	@And("open appear greeting")
//	public void open_appear_greeting() {
//		String actual = loginAgent.appearGreeting();
//		assertTrue(actual.contains("Welcome"));
//		extentTest.log(LogStatus.PASS, "open appear greeting");
//	}
////	
//	@And("click button ok")
//	public void click_button_ok() {
//		loginAgent.clickBtnOke();
//		extentTest.log(LogStatus.PASS, "click button ok");
//	}
	
//	Logout
	@When("click profile agent")
	public void click_profile_agent() {
		delay(2);
		loginAgent.logout();
		delay(1);
		extentTest.log(LogStatus.PASS, "User click profile agent");
	}
	
//	@And("open appear greeting logout")
//	public void open_appear_greeting_logout() {
//		String actual = loginAgent.appearGreeting();
//		assertTrue(actual.contains("Apa"));
//		extentTest.log(LogStatus.PASS, "open appear greeting");
//	}
	
//	@Then("click button ya" )
//	public void click_button_ya() {		
//		loginAgent.clickBtnYa();
//		extentTest.log(LogStatus.PASS, "click button ya");
//	}
//	
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}