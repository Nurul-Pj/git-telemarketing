package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.Activity;
import com.juaracoding.telemarketing.pages.FollowUpDev;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestFollowUpDev{
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private FollowUpDev followUpDev = new FollowUpDev();
	
	
	public TestFollowUpDev() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}

	//-------------------------DASHBOARD---------------------------
	@And("User click follow up developer" )
	public void user_click_followup_dev() {		
		followUpDev.clickBtnFollowUp();
		extentTest.log(LogStatus.PASS, "User click follow up");
	}
	@Then("Page follow up developer")
	public void page_followup_dev() {
		String actual = followUpDev.pageFollowUp();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page follow up");
	}
	
	
	//-------------------------SEARCH------------------------------------------
	@When("User input search valid follow up developer" )
	public void user_input_search_followup_valid() {		
		followUpDev.inputSearchData("ms");
		extentTest.log(LogStatus.PASS, "User input search valid");
	}
	@And("User click search follow up developer")
	public void user_click_search_followup_dev() {
		followUpDev.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "User click search");
	}
	@Then("Page search follow up developer")
	public void page_search_followup_dev() {
		String actual = followUpDev.pageSearch();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page search");
		delay(2);
	}
	
	
	//-------------------------STATUS ACITIVITY--------------------------------
	@When("User click data follow up developer" )
	public void user_click_data_followup_dev() {		
		followUpDev.clickData();
		extentTest.log(LogStatus.PASS, "User click data");

	}
	
	
	//------------------------------NEXT & SHOW PAGE------------------------------------
	@When("User click next page follow up developer" )
	public void user_click_next_page_followup_dev() {		
		followUpDev.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page");
	}
	@When("User click previous page follow up developer" )
	public void user_click_previous_page_followup_dev() {		
		followUpDev.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page");
	}
	@When("User click last page follow up developer" )
	public void user_click_last_page_followup_dev() {		
		followUpDev.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page");
	}
	@When("User click first page follow up developer" )
	public void user_click_first_page_dev() {		
		followUpDev.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page");
	}
	@When("User click show page follow up developer" )
	public void user_click_showpage_dev() {		
		followUpDev.clickShowPage();
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
