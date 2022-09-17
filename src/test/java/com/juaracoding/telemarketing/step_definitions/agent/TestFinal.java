package com.juaracoding.telemarketing.step_definitions.agent;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.ActivityAgent;
import com.juaracoding.telemarketing.pages.FinalAgent;
import com.juaracoding.telemarketing.pages.FollowUpAgent;
import com.juaracoding.telemarketing.pages.LoginAgent;
import com.juaracoding.telemarketing.pages.NewAgent;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestFinal {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	
	private FinalAgent finalAgent = new FinalAgent();
	
	
	public TestFinal() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	

	
	//-------------------------DASHBOARD---------------------------
	@And("User click final" )
	public void user_click_final() {		
		finalAgent.clickBtnFinal();
		extentTest.log(LogStatus.PASS, "User click final");
	}
	@Then("Page final")
	public void page_final() {
		String actual = finalAgent.pageFinal();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page final");
	}
	
	
	
	
	//-------------------------SEARCH------------------------------------------
	@When("User input search in final valid" )
	public void user_input_search_in_final() {		
		finalAgent.inputSearchData("TEA");
		extentTest.log(LogStatus.PASS, "User input search in final valid");
	}
	@And("User click search in final")
	public void user_click_search_in_final() {
		finalAgent.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "User click search in final");
	}
	@Then("Page search in final")
	public void page_search_in_final() {
		String actual = finalAgent.pageSearch();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page search in final");
		delay(2);
	}
	
	
	
	//-------------------------STATUS ACITIVITY--------------------------------
	@When("User click data in final" )
	public void user_click_data_in_final() {		
		finalAgent.clickData();
		extentTest.log(LogStatus.PASS, "User click data");
	}
	
	
	//------------------------------NEXT & SHOW PAGE------------------------------------
	@When("User click next page in final" )
	public void user_click_next_page_in_final() {		
		finalAgent.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page in final");
	}
	@When("User click previous page in final" )
	public void user_click_previous_page_in_final() {		
		finalAgent.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page in final");
	}
	@When("User click last page in final" )
	public void user_click_last_page_in_final() {		
		finalAgent.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page in final");
	}
	@When("User click first page in final" )
	public void user_click_first_page_in_final() {		
		finalAgent.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page in final");
	}
	

	@When("User click show page in final" )
	public void user_click_showpage_in_final() {		
		finalAgent.clickShowPage();
		extentTest.log(LogStatus.PASS, "User click show page in final");
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
