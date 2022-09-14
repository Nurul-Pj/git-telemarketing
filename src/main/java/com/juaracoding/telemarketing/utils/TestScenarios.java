package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("URL Invalid"),
	T2("URL valid"),
	T3("Input username password invalid"),
	T4("Input username password null"),
	T5("Input valid login ignore lettercase"),
	T6("Input valid login uppercase"),
	T7("Logout user"),
	T8("User valid login"),
	T9("Dashboard user management"),
	T10("Search user"),
	T11("Add user"),
	T12("Reset Password"),
	T13("Update Form"),
	T14("Update Password"),
	T15("Remove User"),
	T16("Dashboard user managemsent"),
	T17("show page"),
	T18("search name user"),
	T19("Approve Phone"),
	T20("Reject Phone");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
