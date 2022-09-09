package com.juaracoding.telemarketing.step_definitions;

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
	
	@And("User enter username password invalid")
	public void user_enter_username_password_invalid() {
		loginDeveloper.login("devEl0Per", "23");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User click button sign in")
	public void user_click_button_sign_in() {
		loginDeveloper.clickBtnSignin();
		extentTest.log(LogStatus.PASS, "User click button sign in");
	}
	
	@Then("User invalid credentials")
	public void user_invalid_credentilas() {
		String actual = loginDeveloper.msgSuccess();
		assertTrue(actual.contains("Username atau password tidak ditemukan atau akun anda tidak aktif"));
		delay(2);
		loginDeveloper.clickBtnClose();
		extentTest.log(LogStatus.PASS, "User invalid credentials");
	}
	
	
	
//	valid
	@When("User enter username password valid")
	public void user_enter_username_password_valid() {
		loginDeveloper.login("developer", "23");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@And("User click button sign in valid")
	public void user_click_button_sign_in_valid() {
		loginDeveloper.clickBtnSignin();
		extentTest.log(LogStatus.PASS, "User click button sign in valid");
	}
	
	@Then("User valid credentials")
	public void user_valid_credentilas() {
		String actual = loginDeveloper.msgSuccess();
		assertTrue(actual.contains("Welcome to Tele Kita"));
		loginDeveloper.clickBtnClose();
		loginDeveloper.developerProfile();
		extentTest.log(LogStatus.PASS, "User valid credentials");
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
