package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class ApprovePhone {
	
	private WebDriver driver;
	
	public ApprovePhone() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	open dashboard user management
	@FindBy(xpath = "//h3[@id='ui-id-13']")
	private WebElement listUserManagement;
	
	@FindBy(xpath = "//span[normalize-space()='Phone Approve']")
	private WebElement ApprovePhone;
	
//	search user
	@FindBy(xpath = "//input[@id='tl_add_phone--51816_text']")
	private WebElement search;
	
//	button
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//span[normalize-space()='Approve']")
	private WebElement btnApprove;
	
	@FindBy(xpath = "//span[normalize-space()='Reject']")
	private WebElement btnReject;
	
//	CheckBox
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[5]/div[6]/table/tbody/tr[2]/td[1]")
	private WebElement checkbox;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnYes;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
	private WebElement btnDone;
	
//	SHOW PAGE
	@FindBy(xpath = "//*[@id=\"tl_add_phone--51825_show_text\"]")
	private WebElement showPage;
	
	
//	dashboard
	public void listUserManagement() {
		listUserManagement.click();
	}
	
	public void listApprovePhone() {
		ApprovePhone.click();
	}
	
//	search
	public String search() {
		this.search.sendKeys("DEVELOPER");
		delay(2);
		btnSearch.click();
		return search.getText();
	}
	
//	button
	public void clickBtnApprove() {
		btnApprove.click();
	}
	
	
//	reject phone
	public void clickReject() {
		btnReject.click();
	}
	
//	approve phone
	public void userCheckbox() {
		checkbox.click();
	}
	
	public void clickBtnDone() {
		btnDone.click();
	}
	
	public void clickBtnYes() {
		delay(1);
		btnYes.click();
	}
	
//	show page
	public void showPage() {
		showPage.click();
		delay(1);
		Select showingPage = new Select(showPage);
		showingPage.selectByValue("25");
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
