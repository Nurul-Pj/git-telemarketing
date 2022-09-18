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
  	When User click next page
  	And User click previous page
  	And User click last page
  	And User click first page
  	
  Scenario: Show page agree
  	When User click button show page agree
  	
  Scenario: Export agree	
  	When User click button export agree