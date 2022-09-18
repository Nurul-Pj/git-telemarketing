Feature: Task New Agent


  Scenario: Halaman dashboard telemarketing
    And User click task
    And User click final
    Then Page final
    
  Scenario: Input field search (Final)  
   	When User input search in final valid
   	
 	Scenario: Click search (Final)
   	And User click search in final
   	Then Page search in final
   	
   	And User click final
   
  Scenario: Next page (Final)
  	When User click next page in final
  	When User click previous page in final
  	When User click last page in final
  	When User click first page in final
    
  Scenario: Click activity (Final)	
    When User click data in final
    
  Scenario: Show page (Final)
  	When User click show page in final
    
    
  
    

    
 
    
 
 
 
    
  
  
 
 		