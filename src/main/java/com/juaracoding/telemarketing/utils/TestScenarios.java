package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("URL Salah"),
	T2("URL Benar"),
	T3("Input invalid username and password"),
	T4("Input null username and password"),
	T5("Input valid username and password"),
	T6("Input valid username dengan ignore lettercase"),
	T7("Logout from profile"),
	T8("Input valid username dengan uppercase");
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
