package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.TaskAgree;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTaskAgree {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	private TaskAgree taskAgree = new TaskAgree();
	
	public TestTaskAgree() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//Task Agree Dev
		@When("Pilih menu task")
		public void pilih_menu_task_agree() {
			delay(2);
			taskAgree.btnTask();
			extentTest.log(LogStatus.PASS, "Pilih menu data");
		}
				
		@And("User click agree")
		public void user_click_agree_agree() {
			delay(2);
			taskAgree.btnTaskAgree();
			extentTest.log(LogStatus.PASS, "User click agree");
		}
				
		@When("User click search agree")
		public void user_click_search_agree() {
			delay(2);
			taskAgree.search();
			extentTest.log(LogStatus.PASS, "User click search agree");
		}
				
		@And("User click button search agree")
		public void user_click_button_search_agree() {
			delay(2);
			taskAgree.btnSearch();
			extentTest.log(LogStatus.PASS, "User click button search agree");
		}
		
		@When("User click file agree")
		public void user_click_file_agree() {
			delay(2);
			taskAgree.btnChooseFile();
			extentTest.log(LogStatus.PASS, "User click file agree");
		}
		
		@And("User isi link agree")
		public void user_isi_link_agree() {
			delay(2);
			taskAgree.isiLink();
			extentTest.log(LogStatus.PASS, "User isi link agree");
		}
		
		@And("User click simpan agree")
		public void user_click_simpan_agree() {
			delay(2);
			taskAgree.btnSimpan();
			extentTest.log(LogStatus.PASS, "User click simpan agree");
		}
		
		@Then("User click button oke agree")
		public void user_click_button_oke_agree() {
			delay(2);
			taskAgree.clickBtnClose();
			extentTest.log(LogStatus.PASS, "User click button oke agree");
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
