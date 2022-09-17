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
	T9("Dashboard data"),
	T10("Cek distribute data new, null"),
	T11("Cek distribute data berhasil, null"),
	T12("Cek distribute data follow up, null"),
	T13("Cek distribute data salah sambung, null"),
	T14("Cek distribute data setuju, null"),
	T15("Cek distribute data tidak berhasil, null"),
	T16("Cek distribute data tolak, null"),
	T17("Cek distribute data new, agent"),
	T18("Cek distribute data berhasil, agent"),
	T19("Cek distribute data follow up, agent"),
	T20("Cek distribute data salah sambung, agent"),
	T21("Cek distribute data setuju, agent"),
	T22("Cek distribute data tidak berhasil, agent"),
	T23("Cek distribute data tolak, agent"),
	T24("Distribusi agent");
	
//	T9("Dashboard user management"),
//	T10("Add user supervisior"),
//	T11("Search user"),
//	T12("Add user agent"),
//	T13("Add user admin"),
//	T14("Remove User"),
//	T15("Add user null"),
//	T16("Reset Password"),
//	T17("Update Password"),
//	T18("Update form"),
//	T19("Dashboard user managemsent"),
//	T20("show page"),
//	T21("search name user"),
//	T22("Approve Phone"),
//	T23("Reject Phone");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
