package com.juaracoding.telemarketing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.telemarketing.drivers.DriverSingleton;

public class TaskAgreeAgent {

private WebDriver driver;
	
	public TaskAgreeAgent() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"ui-id-5\"]")
	private WebElement btnTask;
	
	@FindBy(xpath = "//*[@id=\"52826_query\"]")
	private WebElement btnTaskAgreeAgent;
	
	@FindBy(xpath = "//*[@id=\"tl_agree--52770_text\"]")
	private WebElement inputSearchAgent;

	@FindBy(xpath = "//*[@id=\"52776_query\"]")
	private WebElement btnSearchAgent;
	
	@FindBy(xpath = "//*[@id=\"tl_agree--52774_table\"]/tbody/tr")
	private WebElement btnChooseFileAgent;
	
	@FindBy(xpath = "//*[@id=\"tl_user_activity_agree-1212-52891_text\"]")
	private WebElement isiLinkAgent;
	
	@FindBy(xpath = "//*[@id=\"52886_query\"]")
	private WebElement btnUpdateAgent;
	
	@FindBy(xpath = "//div[@class='ui-dialog-buttonset']")
	private WebElement btnOke;
	
	public void btnTask() {
		btnTask.click();
	}
	
	public void btnTaskAgree() {
		btnTaskAgreeAgent.click();
	}
	
	public void search(String id) {
//		inputSearch.click();

		this.inputSearchAgent.sendKeys(id);
	}
	
	public void btnSearch() {
		btnSearchAgent.click();
	}
	
	public void btnChooseFile() {
		btnChooseFileAgent.click();
	}
	
	public void isiLink(String id) {
//		isiLink.click();
		this.isiLinkAgent.sendKeys(id);
	}
	
	public void btnSimpan() {
		btnUpdateAgent.click();
	}
	
	public void clickBtnClose() {
		btnOke.click();
	}
}
