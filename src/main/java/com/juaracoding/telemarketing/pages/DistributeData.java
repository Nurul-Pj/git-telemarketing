package com.juaracoding.telemarketing.pages;

import java.util.List;

//import com.juaracoding.telemarketing.step_definitions.Hooks;
import org.openqa.selenium.By;
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

//	open dashboard
	@FindBy(xpath = "//h3[@id='ui-id-11']")
	private WebElement listData;
	
	@FindBy(xpath = "//span[normalize-space()='Distribute Data']")
	private WebElement distributeData;

//	search field
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select\"]/span/div")
	private WebElement fieldStatus;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52078_verr\"]")
	private WebElement bucketData;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52066_select\"]/span/div")
	private WebElement distribusiKe;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52070_text\"]")
	private WebElement inputAgent;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52079_text\"]")
	private WebElement selectStatus;
	
	
	
	//*[@id="ddcl-tl_distribute--52066_select"]/span
	
//	checkbox status
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[1]")
	private WebElement checkboxNew;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[2]")
	private WebElement checkboxBerhasil;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[3]")
	private WebElement checkboxFollowup;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[4]")
	private WebElement checkboxSalahSambung;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[5]")
	private WebElement checkboxSetuju;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[6]")
	private WebElement checkboxTidakBerhasil;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select-ddw\"]/div/div[7]")
	private WebElement checkboxTolak;
	
//	checkbox buket data
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52078_select-ddw\"]/div/div[2]")
	private WebElement checkboxAgent01;
	
	//*[@id="ddcl-tl_distribute--52066_select-ddw"]/div/div[2]
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52078_select-ddw\"]/div/div[3]")
	private WebElement checkboxDeveloper;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52078_select-ddw\"]/div/div[4]")
	private WebElement checkboxUhuy;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52078_select-ddw\"]/div/div[1]")
	private WebElement checkboxNull;
	
//	button
	@FindBy(xpath = "//span[normalize-space()='View']")
	private WebElement btnView;
	
	@FindBy(xpath = "//span[normalize-space()='Distribusi']")
	private WebElement btnDistribusi;
	
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52066_select\"]/span")
	private WebElement distribusi;
	
	
	@FindBy(xpath = "//input[@id='tl_distribute--52070_text']")
	private WebElement jumlahDistribute;
	
	@FindBy(xpath = "//*[@id=\"ddcl-tl_distribute--52075_select\"]")
	private WebElement status;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52062_table\"]")
	private WebElement tableUser;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52062\"]/div[8]")
	private WebElement entries;
	
	@FindBy(xpath = "//*[@id=\"tl_distribute--52062_table\"]/tbody/tr[1]/td[1]/table/tbody/tr/td")
	private WebElement tableAdded;
	
	@FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]")
	private WebElement popUp;
	
	@FindBy(xpath = "//span[normalize-space()='OK']")
	private WebElement btnOke;
	

	
