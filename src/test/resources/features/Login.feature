Feature: Login Developer

  Scenario: User invalid login
    When User go to Web Telemarketing
    And User enter username password invalid
    And User click button sign in
    Then User invalid credentials
  
  Scenario: User valid login
    When User enter username password valid
    And User click button login sign in valid
    Then User valid credentials