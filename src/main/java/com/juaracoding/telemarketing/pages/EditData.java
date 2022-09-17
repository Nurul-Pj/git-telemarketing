package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class EditData {
	
private WebDriver driver;
	
	public EditData() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	open dashboard data
	@FindBy(xpath = "//h3[@id='ui-id-11']")
	private WebElement listData;
	
	@FindBy(xpath = "//span[normalize-space()='Edit Data']")
	private WebElement editData;
	
	
//	search data
	@FindBy(xpath = "//input[@id='tl_edit_data--52532_text']")
	private WebElement searchUser;
	
	
//	button
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//*[@id=\"tl_edit_data--52536_table\"]/tbody/tr[1]/td[1]/table/tbody/tr/td")
	private WebElement txtValidate;
	
	@FindBy(xpath = "//*[@id=\"tl_edit_data--52536_table\"]/tbody/tr[6]")
	private WebElement tableClick;
	
	@FindBy(xpath = "/html/body/div[9]/div[1]/span")
	private WebElement formEditData;
	
	
//	data detail
	@FindBy(xpath = "//*[@id=\"tl_edit_user_activity-12-52807_text\"]")
	private WebElement selectAgents;
	
	@FindBy(xpath = "//*[@id=\"52803_query\"]/span")
	private WebElement btnUpdate;
	
	@FindBy(xpath = "/html/body/div[8]/div[1]/span")
	private WebElement popupInformasi;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
	private WebElement btnOke;
	
//	remaks
	@FindBy(xpath = "//*[@id=\"tl_edit_user_activity-12-52804_text\"]")
	private WebElement selectRemarks;
	
	@FindBy(xpath = "//*[@id=\"tl_edit_user_activity-12-52798-header\"]/th[7]")
	private WebElement validateRemarks;
	
	@FindBy(xpath = "/html/body/div[9]/div[1]/div/button/span[1]")
	private WebElement close;
	
//	show page
	@FindBy(xpath = "//*[@id=\"tl_edit_data--52536_show_text\"]")
	private WebElement showPage;
	
	
//	update status activity
	public void chooseRemarks(String remarks) {
		Select remarksOpt = new Select(selectRemarks);
		if(remarks.equalsIgnoreCase("pilih")){
			remarksOpt.selectByIndex(0);
		}
		else if(remarks.equalsIgnoreCase("null")){
			remarksOpt.selectByIndex(1);
		}
		else if(remarks.equalsIgnoreCase("gofood & grabfood")){
			remarksOpt.selectByIndex(2);
		}
		else if(remarks.equalsIgnoreCase("gofood")){
			remarksOpt.selectByIndex(3);
		}
		else if(remarks.equalsIgnoreCase("grabfood")){
			remarksOpt.selectByIndex(4);
		}
		else if(remarks.equalsIgnoreCase("website sendiri")){
			remarksOpt.selectByIndex(5);
		}
		else if(remarks.equalsIgnoreCase("shoppe")){
			remarksOpt.selectByIndex(6);
		}
		else if(remarks.equalsIgnoreCase("tokped & shopee")){
			remarksOpt.selectByIndex(7);
		}
		else if(remarks.equalsIgnoreCase("tokped")){
			remarksOpt.selectByIndex(8);
		}
		else if(remarks.equalsIgnoreCase("wa, tokped, shopee")){
			remarksOpt.selectByIndex(9);
		}
		else if(remarks.equalsIgnoreCase("wa")){
			remarksOpt.selectByIndex(10);
		}
	}
	
	
//	update agent
	public void chooseAgents(String agents) {
		Select agentsOpt = new Select(selectAgents);
		if(agents.equalsIgnoreCase("Agent01")){
			agentsOpt.selectByIndex(0);
		}
	}
	
	public void clickBtnUpdate() {
		btnUpdate.click();
	}
	
	public String popupInformation() {
		return popupInformasi.getText();
	}
	
	public void clickBtnOke() {
		btnOke.click();
	}
	
	public String validateRemarks() {
		delay(1);
		tableClick.click();
		return validateRemarks.getText();
	}
	
	public void close() {
		close.click();
	}

	
	
//	open dashboard
	public void listData() {
		listData.click();
	}
	
	public void listEditData() {
		editData.click();
	}
	
	
//	search edit data
	public String search() {
		this.searchUser.sendKeys("AyamBakarIpul");
		delay(1);
		btnSearch.click();
		return searchUser.getText();
	}
	
	public void nullSearch() {
		searchUser.sendKeys(Keys.CONTROL+"A");
		searchUser.sendKeys(Keys.BACK_SPACE);
		btnSearch.click();
	}
	
	public String getValidate() {
		return txtValidate.getText();
	}
	
//	table clik
	public void clickTable() {
		tableClick.click();
	}
	
	public String validateForm() {
		return formEditData.getText();
	}
	
//	show page
	public void clickShowPage() {
		Select pageSelect1 = new Select(showPage);
		pageSelect1.selectByValue("25");
		delay(1);
		
		Select pageSelect2 = new Select(showPage);
		pageSelect2.selectByValue("50");
		delay(1);
		
		Select pageSelect3 = new Select(showPage);
		pageSelect3.selectByValue("100");
		delay(1);
		
		Select pageSelect4 = new Select(showPage);
		pageSelect4.selectByValue("500");
		delay(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-300)");
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
