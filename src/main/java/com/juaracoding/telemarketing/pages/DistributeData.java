package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class DistributeData {
	
private WebDriver driver;
	
	public DistributeData() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	open dashboard data
	@FindBy(xpath = "//h3[@id='ui-id-11']")
	private WebElement listData;
	
	@FindBy(xpath = "//span[normalize-space()='Distribute Data']")
	private WebElement distributeData;
	
//	pilih list for distribute data
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select\"]/span/div")
	private WebElement selectStatusOne;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52078_select\"]/span")
	private WebElement selectBuketData;
	
	@FindBy(xpath = "//span[normalize-space()='View']")
	private WebElement btnView;
	
//	list status
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-i0\"]")
	private WebElement checkboxNew;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[2]")
	private WebElement checkboxBerhasil;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[3]")
	private WebElement checkboxFollowUp;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[4]")
	private WebElement checkboxSalahSambung;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[5]")
	private WebElement checkboxSetuju;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[6]")
	private WebElement checkboxTidakBerhasil;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[7]")
	private WebElement checkboxTolak;
	
//	list buket data
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52078_select-ddw\"]/div/div[1]")
	private WebElement checkboxNull;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52078_select-ddw\"]/div/div[2]")
	private WebElement checkboxAgent;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52078_select-ddw\"]/div/div[3]")
	private WebElement checkboxDeveloper;
	
//	distribusi
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52066_select\"]/span/div")
	private WebElement selectDistribusiKe;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52070_text\"]")
	private WebElement jumlahAgent;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52079_text\"]")
	private WebElement selectStatusTwo;
	
	@FindBy(xpath = "//*[@id=\"52065_query\"]/span")
	private WebElement btnDistribusi;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]/span")
	private WebElement btnYa;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
	private WebElement btnOke;
	

	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52066_select-i1\"]")
	private WebElement checkboxDisAgent01;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52066_select-i0\"]")
	private WebElement checkboxDisDeveloper;

	
//	validasi
	@FindBy(xpath = "//*[@id=\"tl_distribute--52062_table\"]/tbody/tr[1]/td[1]/table/tbody/tr/td")
	private WebElement validasiTable;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52062\"]/div[8]")
	private WebElement noEntries;
	
//	choose list new, null
	public void chooseNew() {
		checkboxTolak.click();
		checkboxNew.click();
	}
	
//	choose list berhasil, null	
	public void chooseBerhasil() {
		checkboxNew.click();
		checkboxBerhasil.click();
	}
	
//	choose list followup, null
	public void chooseFollowUp() {
		checkboxBerhasil.click();
		checkboxFollowUp.click();
	}
	
//	choose list salah sambung, null
	public void chooseSalahSambung() {
		checkboxFollowUp.click();
		checkboxSalahSambung.click();
	}
	
//	choose list setuju, null
	public void chooseSetuju() {
		checkboxSalahSambung.click();
		checkboxSetuju.click();
	}
	
//	choose list tidak berhasil, null
	public void chooseTidakBerhasil() {
		checkboxSetuju.click();
		checkboxTidakBerhasil.click();
	}
	
//	choose list tolak, null
	public void chooseTolak() {
		checkboxTidakBerhasil.click();
		checkboxTolak.click();
	}
	
//	choose list new, agent
	public void chooseNull() {
		checkboxNull.click();
	}
	
	public void chooseAgent() {
		checkboxNull.click();
		checkboxAgent.click();
	}
	
	
	
//	open dashboard
	public void listData() {
		listData.click();
	}
	
	public void listDistributeData() {
		distributeData.click();
	}
	
//	pilih list for distribute data
	public void selectStatusOne() {
		selectStatusOne.click();
	}
	
	public void selectBuketData() {
		selectBuketData.click();
	}
	
	public void clickBtnBiew() {
		btnView.click();
	}
	
//	distribusi ke
	public void clickDistribusiKe() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-300)");
		selectDistribusiKe.click();
	}
	
	public void chooseDisDeveloper() {
		checkboxDisDeveloper.click();
	}
	
	public void chooseDisAgent() {
		checkboxDisAgent01.click();
	}
	
	public void inputJumlahAgent(String jumlahAgent) {
		this.jumlahAgent.sendKeys(jumlahAgent);
	}
	
	public void deleteJumlahAgent() {
		jumlahAgent.sendKeys(Keys.CONTROL+"A");
		jumlahAgent.sendKeys(Keys.BACK_SPACE+"A");
	}
	
	
	public void pilihStatus() {
		Select statusOpt = new Select (selectStatusTwo);
		statusOpt.selectByValue("NEW");
	}
	
	public void clickBtnDistribusi() {
		btnDistribusi.click();
	}
	
	public void clickBtnYa() {
		btnYa.click();
	}
	
	public void clickBtnOke() {
		btnOke.click();
	}
	
//	validasi
	public String getValidate() {
		return validasiTable.getText();
	}
	
	public String getNoEntries() {
		return noEntries.getText();	}
	
}