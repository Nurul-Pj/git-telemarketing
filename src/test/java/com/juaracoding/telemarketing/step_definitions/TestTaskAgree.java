package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.LoginDev;
import com.juaracoding.telemarketing.pages.TaskAgree;
import com.juaracoding.telemarketing.utils.Constants;
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
		public void pilih_menu_task() {
			delay(2);
			taskAgree.btnTask();
			extentTest.log(LogStatus.PASS, "Pilih menu data");
		}
				
		@And("User click agree")
		public void user_click_agree() {
			delay(2);
			taskAgree.btnTaskAgree();
			extentTest.log(LogStatus.PASS, "User click agree");
		}
				
		@And("User click search")
		public void user_click_search() {
			delay(2);
			taskAgree.search("outfit.bekasan");
			extentTest.log(LogStatus.PASS, "User click search");
		}
				
		@And("User click button search")
		public void user_click_button_search() {
			delay(2);
			taskAgree.btnSearch();
			extentTest.log(LogStatus.PASS, "User click button search");
		}
		
		@And("User click file")
		public void user_click_file() {
			delay(2);
			taskAgree.btnChooseFile();
			extentTest.log(LogStatus.PASS, "User click file");
		}
		
		@And("User isi link")
		public void user_isi_link() {
			delay(2);
			taskAgree.isiLink("outfit.bekasan");
			extentTest.log(LogStatus.PASS, "User isi link");
		}
		
		@And("User click simpan")
		public void user_click_simpan() {
			delay(2);
			taskAgree.btnSimpan();
			extentTest.log(LogStatus.PASS, "User click simpan");
		}
		
		@And("User click button oke")
		public void user_click_button_oke() {
			delay(2);
			taskAgree.clickBtnClose();
			extentTest.log(LogStatus.PASS, "User click button oke");
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
