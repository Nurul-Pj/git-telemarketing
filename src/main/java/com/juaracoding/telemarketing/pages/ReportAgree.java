package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class ReportAgree {

	private WebDriver driver;
	
	public ReportAgree() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ui-id-19\"]")
	private WebElement btnReport;

	@FindBy(xpath = "//*[@id=\"52828_query\"]")
	private WebElement clickReportAgree;

	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51772_text\"]")
	private WebElement tablekDateAgree1;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")
	private WebElement clickDateFirstAgree; //Tanggal 11
	
	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51780_text\"]")
	private WebElement tablekDateAgree2;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")
	private WebElement clickDateSecondAgree; //Tanggal 16
	
	@FindBy(xpath = "//*[@id=\"51778_query\"]")
	private WebElement clickView;
	
	@FindBy(xpath = "//*[@id=\"51797_query\"]")
	private WebElement clickExport;
	
	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_show_text\"]")
	private WebElement showPage;
	
	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776\"]/div[4]/ul/li[3]/a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776\"]/div[4]/ul/li[2]/a")
	private WebElement prevPage;
	
	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776\"]/div[4]/ul/li[5]/a")
	private WebElement lastPage;

	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_page\"]")
	private WebElement firstPage;
	
	public void btnReport() {
		btnReport.click();
	}
	
	public void taskAgree() {
		clickReportAgree.click();
	}
	
	public void tableDateAgree1() {
		tablekDateAgree1.click();
	}
	
	public void tableDateAgree2() {
		tablekDateAgree2.click();
	}
	
	public void pilihTanggalAgree1() {
		clickDateFirstAgree.click();
	}
	
	public void pilihTanggalAgree2() {
		clickDateSecondAgree.click();
	}
	
	public void btnView() {
		clickView.click();
		delay(1);
	}
	
	public void btnExport() {
		clickExport.click();
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
