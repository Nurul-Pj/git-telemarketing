package com.juaracoding.telemarketing.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
features = {"src/test/resources/features/1.Login Agent.feature", 
"src/test/resources/features/2.Task New Agent.feature",
"src/test/resources/features/3.Task Follow Up Agent.feature",
"src/test/resources/features/4.Task Data All Agent.feature",
"src/test/resources/features/5.Task Final Agent.feature"},
glue = "com.juaracoding.telemarketing.step_definitions",
plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}