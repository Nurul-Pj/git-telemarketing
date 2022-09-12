package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("User login invalid"),
	T2("User login valid"),
	T3("User task new agent");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
