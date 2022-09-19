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

public class FinalAgent {
	
	private WebDriver driver;
	
	public FinalAgent() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"52841_query\"]")
	private WebElement btnFinal;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52227_text\"]")
	private WebElement fieldSearch;
	
	@FindBy(xpath = "//*[@id=\"52233_query\"]")
	private WebElement btnSearch;

	@FindBy(xpath = "//*[@id=\"tl_final--52231-header\"]/th[3]")
	private WebElement pageFinal;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231-header\"]/th[3]")
	private WebElement pageSearch;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231-cell-0-1\"]")
	private WebElement navigateToData;
	
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231\"]/div[4]/ul/li[3]/a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231\"]/div[4]/ul/li[2]/a")
	private WebElement prevPage;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231\"]/div[4]/ul/li[4]/a")
	private WebElement lastPage;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231_page\"]")
	private WebElement firstPage;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231_show_text\"]")
	private WebElement showPage;
	

	//-------------------------DASHBOARD---------------------------
	public void clickBtnFinal() {
		btnFinal.click();
		delay(1);
	}
	public String pageFinal() {
		delay(1);
		return this.pageFinal.getText();
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
		delay(1);
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
		js.executeScript("window.scrollBy(0,-700)");
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
