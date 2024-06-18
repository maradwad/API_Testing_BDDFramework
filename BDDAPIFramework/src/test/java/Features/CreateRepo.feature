@tag
Feature: Register 


  
  
 Scenario: Verify Create Repo API
 		Given Starting Test case "Verify Create Repo API"
    Given Create Repo payload name "<name>" and decription "<description>"
    When User calls Create API "/user/repos" post API call
    Then API call got successful with status code 201
    And Verify Repository "name" is "<name>"
    And Verify Repository "description" is "<description>"
		And Ending Testcase
		
Examples:
				| name    | description                   |
				| madhuri | This is data driven test Repo1|
				| APIBDD  | This is data driven test Repo2|
 
 
 Scenario: Verify Delete Repo API
  		Given Starting Test case "Verify delete Repo API"
    Given Create Repo payload name "<name>" and decription "<description>"
 		 When User calls delete API "/repos/maradwad/" delete call
     Then API call got successful with status code 204
     	And Ending Testcase
     	
 Examples:
				| name    | description                   |
				| madhuri | This is data driven test Repo1|
				| APIBDD  | This is data driven test Repo2|