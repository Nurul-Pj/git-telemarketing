package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("User username password invalid"),
	T2("User valid login"),
	T3("Dashboard user management"),
	T4("Search user"),
	T5("Add user"),
	T6("Reset Password"),
	T7("Update Form"),
	T8("Update Password"),
	T9("Remove User");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
