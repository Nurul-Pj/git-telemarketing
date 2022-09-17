package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.user;
//import com.juaracoding.telemarketing.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestUser {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private user userPage = new user();
	
	public TestUser() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	
//	dashboard user management
	@When("click list user management")
	public void click_list_user_management() {
		userPage.listUserManagement();
		extentTest.log(LogStatus.PASS, "click list user management");
	}
	
	@Then("click menu user")
	public void click_menu_user() {
		userPage.listUser();
		extentTest.log(LogStatus.PASS, "click menu user");
		
	}
	
//	add user
	@When("click button add")
	public void click_button_add() {
		userPage.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button add");
	}
	
	@And("input field add user and select {string} as previlages and {string} as supervisior")
	public void input_field_add_user_and_select_as_previlages_and_as_supervisior(String privilages, String supervisior) {
		delay(1);
		userPage.formAdd(privilages, supervisior);
	}
	
	@And("edit field add user and select {string} as previlages and {string} as supervisior")
	public void edit_field_add_user_and_select_as_previlages_and_as_supervisior(String Privilages, String Supervisior) {
		delay(1);
		userPage.formAdd(Privilages, Supervisior);
	}


	
	@And("save user")
	public void save_user() {
		delay(1);
		userPage.clickBtnSave();
		delay(1);
		userPage.clickBtnYes();
		extentTest.log(LogStatus.PASS, "save user");	
	}
	
	
//	search user
	@When("input user")
	public void input_user() {
		delay(1);
		userPage.search();
		extentTest.log(LogStatus.PASS, "input user");
	}
	
//	reset password
	@When("click checkbox pada user")
	public void click_checkbox_pada_user() {
		delay(1);
		userPage.userCheckbox();
		extentTest.log(LogStatus.PASS, "click checkbox pada user");
	}
	
	@And("click button reset pass")
	public void click_button_reset_pass() {
		delay(1);
		userPage.clickResetPassword();
		userPage.clickBtnYes();
		extentTest.log(LogStatus.PASS, "click button reset pass");
	}
	
	@Then("reset pass done")
	public void reset_pass_done() {
		delay(1);
		userPage.clickBtnDone();
		extentTest.log(LogStatus.PASS, "reset pass done");
	}
	
//	Update password
	@And("click button update password")
	public void click_button_update_password() {
		userPage.clickBtnUpdatePass();
		delay(1);
		userPage.getTxtAgentEdit();
		assertEquals(userPage.getTxtAgentEdit(), "[d] Agent Editable");
		extentTest.log(LogStatus.PASS, "click button update password");
	}
	
	@And("input new password")
	public void input_new_password() {
		userPage.updatePass();
		delay(1);
		userPage.close();
		extentTest.log(LogStatus.PASS, "input new password");
	}
	
	
//	Update form
	@When("click button edit")
	public void click_button_edit() {
		delay(1);
		userPage.edit();
		extentTest.log(LogStatus.PASS, "click button edit");
	}
	
	@And("edit form")
	public void edit_form() {
		delay(1);
		userPage.nullForm();
		extentTest.log(LogStatus.PASS, "edit form");
	}
	
	@Then("click button update")
	public void click_button_update() {
		userPage.clickBtnUpdate();
		delay(1);
		userPage.validateUser();
		delay(1);
		extentTest.log(LogStatus.PASS, "edit formclick button update");
		
	}
	
	
//	Remove user
	@When("click button remove")
	public void click_button_remove() {
		delay(1);
		userPage.remove();
		extentTest.log(LogStatus.PASS, "click button remove");
	}
	
	@Then("remove user done")
	public void remove_user_done() {
		delay(1);
		userPage.clickBtnYa();
		extentTest.log(LogStatus.PASS, "remove user done");
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
