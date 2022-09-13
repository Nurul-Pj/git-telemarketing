package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.LoginDev;
import com.juaracoding.telemarketing.pages.TaskAgreeDev;
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
	private TaskAgreeDev taskAgreeDev = new TaskAgreeDev();
	
	public TestLogin() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//Invalid Login
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
		extentTest.log(LogStatus.PASS, "User enter password invalid");
	}
	
	@And("User enter username null")
	public void user_enter_username_null() {
		loginDeveloper.clickBtnClose();
		loginDeveloper.deleteLogin();
		loginDeveloper.login("", "23");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter username null");
	}
	
	@And("User enter password null")
	public void user_enter_password_null() {
		loginDeveloper.clickBtnClose();
		loginDeveloper.deleteLogin();
		loginDeveloper.login("developer", "");
		delay(2);
		extentTest.log(LogStatus.PASS, "User enter password null");
	}
	
	
	@Then("User click button sign in")
	public void user_click_button_sign_in() {
		loginDeveloper.clickBtnSignin();
		extentTest.log(LogStatus.PASS, "User click button sign in");
	}
	
//	Valid
	@When("User enter username and password valid" )
	public void user_enter_username_and_password_valid() {
		loginDeveloper.clickBtnClose();
		loginDeveloper.deleteLogin();		
		loginDeveloper.login("developer", "23");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@When("User enter username ignore letter case and password valid" )
	public void user_enter_username_ignorelettercase_and_password_valid() {	
		loginDeveloper.login("DeveLopeR", "23");
		delay(3);
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@When("User enter username uppercase and password valid" )
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
	
	//Task Agree Dev
	@When("Pilih menu task")
	public void pilih_menu_task() {
		delay(2);
		taskAgreeDev.btnTask();
		extentTest.log(LogStatus.PASS, "Pilih menu data");
	}
			
	@And("User click agree")
	public void user_click_agree() {
		delay(2);
		taskAgreeDev.btnTaskAgree();
		extentTest.log(LogStatus.PASS, "User click agree");
	}
			
	@And("User click search")
	public void user_click_search() {
		delay(2);
		taskAgreeDev.search("somaybohay");
		extentTest.log(LogStatus.PASS, "User click search");
	}
			
	@And("User click button search")
	public void user_click_button_search() {
		delay(2);
		taskAgreeDev.btnSearch();
		extentTest.log(LogStatus.PASS, "User click button search");
	}
	
	@And("User click file")
	public void user_click_file() {
		delay(2);
		taskAgreeDev.btnChooseFile();
		extentTest.log(LogStatus.PASS, "User click file");
	}
	
	@And("User isi link")
	public void user_isi_link() {
		delay(2);
		taskAgreeDev.isiLink("somaybohay");
		extentTest.log(LogStatus.PASS, "User isi link");
	}
	
	@And("User click simpan")
	public void user_click_simpan() {
		delay(2);
		taskAgreeDev.btnSimpan();
		extentTest.log(LogStatus.PASS, "User click simpan");
	}
	
	@And("User click button oke")
	public void user_click_button_oke() {
		delay(2);
		taskAgreeDev.clickBtnClose();
		extentTest.log(LogStatus.PASS, "User click button oke");
	}
	

//	Logout
	@Then("User click profile")
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
