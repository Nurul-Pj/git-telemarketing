Feature: Report Activity

  @tag1
  Scenario: Report Activity
    When Pilih menu report2
  	And User click report activity
  	And User click button agent
  	And User choose agent
  	And User choose date act
  	And User click button view act
  	And User click show page
  #	And User click button export act
  	Then User click profile