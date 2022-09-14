Feature: Approve Phone

	Scenario: Dashboard user management
    	When click list user management
    	Then click menu approve phone
    		
   Scenario: show page
  	When click show page		
    		
  Scenario: search name user
  	When: input user name
  	
  Scenario: Approve Phone
    	When click phone number
    	And click button approve phone
    	Then phone has successfully approve
  
  Scenario: Reject Phone
    	When click phone number
    	And click button reject phone
    	Then phone has successfully reject