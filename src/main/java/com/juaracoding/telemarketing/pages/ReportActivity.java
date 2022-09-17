package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

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
	
	@FindBy(xpath = "//*[@id=\"tl_perform_report--51781_text\"]")
	private WebElement tableDateAct1;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")
	private WebElement clickDateFirstAct; //Tanggal 11
	
	@FindBy(xpath = "//*[@id=\"tl_perform_report--51788_text\"]")
	private WebElement tableDateAct2;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")
	private WebElement clickDateSecondAct; //Tanggal 16
	
	@FindBy(xpath = "//*[@id=\"51787_query\"]")
	private WebElement clickView;
	
	@FindBy(xpath = "//*[@id=\"51798_query\"]")
	private WebElement clickExport;
	
	@FindBy(xpath = "//*[@id=\"tl_perform_report--51785_show_text\"]")
	private WebElement showPage;
	
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
	}
	
	public void tableDateAct1() {
		tableDateAct1.click();
	}
	
	public void tableDateAct2() {
		tableDateAct2.click();
	}
	
	public void pilihTanggalAct1() {
		clickDateFirstAct.click();
	}

	public void pilihTanggalAct2() {
		clickDateSecondAct.click();
	}
	
	public void btnView() {
		clickView.click();
	}
	
	public void btnExport() {
		clickExport.click();
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
