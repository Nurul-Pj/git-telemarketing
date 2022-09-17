package com.juaracoding.telemarketing.step_definitions.agent;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
features = "src/test/resources/features/4.Task Final Agent.feature",
glue = "com.juaracoding.telemarketing.step_definitions.agent",
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}