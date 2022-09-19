package com.juaracoding.telemarketing.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
features = {"src/test/resources/features/02.UploadData.feature",
			"src/test/resources/features/08.TaskAgreeDev.feature",
			"src/test/resources/features/11.TaskFinalDev.feature",
			"src/test/resources/features/12.ReportAgree.feature",
			"src/test/resources/features/13.ReportAct.feature"},
glue = "com.juaracoding.telemarketing.step_definitions",
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}