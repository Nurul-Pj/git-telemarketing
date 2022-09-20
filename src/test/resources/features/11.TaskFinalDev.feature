Feature: Task Final Dev

Scenario: Dashboard Task dev
		And User click task developer
  	When User click final dev
  	
  Scenario: User pindah halaman
  	When User click next page final dev
  	And User click previous page final dev
  	And User click last page final dev
  	And User click first page final dev
  	
  Scenario: User search nama final dev
  	When User click search final dev
  	Then User click button search final dev
  	
  	Scenario: User task show page final dev
  	When User click button show page final dev