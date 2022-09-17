package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.DistributeData;
import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDistributeData {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private DistributeData dataDistribusi = new DistributeData();
	
	public TestDistributeData() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
//	dashboard user management
	
	@When("click list menu data")
	public void click_list_menu_data() {
		dataDistribusi.listData();
		extentTest.log(LogStatus.PASS, "click list menu data");
	}
	
	@Then("click menu distribute data")
	public void click_distribute_data() {
		dataDistribusi.listDistributeData();
		extentTest.log(LogStatus.PASS, "click menu distribute data");
	}
	
	@When("click field status")
	public void click_field_status() {
		dataDistribusi.clickStatus();
		delay(1);
	}
	
	@And("select field {string} as status")
	public void select_field_as_status(String pilihStatus) {
		dataDistribusi.listStatus(pilihStatus);
	}
	
	@And("click field buket data")
	public void click_field_buket_data() {
		dataDistribusi.clickStatus();
		delay(1);
		dataDistribusi.clickBuketData();
	}
	
	@And("select field {string} as buket data")
	public void select_field_as_buket_data(String pilihBuketData) {
		delay(1);
		dataDistribusi.listBuketData(pilihBuketData);
	}
	
	@And("click view")
	public void click_view() {
		dataDistribusi.clickBtnView();
		extentTest.log(LogStatus.PASS, "click view");
	}
	
	@Then("table data")
	public void table_date() {
		delay(1);
//		assertTrue(dataDistribusi.validateUser());
		assertEquals(dataDistribusi.getTxtValidate(), "1");
		extentTest.log(LogStatus.PASS, "table data");
	}
	
	@Then("table data entries")
	public void table_date_entries() {
		delay(1);
//		assertTrue(dataDistribusi.validateUser());
		assertEquals(dataDistribusi.getTxtEntries(), " no entries");
		extentTest.log(LogStatus.PASS, "table data entries");
	}
	
	@And("alert greeting")
	public void alert_greeting() {
		String actual = dataDistribusi.appearGreeting();
		assertTrue(actual.contains("Status"));
		extentTest.log(LogStatus.PASS, "alert greeting");
	}
	
	@Then("click oke")
	public void click_oke() {
		delay(1);
		dataDistribusi.clickBtnOke();
		extentTest.log(LogStatus.PASS, "click oke");
	}
	
	@When("select field {string} as distribusi")
	public void select_field_as_distribusi(String pilihAgent) {
		dataDistribusi.fieldStatus(pilihAgent);
	}
	
	@And("input jumlah agent")
	public void input_jumlah_agent() {
		dataDistribusi.inputAgent("1");
		delay(1);
		extentTest.log(LogStatus.PASS, "input jumlah agent");
	}
	
	@And("select field {string} as status distribusi")
	public void select_field_as_status_distribusi(String distribusiStat) {
		dataDistribusi.fieldDistribusiStatus(distribusiStat);
	}
	
	@Then("click button distribusi")
	public void click_button_distribusi() {
		dataDistribusi.clickDistribusi();
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
