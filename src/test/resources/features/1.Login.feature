Feature: Login Developer


@tag1
Scenario: User username password invalid
  
  	When User go to Web Telemarketing
    And User enter username invalid
    Then User click button sign in
    
    And User enter password invalid
    Then User click button sign in
    
    And User enter username null
    Then User click button sign in
    
    And User enter password null
    Then User click button sign in

 
  Scenario: User valid login
  
  	When User enter username and password valid
    Then User click button sign in
    And User click button ok
    Then User click profile

   	When User enter username ignore letter case and password valid
    Then User click button sign in
    And User click button ok
    And User click profile
    
    When User enter username uppercase and password valid
    Then User click button sign in
    And User click button ok

  	
    