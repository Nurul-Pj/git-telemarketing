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
	T10("Add user supervisior"),
	T11("Search user"),
	T12("Add user agent"),
	T13("Add user admin"),
	T14("Remove User"),
	T15("Add user null"),
	T16("Reset Password"),
	T17("Update Password"),
	T18("Update form"),
	T19("Dashboard user managemsent"),
	T20("show page"),
	T21("search name user"),
	T22("Approve Phone"),
	T23("Reject Phone");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
