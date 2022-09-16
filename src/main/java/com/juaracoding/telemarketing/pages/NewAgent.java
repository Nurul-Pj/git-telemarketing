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
	
	@FindBy(xpath = "//*[@id=\"52969_query\"]")
	private WebElement btnSearch;

	@FindBy(xpath = "//*[@id=\"tl_data_new--52963_text\"]")
	private WebElement fieldSearch;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967-cell-0-1\"]")
	private WebElement navigateToData;
	
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

	@FindBy(xpath = "/html/body/div[9]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/div[7]/table/tbody/tr/td[2]/div/select")
	private WebElement dropDownPhone;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53073_text\"]")
	private WebElement fieldPhoneWA;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53071_text\"]")
	private WebElement fieldMsgWa;
	
	@FindBy(xpath = "//*[@id=\"53072_query\"]")
	private WebElement btnSendWA;

	@FindBy(xpath = "//*[@id=\"tl_data_new--52967-header\"]/th[3]")
	private WebElement pageNew;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53077\"]/table/tbody/tr/td[1]/label")
	private WebElement pageActivity;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967-cell-0-1\"]")
	private WebElement pageSearch;
	
	@FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
	private WebElement popUpKonfirmasiPhone;

	@FindBy(xpath = "//*[@id=\"tl_data_new--52967_show_text\"]")
	private WebElement showPage;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnKonfirmasiYES;
	
	@FindBy(xpath = "/html/body/div[8]/div[1]/button")
	private WebElement btnClose;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[3]/a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[2]/a")
	private WebElement prevPage;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[7]/a")
	private WebElement lastPage;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967_page\"]")
	private WebElement firstPage;

	//-------------------------DASHBOARD---------------------------
	public void clickBtnTask() {
		btnTask.click();
		delay(1);
	}
	public void clickBtnNew() {
		btnNew.click();
		delay(1);
	}
	public String pageNew() {
		return this.pageNew.getText();
	}
	
	
	//-------------------------SEARCH--------------------------------
	public void inputSearchData(String fieldSearch) {
		this.fieldSearch.sendKeys(fieldSearch);
		delay(1);
	}
	public void clickBtnSearch() {
		btnSearch.click();
		delay(1);
	}
	public String pageSearch() {
		return this.pageSearch.getText();
	}
	
	
	//-------------------------PHONE--------------------------------
	public void clickListPhone() {
		Select phoneSelect = new Select(dropDownPhone);
		phoneSelect.selectByIndex(1);
		delay(1);
	}
	public void clickAddPhone() {
		btnAddPhone.click();
		delay(1);
	}
	public void inputRequestPhone(String requestPhone) {
		this.requestPhone.sendKeys(requestPhone);
		delay(1);
	}
	public void clickSavePhone() {
		btnSavePhone.click();
		delay(1);
	}
	public void clickKonfirmasiOk() {
		btnKonfirmasiOk.click();
		delay(1);
	}
	public String popUpKonfirmasiPhone() {
		return this.popUpKonfirmasiPhone.getText();
	}
	

	//-------------------------PHONE WA---------------------------
	public void phoneWaValid(String phoneWA, String msgWA) {
		delay(2);
		this.fieldPhoneWA.sendKeys(phoneWA);
		delay(1);
		this.fieldMsgWa.sendKeys(msgWA);
		delay(1);
	}
	public void phoneWaInvalid(String phoneWA, String msgWA) {
		this.fieldPhoneWA.sendKeys(phoneWA);
		delay(1);
		this.fieldMsgWa.sendKeys(msgWA);
		delay(1);
	}
	public void clickBtnSendWA() {
		btnSendWA.click();
		delay(1);
	}
	public void deleteFieldWa() {
		fieldPhoneWA.sendKeys(Keys.CONTROL+"A");
		fieldPhoneWA.sendKeys(Keys.BACK_SPACE);
		fieldMsgWa.sendKeys(Keys.CONTROL+"A");
		fieldMsgWa.sendKeys(Keys.BACK_SPACE);
		delay(1);
	}

	//-------------------------STATUS ACITIVITY---------------------------
	public void clickData() {
		navigateToData.click();
		delay(1);
	}
	public void clickSubmit() {
		btnSubmit.click();
		delay(1);
	}
	public void clickKonfirmasiSubmit() {
		btnKonfirmasiYES.click();
		delay(1);
	}
	public void clickClose() {
		btnClose.click();
		delay(1);
	}
	public String pageActivity() {
		return this.pageActivity.getText();
	}
	
	//------------------------------PAGE------------------------------------
	public void clickNextPage() {
		nextPage.click();
		delay(1);
	}
	public void clickPrevPage() {
		prevPage.click();
		delay(1);
	}
	public void clickLastPage() {
		lastPage.click();
		delay(1);
	}
	public void clickFirstPage() {
		firstPage.click();
		delay(1);
	}
	
	
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
		js.executeScript("window.scrollBy(-700,0)");
	}


	
	//------------------------------SCROLL UP & DOWN------------------------------------
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(-300,0)");
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
