Feature: Report Agree

  @tag1
  Scenario: Dashboard Report
    When Pilih menu report1
  	And User click report agree
  	
  Scenario: Choose date agree invalid
  	When User choose date agree invalid 
  	
  Scenario: Choose date agree valid
  	When User choose date agree
  	Then User click button view agree
  	
  Scenario: Pindah halaman agree
  	When User click next page agree
  	And User click previous page agree
  	And User click last page agree
  	And User click first page agree
  	
  Scenario: Show page agree
  	When User click button show page agree
  	
  Scenario: Export agree	
  	When User click button export agree