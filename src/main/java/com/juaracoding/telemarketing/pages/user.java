package com.juaracoding.telemarketing.pages;

import java.util.List;

import org.openqa.selenium.By;
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
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[3]/div/div[6]/table/tbody/tr/td[1]/input")
	private WebElement checkbox;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
	private WebElement btnDone;
	
//	Update form
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[3]/div/div[6]/table/tbody/tr/td[12]/div/table/tbody/tr[1]/td[1]/div/img")
	private WebElement edit;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-21-51730_text\"]")
	private WebElement FullName;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-21-51736_text\"]")
	private WebElement Telephone;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-21-51738_text\"]")
	private WebElement UserActive;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-21-51746_text\"]")
	private WebElement Extension;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-21-51740_text\"]")
	private WebElement Username;
	
	@FindBy(xpath = "//*[@id=\"tl_agent_editable-21-51740_text\"]")
	private WebElement Password;
	
	
	@FindBy(xpath = "//*[@id=\"51743_query\"]")
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
	
	@FindBy(xpath = "/html/body/div[9]/div[1]/span")
	private WebElement txtAgentEditable;
	
//	remove user
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[3]/div/div[6]/table/tbody/tr/td[12]/div/table/tbody/tr[1]/td[2]/div/img")
	private WebElement remove;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnYa;
	
	@FindBy(id="tl_user_management--51688_table")
	private WebElement tableUser;
	
	@FindBy(id="//td[@id='tl_user_management--51688-cell-6-2']")
	private WebElement table;
	
	//*[@id="tl_user_management--51688_table"]/tbody/tr[7]
	
	
//	open dashboard
	public void listUserManagement() {
		listUserManagement.click();
	}
	
	public void listUser() {
		user.click();
	}
	
//	search user
	public String search() {
		this.searchUser.sendKeys("PJ");
		delay(2);
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
	public void formAdd(String privilages, String supervisior) {
		fullName.sendKeys("DEVELOPER");
		choosePrivileges(privilages);
		chooseSupervisior(supervisior);
		telephone.sendKeys("12345678");
		extension.sendKeys("2022");
		username.sendKeys("PJ");
		password.sendKeys("20");
	}
	
	
	public void choosePrivileges(String privileges) {
		Select privilagesField = new Select(selectPrivilages);
		if(privileges.equalsIgnoreCase("Agent")){
			privilagesField.selectByIndex(1);
		}
		else if(privileges.equalsIgnoreCase("Admin")){
			privilagesField.selectByIndex(2);
		}
		else if(privileges.equalsIgnoreCase("Supervisior")){
			privilagesField.selectByIndex(3);
		}
		else if(privileges.equalsIgnoreCase("null")){
			privilagesField.selectByIndex(0);
		}
	}


	
	public void chooseSupervisior(String supervisior) {
		Select supervisiorField = new Select(selectSupervisor);
		if(supervisior.equalsIgnoreCase("DEVELOPER")){
			supervisiorField.selectByIndex(1);
		}
		else if(supervisior.equalsIgnoreCase("null")){
			supervisiorField.selectByIndex(0);
		}
	}
	
	public void clickBtnSave() {
		delay(1);
		btnSave.click();
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
	
	public String getTxtAgentEdit() {
		return txtAgentEditable.getText();
	}
	
	
//	Form Update
	public void edit() {
		delay(1);
		edit.click();
	}
	
	public void nullForm() {
		FullName.sendKeys(Keys.CONTROL+"A");
		FullName.sendKeys(Keys.BACK_SPACE);
		Telephone.sendKeys(Keys.CONTROL+"A");
		Telephone.sendKeys(Keys.BACK_SPACE);
		UserActive.sendKeys(Keys.CONTROL+"A");
		UserActive.sendKeys(Keys.BACK_SPACE);
		Extension.sendKeys(Keys.CONTROL+"A");
		Extension.sendKeys(Keys.BACK_SPACE);
		Username.sendKeys(Keys.CONTROL+"A");
		Username.sendKeys(Keys.BACK_SPACE);
		Password.sendKeys(Keys.CONTROL+"A");
		Password.sendKeys(Keys.BACK_SPACE);
		
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
	
	public void tableAdded() {
		tableUser.findElement(By.xpath("//td[@id='tl_user_management--51688-cell-6-2']"));
	}
	
	public boolean validateUser() {
		int temp = 0;
		
		List<WebElement> totalRows =tableUser.findElements(By.tagName("tr"));
		int rowsCount = totalRows.size();
		
		for (int row=0; row<rowsCount;row++) {
			List<WebElement> columns_row = totalRows.get(row).findElements(By.tagName("td"));
			int columns_count = columns_row.size();
             
			for (int column=0; column<columns_count; column++){
            	 String celtext = columns_row.get(column).getText();
                 if (celtext.equalsIgnoreCase("PJ")) {
                	 temp++;
                 }
             }
		}
		
		if (temp>0) {
			return true;
		} else {return false;}
		
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
