package com.juaracoding.telemarketing.step_definitions;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.Activity;
import com.juaracoding.telemarketing.pages.FollowUpAgent;
import com.juaracoding.telemarketing.pages.LoginAgent;
import com.juaracoding.telemarketing.pages.NewAgent;
import com.juaracoding.telemarketing.pages.NewDev;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestFollowUpAgent{
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private NewAgent newAgent = new NewAgent();
	private FollowUpAgent followUpAgent = new FollowUpAgent();
	
	
	public TestFollowUpAgent() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	

	
	//-------------------------DASHBOARD---------------------------
	@And("User click follow up" )
	public void user_click_followup() {		
		followUpAgent.clickBtnFollowUp();
		extentTest.log(LogStatus.PASS, "User click follow up");
	}
	@Then("Page follow up")
	public void page_followup() {
		String actual = followUpAgent.pageFollowUp();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page follow up");
	}
	
	
	
	
	//-------------------------SEARCH------------------------------------------
	@When("User input search in follow up valid" )
	public void user_input_search_in_followup() {		
		followUpAgent.inputSearchData("ms");
		extentTest.log(LogStatus.PASS, "User input search in follow up valid");
	}
	@And("User click search in follow up")
	public void user_click_search_in_followup() {
		followUpAgent.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "User click search in follow up");
	}
	@Then("Page search in follow up")
	public void page_search_in_followup() {
		String actual = followUpAgent.pageSearch();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page search in follow up");
		delay(2);
	}
	
	
	
	//-------------------------STATUS ACITIVITY--------------------------------
	@When("User click data in follow up" )
	public void user_click_data_in_followup() {		
		followUpAgent.clickData();
		extentTest.log(LogStatus.PASS, "User click data");
	}
	
	
	//------------------------------NEXT & SHOW PAGE------------------------------------
	@When("User click next page in follow up" )
	public void user_click_next_page_in_followup() {		
		followUpAgent.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page in follow up");
	}
	@When("User click previous page in follow up" )
	public void user_click_previous_page_in_followup() {		
		followUpAgent.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page in follow up");
	}
	@When("User click last page in follow up" )
	public void user_click_last_page_in_followup() {		
		followUpAgent.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page in follow up");
	}
	@When("User click first page in follow up" )
	public void user_click_first_page_in_followup() {		
		followUpAgent.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page in follow up");
	}
	

	@When("User click show page in follow up" )
	public void user_click_showpage_in_followup() {		
		followUpAgent.clickShowPage();
		extentTest.log(LogStatus.PASS, "User click show page in follow up");
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
