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
  
  
  Scenario: User valid login
    When User enter username password valid
    And User click button sign in
    And User click button ok
    And User click profile