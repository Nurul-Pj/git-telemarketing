Feature: Login Developer

	Scenario: URL Invalid
		When User go to invalid Web Telemarketing
		
	Scenario: URL valid
		When User go to Web Telemarketing

	Scenario: Input username password invalid
    	And User enter username invalid
    	And click button sign in
    	And open appear greeting invalid
    	Then click button ok
  
  Scenario: Input username password null
  		When User go to Web Telemarketing
    	And User enter username null
    	And click button sign in
    	And open appear greeting invalid
    	Then click button ok
 
  Scenario: Input valid login ignore lettercase
  		When User go to Web Telemarketing
  		And User enter username and password valid login ignore lettercase
    	And click button sign in
    	And open appear greeting
    	Then click button ok
    	
    	When click profile
  		And open appear greeting logout
  		Then click button ya
  		
 	Scenario: Input valid login uppercase
  		When User go to Web Telemarketing
  		And User enter username and password valid login uppercase
    	And click button sign in
    	And open appear greeting
    	Then click button ok
    
	Scenario: Logout user
  		When click profile
  		And open appear greeting logout
  		Then click button ya

	Scenario: User valid login
  		When User go to Web Telemarketing
  		And User enter username and password valid login
    	And click button sign in
    	And open appear greeting
    	Then click button ok

  	
    