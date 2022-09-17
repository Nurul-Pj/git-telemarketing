package com.juaracoding.telemarketing.utils;

public enum TestScenarios {
	
	T1("URL Salah"),
	T2("URL Benar"),
	T3("Input invalid username and password"),
	T4("Input null username and password"),
	T5("Input valid username and password"),
	T6("Input valid username dengan ignore lettercase"),
	T7("Logout from profile"),
	T8("Input valid username dengan uppercase"),
	T9("Halaman Dashboard telemarketing"),
	T10("Input field search (Task New)"),
	T11("Click search (Task New)"),
	T12("Next Page (Task New)"),
	T13("Click activity (Task New)"), 
	T14("Input status acitivity invalid (Task New)"),
	T15("Dropdown Tersambung, Diangkat, Setuju (Task New)"),
	T16("Dropdown Tersambung, Diangkat, Follow Up (Task New)"),
	T17("Dropdown Tersambung, Diangkat, Tolak (Task New)"),
	T18("Dropdown Tersambung, Diangkat, Berhasil (Task New)"),
	T19("Dropdown Tersambung, Diangkat, Tidak Berhasil (Task New)"),
	T20("Dropdown Tersambung, Salah Sambung (Task New)"),
	T21("Dropdown Tersambung, Tidak Diangkat (Task New)"),
	T22("Dropdown Tidak Tersambung, Nomer Salah (Task New)"),
	T23("Dropdown Tidak Tersambung, Mailbox (Task New)"),
	T24("Dropdown Tidak Tersambung, Invalid Number(Task New)"),
	T25("Dropdown Tidak Tersambung, Telepon Not Register (Task New)"),
	T26("Input field request phone (Task New)"),
	T27("Input field wa (Task New)"),
	T28("Input field wa invalid (number phone wa input by alphabet) (Task New)"),
	T29("Show page (Task New)"),
	T30("Input field search (Follow Up) "),
	T31("Click search (Follow Up) "),
	T32("Next page (Follow Up) "),
	T33("Click activity (Follow Up)"),
	T34("Input status acitivity invalid (Follow Up)"),
	T35("Dropdown Tersambung, Diangkat, Setuju (Follow Up)"),
	T36("Dropdown Tersambung, Diangkat, Follow Up (Follow Up)"),
	T37("Dropdown Tersambung, Diangkat, Tolak (Follow Up)"),
	T38("Dropdown Tersambung, Diangkat, Berhasil (Follow Up)"),
	T39("Dropdown Tersambung, Diangkat, Tidak Berhasil (Follow Up)"),
	T40("Dropdown Tersambung, Salah Sambung (Follow Up)"),
	T41("Dropdown Tersambung, Tidak Diangkat (Follow Up)"),
	T42("Dropdown Tidak Tersambung, Nomer Salah (Follow Up)"),
	T43("Dropdown Tidak Tersambung, Mailbox (Follow Up)"),
	T44("Dropdown Tidak Tersambung, Invalid Number (Follow Up)"),
	T45("Dropdown Tidak Tersambung, Telepon Not Register (Follow Up)"),
	T46("Input field request phone (Follow Up)"),
	T47("Input field wa (Follow Up)"),
	T48("Input field wa invalid (number phone wa input by alphabet) (Follow Up)"),
	T49("Show page (Follow Up)"),
	T50("Input field search (Final)"),
	T51("Click search (Final)"),
	T52("Next page (Final)"),
	T53("Click activity (Final)"),
	T54("Show page (Final)");
	
	
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
