package com.juaracoding.telemarketing.step_definitions;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.Activity;
import com.juaracoding.telemarketing.pages.DataAllDev;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestDataAllDev{
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	
	private DataAllDev dataAllDev = new DataAllDev();
	
	
	public TestDataAllDev() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	

	
	@And("User click export data all" )
	public void user_click_export_data_all() {		
		dataAllDev.clickBtnExport();
		extentTest.log(LogStatus.PASS, "User click export data all");
	}
	
	//-------------------------DASHBOARD---------------------------
	@And("User click data all developer" )
	public void user_click_data_all_dev() {		
		dataAllDev.clickBtnDataAll();
		extentTest.log(LogStatus.PASS, "User click data all");
	}
	@Then("Page data all developer")
	public void page_data_all_dev() {
		String actual = dataAllDev.pageDataAll();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page data all");
	}
	
	
	
	
	//-------------------------SEARCH------------------------------------------
	@When("User input search in data all developer valid" )
	public void user_input_search_in_data_all_dev() {		
		dataAllDev.inputSearchData("suky");
		extentTest.log(LogStatus.PASS, "User input search in data all valid");
	}
	@And("User click search in data all developer")
	public void user_click_search_in_data_all_dev() {
		dataAllDev.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "User click search in data all");
	}
	@Then("Page search in data all developer")
	public void page_search_in_data_all_dev() {
		String actual = dataAllDev.pageSearch();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page search in final");
		delay(2);
	}
	@And("Choose filter form with {string} as agent and {string} as status developer")
	public void filterForm(String agent, String status) {
		delay(1);
		dataAllDev.formFilter(agent,status);
		extentTest.log(LogStatus.PASS, "User search filter agent & status");
	}
	
	
	//-------------------------STATUS ACITIVITY--------------------------------
	@When("User click data in data all developer" )
	public void user_click_data_in_data_all() {		
		dataAllDev.clickData();
		extentTest.log(LogStatus.PASS, "User click data all");
	}
	
	
	//------------------------------NEXT & SHOW PAGE------------------------------------
	@When("User click next page in data all developer" )
	public void user_click_next_page_in_data_all_dev() {		
		dataAllDev.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page in data all");
	}
	@When("User click previous page in data all developer" )
	public void user_click_previous_page_in_data_all_dev() {		
		dataAllDev.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page in data all");
	}
	@When("User click last page in data all developer" )
	public void user_click_last_page_in_data_all_dev() {		
		dataAllDev.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page in data all");
	}
	@When("User click first page in data all developer" )
	public void user_click_first_page_in_data_all_dev() {		
		dataAllDev.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page in data all");
	}
	
	@When("User click show page in data all developer" )
	public void user_click_showpage_in_data_all_dev() {		
		dataAllDev.clickShowPage();
		extentTest.log(LogStatus.PASS, "User click show page in data all");
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
