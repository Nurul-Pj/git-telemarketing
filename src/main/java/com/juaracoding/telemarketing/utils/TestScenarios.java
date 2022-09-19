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
	
//	task data final dev
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
	
//	task agree agent
	T67("Dashboard Data Agent"),
	T68("Search agree agent"),
	T69("Choose file agree agent"),
//>>>>>>> refs/heads/jihan

	
//	task new agent
	T70("Input invalid username and password"),
	T71("Input null username and password"),
	T72("Input valid username and password"),
	T73("Input valid username dengan ignore lettercase"),
	T74("Logout from profile"),
	T75("Input valid username dengan uppercase"),
	T76("Halaman Dashboard telemarketing"),
	T77("Input field search (Task New)"),
	T78("Click search (Task New)"),
	T79("Next Page (Task New)"),
	T80("Click activity (Task New)"), 
	T81("Input status acitivity invalid (Task New)"),
	T82("Dropdown Tersambung, Diangkat, Setuju (Task New)"),
	T83("Dropdown Tersambung, Diangkat, Follow Up (Task New)"),
	T84("Dropdown Tersambung, Diangkat, Tolak (Task New)"),
	T85("Dropdown Tersambung, Diangkat, Berhasil (Task New)"),
	T86("Dropdown Tersambung, Diangkat, Tidak Berhasil (Task New)"),
	T87("Dropdown Tersambung, Salah Sambung (Task New)"),
	T88("Dropdown Tersambung, Tidak Diangkat (Task New)"),
	T89("Dropdown Tidak Tersambung, Nomer Salah (Task New)"),
	T90("Dropdown Tidak Tersambung, Mailbox (Task New)"),
	T91("Dropdown Tidak Tersambung, Invalid Number(Task New)"),
	T92("Dropdown Tidak Tersambung, Telepon Not Register (Task New)"),
	T93("Input field request phone (Task New)"),
	T94("Input field wa (Task New)"),
	T95("Input field wa invalid (number phone wa input by alphabet) (Task New)"),
	T96("Show page (Task New)"),
	
//	task follow up agent
	T97("Input field search (Follow Up) "),
	T98("Click search (Follow Up) "),
	T99("Next page (Follow Up) "),
	T100("Click activity (Follow Up)"),
	T101("Input status acitivity invalid (Follow Up)"),
	T102("Dropdown Tersambung, Diangkat, Setuju (Follow Up)"),
	T103("Dropdown Tersambung, Diangkat, Follow Up (Follow Up)"),
	T104("Dropdown Tersambung, Diangkat, Tolak (Follow Up)"),
	T105("Dropdown Tersambung, Diangkat, Berhasil (Follow Up)"),
	T106("Dropdown Tersambung, Diangkat, Tidak Berhasil (Follow Up)"),
	T107("Dropdown Tersambung, Salah Sambung (Follow Up)"),
	T108("Dropdown Tersambung, Tidak Diangkat (Follow Up)"),
	T109("Dropdown Tidak Tersambung, Nomer Salah (Follow Up)"),
	T110("Dropdown Tidak Tersambung, Mailbox (Follow Up)"),
	T111("Dropdown Tidak Tersambung, Invalid Number (Follow Up)"),
	T112("Dropdown Tidak Tersambung, Telepon Not Register (Follow Up)"),
	T113("Input field request phone (Follow Up)"),
	T114("Input field wa (Follow Up)"),
	T115("Input field wa invalid (number phone wa input by alphabet) (Follow Up)"),
	T116("Show page (Follow Up)"),
	
//	task data final agent
	T117("Input field search (Final)"),
	T118("Click search (Final)"),
	T119("Next page (Final)"),
	T120("Click activity (Final)"),
	T121("Show page (Final)"),
	T122("Input field search (Data All) "),
	T123("Click search (Data All) "),
	T124("Filter search null (Data All)"),
	T125("Filter search (Data All)"),
	T126("Next page (Data All) "),
	T127("Click activity (Data All)"),
	T128("Input status acitivity invalid (Data All)"),
	T129("Dropdown Tersambung, Diangkat, Setuju (Data All)"),
	T130("Dropdown Tersambung, Diangkat, Follow Up (Data All)"),
	T131("Dropdown Tersambung, Diangkat, Tolak (Data All)"),
	T132("Dropdown Tersambung, Diangkat, Berhasil (Data All)"),
	T133("Dropdown Tersambung, Diangkat, Tidak Berhasil (Data All)"),
	T134("Dropdown Tersambung, Salah Sambung (Data All)"),
	T135("Dropdown Tersambung, Tidak Diangkat (Data All)"),
	T136("Dropdown Tidak Tersambung, Nomer Salah (Data All)"),
	T137("Dropdown Tidak Tersambung, Mailbox (Data All)"),
	T138("Dropdown Tidak Tersambung, Invalid Number (Data All)"),
	T140("Dropdown Tidak Tersambung, Telepon Not Register (Data All)"),
	T141("Input field request phone (Data All)"),
	T142("Input field wa (Data All)"),
	T143("Input field wa invalid (number phone wa input by alphabet) (Data All)"),
	T144("Show page (Data All)"),
	