//	open dashboard
	public void listData() {
		listData.click();
	}
	
	public void listDistributeData() {
		distributeData.click();
	}
	
	public void clickStatus() {
		fieldStatus.click();
	}
	
	public void clickBuketData() {
		bucketData.click();
	}
	
	public void clickDistribusi() {
		distribusiKe.click();
	}
	
	public void inputAgent(String jumlahAgent) {
		this.inputAgent.sendKeys(jumlahAgent);
	}
	
	public void chooseDistribusiKe(String pilihAgent) {
		if(pilihAgent.equalsIgnoreCase("agent01")) {
			checkboxAgent01.click();
			delay(1);
		}
	}
	
	public void NewAgent() {
		checkboxNew.click();
		delay(1);
		checkboxAgent01.click();
	}
	
	public void chooseStatus(String pilihStatus) {
		if(pilihStatus.equalsIgnoreCase("Berhasil")) {
			checkboxNew.click();
			checkboxBerhasil.click();
			delay(1);
		}
		else if (pilihStatus.equalsIgnoreCase("Follow up")) {
			checkboxBerhasil.click();
			checkboxFollowup.click();
			delay(1);
		}
		else if (pilihStatus.equalsIgnoreCase("Salah sambung")) {
			checkboxFollowup.click();
			checkboxSalahSambung.click();
			delay(1);
		}
		else if (pilihStatus.equalsIgnoreCase("Setuju")) {
			checkboxSalahSambung.click();
			checkboxSetuju.click();
			delay(1);
		}
		else if (pilihStatus.equalsIgnoreCase("Tidak berhasil")) {
			checkboxSetuju.click();
			checkboxTidakBerhasil.click();
			delay(1);
		}
		else if (pilihStatus.equalsIgnoreCase("Tolak")) {
			checkboxTidakBerhasil.click();
			checkboxTolak.click();
			delay(1);
		}
		else if (pilihStatus.equalsIgnoreCase("null")) {
			checkboxTolak.click();
			delay(1);
		}
	}
	
	public void chooseStatusDua(String pilihStatusDua) {
		if(pilihStatusDua.equalsIgnoreCase("New")) {
			checkboxTolak.click();
			checkboxNew.click();
			delay(1);
		}
		else if (pilihStatusDua.equalsIgnoreCase("Berhasil")) {
			checkboxNew.click();
			checkboxBerhasil.click();
			delay(1);
		}
		else if (pilihStatusDua.equalsIgnoreCase("Follow up")) {
			checkboxBerhasil.click();
			checkboxFollowup.click();
			delay(1);
		}
		else if (pilihStatusDua.equalsIgnoreCase("Salah sambung")) {
			checkboxFollowup.click();
			checkboxSalahSambung.click();
			delay(1);
		}
		else if (pilihStatusDua.equalsIgnoreCase("Setuju")) {
			checkboxSalahSambung.click();
			checkboxSetuju.click();
			delay(1);
		}
		else if (pilihStatusDua.equalsIgnoreCase("Tidak berhasil")) {
			checkboxSetuju.click();
			checkboxTidakBerhasil.click();
			delay(1);
		}
		else if (pilihStatusDua.equalsIgnoreCase("Tolak")) {
			checkboxTidakBerhasil.click();
			checkboxTolak.click();
			delay(1);
		}
	}
		
	
	public void chooseBuketData(String pilihBuketData) {
		if(pilihBuketData.equalsIgnoreCase("Agent01")) {
			checkboxNull.click();
			checkboxAgent01.click();
		}

	}
	
	public void chooseStatusDistribusi(String distribusiStat) {
		Select distribusiField = new Select(status);
		if(distribusiStat.equalsIgnoreCase("New")){
			distribusiField.selectByIndex(1);
		}
		else if(distribusiStat.equalsIgnoreCase("Existing")){
			distribusiField.selectByIndex(0);
		}
	}
	
	public void fieldDistribusiStatus(String distribusiStat) {
		chooseStatusDistribusi(distribusiStat);
	}
	
	public void fieldStatus(String pilihAgent) {
		chooseDistribusiKe(pilihAgent);
	}
	
	public void listStatus(String pilihStatus) {
		chooseStatus(pilihStatus);
	}
	
	public void listBuketData(String pilihBuketData) {
		chooseBuketData(pilihBuketData);
	}

	
	public void clickBtnView() {
		btnView.click();
	}
	
	public void clickBtnDistribusi() {
		btnDistribusi.click();
	}
	
	public String getTxtValidate() {
		return tableAdded.getText();
	}
	
	public String getTxtEntries() {
		return entries.getText();
	}
	
	public String appearGreeting() {
		return popUp.getText();
	}
	
	public void clickBtnOke() {
		btnOke.click();
		delay(1);
	}
	
	public boolean validateUser() {
		int temp = 0;
		
		List<WebElement> totalRows =tableUser.findElements(By.tagName("tr"));
		int rowsCount = totalRows.size();
		
		for (int row=0; row<rowsCount;row++) {
			List<WebElement> columns_row = totalRows.get(row).findElements(By.tagName("td"));
			int columns_count = columns_row.size();
             
			for (int column=0; column<columns_count; column++){
       
             }
		}
		
		if (temp>0) {
			return true;
		} else {return false;}
		
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
