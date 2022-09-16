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

public class ActivityAgent {
	
	private WebDriver driver;
	
	public ActivityAgent() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"tl_data_new--52967-cell-0-1\"]")
	private WebElement navigateToData;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53076_text\"]")
	private WebElement dropDownChannel;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53050_text\"]")
	private WebElement dropDownStatus;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53048_text\"]")
	private WebElement dropDownStatusCall;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53051_text\"]")
	private WebElement dropDownStatusResult;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity--53052_text\"]")
	private WebElement dropDownReason;
	
	@FindBy(xpath = "//*[@id=\"53058_query\"]")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
	private WebElement btnKonfirmasiYES;
	
	
	public void formAdd(String status, String statuscall) {
		chooseStatus(status);
		chooseStatusCall(statuscall);
	}
	
	public void formAdd2(String statusresult, String reason) {
		chooseStatusResult(statusresult);
		chooseReason(reason);
	}
	
	public void chooseStatus(String status) {
		Select statusOptSelect = new Select (driver.findElement(By.xpath("//*[@id=\"tl_user_activity--53050_text\"]")));
		if(status.equalsIgnoreCase("Tersambung")) {
			statusOptSelect.selectByIndex(1);
		} else if (status.equalsIgnoreCase("Tidak Tersambung")) {
			statusOptSelect.selectByIndex(2);
		}else if (status.equalsIgnoreCase("null")) {
			statusOptSelect.selectByIndex(0);
		}
		
	}
	
	public void chooseStatusCall(String statuscall) {
		delay(1);
		Select statuscallOptSelect = new Select (driver.findElement(By.xpath("//*[@id=\"tl_user_activity--53048_text\"]")));
		
		if(statuscall.equalsIgnoreCase("Diangkat")) {
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
			
		}else if (statuscall.equalsIgnoreCase("null")) {
			statuscallOptSelect.selectByIndex(0);
			
		
		}
	}
	
	
	public void chooseStatusResult(String statusresult) {
		delay(1);
		Select statusresultOptSelect = new Select (driver.findElement(By.xpath("//*[@id=\"tl_user_activity--53051_text\"]")));
		
		if(statusresult.equalsIgnoreCase("Setuju")) {
			statusresultOptSelect.selectByIndex(1);
		} else if (statusresult.equalsIgnoreCase("Follow Up")) {
			statusresultOptSelect.selectByIndex(2);
		} else if (statusresult.equalsIgnoreCase("Tolak")) {
			statusresultOptSelect.selectByIndex(3);
		}else if (statusresult.equalsIgnoreCase("Berhasil")) {
			statusresultOptSelect.selectByIndex(4);
		}else if (statusresult.equalsIgnoreCase("Tidak Berhasil")) {
			statusresultOptSelect.selectByIndex(5);
			
			
		}else if (statusresult.equalsIgnoreCase("Salah Sambung")) {
			statusresultOptSelect.selectByIndex(1);
			
		}else if (statusresult.equalsIgnoreCase("Tidak Di Angkat")) {
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
		Select reasonOptSelect = new Select (driver.findElement(By.xpath("//*[@id=\"tl_user_activity--53052_text\"]")));
		
		
		//Status Result > Setuju
		if(reason.equalsIgnoreCase("Berhasil Download")) {
			reasonOptSelect.selectByIndex(1);
		} else if (reason.equalsIgnoreCase("Follow Up Download")) {
			reasonOptSelect.selectByIndex(2);
			
			
			
		//Status Result > Follow Up	
		}else if (reason.equalsIgnoreCase("Telepon Kembali Lain Waktu")) {
			reasonOptSelect.selectByIndex(1);
		}else if (reason.equalsIgnoreCase("Request Kirim Whatsapp Untuk Dipelajari")) {
			reasonOptSelect.selectByIndex(2);
		}else if (reason.equalsIgnoreCase("Minta Nomer Manager/Pemilik")) {
			reasonOptSelect.selectByIndex(3);
		}else if (reason.equalsIgnoreCase("Minta Pendapat Partner/Pasangan/Orangtua")) {
			reasonOptSelect.selectByIndex(4);
		}else if (reason.equalsIgnoreCase("Follow Up")) {
			reasonOptSelect.selectByIndex(5);
		}else if (reason.equalsIgnoreCase("Follow Convert")) {
			reasonOptSelect.selectByIndex(6);
			
			
			
		//Status Result > Tolak
		}else if (reason.equalsIgnoreCase("Tidak Bersedia Memberikan Kontak Owner")) {
			reasonOptSelect.selectByIndex(1);			
		}else if (reason.equalsIgnoreCase("Tidak Fokus Online")) {
			reasonOptSelect.selectByIndex(2);			
		}else if (reason.equalsIgnoreCase("Tidak Tertarik, Tidak Memberi Alasan")) {
			reasonOptSelect.selectByIndex(3);			
		}else if (reason.equalsIgnoreCase("Tidak Mengerti dan Tidak Bersedia Dijelaskan")) {
			reasonOptSelect.selectByIndex(4);		
		}else if (reason.equalsIgnoreCase("Tidak Mengenal Tokko/Bukukas")) {
			reasonOptSelect.selectByIndex(5);
		}else if (reason.equalsIgnoreCase("Rating/Comment Buruk Tokko di Sosial Media")) {
			reasonOptSelect.selectByIndex(6);
		}else if (reason.equalsIgnoreCase("Tidak Mau Dipersulit Menggunakan Tokko")) {
			reasonOptSelect.selectByIndex(7);
		}else if (reason.equalsIgnoreCase("Terlalu Banyak Aplikasi atau Platform")) {
			reasonOptSelect.selectByIndex(8);
		}else if (reason.equalsIgnoreCase("Memory Handphone Penuh")) {
			reasonOptSelect.selectByIndex(9);
		}else if (reason.equalsIgnoreCase("Tidak Punya Android")) {
			reasonOptSelect.selectByIndex(10);
		}else if (reason.equalsIgnoreCase("Lebih Nyaman Dengan Platform Selain Tokko")) {
			reasonOptSelect.selectByIndex(11);
		}else if (reason.equalsIgnoreCase("Usaha Sudah Tutup/Bangkrut")) {
			reasonOptSelect.selectByIndex(12);
			
		
		
		}else if (reason.equalsIgnoreCase("Berhasil")) {
			reasonOptSelect.selectByIndex(1);
			
		}else if (reason.equalsIgnoreCase("Tidak Berhasil")) {
			reasonOptSelect.selectByIndex(1);
			
			
						
		}else if (reason.equalsIgnoreCase("Salah Sambung")) {
			reasonOptSelect.selectByIndex(1);
			
		}else if (reason.equalsIgnoreCase("Tidak Diangkat")) {
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
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	



//----------------------------------BUANGAN!!!!!!!!!!!--------------------------	
//	public void inputDataValid1() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByValue("Tersambung");
//		delay(1);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByValue("Diangkat");
//		delay(1);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByValue("Setuju");
//		delay(1);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByValue("Berhasil Download");
//		delay(1);
//		
//	}
//
//	public void inputDataValid2() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByValue("Tersambung");
//		delay(1);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByValue("Diangkat");
//		delay(1);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByValue("Setuju");
//		delay(1);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByValue("Follow Up Download");
//		delay(1);
//		
//	}
//	
//	public void inputDataValid3() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByValue("Tersambung");
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByValue("Diangkat");
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByValue("Follow Up");
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByValue("Telpon Kembali Lain Waktu");
//		delay(2);
//		
//	}
//	
//	public void inputDataValid4() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByValue("Tersambung");
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByValue("Diangkat");
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByValue("Follow Up");
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByValue("Request Kirim Whatsapp Untuk Dipelajari");
//		delay(2);
//		
//	}
//	
//	public void inputDataValid5() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByValue("Tersambung");
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByValue("Diangkat");
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByValue("Follow Up");
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByValue("Minta Nomer Manager/Pemilik");
//		delay(2);
//		
//	}
//	
//	
//	public void inputDataValid6() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByValue("Tersambung");
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByValue("Diangkat");
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByValue("Follow Up");
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByValue("Minta Pendapat Partner/Pasangan/Orangtua");
//		delay(2);
//		
//	}
//	
//	public void inputDataValid7() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByValue("Tersambung");
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByValue("Diangkat");
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByValue("Follow Up");
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByValue("Follow Up");
//		delay(2);
//		
//	}
//	
//	public void inputDataValid8() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByValue("Tersambung");
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByValue("Diangkat");
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByValue("Follow Up");
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByValue("Follow Convert");
//		delay(2);
//		
//	}
//	
//	
//	public void inputDataValid9() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
//	public void inputDataValid10() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(2);
//		delay(2);
//	}
//	
//	public void inputDataValid11() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(3);
//		delay(2);
//	}
//	
//	public void inputDataValid12() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(4);
//		delay(2);
//	}
//	
//	public void inputDataValid13() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(5);
//		delay(2);
//	}
//	
//	public void inputDataValid14() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(6);
//		delay(2);
//	}
//	
//	public void inputDataValid15() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(7);
//		delay(2);
//	}
//	
//	public void inputDataValid16() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(8);
//		delay(2);
//	}
//	
//	public void inputDataValid17() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(9);
//		delay(2);
//	}
//	
//	public void inputDataValid18() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(10);
//		delay(2);
//	}
//	
//	public void inputDataValid19() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(11);
//		delay(2);
//	}
//	
//	public void inputDataValid20() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(3);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(12);
//		delay(2);
//	}
//	
//	public void inputDataValid21() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(4);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
//	
//
//	public void inputDataValid22() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(5);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
//	public void inputDataValid23() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(2);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(1);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
//	public void inputDataValid24() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(3);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(1);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
//	public void inputDataValid25() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(2);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(1);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(1);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
//	public void inputDataValid26() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(2);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(2);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(1);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
//	public void inputDataValid27() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(2);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(3);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(1);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
//	public void inputDataValid28() {
//		Select statusSelect = new Select(dropDownStatus);
//		statusSelect.selectByIndex(2);
//		delay(2);
//		
//		Select statuscallSelect = new Select(dropDownStatusCall);
//		statuscallSelect.selectByIndex(4);
//		delay(2);
//		
//		Select statusresultSelect = new Select(dropDownStatusResult);
//		statusresultSelect.selectByIndex(1);
//		delay(2);
//		
//		Select reasonSelect = new Select(dropDownReason);
//		reasonSelect.selectByIndex(1);
//		delay(2);
//	}
//	
	
	
