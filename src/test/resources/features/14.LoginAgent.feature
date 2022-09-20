Feature: Login Agent

	Scenario: Input username password invalid agent
    	And User enter username invalid agent
    	And click button sign in
    	And open appear greeting invalid
    	Then click button ok
  
  Scenario: Input username password null agent
  		When User go to Web Telemarketing
    	And User enter username null agent
    	And click button sign in
    	And open appear greeting invalid
    	Then click button ok
 
  Scenario: Input valid login ignore lettercase agent
  		When User go to Web Telemarketing
  		And User enter username and password valid login ignore lettercase agent
    	And click button sign in
    	And open appear greeting
    	Then click button ok
    	
    	When click profile agent
  		And open appear greeting logout
  		Then click button ya
  		
 	Scenario: Input valid login uppercase agent
  		When User go to Web Telemarketing
  		And User enter username and password valid login uppercase agent
    	And click button sign in
    	And open appear greeting
    	Then click button ok
    
	Scenario: Logout user
  		When click profile agent
  		And open appear greeting logout
  		Then click button ya

	Scenario: User valid login agent
  		When User go to Web Telemarketing
  		And User enter username and password valid login agent
    	And click button sign in
    	And open appear greeting
    	Then click button ok

  	
    