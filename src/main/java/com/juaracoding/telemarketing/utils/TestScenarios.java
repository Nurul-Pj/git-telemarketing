package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
//	Login
	T1("URL Invalid"),
	T2("URL valid"),
	T3("Input username password invalid"),
	T4("Input username password null"),
	T5("Input valid login ignore lettercase"),
	T6("Input valid login uppercase"),
	T7("Logout user"),
	T8("User valid login"),
	
//	Distribute data
	T9("Dashboard data"),
	T10("Status New Null"),
	T11("Status Berhasil Null"),
	T12("Status Follow Up Null"),
	T13("Status Salah Sambung Null"),
	T14("Status Setuju Null"),
	T15("Status Tidak Berhasil Null"),
	T16("Status Tolak Null"),
	T17("Status New Agent"),
	T18("Distribusi form developer input"),
	T19("Distribusi form agent input"),
	T20("Distribusi form null"),
	
//	Edit data
	T21("Dashboard data"),
	T22("Search user"),
	T24("table click"),
	T25("Update data detail"),
	T26("Update status activity"),
	T27("Update data"),
	T28("Show page data"),
	
//	user management
	T29("Dashboard user management"),
	T30("Add user supervisior"),
	T31("Search user"),
	T32("Add user agent"),
	T33("Add user admin"),
	T34("Remove User"),
	T35("Add user null"),
	T36("Reset Password"),
	T37("Update Password"),
	T38("Update form"),
	
//	approve phone
	T39("Dashboard user managemsent"),
	T40("show page"),
	T41("search name user"),
	T42("Approve Phone"),
	T43("Reject Phone"),

//	upload data
	T44("Dashboard Data"),
	T45("Upload data invalid"),
	T46("Choose data button invalid"),
	T47("Upload data valid"),
	
//	task agree
	T48("Dashboard Task"),
	T49("Search data agree"),
	T50("Isi field link"),
	
//	data final
	T51("Dashboard Task"),
	T52("User pindah halaman"),
	T53("User search nama final"),
	T54("User task show page final"),
	
//	report agree
	T55("Dashboard Report"),
	T56("Choose date agree invalid"),
	T57("Choose date agree valid"),
	T58("Pindah halaman agree"),
	T59("Show page agree"),
	T60("Export agree"),
	
//	report activity
	T61("Dashboard Report"),
	T62("Choose agent"),
	T63("Choose date"),
	T64("Show page activity"),
	T65("Export activity"),
	T66("Logout"),
	
//	agree agent
	T67("Dashboard Data Agent"),
	T68("Search agree agent"),
	T69("Choose file agree agent");
//>>>>>>> refs/heads/jihan

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}


}
