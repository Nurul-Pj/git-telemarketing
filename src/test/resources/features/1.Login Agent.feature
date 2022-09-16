Feature: Login Agent


	Scenario: URL Salah
	When User go to Web Telemarketing invalid
	
	Scenario: URL Benar
	When User go to Web Telemarketing 

  Scenario: Input invalid username and password 
    And User enter username invalid
    And User click button sign in
    Then User invalid credentials
    
    And User enter password invalid
    And User click button sign in
    Then User invalid credentials
 
    
 Scenario: Input null username and password 
    And User enter username null
    And User click button sign in
    Then User invalid credentials
    
    And User enter password null
    And User click button sign in
    Then User invalid credentials
  
 #And User enter "agent1" as username and "1" as password

  Scenario: Input valid username and password 
  	And User enter username and password valid
    And User click button sign in
    Then User valid credentials 
    And User click button ok
    And User click profile
    
    
  Scenario: Input valid username dengan ignore lettercase
   	And User enter username ignore letter case and password valid
    And User click button sign in
    Then User valid credentials
    And User click button ok
    
  Scenario: Logout from profile
    And User click profile
    
    
  Scenario: Input valid username dengan uppercase  
    And User enter username uppercase and password valid
    And User click button sign in
    Then User valid credentials
    And User click button ok
   
  
    