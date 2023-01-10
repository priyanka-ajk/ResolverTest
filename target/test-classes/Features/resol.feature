@TC 
Feature: Resolver Test

@TCTest1
Scenario: Test Email and Password

Given user is on sample login page
When email, password and login button is present  
Then user enters username and password 
		| username | password|
		| priyankavijaykumar555@gmail.com | Cheryl@123 |
Then user clicks on signin button 

@TCTest2
Scenario: Test List Items

	Given user is on sample login page now
	Then user checks there are three values in the listgroup
	Then user checks second list item's value
	And user checks second item's badge value
	
@TCTest3
Scenario: Test Options

	Given user is on the sample login page 
	Then user checks default selected value
	And user selects from the list
	
@TCTest4
Scenario: Test Buttons

	Given user is on login page 
	Then user checks if button is enabled
	Then user checks in button is disabled
	
@TCTest5
Scenario: Test messages 

	Given user is on the login page 
	Then user waits for the button to be displayed and clicks on it
	Then user checks if the message is displayed
	Then user checks if the button is now displayed
	
@TCTest6
Scenario: Test cells 

	Given user is on the login page now
	Then user finds the value of any cell on the grid
	Then user finds cell at coordinates
	Then user check the value of the cell