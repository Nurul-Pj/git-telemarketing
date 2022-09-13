Feature: Task New Agent


  Scenario: Halaman dashboard telemarketing
  	When User go to Web Telemarketing
  	And User enter username ignore letter case and password valid
    And User click button sign in
    And User click button ok
    And User click task
    And User click new
    
  Scenario: Input field search  
   	When User search valid
   	
  Scenario: Click activity 	
    When User click data
    
    
 	Scenario: Mengisi data detail
 		When User input data invalid 
 		And User click submit
    When User input data valid
    And User click submit
    
    
    
  Scenario: Input field request phone
    And User click list phone
    When User click add phone
    And User input request phone
    And User click save phone
    And User click konfirmasi Ok
    
  Scenario: Input field wa valid
  	When User input WA valid
  	
  Scenario: Input field wa 
  	When User input WA valid
  	And User input WA invalid
    
  
  
 
 		