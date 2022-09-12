package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class NewAgent {
	
	private WebDriver driver;
	
	public NewAgent() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ui-id-5\"]")
	private WebElement btnTask;
	
	@FindBy(xpath = "//*[@id=\"52827_query\"]")
	private WebElement btnNew;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52963_text\"]")
	private WebElement fieldSearch;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967-cell-0-4\"]")
	private WebElement navigateToData;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53076_text\"]")
	private WebElement dropDownChannel;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53050_text\"]")
	private WebElement dropDownStatus;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53048_text\"]")
	private WebElement dropDownStatusCall;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53051_text\"]")
	private WebElement dropDownStatusResult;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53052_text\"]")
	private WebElement dropDownReason;
	
	@FindBy(xpath = "//*[@id=\"53058_query\"]")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//*[@id=\"53069_query\"]")
	private WebElement btnAddPhone;
	
	@FindBy(xpath = "//*[@id=\"tl_multi_add_phone--51838_text\"]")
	private WebElement requestPhone;
	
	@FindBy(xpath = "//*[@id=\"51839_query\"]")
	private WebElement btnSavePhone;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
	private WebElement btnKonfirmasiOk;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53057_text\"]")
	private WebElement dropDownPhone;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53073_text\"]")
	private WebElement fieldPhoneWA;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53071_text\"]")
	private WebElement fieldMsg;
	
	@FindBy(xpath = "//*[@id=\"53072_query\"]")
	private WebElement btnSendWA;
	
	
	
	public void clickListPhone() {
		Select phoneSelect = new Select(dropDownPhone);
		phoneSelect.selectByIndex(3);
		delay(2);
	}
	
	public void phoneWA(String phoneWA, String msgWA) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		this.fieldPhoneWA.sendKeys(phoneWA);
		this.fieldMsg.sendKeys(msgWA);
		btnSendWA.click();
		delay(2);
	}
	
	public void clickBtnTask() {
		btnTask.click();
		delay(2);
	}
	
	public void clickBtnNew() {
		btnNew.click();
		delay(2);
	}
	

	public void clickData() {
		navigateToData.click();
		delay(2);
	}
	
	public void clickAddPhone() {
		btnAddPhone.click();
		delay(2);
	}
	
	public void inputRequestPhone(String requestPhone) {
		this.requestPhone.sendKeys(requestPhone);
		delay(2);
	}
	
	public void clickSavePhone() {
		btnSavePhone.click();
		delay(2);
	}
	
	public void clickKonfirmasiOk() {
		btnKonfirmasiOk.click();
		delay(2);
	}
	
	public void clickSearchData(String fieldSearch) {
		this.fieldSearch.sendKeys(fieldSearch);
		this.fieldSearch.sendKeys(Keys.ENTER);
		delay(2);
	}
	
	
	
	
	public void inputData() {
		Select statusSelect = new Select(dropDownStatus);
		statusSelect.selectByValue("Tersambung");
		delay(2);
		
		Select statuscallSelect = new Select(dropDownStatusCall);
		statuscallSelect.selectByValue("Diangkat");
		delay(2);
		
		Select statusresultSelect = new Select(dropDownStatusResult);
		statusresultSelect.selectByValue("Setuju");
		delay(2);
		
		Select reasonSelect = new Select(dropDownReason);
		reasonSelect.selectByValue("Berhasil Download");
		delay(2);
		
	}

	
	
	
	public void clickSubmit() {
		btnSubmit.click();
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
