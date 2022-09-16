package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

import net.bytebuddy.asm.Advice.Enter;

public class ReportActivity {

private WebDriver driver;
	
	public ReportActivity() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ui-id-19\"]")
	private WebElement btnReport;
	
	@FindBy(xpath = "//*[@id=\"52836_query\"]")
	private WebElement btnReportActivity;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_perform_report--51789_select\"]/span")
	private WebElement btnChooseAgent;
	
	@FindBy(xpath = "//label[@for='ddcl-tl_perform_report--51789_select-i1']")
	private WebElement btnAgent01;
	
	@FindBy(xpath = "//*[@id=\\\"ui-datepicker-div\\\"]/table/tbody/tr[3]/td[2]/a")
	private WebElement DateFirst; //Tanggal 11
	
	@FindBy(xpath = "//*[@id=\"tl_perform_report--51781_text\"]")
	private WebElement tableDate1;
	
	@FindBy(xpath = "//*[@id=\"tl_perform_report--51788\"]")
	private WebElement tableDate2;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")
	private WebElement DateSecond; //Tanggal 16
	
	@FindBy(xpath = "//*[@id=\"51787_query\"]")
	private WebElement clickView;
	
	@FindBy(xpath = "//*[@id=\"51798_query\"]")
	private WebElement clickExport;
	
	public void btnReport() {
		btnReport.click();
	}
	
	public void btnReportAct() {
		btnReportActivity.click();
	}
	
	public void btnAgent() {
		btnChooseAgent.click();
		delay(2);
		btnAgent01.click();
		btnAgent01.sendKeys(Keys.ENTER);
	}
	
	public void pilihTanggalAct1() {
		DateFirst.click();
	}

	public void pilihTanggalAct2() {
		DateSecond.click();
	}
	
	public void btnView() {
		clickView.click();
	}
	
	public void btnExport() {
		clickExport.click();
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
