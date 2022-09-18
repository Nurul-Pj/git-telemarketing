Feature: Report Activity

  @tag1
  Scenario: Dashboard Report
  	When User click report activity
  	
  Scenario: Choose agent
  	When User click button agent
  	And User choose agent
  	
  Scenario: Choose date
  	When User choose date act
  	And User click button view act
  	
  Scenario: Show page activity
  	When User click show page act
  	
  Scenario: Export activity
  	When User click button export act
  	
  Scenario: Logout
  	Then User click profile