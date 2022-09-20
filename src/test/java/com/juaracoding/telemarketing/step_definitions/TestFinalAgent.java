package com.juaracoding.telemarketing.step_definitions;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.Activity;
import com.juaracoding.telemarketing.pages.FinalAgent;
import com.juaracoding.telemarketing.pages.FollowUpAgent;
import com.juaracoding.telemarketing.pages.LoginAgent;
import com.juaracoding.telemarketing.pages.NewAgent;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestFinalAgent{
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	
	private FinalAgent finalAgent = new FinalAgent();
	
	
	public TestFinalAgent() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	

	
	//-------------------------DASHBOARD---------------------------
	@And("User click final agent" )
	public void user_click_final_agent() {		
		finalAgent.clickBtnFinal();
		extentTest.log(LogStatus.PASS, "User click final agent");
	}
	@Then("Page final agent")
	public void page_final_agent() {
		String actual = finalAgent.pageFinal();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page final agent");
	}
	
	
	
	
	//-------------------------SEARCH------------------------------------------
	@When("User input search in final valid agent" )
	public void user_input_search_in_final_agent() {		
		finalAgent.inputSearchData("TEA");
		extentTest.log(LogStatus.PASS, "User input search in final valid agent");
	}
	@And("User click search in final agent")
	public void user_click_search_in_final_agent() {
		finalAgent.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "User click search in final agent");
	}
	@Then("Page search in final agent")
	public void page_search_in_final_agent() {
		String actual = finalAgent.pageSearch();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page search in final agent");
		delay(2);
	}
	
	
	
	//-------------------------STATUS ACITIVITY--------------------------------
	@When("User click data in final agent" )
	public void user_click_data_in_final_agent() {		
		finalAgent.clickData();
		extentTest.log(LogStatus.PASS, "User click data agent");
	}
	
	
	//------------------------------NEXT & SHOW PAGE------------------------------------
	@When("User click next page in final agent" )
	public void user_click_next_page_in_final_agent() {		
		finalAgent.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page in final agent");
	}
	@When("User click previous page in final agent" )
	public void user_click_previous_page_in_final_agent() {		
		finalAgent.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page in final agent");
	}
	@When("User click last page in final agent" )
	public void user_click_last_page_in_final_agent() {		
		finalAgent.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page in final agent");
	}
	@When("User click first page in final agent" )
	public void user_click_first_page_in_final_agent() {		
		finalAgent.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page in final agent");
	}
	

	@When("User click show page in final agent" )
	public void user_click_showpage_in_final_agent() {		
		finalAgent.clickShowPage();
		extentTest.log(LogStatus.PASS, "User click show page in final agent");
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
