package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("User username password invalid"),
	T2("User valid login"),
	T3("Dashboard user management"),
	T4("show page"),
	T5("search name user"),
	T6("Approve Phone"),
	T7("Reject Phone"),
	T8("Dashboard user management"),
	T9("Search user"),
	T10("Add user"),
	T11("Reset Password"),
	T12("Update Form"),
	T13("Update Password"),
	T14("Remove User");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
