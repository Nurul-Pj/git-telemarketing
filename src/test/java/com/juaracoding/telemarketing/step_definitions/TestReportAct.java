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
			
	@When("User click report activity")
	public void user_click_report_activity() {
		delay(2);
		reportAct.btnReportAct();
		extentTest.log(LogStatus.PASS, "User click report activity");
	}
	
	@When("User click button activity")
	public void user_click_button_activity() {
		delay(2);
		reportAct.btnAgent();
		extentTest.log(LogStatus.PASS, "User click button activity");
	}
	
	@And("User choose activity")
	public void user_choose_activity() {
		delay(2);
		reportAct.btnView();
		delay(2);
		extentTest.log(LogStatus.PASS, "User choose activity");
	}
	
	@When("User choose date activity")
	public void user_choose_date_activity() {
		delay(2);
		reportAct.tableDateAct1();
		delay(1);
		reportAct.pilihTanggalAct1();
		delay(1);
		reportAct.tableDateAct2();
		delay(1);
		reportAct.pilihTanggalAct2();
		extentTest.log(LogStatus.PASS, "User choose date activity");
	}
	
	@And("User click button view activity")
	public void user_click_button_view_activity() {
		delay(2);
		reportAct.btnView();
		extentTest.log(LogStatus.PASS, "User click button view activity");
	}
	
	@When("User click show page activity")
	public void user_click_show_page_activity() {		
		reportAct.clickShowPage();
		extentTest.log(LogStatus.PASS, "User click show page activity");
	}
	
	@When("User click button export activity")
	public void user_click_button_export_activity() {
		delay(2);
		reportAct.btnExport();
		extentTest.log(LogStatus.PASS, "User click button export activity");
	}
	
	
//	Logout
	@Then("User click profile activity")
	public void user_click_profile() {
		loginDeveloper.logout();
		delay(3);
		extentTest.log(LogStatus.PASS, "User click profile activity");
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
