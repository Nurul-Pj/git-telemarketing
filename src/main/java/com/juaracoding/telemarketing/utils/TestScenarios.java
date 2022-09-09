package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("User login valid"),
	T2("User login invalid"),
	T3("");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
