package com.juaracoding.telemarketing.step_definitions.agent;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.ActivityAgent;
import com.juaracoding.telemarketing.pages.DataAllAgent;
import com.juaracoding.telemarketing.pages.FinalAgent;
import com.juaracoding.telemarketing.pages.FollowUpAgent;
import com.juaracoding.telemarketing.pages.LoginAgent;
import com.juaracoding.telemarketing.pages.NewAgent;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestDataAll {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	
	private DataAllAgent dataAllAgent = new DataAllAgent();
	
	
	public TestDataAll() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	

	
	//-------------------------DASHBOARD---------------------------
	@And("User click data all" )
	public void user_click_data_all() {		
		dataAllAgent.clickBtnDataAll();
		extentTest.log(LogStatus.PASS, "User click data all");
	}
	@Then("Page data all")
	public void page_data_all() {
		String actual = dataAllAgent.pageDataAll();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page data all");
	}
	
	
	
	
	//-------------------------SEARCH------------------------------------------
	@When("User input search in data all valid" )
	public void user_input_search_in_data_all() {		
		dataAllAgent.inputSearchData("suky");
		extentTest.log(LogStatus.PASS, "User input search in data all valid");
	}
	@And("User click search in data all")
	public void user_click_search_in_data_all() {
		dataAllAgent.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "User click search in data all");
	}
	@Then("Page search in data all")
	public void page_search_in_data_all() {
		String actual = dataAllAgent.pageSearch();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page search in final");
		delay(2);
	}
	@And("Choose filter form with {string} as agent and {string} as status")
	public void filterForm(String agent, String status) {
		delay(1);
		dataAllAgent.formFilter(agent,status);
		extentTest.log(LogStatus.PASS, "User search filter agent & status");
	}
	
	
	//-------------------------STATUS ACITIVITY--------------------------------
	@When("User click data in data all" )
	public void user_click_data_in_data_all() {		
		dataAllAgent.clickData();
		extentTest.log(LogStatus.PASS, "User click data all");
	}
	
	
	//------------------------------NEXT & SHOW PAGE------------------------------------
	@When("User click next page in data all" )
	public void user_click_next_page_in_data_all() {		
		dataAllAgent.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page in data all");
	}
	@When("User click previous page in data all" )
	public void user_click_previous_page_in_data_all() {		
		dataAllAgent.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page in data all");
	}
	@When("User click last page in data all" )
	public void user_click_last_page_in_data_all() {		
		dataAllAgent.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page in data all");
	}
	@When("User click first page in data all" )
	public void user_click_first_page_in_data_all() {		
		dataAllAgent.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page in data all");
	}
	

	@When("User click show page in data all" )
	public void user_click_showpage_in_data_all() {		
		dataAllAgent.clickShowPage();
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
