 Feature: Login Developer
 
 Scenario: Upload data invalid
  	When Pilih menu data
  	And User click upload data invalid
  	And User click choose file invalid
  	And User click button upload invalid
  
  Scenario: Upload data valid
  	And User click choose file valid
  	And User click button upload valid
  	And User click Simpan valid