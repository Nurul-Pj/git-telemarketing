package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class TaskFinal {

	private WebDriver driver;
	
	public TaskFinal() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ui-id-15\"]")
	private WebElement btnTask;
	
	@FindBy(xpath = "//*[@id=\"52841_query\"]")
	private WebElement btnTaskFinal;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52227_text\"]")
	private WebElement inputSearch;

	@FindBy(xpath = "//*[@id=\"52233_query\"]")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231_show_text\"]")
	private WebElement showPage;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231\"]/div[4]/ul/li[3]/a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231\"]/div[4]/ul/li[2]/a")
	private WebElement prevPage;
	
	@FindBy(xpath = "//*[@id=\"tl_final--52231\"]/div[4]/ul/li[6]/a")
	private WebElement lastPage;

	@FindBy(xpath = "//*[@id=\"tl_final--52231_page\"]")
	private WebElement firstPage;
	
	public void btnTask() {
		btnTask.click();
	}
	
	public void btnTaskFinal() {
		btnTaskFinal.click();
	}
	
	public void search(String id) {
//		inputSearch.click();

		this.inputSearch.sendKeys(id);
	}
	
	public void btnSearch() {
		btnSearch.click();
	}
	
	public void btnShowPage() {
		showPage.click();
	}
	
	public void clickNextPage() {
		nextPage.click();
		delay(2);
	}
	
	public void clickPrevPage() {
		prevPage.click();
		delay(2);
	}
	
	public void clickLastPage() {
		lastPage.click();
		delay(2);
	}
	public void clickFirstPage() {
		firstPage.click();
		delay(2);
	}
	
	public void clickShowPage() {
		Select btnShowPage10 = new Select(showPage);
		btnShowPage10.selectByValue("10");
		delay(2);
		
		Select btnShowPage25 = new Select(showPage);
		btnShowPage25.selectByValue("25");
		delay(2);
		
		Select btnShowPage50 = new Select(showPage);
		btnShowPage50.selectByValue("50");
		delay(2);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
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
