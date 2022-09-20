package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.TaskFinal;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTaskFinal {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	private TaskFinal taskFinal = new TaskFinal();
	
	public TestTaskFinal() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
					
			@When("User click final dev")
			public void user_click_final_dev() {
				delay(2);
				taskFinal.btnTaskFinal();
				extentTest.log(LogStatus.PASS, "User click final dev");
			}
			
			
			@When("User click next page final dev")
			public void user_click_next_page_final_dev() {		
				taskFinal.clickNextPage();
				extentTest.log(LogStatus.PASS, "User click next page final dev");
			}
			
			@And("User click previous page final dev")
			public void user_click_previous_page_final_dev() {		
				taskFinal.clickPrevPage();
				extentTest.log(LogStatus.PASS, "User click previous page final dev");
			}
			
			@And("User click last page final dev")
			public void user_click_last_page_final_dev() {		
				taskFinal.clickLastPage();
				extentTest.log(LogStatus.PASS, "User click last page final dev");
			}
			
			@And("User click first page final dev")
			public void user_click_first_page_final_dev() {		
				taskFinal.clickFirstPage();
				extentTest.log(LogStatus.PASS, "User click first page final dev");
			}
					
			@When("User click search final dev")
			public void user_click_search_final_dev() {
				delay(2);
				taskFinal.search("cocabakes_husain2");
				extentTest.log(LogStatus.PASS, "User click search_final dev");
			}
					
			@Then("User click button search final dev")
			public void user_click_button_search_final_dev() {
				delay(2);
				taskFinal.btnSearch();
				delay(3);
				extentTest.log(LogStatus.PASS, "User click button search final dev");
			}
			
			@When("User click button show page final dev")
			public void user_click_button_show_page_final_dev() {		
				taskFinal.clickShowPage();
				extentTest.log(LogStatus.PASS, "User click show page final dev");
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
