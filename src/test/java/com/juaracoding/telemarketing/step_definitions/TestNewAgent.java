package com.juaracoding.telemarketing.step_definitions;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.Activity;
import com.juaracoding.telemarketing.pages.NewAgent;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestNewAgent{
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private NewAgent newAgent = new NewAgent();
	private Activity activityAgent = new Activity();
	
	
	public TestNewAgent() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//-------------------------PHONE---------------------------
	@And("User click list phone")
	public void user_click_list_phone() {		
		activityAgent.clickListPhone();
		extentTest.log(LogStatus.PASS, "User click list phone");
	}
	@When("User click add phone")
	public void user_click_add_phone() {		
		activityAgent.clickAddPhone();
		extentTest.log(LogStatus.PASS, "User click add phone");
	}
	
	@And("User input request phone")
	public void user_input_request_phone() {		
		activityAgent.inputRequestPhone("089636391169");
		extentTest.log(LogStatus.PASS, "User input request phone");
	}
	
	@And("User click save phone")
	public void user_click_save_phone() {		
		activityAgent.clickSavePhone();
		extentTest.log(LogStatus.PASS, "User click save phone");
	}
	
	@And("User click konfirmasi Ok")
	public void user_click_konfirmasi_ok() {		
		activityAgent.clickKonfirmasiOk();
		extentTest.log(LogStatus.PASS, "User click konfirmasi ok");
	}
	@Then("Popup konfirmasi")
	public void popup_konfirmasi() {
		String actual = activityAgent.popUpKonfirmasiPhone();
		assertTrue(actual.contains("Data"));
		extentTest.log(LogStatus.PASS, "Popup konfirmasi");
	}
	

	
	//-------------------------PHONE WA---------------------------
	@When("User input WA valid")
	public void user_input_wa_valid() {		
		activityAgent.phoneWaValid("089636391172", "Hallo");
		extentTest.log(LogStatus.PASS, "User input WA");
	}
	
	@And("User input WA invalid")
	public void user_input_wa_invalid() {	
		activityAgent.deleteFieldWa();
		activityAgent.phoneWaInvalid("aoskwosw", "Hallo");
		extentTest.log(LogStatus.PASS, "User input WA");
	}
	
	@And("User click send wa")
	public void user_click_send_wa() {		
		activityAgent.clickBtnSendWA();
		extentTest.log(LogStatus.PASS, "User click send wa");
	}
	
	
	
	//-------------------------DASHBOARD---------------------------
	@And("User click task")
	public void user_click_task() {		
		newAgent.clickBtnTask();;
		extentTest.log(LogStatus.PASS, "User click task");
	}
	@And("User click new" )
	public void user_click_new() {		
		newAgent.clickBtnNew();
		extentTest.log(LogStatus.PASS, "User click new");
	}
	@Then("Page new")
	public void page_new() {
		String actual = newAgent.pageNew();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page new");
	}
	
	
	
	
	//-------------------------SEARCH------------------------------------------
	@When("User input search valid" )
	public void user_input_search_valid() {		
		newAgent.inputSearchData("ms");
		extentTest.log(LogStatus.PASS, "User input search valid");
	}
	@And("User click search")
	public void user_click_search() {
		newAgent.clickBtnSearch();
		extentTest.log(LogStatus.PASS, "User click search");
	}
	@Then("Page search")
	public void page_search() {
		String actual = newAgent.pageNew();
		assertTrue(actual.contains("Nama"));
		extentTest.log(LogStatus.PASS, "Page search");
		delay(2);
	}
	
	
	
	//-------------------------STATUS ACITIVITY--------------------------------
	@When("User click data" )
	public void user_click_data() {		
		newAgent.clickData();
		extentTest.log(LogStatus.PASS, "User click data");
	}
	@And("Input activity data form with {string} as status and {string} as statuscall")
	public void inputActivityData(String status, String statuscall) {
		delay(1);
		activityAgent.formAdd(status,statuscall);
		extentTest.log(LogStatus.PASS, "User input status & statuscall");
	}
	@And("Input activity data2 form with {string} as statusresult and {string} as reason")
	public void inputActivityData2(String statusresult, String reason) {
		delay(1);
		activityAgent.formAdd2(statusresult,reason);
		extentTest.log(LogStatus.PASS, "User input result & reason");
	}
	@And("User click konfirmasi YES" )
	public void user_click_konfirmasi_yes() {		
		activityAgent.clickKonfirmasiSubmit();
		extentTest.log(LogStatus.PASS, "User click confirmation yes");
	}
	@And("User click submit" )
	public void user_click_submit() {		
		activityAgent.clickSubmit();
		extentTest.log(LogStatus.PASS, "User click submit");
	}
	@And("User click close" )
	public void user_click_close() {		
		activityAgent.clickClose();
		extentTest.log(LogStatus.PASS, "User click close");
	}
	@Then("Page activity")
	public void page_activity() {
		String actual = activityAgent.pageActivity();
		assertTrue(actual.contains("Link"));
		extentTest.log(LogStatus.PASS, "Page Activity");
	}
	
	
	
	//------------------------------NEXT & SHOW PAGE------------------------------------
	@When("User click next page" )
	public void user_click_next_page() {		
		newAgent.clickNextPage();
		extentTest.log(LogStatus.PASS, "User click next page");
	}
	@When("User click previous page" )
	public void user_click_previous_page() {		
		newAgent.clickPrevPage();
		extentTest.log(LogStatus.PASS, "User click previous page");
	}
	@When("User click last page" )
	public void user_click_last_page() {		
		newAgent.clickLastPage();
		extentTest.log(LogStatus.PASS, "User click last page");
	}
	@When("User click first page" )
	public void user_click_first_page() {		
		newAgent.clickFirstPage();
		extentTest.log(LogStatus.PASS, "User click first page");
	}
	

	@When("User click show page" )
	public void user_click_showpage() {		
		newAgent.clickShowPage();
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
