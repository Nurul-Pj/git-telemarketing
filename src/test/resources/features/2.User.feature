Feature: User Management

	Scenario: User valid login
  		When User go to Web Telemarketing
  		And User enter username and password valid login
    	And click button sign in
    	And open appear greeting
    	Then click button ok

	Scenario: Dashboard user management
    	When click list user management
    	Then click menu user
 
  
  Scenario: Add user supervisior
    	When click button add
    	And input field add user and select "supervisior" as previlages and "developer" as supervisior
    	And save user
    #	Then added table
   
  Scenario: Search user
    	When input user
    	
    	When click button remove
    	Then remove user done
    	
  Scenario: Add user agent
    	When click button add
    	And input field add user and select "agent" as previlages and "developer" as supervisior
    	And save user
    	
    	When click button remove
    	Then remove user done
    
   Scenario: Add user admin
    	When click button add
    	And input field add user and select "admin" as previlages and "developer" as supervisior
    	And save user
  
  Scenario: Remove User
    	When click button remove
    	Then remove user done
  
   Scenario: Add user null
    	When click button add
    	And input field add user and select "null" as previlages and "null" as supervisior
    	And save user
   
   Scenario: Reset Password
    	When click checkbox pada user
    	And click button reset pass
    	Then reset pass done
   
   Scenario: Update Password
    	When click button edit
    	And click button update password
    	And input new password
    
    Scenario: Update form
    	When click button edit
    	And edit form
    	Then click button update
    
    	
   