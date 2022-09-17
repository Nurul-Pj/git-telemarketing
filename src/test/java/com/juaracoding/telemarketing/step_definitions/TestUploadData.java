package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.UploadData;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestUploadData {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	private UploadData uploadData = new UploadData();
	
	public TestUploadData() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
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
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
