package com.juaracoding.telemarketing.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
features = {
//			"src/test/resources/features/01.LoginDev.feature",
//			"src/test/resources/features/02.UploadData.feature",
//			"src/test/resources/features/03.DistributeData.feature",
//			"src/test/resources/features/04.EditData.feature",
//			"src/test/resources/features/05.User.feature",
//			"src/test/resources/features/06.ApprovePhone.feature",
//			"src/test/resources/features/07.TaskNewDev.feature",
//			"src/test/resources/features/08.TaskAgreeDev.feature",
//			"src/test/resources/features/09.TaskFollowUpDev.feature",
//			"src/test/resources/features/10.TaskDataAllDev.feature",
//			"src/test/resources/features/11.TaskFinalDev.feature",
//			"src/test/resources/features/12.ReportAgree.feature",
//			"src/test/resources/features/13.ReportAct.feature",
			"src/test/resources/features/14.LoginAgent.feature"
			},
glue = "com.juaracoding.telemarketing.step_definitions",
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}