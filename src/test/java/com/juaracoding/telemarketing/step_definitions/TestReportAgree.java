package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.ReportAgree;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestReportAgree {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
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
		extentTest.log(LogStatus.PASS, "Pilih menu report1");
	}
			
	@And("User click report agree")
	public void user_click_report_agree() {
		delay(2);
		reportAgree.taskAgree();
		extentTest.log(LogStatus.PASS, "User click report agree");
	}
	
	@When("User choose date agree invalid")
	public void user_choose_date_agree_invalid() {
		delay(2);
		reportAgree.tableDateAgree1();
		delay(1);
		reportAgree.tableDateAgree2();
		delay(1);
		reportAgree.btnView();
		extentTest.log(LogStatus.PASS, "User choose date agree invalid");
	}
	
	@When("User choose date agree")
	public void user_choose_date_agree() {
		delay(2);
		reportAgree.tableDateAgree1();
		delay(1);
		reportAgree.pilihTanggalAgree1();
		delay(1);
		reportAgree.tableDateAgree2();
		delay(1);
		reportAgree.pilihTanggalAgree2();
		extentTest.log(LogStatus.PASS, "User choose date agree");
	}
	
	@Then("User click button view agree")
	public void user_click_button_view_agree() {
		delay(2);
		reportAgree.btnView();
		delay(2);
		extentTest.log(LogStatus.PASS, "User click button view");
	}
	
	@When("User click next page")
	public void user_click_next_page() {		
		reportAgree.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page");
	}
	
	@And("User click previous page")
	public void user_click_previous_page() {		
		reportAgree.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page");
	}
	
	@And("User click last page")
	public void user_click_last_page() {		
		reportAgree.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page");
	}
	
	@And("User click first page")
	public void user_click_first_page() {		
		reportAgree.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page");
	}
	
	@When("User click button show page agree")
	public void user_click_button_show_page_agree() {
		scroll(300);
		reportAgree.clickShowPage();
		extentTest.log(LogStatus.PASS, "User click show page");
	}
	
	
	@When("User click button export agree")
	public void user_click_button_export_agree() {
		delay(2);
		reportAgree.btnExport();
		extentTest.log(LogStatus.PASS, "User click button export");
	}
	

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
