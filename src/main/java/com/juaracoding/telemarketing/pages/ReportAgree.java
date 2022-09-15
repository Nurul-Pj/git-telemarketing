package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")
	private WebElement clickDateFirst;
	
	@FindBy(xpath = "//*[@id=\"ui-id-11\"]")
	private WebElement clickDateSecond;
	
	@FindBy(xpath = "//*[@id=\"51778_query\"]")
	private WebElement clickView;
	
	@FindBy(xpath = "//*[@id=\"51797_query\"]")
	private WebElement clickExport;
	
	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_show_text\"]")
	private WebElement showPage;
	
	public void btnReport() {
		btnReport.click();
	}
	
	public void taskAgree() {
		clickReportAgree.click();
	}
	
	public void pilihTanggal1() {
		clickDateFirst.click();
		clickDateFirst.sendKeys("12/09/2022");
	}
	
	public void pilihTanggal2() {
		clickDateSecond.click();
		clickDateSecond.sendKeys("15/09/2022");
	}
	
	public void btnView() {
		clickView.click();
	}
	
	public void btnExport() {
		clickExport.click();
	}
	
	public void btnShowPage() {
		showPage.click();
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
