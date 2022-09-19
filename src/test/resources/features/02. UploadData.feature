 Feature: Upload Data Developer
    
 Scenario: Dashboard Data
  	When Pilih menu data
  	And User click upload data invalid
  	
  Scenario: Choose data invalid
  	When User click choose file invalid
  	
  Scenario: Upload data button invalid
  	When User click button upload invalid
  
  Scenario: Choose data valid
  	When User click choose file valid
  	And User click button upload valid
  	Then User click Simpan valid