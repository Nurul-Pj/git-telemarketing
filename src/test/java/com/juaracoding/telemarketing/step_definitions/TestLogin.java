package com.juaracoding.telemarketing.step_definitions;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.LoginDev;
import com.juaracoding.telemarketing.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginDev loginDeveloper = new LoginDev();
	
	public TestLogin() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
//	Invalid Login

	@When("User go to invalid Web Telemarketing")
	public void user_go_to_invalid_web_telemarketing() {
		driver.get(Constants.URL_INVALID);
		assertEquals(Constants.URL_INVALID, "https://sqa.peluangkerjaku.com/tele/");
		extentTest.log(LogStatus.PASS, "User go to invalid Web Telemarketing");
	}
	
	@When("User go to Web Telemarketing")
	public void user_go_to_web_telemarketing() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web Telemarketing");
	}

	@And("User enter username invalid")
	public void user_enter_username_invalid() {
		loginDeveloper.deleteLogin();
		delay(1);
		loginDeveloper.login("developer1", "1");
		delay(1);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User enter username null")
	public void user_enter_username_null() {
		loginDeveloper.deleteLogin();
		delay(1);
		loginDeveloper.login("", "");
		delay(1);
		extentTest.log(LogStatus.PASS, "User enter username null");
	}
	
	@And("open appear greeting invalid")
	public void open_appear_greeting_invalid() {
		String actual = loginDeveloper.appearGreeting();
		assertTrue(actual.contains("Username atau password"));
		extentTest.log(LogStatus.PASS, "open appear greeting invalid");
	}

	
//	Valid
	@And("User enter username and password valid login ignore lettercase" )
	public void user_enter_username_and_password_valid_login_ignore_lettercase() {		
		loginDeveloper.deleteLogin();
		delay(1);
		loginDeveloper.login("DeveloPeR", "23");
		extentTest.log(LogStatus.PASS, "User enter username and password valid login ignore lettercase");
	}
	
	@And("User enter username and password valid login uppercase" )
	public void user_enter_username_and_password_valid_login_uppercase() {
		loginDeveloper.deleteLogin();
		delay(1);
		loginDeveloper.login("DEVELOPER", "23");
		extentTest.log(LogStatus.PASS, "User enter username and password valid login uppercase");
	}
	
	@And("User enter username and password valid login" )
	public void user_enter_username_and_password_valid_login() {
		loginDeveloper.deleteLogin();
		delay(1);
		loginDeveloper.login("developer", "23");
		extentTest.log(LogStatus.PASS, "User enter username and password valid login");
	}
	
	@And("click button sign in")
	public void click_button_sign_in() {
		loginDeveloper.clickBtnSignin();
		delay(1);
		extentTest.log(LogStatus.PASS, "click button sign in");
	}

	@And("open appear greeting")
	public void open_appear_greeting() {
		String actual = loginDeveloper.appearGreeting();
		assertTrue(actual.contains("Welcome"));
		extentTest.log(LogStatus.PASS, "open appear greeting");
	}
//	
	@And("click button ok")
	public void click_button_ok() {
		loginDeveloper.clickBtnOke();
		extentTest.log(LogStatus.PASS, "click button ok");
	}
	
//	Logout
	@When("click profile")
	public void click_profile() {
		delay(2);
		loginDeveloper.logout();
		delay(1);
		extentTest.log(LogStatus.PASS, "User click profile");
	}
	
	@And("open appear greeting logout")
	public void open_appear_greeting_logout() {
		String actual = loginDeveloper.appearGreeting();
		assertTrue(actual.contains("Apa"));
		extentTest.log(LogStatus.PASS, "open appear greeting");
	}
	
	@Then("click button ya" )
	public void click_button_ya() {		
		loginDeveloper.clickBtnYa();
		extentTest.log(LogStatus.PASS, "click button ya");
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