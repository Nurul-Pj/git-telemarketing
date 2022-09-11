Feature: Login Developer

@tag1
  Scenario: Input invalid login
    When User go to Web Telemarketing
    And User enter username password invalid
    And User click button sign in
    And User invalid credentials
    Then Click oke
    
  Scenario: Input null login
    When User enter username password null
    And User click button sign in
    And User invalid credentials
    Then Click oke
 

  Scenario: User valid login
    When User enter username password valid
    And User click button sign in
    Then User valid credentials
    
  Scenario: User valid login ignore lettercase
    When User enter username password ignore lettercase
    And User click button sign in
    Then User valid credentials
    
  Scenario: User valid login uppercase
    When User enter username password uppercase
    And User click button sign in
    Then User valid credentials
    
  Scenario: Logout user
  	When User click profile and logout
  	Then User logout
  	
    