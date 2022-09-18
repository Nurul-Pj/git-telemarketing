package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class DataAllDev{
	
	private WebDriver driver;
	
	public DataAllDev() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"52858_query\"]")
	private WebElement btnDataAll;
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53031_text\"]")
	private WebElement dropDownAgent;
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53032_text\"]")
	private WebElement dropDownStatus;
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53023_text\"]")
	private WebElement fieldSearch;
	
	@FindBy(xpath = "//*[@id=\"53029_query\"]")
	private WebElement btnSearch;

	@FindBy(xpath = "//*[@id=\"tl_all_data--53027-cell-0-1\"]")
	private WebElement navigateToData;

	@FindBy(xpath = "//*[@id=\"tl_all_data--53027-header\"]/th[3]")
	private WebElement pageDataAll;
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53027-header\"]/th[3]")
	private WebElement pageSearch;
	
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53027\"]/div[4]/ul/li[3]/a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53027\"]/div[4]/ul/li[2]/a")
	private WebElement prevPage;
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53027\"]/div[4]/ul/li[8]/a")
	private WebElement lastPage;
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53027_page\"]")
	private WebElement firstPage;
	
	@FindBy(xpath = "//*[@id=\"tl_all_data--53027_show_text\"]")
	private WebElement showPage;
	

	//-------------------------DASHBOARD---------------------------
	public void clickBtnDataAll() {
		btnDataAll.click();
		delay(1);
	}
	public String pageDataAll() {
		delay(1);
		return this.pageDataAll.getText();
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
	
	
	
	
	public void formFilter(String agent, String status) {
		delay(1);
		chooseAgent(agent);
		delay(1);
		chooseStatus(status);
		delay(1);
	}
	public void chooseAgent(String agent) {
		delay(1);
		Select agentOptSelect = new Select (driver.findElement(By.xpath("//*[@id=\"tl_all_data--53031_text\"]")));
		if(agent.equalsIgnoreCase("AGENT01")) {
			agentOptSelect.selectByIndex(1);
		} else if (agent.equalsIgnoreCase("ridho")) {
			agentOptSelect.selectByIndex(2);
		}else if (agent.equalsIgnoreCase("elvay")) {
			agentOptSelect.selectByIndex(3);
		}else if (agent.equalsIgnoreCase("null")) {
			agentOptSelect.selectByIndex(0);
		delay(1);
		}
		
	}
	public void chooseStatus(String status) {
		delay(1);
		Select statusOptSelect = new Select (driver.findElement(By.xpath("//*[@id=\"tl_all_data--53032_text\"]")));
		if(status.equalsIgnoreCase("Berhasil")) {
			statusOptSelect.selectByIndex(1);
		} else if (status.equalsIgnoreCase("Follow Up")) {
			statusOptSelect.selectByIndex(2);
		} else if (status.equalsIgnoreCase("Mailbox")) {
			statusOptSelect.selectByIndex(3);
		} else if (status.equalsIgnoreCase("Nomer Salah")) {
			statusOptSelect.selectByIndex(4);
		} else if (status.equalsIgnoreCase("Salah Sambung")) {
			statusOptSelect.selectByIndex(5);
		} else if (status.equalsIgnoreCase("Setuju")) {
			statusOptSelect.selectByIndex(6);
		} else if (status.equalsIgnoreCase("Tidak Ada Nomor Telepon")) {
			statusOptSelect.selectByIndex(7);
		} else if (status.equalsIgnoreCase("Tidak Berhasil")) {
			statusOptSelect.selectByIndex(8);
		} else if (status.equalsIgnoreCase("Tidak Diangkat")) {
			statusOptSelect.selectByIndex(9);
		} else if (status.equalsIgnoreCase("Tidak Terdaftar")) {
			statusOptSelect.selectByIndex(10);
		} else if (status.equalsIgnoreCase("Tolak")) {
			statusOptSelect.selectByIndex(11);
		delay(1);	
		}
		
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
