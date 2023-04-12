#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@login @regression
Feature: Create app user management
	User should be able to intereact with the application on successful login
	
	@validlogin @smokeTest @loginTest
	Scenario: Successful login
		Given As a user, I am on the login page
		When I enter valid username and valid password
		And I clicked on login button
		Then I should be on user profile page
		
	@invalidlogin
	Scenario: Invalid username login
		Given As a user, I am on the login page1
		When I enter invalid username and valid password
		And I click on login button
		Then I should see an error message
		And I should not be logged in	