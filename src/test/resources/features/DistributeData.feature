
Feature: Distribute Data

	Scenario: User valid login
  		When User go to Web Telemarketing
  		And User enter username and password valid login
    	And click button sign in
    	And open appear greeting
    	Then click button ok
    	
  Scenario: Dashboard data
    	When click list menu data
    	Then click menu distribute data
    	
  Scenario: Cek distribute data new, null
  		When click field status
  		And select field "New" as status
  		And click field buket data
  		And select field "null" as buket data
  		And click view
  		Then table data
  		
   Scenario: Cek distribute data berhasil, null
  		When click field status
  		And select field "Berhasil" as status
  		And click field buket data
  		And select field "null" as buket data
  		And click view
  		Then table data entries
  		
  Scenario: Cek distribute data follow up, null
  		When click field status
  		And select field "Follow up" as status
  		And click field buket data
  		And select field "null" as buket data
  		And click view
  		Then table data
  		
  Scenario: Cek distribute data salah sambung, null
  		When click field status
  		And select field "Salah sambung" as status
  		And click field buket data
  		And select field "null" as buket data
  		And click view
  		Then table data entries
  
  Scenario: Cek distribute data setuju, null
  		When click field status
  		And select field "Setuju" as status
  		And click field buket data
  		And select field "null" as buket data
  		And click view
  		Then table data
  		
  Scenario: Cek distribute data tidak berhasil, null
  		When click field status
  		And select field "Tidak berhasil" as status
  		And click field buket data
  		And select field "null" as buket data
  		And click view
  		Then table data entries
  		
  Scenario: Cek distribute data tolak, null
  		When click field status
  		And select field "Tolak" as status
  		And click field buket data
  		And select field "null" as buket data
  		And click view
  		Then table data entries
  		
   Scenario: Cek distribute data null, null
  		When click field status
  		And select field "null" as status
  		And click field buket data
  		And select field "null" as buket data
  		And click view
  		Then click oke
  		
  #Scenario: Cek distribute data new, agent
  #		When click field status
  #		And select field "New" as status
  #		And click field buket data
  #		And select field "Agent01" as buket data
  #		And click view
  #		Then table data
  #		
 #	Scenario: Cek distribute data berhasil, agent
  #		When click field status
  #		And select field "Berhasil" as status
  #		And click field buket data
  #		And select field "Agent01" as buket data
  #		And click view
  #		Then table data
  #		
  #Scenario: Cek distribute data follow up, agent
  #		When click field status
  #		And select field "Follow up" as status
  #		And click field buket data
  #		And select field "Agent01" as buket data
  #		And click view
  #		Then table data
  #		
  #Scenario: Cek distribute data salah sambung, agent
  #		When click field status
  #		And select field "Salah sambung" as status
  #		And click field buket data
  #		And select field "Agent01" as buket data
  #		And click view
  #		Then table data
  #		
  #Scenario: Cek distribute data setuju, agent
  #		When click field status
  #		And select field "Setuju" as status
  #		And click field buket data
  #		And select field "Agent01" as buket data
  #		And click view
  #		Then table data
  #
  #Scenario: Cek distribute data tidak berhasil, agent
  #		When click field status
  #		And select field "Tidak berhasil" as status
  #		And click field buket data
  #		And select field "Agent01" as buket data
  #		And click view
  #		Then table data entries
  #		
  #Scenario: Cek distribute data tidak berhasil, agent
  #		When click field status
  #		And select field "Tolak" as status
  #		And click field buket data
  #		And select field "Agent01" as buket data
  #		And click view
  #		Then table data
  
  
  Scenario: Distribusi agent
  When select field "agent01" as distribusi
  And input jumlah agent
  And select field "new" as status distribusi
  Then click button distribusi
  
   
