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

public class NewDev {
	
	private WebDriver driver;
	
	public NewDev() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"52827_query\"]")
	private WebElement btnNew;
	
	@FindBy(xpath = "//*[@id=\"52969_query\"]")
	private WebElement btnSearch;

	@FindBy(xpath = "//*[@id=\"tl_data_new--52963_text\"]")
	private WebElement fieldSearch;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967-cell-0-1\"]")
	private WebElement navigateToData;
	
	@FindBy(xpath = "//*[@id=\"52971_query\"]")
	private WebElement btnExport;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967-header\"]/th[3]")
	private WebElement pageNew;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967-cell-0-1\"]")
	private WebElement pageSearch;

	@FindBy(xpath = "//*[@id=\"tl_data_new--52967_show_text\"]")
	private WebElement showPage;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[3]/a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[2]/a")
	private WebElement prevPage;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[8]/a")
	private WebElement lastPage;
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967_page\"]")
	private WebElement firstPage;

	
	public void clickBtnExport() {
		btnExport.click();
		delay(1);
	}
	//-------------------------DASHBOARD---------------------------
	public void clickBtnNew() {
		btnNew.click();
		delay(1);
	}
	public void clickData() {
		navigateToData.click();
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
		js.executeScript("window.scrollBy(0,-300)");
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
