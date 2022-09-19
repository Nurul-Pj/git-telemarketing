Feature: Task Final Dev

Scenario: Dashboard Task
  	When User click final
  	
  Scenario: User pindah halaman
  	When User click next page final
  	And User click previous page final
  	And User click last page final
  	And User click first page final
  	
  Scenario: User search nama final
  	When User click search final
  	Then User click button search final
  	
  	Scenario: User task show page final
  	When User click button show page final