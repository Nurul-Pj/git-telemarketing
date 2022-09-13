Feature: User Management

	Scenario: Dashboard user management
    	When click list user management
    	Then click menu user
    	
  Scenario: Search user
    	When input user
  
  Scenario: Add user
    	When click button add
    	And input field add user
    	Then save user
    
   Scenario: Reset Password
    	When click checkbox pada user
    	And click button reset pass
    	Then reset pass done
    	
   Scenario: Update Form
    	When click button edit
    	And edit form
    	Then click button update
    	
   Scenario: Update Password
    	When click button edit
    	And click button update password
    	And input new password
  
  
   Scenario: Remove User
    	When click button remove
    	Then remove user done
   