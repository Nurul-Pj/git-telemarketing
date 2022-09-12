package com.juaracoding.telemarketing.pages.usermanagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class user {
	
	private WebDriver driver;
	
	public user() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	open dashboard user management
	@FindBy(xpath = "//h3[@id='ui-id-13']")
	private WebElement listUserManagement;
	
	@FindBy(xpath = "//span[normalize-space()='User']")
	private WebElement user;
	
//	search user
	@FindBy(xpath = "//input[@id='tl_user_management--51690_text']")
	private WebElement searchUser;
	
//	button
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//span[normalize-space()='Add']")
	private WebElement btnAdd;
	
	@FindBy(xpath = "//span[normalize-space()='Reset Password']")
	private WebElement btnResetPass;
	
//	form add
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-14-51730_text\"]")
	private WebElement fullName;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-14-51731_text\"]")
	private WebElement selectPrivilages;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-14-51733_text\"]")
	private WebElement selectSupervisor;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-14-51736_text\"]")
	private WebElement telephone;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-14-51746_text\"]")
	private WebElement extension;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-14-51740_text\"]")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-14-51741_text\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"51742_query\"]")
	private WebElement btnSave;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnYes;
	
//	Reset Password
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[3]/div/div[6]/table/tbody/tr[7]/td[1]")
	private WebElement checkbox;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
	private WebElement btnDone;
	
//	Update form
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[3]/div/div[6]/table/tbody/tr[7]/td[12]/div/table/tbody/tr[1]/td[1]/div")
	private WebElement edit;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-21-51740_text\"]")
	private WebElement Username;
	
	
	@FindBy(xpath = "//*[@id=\"51743_query\"]")
	//*[@id="51753_query"]/span
	private WebElement btnUpdateOne;

//	Update Password
	@FindBy(xpath = "//span[normalize-space()='Update Password']")
	private WebElement btnUpdatePass;
	
	@FindBy(xpath = "//*[@id=\"51753_query\"]/span")
	private WebElement btnUpdateTwo;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_edit_pass-1000-51754_text\"]")
	private WebElement fieldPass;
	
	@FindBy(xpath = "/html/body/div[9]/div[1]/div/button/span[1]")
	private WebElement close;
	
	
//	remove user
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[3]/div/div[6]/table/tbody/tr[7]/td[12]/div/table/tbody/tr[1]/td[2]/div")
	private WebElement remove;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnYa;
	
	
//	open dashboard
	public void listUserManagement() {
		listUserManagement.click();
	}
	
	public void listUser() {
		user.click();
	}
	
//	search user
	public String search() {
		this.searchUser.sendKeys("DEVELOPER");
		btnSearch.click();
		return searchUser.getText();
	}
	
//	button
	public void clickBtnAdd() {
		btnAdd.click();
	}
	
	public void clickResetPassword() {
		btnResetPass.click();
	}
	
//	form add
	public void formAdd() {
		this.fullName.sendKeys("DEVELOPER");
		Select privilages = new Select(selectPrivilages);
		privilages.selectByValue("Supervisor");
		Select supervisor = new Select(selectSupervisor);
		supervisor.selectByValue("DEVELOPER");
		this.telephone.sendKeys("12345678");
		this.extension.sendKeys("2022");
		this.username.sendKeys("PJ");
		this.password.sendKeys("20");
	}
	
	public void clickBtnSave() {
		btnSave.click();
		delay(2);
		btnYes.click();
	}
	
	public void clickBtnYes() {
		delay(1);
		btnYes.click();
	}
	
//	reset pass
	public void userCheckbox() {
		checkbox.click();
	}
	
	public void clickBtnDone() {
		btnDone.click();
	}
	
	
//	Form Update
	public void edit() {
		delay(3);
		edit.click();
	}
	
	public void deleteForm() {
		Username.sendKeys(Keys.CONTROL+"A");
		Username.sendKeys(Keys.BACK_SPACE);
	}
	
	public void formUpdate() {
		delay(1);
		this.Username.sendKeys("NURUL");
	}
	
	public void clickBtnUpdate() {
		btnUpdateOne.click();
		delay(2);
		btnYes.click();
	}
	
//	update pass
	public void clickBtnUpdatePass() {
		btnUpdatePass.click();
	}
	
	
	public void updatePass() {
		this.fieldPass.sendKeys("22");
		delay(1);
		btnUpdateTwo.click();
		delay(1);
		btnYes.click();
	}
	
	public void close() {
		close.click();
	}
	
//	remove user
	public void remove() {
		remove.click();
	}
	
	public void clickBtnYa() {
		btnYa.click();
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
