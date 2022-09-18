package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class FollowUpDev {
	
	private WebDriver driver;
	
	public FollowUpDev() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"52769_query\"]")
	private WebElement btnExport;
	
	@FindBy(xpath = "//*[@id=\"52834_query\"]")
	private WebElement btnFollowUp;
	
	@FindBy(xpath = "//*[@id=\"tl_thinking--52761_text\"]")
	private WebElement fieldSearch;
	
	@FindBy(xpath = "//*[@id=\"52767_query\"]")
	private WebElement btnSearch;

	@FindBy(xpath = "//*[@id=\"tl_thinking--52765-cell-0-1\"]")
	private WebElement navigateToData;

	@FindBy(xpath = "//*[@id=\"tl_thinking--52765-header\"]/th[3]")
	private WebElement pageFollowUp;
	
	@FindBy(xpath = "//*[@id=\"tl_thinking--52765-header\"]/th[3]")
	private WebElement pageSearch;
	
	
	@FindBy(xpath = "//*[@id=\"tl_thinking--52765\"]/div[4]/ul/li[3]/a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"tl_thinking--52765\"]/div[4]/ul/li[2]/a")
	private WebElement prevPage;
	
	@FindBy(xpath = "//*[@id=\"tl_thinking--52765\"]/div[4]/ul/li[4]/a")
	private WebElement lastPage;
	
	@FindBy(xpath = "//*[@id=\"tl_thinking--52765_page\"]")
	private WebElement firstPage;
	
	@FindBy(xpath = "//*[@id=\"tl_thinking--52765_show_text\"]")
	private WebElement showPage;
	

	public void clickBtnExport() {
		btnExport.click();
		delay(1);
	}
	//-------------------------DASHBOARD---------------------------
	public void clickBtnFollowUp() {
		btnFollowUp.click();
		delay(1);
	}
	public String pageFollowUp() {
		delay(1);
		return this.pageFollowUp.getText();
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

	//-------------------------STATUS ACITIVITY---------------------------
	public void clickData() {
		navigateToData.click();
		delay(1);
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

	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
