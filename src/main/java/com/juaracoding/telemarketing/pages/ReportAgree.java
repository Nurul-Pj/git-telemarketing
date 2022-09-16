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

	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51772_text\"]")
	private WebElement tablekDate1;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")
	private WebElement clickDateFirst; //Tanggal 11
	
	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51780_text\"]")
	private WebElement tablekDate2;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a")
	private WebElement clickDateSecond; //Tanggal 16
	
	@FindBy(xpath = "//*[@id=\"51778_query\"]")
	private WebElement clickView;
	
	@FindBy(xpath = "//*[@id=\"51797_query\"]")
	private WebElement clickExport;
	
//	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_show_text\"]")
//	private WebElement showPage;
//	
//	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_show_text\"]/option[1]")
//	private WebElement showPage10;
//	
//	@FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_show_text\"]/option[2]")
//	private WebElement showPage25;
	
	public void btnReport() {
		btnReport.click();
	}
	
	public void taskAgree() {
		clickReportAgree.click();
	}
	
	public void tableDateAgree1() {
		tablekDate1.click();
	}
	
	public void tableDateAgree2() {
		tablekDate2.click();
	}
	
	public void pilihTanggal1() {
		clickDateFirst.click();
	}
	
	public void pilihTanggal2() {
		clickDateSecond.click();
	}
	
	public void btnView() {
		clickView.click();
	}
	
	public void btnExport() {
		clickExport.click();
	}
	
//	public void btnShowPage() {
//		showPage.click();
//	}
//	
//	public void btnShowPage10() {
//		showPage10.click();
//	}
//	
//	public void btnShowPage25() {
//		showPage25.click();
//	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
