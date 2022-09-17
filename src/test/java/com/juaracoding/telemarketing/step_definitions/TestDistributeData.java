package com.juaracoding.telemarketing.step_definitions;

import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.juaracoding.telemarketing.pages.DistributeData;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDistributeData {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	private DistributeData dataDistribusi = new DistributeData();
	
	public TestDistributeData() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
//	dashboard user management
	
	@When("click list menu data")
	public void click_list_menu_data() {
		dataDistribusi.listData();
		extentTest.log(LogStatus.PASS, "click list menu data");
	}
	
	@Then("click menu distribute data")
	public void click_distribute_data() {
		dataDistribusi.listDistributeData();
		extentTest.log(LogStatus.PASS, "click menu distribute data");
	}
	
//	status new, null
	@And("click button view")
	public void click_button_view() {
		dataDistribusi.clickBtnBiew();
		extentTest.log(LogStatus.PASS, "click button view");
	}
	
	@Then("validasi table")
	public void validasi_table() {
		delay(1);
		assertEquals(dataDistribusi.getValidate(), "1");
		extentTest.log(LogStatus.PASS, "validasi table");
	}

//	status 
	@When("click list status")
	public void click_list_status() {
		dataDistribusi.selectStatusOne();
		extentTest.log(LogStatus.PASS, "click list status");
	}
	
	@And("choose field status berhasil")
	public void choose_field_status_berhasil() {
		dataDistribusi.chooseBerhasil();
		delay(1);
		extentTest.log(LogStatus.PASS, "choose field status berhasil");
	}
	
	@And("choose field status follow up")
	public void choose_field_status_follow_up() {
		dataDistribusi.chooseFollowUp();
		delay(1);
		extentTest.log(LogStatus.PASS, "choose field status follow up");
	}
	
	@And("choose field status salah sambung")
	public void choose_field_status_salah_sambung() {
		dataDistribusi.chooseSalahSambung();
		delay(1);
		extentTest.log(LogStatus.PASS, "choose field status salah sambung");
	}
	
	@And("choose field status setuju")
	public void choose_field_status_setuju() {
		dataDistribusi.chooseSetuju();
		delay(1);
		extentTest.log(LogStatus.PASS, "choose field status setuju");
	}
	
	@And("choose field status tidak berhasil")
	public void choose_field_status_tidak_berhasil() {
		dataDistribusi.chooseTidakBerhasil();
		delay(1);
		extentTest.log(LogStatus.PASS, "choose field status tidak berhasil");
	}
	
	@And("choose field status tolak")
	public void choose_field_status_tolak() {
		dataDistribusi.chooseTolak();
		delay(1);
		extentTest.log(LogStatus.PASS, "choose field status tolak");
	}
	
	@And("choose field status new")
	public void choose_field_status_new() {
		dataDistribusi.chooseNew();
		delay(1);
		extentTest.log(LogStatus.PASS, "choose field status new");
	}
	
	@And("click list buket data")
	public void click_list_buket_data() {
		dataDistribusi.selectStatusOne();
		dataDistribusi.selectBuketData();
		extentTest.log(LogStatus.PASS, "click list buket data");
	}
	
	@And("choose field buket data agent01")
	public void choose_field_status_agent01() {
		dataDistribusi.chooseAgent();
		delay(1);
		extentTest.log(LogStatus.PASS, "choose field status agent01");
	}
	
	@And("choose field status null")
	public void choose_field_status_null() {
		extentTest.log(LogStatus.PASS, "choose field status null");
	}
	
	@Then("validate no entries")
	public void validate_no_entries() {
		delay(1);
		assertEquals(dataDistribusi.getNoEntries(), " no entries");
		extentTest.log(LogStatus.PASS, "validate no entries");
	}
	
//	distribusi form
	@When("choose distribusi ke agent")
	public void choose_distribusi_ke_agent() {
		dataDistribusi.clickDistribusiKe();
		dataDistribusi.chooseDisDeveloper();
		dataDistribusi.chooseDisAgent();
		dataDistribusi.clickDistribusiKe();
		extentTest.log(LogStatus.PASS, "choose distribusi ke agent");
	}
	
	@When("choose distribusi ke developer")
	public void choose_distribusi_ke_developer() {
		dataDistribusi.clickDistribusiKe();
		dataDistribusi.chooseDisDeveloper();
		dataDistribusi.clickDistribusiKe();
		extentTest.log(LogStatus.PASS, "choose distribusi ke developer");
	}
	
	@When("choose distribusi ke null")
	public void choose_distribusi_ke_null() {
		dataDistribusi.clickDistribusiKe();
		dataDistribusi.chooseDisAgent();
		dataDistribusi.clickDistribusiKe();
		extentTest.log(LogStatus.PASS, "choose distribusi ke null");
	}
	
	@And("input jumlah agent")
	public void input_jumlah_agent() {
		dataDistribusi.inputJumlahAgent("1");
		extentTest.log(LogStatus.PASS, "input jumlah agent");
	}
	
	@And("input jumlah agent null")
	public void input_jumlah_agent_null() {
		dataDistribusi.deleteJumlahAgent();
		delay(1);
		dataDistribusi.inputJumlahAgent("");
		extentTest.log(LogStatus.PASS, "input jumlah agent null");
	}
	
	@And("select status")
	public void select_status() {
		dataDistribusi.pilihStatus();
		extentTest.log(LogStatus.PASS, "select status");
	}
	
	@And("click button distribusi")
	public void click_button_distribusi() {
		delay(1);
		dataDistribusi.clickBtnDistribusi();
		extentTest.log(LogStatus.PASS, "click button distribusi");
	}
	
	@Then("click oke")
	public void click_oke() {
		delay(1);
		dataDistribusi.clickBtnOke();
		extentTest.log(LogStatus.PASS, "click oke");
	}
	
	@Then("click ya")
	public void click_ya() {
		delay(1);
		dataDistribusi.clickBtnYa();
		extentTest.log(LogStatus.PASS, "click ya");
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
