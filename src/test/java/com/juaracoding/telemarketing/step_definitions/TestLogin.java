package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.LoginDev;
import com.juaracoding.telemarketing.pages.UploadData;
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
	private UploadData uploadData = new UploadData();
	
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
	
//	Invalid Null
	@When("User enter username password null")
	public void user_enter_username_password_null() {
		loginDeveloper.updateData("","");
		delay(1);
		loginDeveloper.login("","");
		delay(1);
		extentTest.log(LogStatus.PASS, "User enter username password null");
	}
	
	@And("User click button sign in")
	public void user_click_button_sign_in() {
		loginDeveloper.clickBtnSignin();
		extentTest.log(LogStatus.PASS, "User click button sign in");
	}
	
	@And("User invalid credentials")
	public void user_invalid_credentilas() {
		String actual = loginDeveloper.msgError();
		assertTrue(actual.contains("Username atau password tidak ditemukan atau akun anda tidak aktif"));
		delay(2);
	}
	
	@Then("Click oke")
	public void click_oke() {
		delay(2);
		loginDeveloper.clickBtnOkeInvalid();
		extentTest.log(LogStatus.PASS, "Click oke");
	}
	
	
//	valid
	
	@When("User enter username password valid")
	public void user_enter_username_password_valid() {
		loginDeveloper.updateData("", "");
		loginDeveloper.login("developer", "23");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@When("User enter username password ignore lettercase")
	public void user_enter_username_password_ignore_lettercase() {
		loginDeveloper.updateData("", "");
		loginDeveloper.login("DeVeloPer", "23");
		extentTest.log(LogStatus.PASS, "User enter username password ignore lettercase");
	}
	
	@When("User enter username password uppercase")
	public void user_enter_username_password_uppercase() {
		loginDeveloper.updateData("", "");
		loginDeveloper.login("DeVeloPer", "23");
		extentTest.log(LogStatus.PASS, "User enter username password uppercase");
	}
	
	
	@Then("User valid credentials")
	public void user_valid_credentilas() {
		driver.navigate().to("https://sqa.peluangkerjaku.com/tele/");
		String actual = loginDeveloper.msgSucces();
		assertTrue(actual.contains("Welcome to Tele Kita"));
		delay(2);
		loginDeveloper.clickBtnOkevalid();
//		delay(2);
//		loginDeveloper.developerProfile();
//		loginDeveloper.clickBtnYa();
		extentTest.log(LogStatus.PASS, "User valid credentials");
	}

	//UploadData 
	//UploadData invalid
	@When("Pilih menu data")
	public void pilih_menu_data() {
		delay(2);
		uploadData.btnData();
		extentTest.log(LogStatus.PASS, "Pilih menu data");
	}
			
	@And("User click upload data invalid")
	public void user_click_upload_data_invalid() {
		delay(2);
		uploadData.btnUploadData();
		extentTest.log(LogStatus.PASS, "User click upload data invalid");
	}
			
	@And("User click choose file invalid")
	public void user_click_choose_file_invalid() {
		delay(2);
		uploadData.btnChooseFileInvalid();
		delay(1);
		extentTest.log(LogStatus.PASS, "User click choose file invalid");
	}
			
	@And("User click button upload invalid")
	public void user_click_button_upload_invalid() {
		delay(2);
		uploadData.btnUploadFile();
		delay(2);
		uploadData.clickBtnClose();
		extentTest.log(LogStatus.PASS, "User click button upload invalid");
	}
			
	//UploadData valid
	@And("User click choose file valid")
	public void user_click_choose_file_valid() {
		delay(2);
		uploadData.btnChooseFileValid();
		extentTest.log(LogStatus.PASS, "User click choose file valid");
	}
			
	@And("User click button upload valid")
	public void user_click_button_upload_valid() {
		delay(2);
		uploadData.btnUploadFile();
		extentTest.log(LogStatus.PASS, "User click button upload valid");
	}
			
	@Then("User click Simpan valid")
	public void user_click_simpan_valid() {
		delay(2);
		uploadData.btnSimpanFile();
		delay(2);
		uploadData.btnSimpanFileBaru();
		delay(2);
		uploadData.clickBtnClose();
		extentTest.log(LogStatus.PASS, "User click Simpan valid");
	}
	

//	Logout
	@When("User click profile and logout")
	public void user_click_profile_and_logout() {
		loginDeveloper.developerProfile();
		extentTest.log(LogStatus.PASS, "User click profile and logout");
	}
	
	@Then("User logout")
	public void user_logout() {
		String actual = loginDeveloper.logoutPopup();
		assertTrue(actual.contains("Apa Yakin Keluar ?"));
		loginDeveloper.clickBtnYa();
		driver.navigate().refresh();
		extentTest.log(LogStatus.PASS, "User click profile and logout");
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
