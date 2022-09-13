package com.juaracoding.telemarketing.step_definitions;

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
	
//	search user
	@When("input user")
	public void input_user() {
		userPage.search();
		delay(2);
		extentTest.log(LogStatus.PASS, "input user");
	}
	
//	add user
	@When("click button add")
	public void click_button_add() {
		userPage.clickBtnAdd();
		extentTest.log(LogStatus.PASS, "click button add");
	}
	
	@And("input field add user")
	public void input_field_add_user() {
		userPage.formAdd();
		extentTest.log(LogStatus.PASS, "input field add user");
	}
	
	@Then("save user")
	public void save_user() {
		userPage.clickBtnSave();
		extentTest.log(LogStatus.PASS, "save user");
		
	}
	
//	reset password
	@When("click checkbox pada user")
	public void click_checkbox_pada_user() {
		userPage.userCheckbox();
		extentTest.log(LogStatus.PASS, "click checkbox pada user");
	}
	
	@And("click button reset pass")
	public void click_button_reset_pass() {
		userPage.clickResetPassword();
		delay(1);
		userPage.clickBtnYes();
		extentTest.log(LogStatus.PASS, "click button reset pass");
	}
	
	@Then("reset pass done")
	public void reset_pass_done() {
		delay(1);
		userPage.clickBtnDone();
		extentTest.log(LogStatus.PASS, "reset pass done");
	}
	
	
//	Update form
	@When("click button edit")
	public void click_button_edit() {
		userPage.edit();
		extentTest.log(LogStatus.PASS, "click button edit");
	}
	
	@And("edit form")
	public void edit_form() {
		userPage.deleteForm();
		delay(1);
		userPage.formUpdate();
		extentTest.log(LogStatus.PASS, "edit form");
	}
	
	@Then("click button update")
	public void click_button_update() {
		userPage.clickBtnUpdate();
		extentTest.log(LogStatus.PASS, "edit formclick button update");
		
	}
	
//	Update password
	
	@And("click button update password")
	public void click_button_update_password() {
		userPage.clickBtnUpdatePass();
		delay(1);
		extentTest.log(LogStatus.PASS, "click button update password");
	}
	
	@And("input new password")
	public void input_new_password() {
		userPage.updatePass();
		delay(1);
		extentTest.log(LogStatus.PASS, "input new password");
	}
	
	
//	Remove user
	@When("click button remove")
	public void click_button_remove() {
		delay(2);
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
