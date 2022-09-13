package com.juaracoding.telemarketing.step_definitions;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.ApprovePhone;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestApprovePhone {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private ApprovePhone approvePhone = new ApprovePhone();
	
	public TestApprovePhone() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
//	dashboard user management
	
	@Then("click menu approve phone")
	public void click_menu_approve_phone() {
		approvePhone.listApprovePhone();
		extentTest.log(LogStatus.PASS, "click menu approve phone");
	}
	
//	show page
	@When("click show page")
	public void click_show_page() {
		approvePhone.showPage();
		delay(1);
	}
	
//	search user
	@When("input user name")
	public void input_user_name() {
		approvePhone.search();
		delay(2);
		extentTest.log(LogStatus.PASS, "input user name");
	}
	
//	approve phone
	@When("click phone number")
	public void click_phone_number() {
		approvePhone.userCheckbox();
		extentTest.log(LogStatus.PASS, "click phone number");
	}
	
	@And("click button approve phone")
	public void click_button_approve_phone() {
		approvePhone.clickBtnApprove();
		delay(1);
		extentTest.log(LogStatus.PASS, "click button approve phone");
	}
	
	@Then("phone has successfully approve")
	public void phone_has_successfully_approve() {
		approvePhone.clickBtnYes();
		delay(1);
		approvePhone.clickBtnDone();
		extentTest.log(LogStatus.PASS, "phone has successfully approve");
	}
	
//	reject phone
	
	@And("click button reject phone")
	public void click_button_reject_phone() {
		approvePhone.clickReject();
		delay(1);
		extentTest.log(LogStatus.PASS, "click button reject phone");
	}
	
	@Then("phone has successfully reject")
	public void phone_has_successfully_reject() {
		approvePhone.clickBtnYes();
		delay(1);
		approvePhone.clickBtnDone();
		extentTest.log(LogStatus.PASS, "phone has successfully reject");
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
