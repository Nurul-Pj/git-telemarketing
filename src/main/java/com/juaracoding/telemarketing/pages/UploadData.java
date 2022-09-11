package com.juaracoding.telemarketing.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class UploadData {

private WebDriver driver;
	
	public UploadData() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ui-id-11\"]")
	private WebElement btnData;
	
	@FindBy(xpath = "//*[@id=\"52837_query\"]")
	private WebElement btnUploadData;
	//input[@id='tl_upload_new--52043_text']
	//input[@id='tl_upload_new--52043']
	//input[@id='52043']
	@FindBy(xpath = "//input[@type='file']")
	private WebElement btnChooseFile;
	
	@FindBy(xpath = "//*[@id=\"52044_query\"]")
	private WebElement btnUpload;
	
	@FindBy(xpath = "//*[@id=\"52055_query\"]")
	private WebElement btnSimpan;
	
	@FindBy(xpath = "//*[@id=\"52057_query\"]")
	private WebElement btnSimpanFile;
	
	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']")
	private WebElement btnOke;

	public void btnData() {
		btnData.click();
	}
	
	public void btnUploadData() {
		btnUploadData.click();
	}
	
	public void btnChooseFileInvalid() {
//		btnChooseFile.click();
		File file = new File("Ujicoba invalid.docx");
		//this.btnChooseFile.sendKeys("C:\\Users\\HP\\Downloads\\Uji coba invalid.docx");
		System.out.println("HOIIIII"+file.getAbsolutePath());
		btnChooseFile.sendKeys(file.getAbsolutePath());
//		btnChooseFile.click();
	}
	
	
	public void btnChooseFileValid() {
//		btnChooseFile.click();
		File file = new File("contoh data KP.xlsx");
		//this.btnChooseFile.sendKeys("C:\\Users\\HP\\Downloads\\Uji coba invalid.docx");
		System.out.println("HOIIIII"+file.getAbsolutePath());
		btnChooseFile.sendKeys(file.getAbsolutePath());
//		this.btnChooseFile.sendKeys("C:\\Users\\HP\\Downloads\\contoh data KP.xlsx");
	}
	
	public void btnUploadFile() {
		btnUpload.click();
	}
	
	public void btnSimpanFile() {
		btnSimpan.click();
	}
	
	public void btnSimpanFileBaru() {
		btnSimpanFile.click();
	}
	
	public void clickBtnClose() {
		btnOke.click();
	}
	
}