package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("Input invalid login"),
	T2("Input null login"),
	T3("Input valid logim"),
	T4("Input valid login ignore lettercase"),
	T5("Input valid login uppercase"),
	T6("Halaman dashboard telemarketing"),
	T7("Input field search"),
	T8("Click activity"),
	T9("Input field request phone");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
