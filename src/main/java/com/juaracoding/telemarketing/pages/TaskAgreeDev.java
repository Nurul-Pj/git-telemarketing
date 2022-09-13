package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class TaskAgreeDev {

	private WebDriver driver;
	
	public TaskAgreeDev() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ui-id-15\"]")
	private WebElement btnTask;
	
	@FindBy(xpath = "//*[@id=\"52826_query\"]")
	private WebElement btnTaskAgree;
	
	@FindBy(xpath = "//*[@id=\"tl_agree--52770_text\"]")
	private WebElement inputSearch;

	@FindBy(xpath = "//*[@id=\"52776_query\"]")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//*[@id=\"tl_agree--52774_table\"]/tbody/tr")
	private WebElement btnChooseFile;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity_agree-1212-52891_text\"]")
	private WebElement isiLink;
	
	@FindBy(xpath = "//*[@id=\"52886_query\"]")
	private WebElement btnSimpan;
	
	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']")
	private WebElement btnOke;
	
	public void btnTask() {
		btnTask.click();
	}
	
	public void btnTaskAgree() {
		btnTaskAgree.click();
	}
	
	public void search(String id) {
//		inputSearch.click();

		this.inputSearch.sendKeys(id);
	}
	
	public void btnSearch() {
		btnSearch.click();
	}
	
	public void btnChooseFile() {
		btnChooseFile.click();
	}
	
	public void isiLink(String id) {
//		isiLink.click();
		this.isiLink.sendKeys(id);
	}
	
	public void btnSimpan() {
		btnSimpan.click();
	}
	
	public void clickBtnClose() {
		btnOke.click();
	}
}
