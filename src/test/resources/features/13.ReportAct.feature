Feature: Report Activity

  @tag1
  Scenario: Dashboard Report
  	When User click report activity
  	
  Scenario: Choose activity
  	When User click button activity
  	And User choose activity
  	
  Scenario: Choose date
  	When User choose date activity
  	And User click button view activity
  	
  Scenario: Show page activity
  	When User click show page activity
  	
  Scenario: Export activity
  	When User click button export activity
  	
  Scenario: Logout
  	Then User click profile activity
  	When User go to Web Telemarketing