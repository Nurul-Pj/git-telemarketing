package com.juaracoding.telemarketing.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
features = {"src/test/resources/features/1. Login.feature",
		"src/test/resources/features/6. ReportAct.feature"},
glue = "com.juaracoding.telemarketing.step_definitions",
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}