Feature: Task Agree Dev

Scenario: Dashboard Task
  	When Pilih menu task
  	And User click agree
  	
 Scenario: Search data agree
  	When User click search agree
  	And User click button search agree
  	
 Scenario: Isi field link
  	When User click file agree
  	And User isi link agree
  	And User click simpan agree
  	Then User click button oke agree
    