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
    
   Scenario: Upload data invalid
  	When Pilih menu data
  	And User click upload data invalid
  	And User click choose file invalid
  	And User click button upload invalid
  
  Scenario: Upload data valid
  	And User click choose file valid
  	And User click button upload valid
  	Then User click Simpan valid  
    
  Scenario: Logout user
  	When User click profile and logout
  	Then User logout
  	
    