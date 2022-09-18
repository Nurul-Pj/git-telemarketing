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

import io.cucumber.core.backend.Status;

public class Activity{

	private WebDriver driver;

	public Activity() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//*[@id=\"ui-id-15\"]")
	private WebElement btnTaskDev;
	
	@FindBy(xpath = "//*[@id=\"53069_query\"]")
	private WebElement btnAddPhone;

	@FindBy(xpath = "//*[@id=\"tl_multi_add_phone--51838_text\"]")
	private WebElement requestPhone;

	@FindBy(xpath = "//*[@id=\"51839_query\"]")
	private WebElement btnSavePhone;

	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
	private WebElement btnKonfirmasiOk;

	@FindBy(xpath = "/html/body/div[9]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/div[7]/table/tbody/tr/td[2]/div/select")
	private WebElement dropDownPhone;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53073_text\"]")
	private WebElement fieldPhoneWA;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53071_text\"]")
	private WebElement fieldMsgWa;

	@FindBy(xpath = "//*[@id=\"53072_query\"]")
	private WebElement btnSendWA;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53076_text\"]")
	private WebElement dropDownChannel;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53050_text\"]")
	private WebElement dropDownStatus;

	@FindBy(xpath = "//*[@id=\"tl_useractivity--53048_text\"]")
	private WebElement dropDownStatusCall;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53051_text\"]")
	private WebElement dropDownStatusResult;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53052_text\"]")
	private WebElement dropDownReason;

	@FindBy(xpath = "//*[@id=\"53058_query\"]")
	private WebElement btnSubmit;

	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnKonfirmasiYES;

	@FindBy(xpath = "/html/body/div[8]/div[1]/button")
	private WebElement btnClose;

	@FindBy(xpath = "//*[@id=\"tl_user_activity--53077\"]/table/tbody/tr/td[1]/label")
	private WebElement pageActivity;

	@FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
	private WebElement popUpKonfirmasiPhone;

	
	// -------------------------DASHBOARD DEV--------------------------------
	public void clickBtnTaskDev() {
		btnTaskDev.click();
		delay(1);
	}
	
	
	// -------------------------PHONE--------------------------------
	public void clickListPhone() {
		Select phoneSelect = new Select(dropDownPhone);
		phoneSelect.selectByIndex(1);
		delay(1);
	}

	public void clickAddPhone() {
		btnAddPhone.click();
		delay(1);
	}

	public void inputRequestPhone(String requestPhone) {
		this.requestPhone.sendKeys(requestPhone);
		delay(1);
	}

	public void clickSavePhone() {
		btnSavePhone.click();
		delay(1);
	}

	public void clickKonfirmasiOk() {
		btnKonfirmasiOk.click();
		delay(1);
	}

	public String popUpKonfirmasiPhone() {
		return this.popUpKonfirmasiPhone.getText();
	}

	// -------------------------PHONE WA---------------------------
	public void phoneWaValid(String phoneWA, String msgWA) {
		delay(2);
		this.fieldPhoneWA.sendKeys(phoneWA);
		delay(1);
		this.fieldMsgWa.sendKeys(msgWA);
		delay(1);
	}

	public void phoneWaInvalid(String phoneWA, String msgWA) {
		this.fieldPhoneWA.sendKeys(phoneWA);
		delay(1);
		this.fieldMsgWa.sendKeys(msgWA);
		delay(1);
	}

	public void clickBtnSendWA() {
		btnSendWA.click();
		delay(1);
	}

	public void deleteFieldWa() {
		fieldPhoneWA.sendKeys(Keys.CONTROL + "A");
		fieldPhoneWA.sendKeys(Keys.BACK_SPACE);
		fieldMsgWa.sendKeys(Keys.CONTROL + "A");
		fieldMsgWa.sendKeys(Keys.BACK_SPACE);
		delay(1);
	}

	// -------------------------STATUS ACITIVITY---------------------------
	

	public void clickSubmit() {
		btnSubmit.click();
		delay(1);
	}

	public void clickKonfirmasiSubmit() {
		btnKonfirmasiYES.click();
		delay(1);
	}

	public void clickClose() {
		btnClose.click();
		delay(1);
	}

	public String pageActivity() {
		return this.pageActivity.getText();
	}

	public void formAdd(String status, String statuscall) {
		chooseStatus(status);
		chooseStatusCall(statuscall);
	}

	public void formAdd2(String statusresult, String reason) {
		chooseStatusResult(statusresult);
		chooseReason(reason);
	}

	public void chooseStatus(String status) {
		Select statusOptSelect = new Select(driver.findElement(By.xpath("//*[@id=\"tl_user_activity--53050_text\"]")));
		if (status.equalsIgnoreCase("Tersambung")) {
			statusOptSelect.selectByIndex(1);
		} else if (status.equalsIgnoreCase("Tidak Tersambung")) {
			statusOptSelect.selectByIndex(2);
		} else if (status.equalsIgnoreCase("null")) {
			statusOptSelect.selectByIndex(0);
		}

	}

	public void chooseStatusCall(String statuscall) {
		delay(1);
		Select statuscallOptSelect = new Select(
				driver.findElement(By.xpath("//*[@id=\"tl_user_activity--53048_text\"]")));

		if (statuscall.equalsIgnoreCase("Diangkat")) {
			statuscallOptSelect.selectByIndex(1);
		} else if (statuscall.equalsIgnoreCase("Salah Sambung")) {
			statuscallOptSelect.selectByIndex(2);
		} else if (statuscall.equalsIgnoreCase("Tidak Diangkat")) {
			statuscallOptSelect.selectByIndex(3);

		} else if (statuscall.equalsIgnoreCase("Nomer Salah")) {
			statuscallOptSelect.selectByIndex(1);
		} else if (statuscall.equalsIgnoreCase("Mailbox")) {
			statuscallOptSelect.selectByIndex(2);
		} else if (statuscall.equalsIgnoreCase("Invalid Number")) {
			statuscallOptSelect.selectByIndex(3);
		} else if (statuscall.equalsIgnoreCase("Telepon Not Register ")) {
			statuscallOptSelect.selectByIndex(4);

		} else if (statuscall.equalsIgnoreCase("null")) {
			statuscallOptSelect.selectByIndex(0);

		}
	}

	public void chooseStatusResult(String statusresult) {
		delay(1);
		Select statusresultOptSelect = new Select(
				driver.findElement(By.xpath("//*[@id=\"tl_user_activity--53051_text\"]")));

		if (statusresult.equalsIgnoreCase("Setuju")) {
			statusresultOptSelect.selectByIndex(1);
		} else if (statusresult.equalsIgnoreCase("Follow Up")) {
			statusresultOptSelect.selectByIndex(2);
		} else if (statusresult.equalsIgnoreCase("Tolak")) {
			statusresultOptSelect.selectByIndex(3);
		} else if (statusresult.equalsIgnoreCase("Berhasil")) {
			statusresultOptSelect.selectByIndex(4);
		} else if (statusresult.equalsIgnoreCase("Tidak Berhasil")) {
			statusresultOptSelect.selectByIndex(5);

		} else if (statusresult.equalsIgnoreCase("Salah Sambung")) {
			statusresultOptSelect.selectByIndex(1);

		} else if (statusresult.equalsIgnoreCase("Tidak Di Angkat")) {
			statusresultOptSelect.selectByIndex(1);

		} else if (statusresult.equalsIgnoreCase("Nomer Salah")) {
			statusresultOptSelect.selectByIndex(1);
		} else if (statusresult.equalsIgnoreCase("Mailbox")) {
			statusresultOptSelect.selectByIndex(2);
		} else if (statusresult.equalsIgnoreCase("Invalid Number")) {
			statusresultOptSelect.selectByIndex(3);
		} else if (statusresult.equalsIgnoreCase("Telepon Not Register ")) {
			statusresultOptSelect.selectByIndex(4);

		} else if (statusresult.equalsIgnoreCase("null")) {
			statusresultOptSelect.selectByIndex(0);

		}
	}

	public void chooseReason(String reason) {
		delay(1);
		Select reasonOptSelect = new Select(driver.findElement(By.xpath("//*[@id=\"tl_user_activity--53052_text\"]")));

		// Status Result > Setuju
		if (reason.equalsIgnoreCase("Berhasil Download")) {
			reasonOptSelect.selectByIndex(1);
		} else if (reason.equalsIgnoreCase("Follow Up Download")) {
			reasonOptSelect.selectByIndex(2);

			// Status Result > Follow Up
		} else if (reason.equalsIgnoreCase("Telepon Kembali Lain Waktu")) {
			reasonOptSelect.selectByIndex(1);
		} else if (reason.equalsIgnoreCase("Request Kirim Whatsapp Untuk Dipelajari")) {
			reasonOptSelect.selectByIndex(2);
		} else if (reason.equalsIgnoreCase("Minta Nomer Manager/Pemilik")) {
			reasonOptSelect.selectByIndex(3);
		} else if (reason.equalsIgnoreCase("Minta Pendapat Partner/Pasangan/Orangtua")) {
			reasonOptSelect.selectByIndex(4);
		} else if (reason.equalsIgnoreCase("Follow Up")) {
			reasonOptSelect.selectByIndex(5);
		} else if (reason.equalsIgnoreCase("Follow Convert")) {
			reasonOptSelect.selectByIndex(6);

			// Status Result > Tolak
		} else if (reason.equalsIgnoreCase("Tidak Bersedia Memberikan Kontak Owner")) {
			reasonOptSelect.selectByIndex(1);
		} else if (reason.equalsIgnoreCase("Tidak Fokus Online")) {
			reasonOptSelect.selectByIndex(2);
		} else if (reason.equalsIgnoreCase("Tidak Tertarik, Tidak Memberi Alasan")) {
			reasonOptSelect.selectByIndex(3);
		} else if (reason.equalsIgnoreCase("Tidak Mengerti dan Tidak Bersedia Dijelaskan")) {
			reasonOptSelect.selectByIndex(4);
		} else if (reason.equalsIgnoreCase("Tidak Mengenal Tokko/Bukukas")) {
			reasonOptSelect.selectByIndex(5);
		} else if (reason.equalsIgnoreCase("Rating/Comment Buruk Tokko di Sosial Media")) {
			reasonOptSelect.selectByIndex(6);
		} else if (reason.equalsIgnoreCase("Tidak Mau Dipersulit Menggunakan Tokko")) {
			reasonOptSelect.selectByIndex(7);
		} else if (reason.equalsIgnoreCase("Terlalu Banyak Aplikasi atau Platform")) {
			reasonOptSelect.selectByIndex(8);
		} else if (reason.equalsIgnoreCase("Memory Handphone Penuh")) {
			reasonOptSelect.selectByIndex(9);
		} else if (reason.equalsIgnoreCase("Tidak Punya Android")) {
			reasonOptSelect.selectByIndex(10);
		} else if (reason.equalsIgnoreCase("Lebih Nyaman Dengan Platform Selain Tokko")) {
			reasonOptSelect.selectByIndex(11);
		} else if (reason.equalsIgnoreCase("Usaha Sudah Tutup/Bangkrut")) {
			reasonOptSelect.selectByIndex(12);

		} else if (reason.equalsIgnoreCase("Berhasil")) {
			reasonOptSelect.selectByIndex(1);

		} else if (reason.equalsIgnoreCase("Tidak Berhasil")) {
			reasonOptSelect.selectByIndex(1);

		} else if (reason.equalsIgnoreCase("Salah Sambung")) {
			reasonOptSelect.selectByIndex(1);

		} else if (reason.equalsIgnoreCase("Tidak Diangkat")) {
			reasonOptSelect.selectByIndex(1);

		} else if (reason.equalsIgnoreCase("Nomer Salah")) {
			reasonOptSelect.selectByIndex(1);
		} else if (reason.equalsIgnoreCase("Mailbox")) {
			reasonOptSelect.selectByIndex(2);
		} else if (reason.equalsIgnoreCase("Invalid Number")) {
			reasonOptSelect.selectByIndex(3);
		} else if (reason.equalsIgnoreCase("Telepon Not Register")) {
			reasonOptSelect.selectByIndex(4);
		} else if (reason.equalsIgnoreCase("null")) {
			reasonOptSelect.selectByIndex(0);

		}
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
