
Feature: Distribute Data
    	
  Scenario: Dashboard data
    	When click list menu data
    	Then click menu distribute data
    	
  Scenario: Status New Null
  		And click button view
    	Then validasi table
    	
  Scenario: Status Berhasil Null
  		When click list status
  		And choose field status berhasil
  		And click list buket data
  		And click button view
  		Then validate no entries
  		
  Scenario: Status Follow Up Null
  		When click list status
  		And choose field status follow up
  		And click list buket data
  		And click button view
  		Then validasi table
  		
  Scenario: Status Salah Sambung Null
  		When click list status
  		And choose field status salah sambung
  		And click list buket data
  		And click button view
  		Then validate no entries
  		
   Scenario: Status Setuju Null
  		When click list status
  		And choose field status setuju
  		And click list buket data
  		And click button view
  		Then validasi table
  		
  Scenario: Status Tidak Berhasil Null
  		When click list status
  		And choose field status tidak berhasil
  		And click list buket data
  		And click button view
  		Then validate no entries
  		
  Scenario: Status Tolak Null
  		When click list status
  		And choose field status tolak
  		And click list buket data
  		And click button view
  		Then validate no entries
  		
  
  Scenario: Status New Agent
  		When click list status
  		And choose field status new
  		And click list buket data
  		And choose field buket data agent01
  		And click button view
  		Then validasi table
  		
  Scenario: Distribusi form developer input
  		When choose distribusi ke developer
  		And input jumlah agent
  		And select status
  		And click button distribusi
  		Then click ya
 

  Scenario: Distribusi form agent input
  		When choose distribusi ke agent
  		And input jumlah agent
  		And select status
  		And click button distribusi
  		Then click ya
  			
  Scenario: Distribusi form null
  		When choose distribusi ke null
  		And input jumlah agent null
  		And select status
  		And click button distribusi
  		Then click oke
  		
    	
 