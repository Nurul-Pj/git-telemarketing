Feature: Edit Data

	Scenario: User valid login
  		When User go to Web Telemarketing
  		And User enter username and password valid login
    	And click button sign in
    	And open appear greeting
    	Then click button ok

	Scenario: Dashboard Data
    	When click list data
    	Then click menu edit data
  
  Scenario: Search user
    	When input user edit data
    	Then table open
    	
  Scenario: table click
  		When table click
  		Then open form edit data
  		
  Scenario: Update data detail
  		When choose field "agent01" as agents
  		
  Scenario: Update status activity
  		When choose field "wa" as remarks
  
  Scenario: Update data
  		When click update
  		And open popup informasion
  		And click oke
  		Then validasi update
  		
  Scenario: Show page data
  		When show page