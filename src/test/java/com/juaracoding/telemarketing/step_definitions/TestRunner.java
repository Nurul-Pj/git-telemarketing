package com.juaracoding.telemarketing.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
features = "",
glue = "",
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}