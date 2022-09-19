Feature: Task Agree Dev

Scenario: Dashboard Task
  	When Pilih menu task
  	And User click agree
  	
 Scenario: Search data agree
  	When User click search
  	And User click button search
  	
 Scenario: Isi field link
  	When User click file
  	And User isi link
  	And User click simpan
  	Then User click button oke
    