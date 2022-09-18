Feature: Task New Agent


  Scenario: Halaman dashboard telemarketing
    And User click task
    And User click new
    Then Page new
    
  Scenario: Input field search (Task New)  
   	When User input search valid
   	
 	Scenario: Click search (Task New) 
   	And User click search
   	Then Page search
   	
   	And User click new
   
   
  Scenario: Show page (Task New)
  	When User click show page
  
  #Scenario: Next page (Task New) 
  #	When User click next page
  #	When User click previous page
  #	When User click last page
  #	When User click first page  
    
  Scenario: Click activity (Task New)	
    When User click data
    Then Page activity

  Scenario: Input status acitivity invalid (Task New)
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
    
 
 	Scenario: Dropdown Tersambung, Diangkat, Setuju (Task New)
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Setuju" as statusresult and "Berhasil Download" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Setuju" as statusresult and "Follow Up Download" as reason
    And User click submit
    And User click konfirmasi YES
    
    
 	Scenario: Dropdown Tersambung, Diangkat, Follow Up (Task New)  
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Telepon Kembali Lain Waktu" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Request Kirim Whatsapp Untuk Dipelajari" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Minta Nomer Manager/Pemilik" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Minta Pendapat Partner/Pasangan/Orangtua" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Follow Up" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Follow Up" as statusresult and "Follow Convert" as reason
    And User click submit
    And User click konfirmasi YES
    
    
    
  Scenario: Dropdown Tersambung, Diangkat, Tolak (Task New) 
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Bersedia Memberikan Kontak Owner" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Fokus Online" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Tertarik, Tidak Memberi Alasan" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Mengerti dan Tidak Bersedia Dijelaskan" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Mengenal Tokko/Bukukas" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Rating/Comment Buruk Tokko di Sosial Media" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Mau Dipersulit Menggunakan Tokko" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Terlalu Banyak Aplikasi atau Platform" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Memory Handphone Penuh" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Tidak Punya Android" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Lebih Nyaman Dengan Platform Selain Tokko" as reason
    And User click submit
    And User click konfirmasi YES
    
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tolak" as statusresult and "Usaha Sudah Tutup/Bangkrut" as reason
    And User click submit
    And User click konfirmasi YES
    
    
    
  Scenario: Dropdown Tersambung, Diangkat, Berhasil (Task New) 
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Berhasil" as statusresult and "Berhasil" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tersambung, Diangkat, Tidak Berhasil (Task New)  
    When User click data
    And Input activity data form with "Tersambung" as status and "Diangkat" as statuscall 
    And Input activity data2 form with "Tidak Berhasil" as statusresult and "Tidak Berhasil" as reason
    And User click submit
    And User click konfirmasi YES
    
    
    
  Scenario: Dropdown Tersambung, Salah Sambung (Task New)   
    When User click data
    And Input activity data form with "Tersambung" as status and "Salah Sambung" as statuscall 
    And Input activity data2 form with "Salah Sambung" as statusresult and "Salah Sambung" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tersambung, Tidak Diangkat (Task New)   
    When User click data
    And Input activity data form with "Tersambung" as status and "Tidak Diangkat" as statuscall 
    And Input activity data2 form with "Tidak Diangkat" as statusresult and "Tidak Diangkat" as reason
    And User click submit
    And User click konfirmasi YES
    
    
    
  Scenario: Dropdown Tidak Tersambung, Nomer Salah (Task New) 
    When User click data
    And Input activity data form with "Tidak Tersambung" as status and "Nomer Salah" as statuscall 
    And Input activity data2 form with "Nomer Salah" as statusresult and "Nomer Salah" as reason
    And User click submit
    And User click konfirmasi YES
    
    
  Scenario: Dropdown Tidak Tersambung, Mailbox (Task New)
    When User click data
    And Input activity data form with "Tidak Tersambung" as status and "Mailbox" as statuscall 
    And Input activity data2 form with "Mailbox" as statusresult and "Mailbox" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tidak Tersambung, Invalid Number (Task New)
    When User click data
    And Input activity data form with "Tidak Tersambung" as status and "Invalid Number" as statuscall 
    And Input activity data2 form with "Invalid Number" as statusresult and "Invalid Number" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Dropdown Tidak Tersambung, Telepon Not Register (Task New)
    When User click data
    And Input activity data form with "Tidak Tersambung" as status and "Telepon Not Register" as statuscall 
    And Input activity data2 form with "Telepon Not Register" as statusresult and "Telepon Not Register" as reason
    And User click submit
    And User click konfirmasi YES
    
  Scenario: Input field request phone (Task New)
  	When User click data
    And User click list phone
    When User click add phone
    And User input request phone
    And User click save phone
    Then Popup konfirmasi
    And User click konfirmasi Ok
    
  Scenario: Input field wa (Task New) 
  	When User input WA valid
  	And User click send wa
  	
  Scenario: Input field wa invalid (number phone wa input by alphabet) (Task New)	
  	And User input WA invalid
  	And User click send wa
  	And User click close acitivity
    

    
    
    
 
    

    
 
    
 
 
 
    
  
  
 
 		