package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.TaskFinal;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TestTaskFinal {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	private TaskFinal taskFinal = new TaskFinal();
	
	public TestTaskFinal() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	//Task Final Dev
			@When("Pilih menu final")
			public void pilih_menu_final() {
				delay(2);
				taskFinal.btnTask();
				extentTest.log(LogStatus.PASS, "Pilih menu final");
			}
					
			@And("User click final")
			public void user_click_final() {
				delay(2);
				taskFinal.btnTaskFinal();
				extentTest.log(LogStatus.PASS, "User click final");
			}
			
			@And("User click next page final")
			public void user_click_next_page_final() {		
				taskFinal.clickNextPage();
				extentTest.log(LogStatus.PASS, "User click next page final");
			}
			
			@And("User click previous page final")
			public void user_click_previous_page_final() {		
				taskFinal.clickPrevPage();
				extentTest.log(LogStatus.PASS, "User click previous page final");
			}
			
			@And("User click last page final")
			public void user_click_last_page_final() {		
				taskFinal.clickLastPage();
				extentTest.log(LogStatus.PASS, "User click last page final");
			}
			
			@And("User click first page final")
			public void user_click_first_page_final() {		
				taskFinal.clickFirstPage();
				extentTest.log(LogStatus.PASS, "User click first page final");
			}
					
			@And("User click search final")
			public void user_click_search_final() {
				delay(2);
				taskFinal.search("cocabakes_husain2");
				extentTest.log(LogStatus.PASS, "User click search_final");
			}
					
			@And("User click button search final")
			public void user_click_button_search_final() {
				delay(2);
				taskFinal.btnSearch();
				delay(3);
				extentTest.log(LogStatus.PASS, "User click button search");
			}
			
			
			
			@And("User click button show page final")
			public void user_click_button_show_page_final() {		
				taskFinal.clickShowPage();
				extentTest.log(LogStatus.PASS, "User click show page final");
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
