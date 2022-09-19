package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.Activity;
import com.juaracoding.telemarketing.pages.NewDev;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestNewDev{
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private NewDev newDeveloper = new NewDev();
	private Activity activityDev = new Activity();
	
	
	public TestNewDev() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@And("User click export new" )
	public void user_click_export_new() {		
		newDeveloper.clickBtnExport();
		extentTest.log(LogStatus.PASS, "User click export new");
	}
	//-------------------------DASHBOARD---------------------------
	@And("User click task developer")
	public void user_click_task_dev() {		
		activityDev.clickBtnTaskDev();;
		extentTest.log(LogStatus.PASS, "User click task");
	}
	@And("User click new developer" )
	public void user_click_new_dev() {		
		newDeveloper.clickBtnNew();
		extentTest.log(LogStatus.PASS, "User click new");
	}
	@Then("Page new developer")
	public void page_new_dev() {
		String actual = newDeveloper.pageNew();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page new");
	}
	
	
	//-------------------------SEARCH------------------------------------------
	@When("User input search valid new developer" )
	public void user_input_search_valid_dev() {		
		newDeveloper.inputSearchData("ms");
		extentTest.log(LogStatus.PASS, "User input search valid");
	}
	@And("User click search new developer")
	public void user_click_search_dev() {
		newDeveloper.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "User click search");
	}
	@Then("Page search new developer")
	public void page_search_dev() {
		String actual = newDeveloper.pageNew();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page search");
		delay(2);
	}
	
	
	//-------------------------STATUS ACITIVITY--------------------------------
	@When("User click data new developer" )
	public void user_click_data_dev() {		
		newDeveloper.clickData();
		extentTest.log(LogStatus.PASS, "User click data");

	}
	
	
	
	//------------------------------NEXT & SHOW PAGE------------------------------------
	@When("User click next page new developer" )
	public void user_click_next_page_dev() {		
		newDeveloper.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page");
	}
	@When("User click previous page new developer" )
	public void user_click_previous_page_dev() {		
		newDeveloper.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page");
	}
	@When("User click last page new developer" )
	public void user_click_last_page_dev() {		
		newDeveloper.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page");
	}
	@When("User click first page new developer" )
	public void user_click_first_page_dev() {		
		newDeveloper.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page");
	}
	@When("User click show page new developer" )
	public void user_click_showpage_dev() {		
		newDeveloper.clickShowPage();
		extentTest.log(LogStatus.PASS, "User click show page");
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
