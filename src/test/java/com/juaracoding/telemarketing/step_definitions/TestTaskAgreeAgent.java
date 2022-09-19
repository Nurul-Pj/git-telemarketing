package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.TaskAgreeDev;
import com.juaracoding.telemarketing.pages.TaskAgreeAgent;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TestTaskAgreeAgent {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	private TaskAgreeAgent taskAgreeAgent = new TaskAgreeAgent();
	
	public TestTaskAgreeAgent() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//Task Agree Dev
		@When("Pilih menu task agent")
		public void pilih_menu_task_agent() {
			delay(2);
			taskAgreeAgent.btnTask();
			extentTest.log(LogStatus.PASS, "Pilih menu data agent");
		}
				
		@And("User click agree agent")
		public void user_click_agree_agent() {
			delay(2);
			taskAgreeAgent.btnTaskAgree();
			extentTest.log(LogStatus.PASS, "User click agree agent");
		}
				
		@And("User click search agent")
		public void user_click_search_agent() {
			delay(2);
			taskAgreeAgent.search("outfit.bekasan");
			extentTest.log(LogStatus.PASS, "User click search agent");
		}
				
		@And("User click button search agent")
		public void user_click_button_search_agent() {
			delay(2);
			taskAgreeAgent.btnSearch();
			extentTest.log(LogStatus.PASS, "User click button search agent");
		}
		
		@And("User click file agent")
		public void user_click_file_agent() {
			delay(2);
			taskAgreeAgent.btnChooseFile();
			extentTest.log(LogStatus.PASS, "User click file agent");
		}
		
		@And("User isi link agent")
		public void user_isi_link_agent() {
			delay(2);
			taskAgreeAgent.isiLink("outfit.bekasan");
			extentTest.log(LogStatus.PASS, "User isi link agent");
		}
		
		@And("User click simpan agent")
		public void user_click_simpan_agent() {
			delay(2);
			taskAgreeAgent.btnSimpan();
			extentTest.log(LogStatus.PASS, "User click simpan agent");
		}
		
		@And("User click button oke agent")
		public void user_click_button_oke_agent() {
			delay(2);
			taskAgreeAgent.clickBtnClose();
			extentTest.log(LogStatus.PASS, "User click button oke agent");
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
