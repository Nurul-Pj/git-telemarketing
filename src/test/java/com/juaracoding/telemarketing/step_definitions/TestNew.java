package com.juaracoding.telemarketing.step_definitions;


import org.openqa.selenium.WebDriver;
import com.juaracoding.telemarketing.pages.NewAgent;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class TestNew {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private NewAgent newAgent = new NewAgent();
	
	
	public TestNew() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	
	@When("User click list phone")
	public void user_click_list_phone() {		
		newAgent.clickListPhone();
		extentTest.log(LogStatus.PASS, "User click list phone");
	}
	
	@When("User input WA valid")
	public void user_input_wa_valid() {		
		newAgent.phoneWA("0892312212", "Hallo");
		extentTest.log(LogStatus.PASS, "User input WA");
	}
	
	@And("User input WA invalid")
	public void user_input_wa_invalid() {		
		newAgent.phoneWA("aoskwosw", "Hallo");
		extentTest.log(LogStatus.PASS, "User input WA");
	}
	
	@When("User click add phone")
	public void user_click_add_phone() {		
		newAgent.clickAddPhone();
		extentTest.log(LogStatus.PASS, "User click add phone");
	}
	
	@And("User input request phone")
	public void user_input_request_phone() {		
		newAgent.inputRequestPhone("089672312");
		extentTest.log(LogStatus.PASS, "User input request phone");
	}
	
	@And("User click save phone")
	public void user_click_save_phone() {		
		newAgent.clickSavePhone();
		extentTest.log(LogStatus.PASS, "User click save phone");
	}
	
	@And("User click konfirmasi Ok")
	public void user_click_konfirmasi_ok() {		
		newAgent.clickKonfirmasiOk();
		extentTest.log(LogStatus.PASS, "User click konfirmasi ok");
	}
	
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

	@When("User search valid" )
	public void user_search_valid() {		
		newAgent.clickSearchData("makaroni");
		extentTest.log(LogStatus.PASS, "User search valid");
	}
	
	@When("User click data" )
	public void user_click_data() {		
		newAgent.clickData();
		extentTest.log(LogStatus.PASS, "User click data");
	}
	
	
	@When("User input data valid" )
	public void user_input_data_valid() {		
		newAgent.inputData();
		extentTest.log(LogStatus.PASS, "User input data valid");
	}
	
	
	@And("User click submit" )
	public void user_click_submit() {		
		newAgent.clickSubmit();
		extentTest.log(LogStatus.PASS, "User click submit");
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
