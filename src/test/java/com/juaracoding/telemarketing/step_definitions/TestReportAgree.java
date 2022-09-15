package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.LoginDev;
import com.juaracoding.telemarketing.pages.ReportAgree;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestReportAgree {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private LoginDev loginDeveloper = new LoginDev();
	private ReportAgree reportAgree = new ReportAgree();
	
	public TestReportAgree() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//Task Report
	@When("Pilih menu report1")
	public void pilih_menu_report1() {
		delay(2);
		reportAgree.btnReport();
		extentTest.log(LogStatus.PASS, "Pilih menu report");
	}
			
	@And("User click report agree")
	public void user_click_report_agree() {
		delay(2);
		reportAgree.taskAgree();
		extentTest.log(LogStatus.PASS, "User click report agree");
	}
	
	@And("User choose date agree")
	public void user_choose_date_agree() {
		delay(2);
		reportAgree.pilihTanggal1();
		delay(1);
		reportAgree.pilihTanggal2();
		extentTest.log(LogStatus.PASS, "User choose date");
	}
	
	@And("User click button show page")
	public void user_click_button_show_page() {
		delay(2);
		reportAgree.btnShowPage();
		scroll(300);
		extentTest.log(LogStatus.PASS, "User click show page");
	}
	
	@And("User click button view agree")
	public void user_click_button_view_agree() {
		delay(2);
		reportAgree.btnView();
		extentTest.log(LogStatus.PASS, "User click button view");
	}
	
//	@And("User click button export agree")
//	public void user_click_button_export_agree() {
//		delay(2);
//		reportAgree.btnExport();
//		extentTest.log(LogStatus.PASS, "User click button export");
//	}
	

	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void scroll(int vertikal) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertikal+")");
	}
}