//	task new developer
	T145("Input field search (Task New Developer)"),
	T146("Click search (Task New Developer)"),
	T147("Next Page (Task New Developer)"),
	T148("Click activity (Task New Developer)"), 
	T149("Input status acitivity invalid (Task New Developer)"),
	T150("Dropdown Tersambung, Diangkat, Setuju (Task New Developer)"),
	T151("Dropdown Tersambung, Diangkat, Follow Up (Task New Developer)"),
	T152("Dropdown Tersambung, Diangkat, Tolak (Task New Developer)"),
	T153("Dropdown Tersambung, Diangkat, Berhasil (Task New Developer)"),
	T154("Dropdown Tersambung, Diangkat, Tidak Berhasil (Task New Developer)"),
	T155("Dropdown Tersambung, Salah Sambung (Task New Developer)"),
	T156("Dropdown Tersambung, Tidak Diangkat (Task New Developer)"),
	T157("Dropdown Tidak Tersambung, Nomer Salah (Task New Developer)"),
	T158("Dropdown Tidak Tersambung, Mailbox (Task New Developer)"),
	T159("Dropdown Tidak Tersambung, Invalid Number(Task New Developer)"),
	T160("Dropdown Tidak Tersambung, Telepon Not Register (Task New Developer)"),
	T161("Input field request phone (Task New Developer)"),
	T162("Input field wa (Task New Developer)"),
	T163("Input field wa invalid (number phone wa input by alphabet) (Task New Developer)"),
	T164("Show page (Task New Developer)"),
	
//	task follow up developer
	T165("Input field search (Task Follow Up Dev)"),
	T166("Click search (Task Follow Up Dev)"),
	T167("Next Page (Task Follow Up Dev)"),
	T168("Click activity (Task Follow Up Dev)"), 
	T169("Input status acitivity invalid (Task Follow Up Dev)"),
	T170("Dropdown Tersambung, Diangkat, Setuju (Task Follow Up Dev)"),
	T171("Dropdown Tersambung, Diangkat, Follow Up (Task Follow Up Dev)"),
	T172("Dropdown Tersambung, Diangkat, Tolak (Task Follow Up Dev)"),
	T173("Dropdown Tersambung, Diangkat, Berhasil (Task Follow Up Dev)"),
	T174("Dropdown Tersambung, Diangkat, Tidak Berhasil (Task Follow Up Dev)"),
	T175("Dropdown Tersambung, Salah Sambung (Task Follow Up Dev)"),
	T176("Dropdown Tersambung, Tidak Diangkat (Task Follow Up Dev)"),
	T177("Dropdown Tidak Tersambung, Nomer Salah (Task Follow Up Dev)"),
	T178("Dropdown Tidak Tersambung, Mailbox (Task Follow Up Dev)"),
	T179("Dropdown Tidak Tersambung, Invalid Number(Task Follow Up Dev)"),
	T180("Dropdown Tidak Tersambung, Telepon Not Register(Task Follow Up Dev)"),
	T181("Input field request phone (Task Follow Up Dev)"),
	T182("Input field wa (Task Follow Up Dev)"),
	T183("Input field wa invalid (number phone wa input by alphabet) (Task Follow Up Dev)"),
	T184("Show page (Task Follow Up Dev)"),
	
//	task data all developer
	T185("Input field search (Data All Dev)"),
	T186("Click search (Data All Dev)"),
	T187("Next Page (Data All Dev)"),
	T188("Click activity (Data All Dev)"), 
	T189("Input status acitivity invalid (Data All Dev)"),
	T190("Dropdown Tersambung, Diangkat, Setuju (Data All Dev)"),
	T191("Dropdown Tersambung, Diangkat, Follow Up (Data All Dev)"),
	T192("Dropdown Tersambung, Diangkat, Tolak (Data All Dev)"),
	T193("Dropdown Tersambung, Diangkat, Berhasil (Data All Dev)"),
	T194("Dropdown Tersambung, Diangkat, Tidak Berhasil (Data All Dev)"),
	T195("Dropdown Tersambung, Salah Sambung (Data All Dev)"),
	T196("Dropdown Tersambung, Tidak Diangkat (Data All Dev)"),
	T197("Dropdown Tidak Tersambung, Nomer Salah (Data All Dev)"),
	T198("Dropdown Tidak Tersambung, Mailbox (Data All Dev)"),
	T199("Dropdown Tidak Tersambung, Invalid Number(Data All Dev)"),
	T200("Dropdown Tidak Tersambung, Telepon Not Register(Data All Dev)"),
	T201("Input field request phone (Data All Dev)"),
	T202("Input field wa (Data All Dev)"),
	T203("Input field wa invalid (number phone wa input by alphabet) (Data All Dev)"),
	
	
	T204("Click export (Task New Dev) "),
	T205("Click export (Task Follow Up Dev) "),
	T206("Click export (Data All Dev) ");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}


}
