package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.LoginDev;
import com.juaracoding.telemarketing.pages.ReportActivity;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestReportAct {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	private LoginDev loginDeveloper = new LoginDev();
	private ReportActivity reportAct = new ReportActivity();
	
	public TestReportAct() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//Task Report
	@When("Pilih menu report2")
	public void pilih_menu_report2() {
		delay(2);
		reportAct.btnReport();
		extentTest.log(LogStatus.PASS, "Pilih menu report");
	}
			
	@And("User click report activity")
	public void user_click_report_activity() {
		delay(2);
		reportAct.btnReportAct();
		extentTest.log(LogStatus.PASS, "User click report activity");
	}
	
	@And("User click button agent")
	public void user_click_button_agent() {
		delay(2);
		reportAct.btnAgent();
		extentTest.log(LogStatus.PASS, "User click button agent");
	}
	
	@And("User choose agent")
	public void user_choose_agent() {
		delay(2);
		reportAct.btnView();
		extentTest.log(LogStatus.PASS, "User choose agent");
	}
	
	@And("User choose date act invalid")
	public void user_choose_date_act_invalid() {
		delay(2);
		reportAct.tableDateAct1();
		delay(1);
		reportAct.tableDateAct2();
		delay(1);
		reportAct.btnView();
		extentTest.log(LogStatus.PASS, "User choose date act invalid");
	}
	
	@And("User choose date act")
	public void user_choose_date_act() {
		delay(2);
		reportAct.tableDateAct1();
		delay(1);
		reportAct.pilihTanggalAct1();
		delay(1);
		reportAct.tableDateAct2();
		delay(1);
		reportAct.pilihTanggalAct2();
		extentTest.log(LogStatus.PASS, "User choose date act");
	}
	
	@And("User click button view act")
	public void user_click_button_view_act() {
		delay(2);
		reportAct.btnView();
		extentTest.log(LogStatus.PASS, "User click button view act");
	}
	
//	@And("User click button export act")
//	public void user_click_button_export_act() {
//		delay(2);
//		reportAct.btnExport();
//		extentTest.log(LogStatus.PASS, "User click button export");
//	}
	
	@And("User click button show page act")
	public void user_click_button_show_page_act() {		
		reportAct.clickShowPage();
		extentTest.log(LogStatus.PASS, "User click show page act");
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