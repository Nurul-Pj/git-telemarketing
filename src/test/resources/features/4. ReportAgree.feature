Feature: Report Agree

  @tag1
  Scenario: Report Agree
    When Pilih menu report1
  	And User click report agree
  	And User choose date agree invalid
  	And User choose date agree
  #	And User click button view agree
  	And User click button show page agree
  	And User click button export agree
  	Then User click profile