package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("Input invalid login"),
	T2("Input null login"),
	T3("User valid login"),
	T4("User valid login ignore lettercase"),
	T5("User valid login uppercase"),
	
	T6("Dashboard Data"),
	T7("Upload data invalid"),
	T8("Choose data button invalid"),
	T9("Upload data valid"),
	
	T10("Dashboard Task"),
	T11("Search data agree"),
	T12("Isi field link"),
	
	T13("Dashboard Task"),
	T14("User pindah halaman"),
	T15("User search nama final"),
	T16("User task show page final"),
	
	T17("Dashboard Report"),
	T18("Choose date agree invalid"),
	T19("Choose date agree valid"),
	T20("Pindah halaman agree"),
	T21("Show page agree"),
	T22("Export agree"),
	
	T23("Dashboard Report"),
	T24("Choose agent"),
	T25("Choose date"),
	T26("Show page activity"),
	T27("Export activity"),
	T28("Logout"),
	
	T29("Dashboard Data Agent"),
	T30("Search agree agent"),
	T31("Choose file agree agent");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
