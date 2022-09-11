package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("Input invalid login"),
	T2("Input null login"),
	T3("User valid login"),
	T4("User valid login ignore lettercase"),
	T5("User valid login uppercase"),
	T6("Upload data invalid"),
	T7("Upload data valid"),
	T8("Logout user");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
