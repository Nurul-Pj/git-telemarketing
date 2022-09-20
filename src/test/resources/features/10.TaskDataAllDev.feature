Feature: Task New Agent

Scenario: User valid login
  		When User go to Web Telemarketing
  		And User enter username and password valid login
    	And click button sign in
    	And open appear greeting
    	Then click button ok
    	
    And User click task developer
    And User click data all developer
    Then Page data all developer
    
    
  Scenario: Click export (Data All Dev)  
   	And User click export data all 
    
  Scenario: Input field search (Data All Dev)  
   	When User input search in data all valid
   	
 	Scenario: Click search (Data All Dev)  
   	And User click search in data all
   	Then Page search in data all
   	
   	And User click data all
   	  	
  Scenario: Filter search null (Data All Dev)  
  	And Choose filter form with "AGENT01" as agent and "null" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "ridho" as agent and "null" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "elvay" as agent and "null" as status
   	And User click search in data all
   	Then Page data all
   	
   		And Choose filter form with "null" as agent and "Berhasil" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Follow Up" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Mailbox" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Nomer Salah" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Salah Sambung" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Setuju" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Tidak Ada Nomor Telepon" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Tidak Berhasil" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Berhasil" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Tidak Diangkat" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "null" as agent and "Tidak Terdaftar" as status
   	And User click search in data all
   	Then Page data all
   
   And Choose filter form with "null" as agent and "Tolak" as status
   	And User click search in data all
   	Then Page data all
   	
   	
  Scenario: Filter search (Data All Dev)  
  	And Choose filter form with "ridho" as agent and "Berhasil" as status 
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "elvay" as agent and "Berhasil" as status
   	And User click search in data all
   	Then Page data all
  	
   	And Choose filter form with "AGENT01" as agent and "Berhasil" as status 
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Follow Up" as status 
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Mailbox" as status 
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Nomer Salah" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Salah Sambung" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Setuju" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Tidak Ada Nomor Telepon" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Tidak Berhasil" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Berhasil" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Tidak Diangkat" as status
   	And User click search in data all
   	Then Page data all
   	
   	And Choose filter form with "AGENT01" as agent and "Tidak Terdaftar" as status
   	And User click search in data all
   	Then Page data all
   
   And Choose filter form with "AGENT01" as agent and "Tolak" as status
   	And User click search in data all
   	Then Page data all
   
  #Scenario: Next page (Data All Dev)
  #	When User click next page in data all
  #	When User click previous page in data all
  #	When User click last page in data all
  #	When User click first page in data all
    
  Scenario: Click activity (Data All Dev)	
    When User click data in final
    
  Scenario: Input field request phone (Data All Dev)  
  #	When User click data in follow up
    And User click list phone
    When User click add phone
    And User input request phone
    And User click save phone
    Then Popup konfirmasi
    And User click konfirmasi Ok
    
  Scenario: Click activity (Data All Dev)   	
    When User click data in data all
    Then Page activity

  Scenario: Input status acitivity invalid (Data All Dev)  
 		And Input activity data form with "null" as status and "null" as statuscall 
    And Input activity data2 form with "null" as statusresult and "null" as reason
    And User click submit
    And User click close
    
    And Input activity data form with "Tersambung" as status and "null" as statuscall 
    And Input activity data2 form with "null" as statusresult and "null" as reason
    And User click submit
    And User click close
    
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "null" as statusresult and "null" as reason
    And User click submit
    And User click close
    
 
 	Scenario: Dropdown Tersambung, Diangkat, Setuju (Data All Dev)  
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Setuju" as statusresult and "Berhasil Download" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Setuju" as statusresult and "Follow Up Download" as reason
    And User click submit
    And User click konfirmasi YES
    
    
 	Scenario: Dropdown Tersambung, Diangkat, Follow Up (Data All Dev)     
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Telepon Kembali Lain Waktu" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Request Kirim Whatsapp Untuk Dipelajari" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Minta Nomer Manager/Pemilik" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Minta Pendapat Partner/Pasangan/Orangtua" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Follow Up" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Follow Convert" as reason
    And User click submit
    And User click konfirmasi YES
    
    
    
  Scenario: Dropdown Tersambung, Diangkat, Tolak (Data All Dev)    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Bersedia Memberikan Kontak Owner" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Fokus Online" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Tertarik, Tidak Memberi Alasan" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Mengerti dan Tidak Bersedia Dijelaskan" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Mengenal Tokko/Bukukas" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Rating/Comment Buruk Tokko di Sosial Media" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Mau Dipersulit Menggunakan Tokko" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Terlalu Banyak Aplikasi atau Platform" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Memory Handphone Penuh" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Punya Android" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Lebih Nyaman Dengan Platform Selain Tokko" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Usaha Sudah Tutup/Bangkrut" as reason
    And User click submit
    And User click konfirmasi YES
    
    
    
  Scenario: Dropdown Tersambung, Diangkat, Berhasil (Data All Dev)     
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Berhasil" as statusresult and "Berhasil" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tersambung, Diangkat, Tidak Berhasil (Data All Dev)     
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tidak Berhasil" as statusresult and "Tidak Berhasil" as reason
    And User click submit
    And User click konfirmasi YES
    
    
    
  Scenario: Dropdown Tersambung, Salah Sambung (Data All Dev)     
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Salah Sambung" as statuscall 
    And Input activity data2 form with "Salah Sambung" as statusresult and "Salah Sambung" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tersambung, Tidak Diangkat (Data All Dev)     
    When User click data in follow up
    And Input activity data form with "Tersambung" as status and "Tidak Diangkat" as statuscall 
    And Input activity data2 form with "Tidak Diangkat" as statusresult and "Tidak Diangkat" as reason
    And User click submit
    And User click konfirmasi YES
    
    
    
  Scenario: Dropdown Tidak Tersambung, Nomer Salah (Data All Dev)  
    When User click data in follow up
    And Input activity data form with "Tidak Tersambung" as status and "Nomer Salah" as statuscall 
    And Input activity data2 form with "Nomer Salah" as statusresult and "Nomer Salah" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tidak Tersambung, Mailbox (Data All Dev)  
    When User click data in follow up
    And Input activity data form with "Tidak Tersambung" as status and "Mailbox" as statuscall 
    And Input activity data2 form with "Mailbox" as statusresult and "Mailbox" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tidak Tersambung, Invalid Number (Data All Dev)  
    When User click data in follow up
    And Input activity data form with "Tidak Tersambung" as status and "Invalid Number" as statuscall 
    And Input activity data2 form with "Invalid Number" as statusresult and "Invalid Number" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tidak Tersambung, Telepon Not Register (Data All Dev)  
    When User click data in follow up
    And Input activity data form with "Tidak Tersambung" as status and "Telepon Not Register" as statuscall 
    And Input activity data2 form with "Telepon Not Register" as statusresult and "Telepon Not Register" as reason
    And User click submit
    And User click konfirmasi YES

    
  Scenario: Input field wa (Data All Dev) 
  	When User input WA valid
  	And User click send wa
  	
  Scenario: Input field wa invalid (number phone wa input by alphabet) (Data All Dev)   	
  	And User input WA invalid
  	And User click send wa
    
  Scenario: Show page (Data All Dev)  
  	When User click show page in data all
  
    

    
 
    
 
 
 
    
  
  
 
 		