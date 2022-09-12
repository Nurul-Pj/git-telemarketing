Feature: Login Agent


  Scenario: User username password invalid
  
  	When User go to Web Telemarketing
  	
    And User enter username invalid
    And User click button sign in
    
    And User enter password invalid
    And User click button sign in
    
    And User enter username null
    And User click button sign in
    
    And User enter password null
    And User click button sign in
  
  #And User enter "agent1" as username and "1" as password
 
  Scenario: User valid login
  
  	And User enter username and password valid
    And User click button sign in
    And User click button ok
    And User click profile
    
   	And User enter username ignore letter case and password valid
    And User click button sign in
    And User click button ok
    And User click profile
    
    And User enter username uppercase and password valid
    And User click button sign in
    And User click button ok
    And User click profile