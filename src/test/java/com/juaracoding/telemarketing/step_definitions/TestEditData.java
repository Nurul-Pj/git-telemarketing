package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.EditData;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestEditData {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private EditData editData = new EditData();
	
	public TestEditData() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
//	dashboard data
	@When("click list data")
	public void click_list_data() {
		editData.listData();
		extentTest.log(LogStatus.PASS, "click list data");
	}
	
	@Then("click menu edit data")
	public void click_menu_edit_data() {
		editData.listEditData();
		extentTest.log(LogStatus.PASS, "click menu edit data");
		
	}

	
//	search user
	@When("input user edit data")
	public void input_user() {
		delay(1);
		editData.search();
		extentTest.log(LogStatus.PASS, "input user edit data");
	}
	
	@Then("table open")
	public void table_open() {
		delay(1);
		assertEquals(editData.getValidate(), "1");
		extentTest.log(LogStatus.PASS, "table open");
	}
	
//	table click
	@When("table click")
	public void table_click() {
		delay(1);
		editData.clickTable();
		extentTest.log(LogStatus.PASS, "table click");
	}
	
	@Then("open form edit data")
	public void open_form_edit_data() {
		delay(1);
		assertEquals(editData.validateForm(), "[d] Edit Data");
		extentTest.log(LogStatus.PASS, "open form edit data");
	}
	
//	update data detail
	@When("choose field {string} as agents")
	public void choose_field_as_agents(String agents) {
		delay(1);
		editData.chooseAgents(agents);
		extentTest.log(LogStatus.PASS, "choose field \"agent01\" as agents");
	}
	
//	update status activity
	@When("choose field {string} as remarks")
	public void choose_field_as_remarks(String remarks) {
		delay(1);
		editData.chooseRemarks(remarks);
		extentTest.log(LogStatus.PASS, "choose field \"agent01\" as agents");
	}
	
//	update data
	@When("click update")
	public void click_update() {
		delay(1);
		editData.clickBtnUpdate();
		extentTest.log(LogStatus.PASS, "click update");
	}
	
	@And("open popup informasion")
	public void open_popup_informasion() {
		delay(1);
		assertEquals(editData.popupInformation(), "Informasi");
		extentTest.log(LogStatus.PASS, "open popup informasion");
	}
	
	@Then("validasi update")
	public void validasi_update() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-300)");
		assertEquals(editData.validateRemarks(), "Remarks");
		delay(1);
		editData.close();
		extentTest.log(LogStatus.PASS, "validasi update");
	}
	
//	show page
	@When("show page")
	public void show_page() {
		delay(1);
		editData.nullSearch();
		delay(1);
		editData.clickShowPage();
		extentTest.log(LogStatus.PASS, "show page");
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
