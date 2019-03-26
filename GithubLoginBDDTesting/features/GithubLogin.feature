
@execute
Feature: I want to test Github login feature
  
  Scenario: test for invalid username
    Given user tries to enter github.com
    When when a user tries to login with invalid username
    Then 'Invalid Username or Password' message is displayed for username
    

  Scenario: test for invalid password
    Given user tries to enter github.com
    When when a user tries to login with invalid password
    Then 'Invalid Username or Password' message is displayed for password

	 Scenario: test for valid password and username
    Given user tries to enter github.com
    When when a user tries to login with valid username and password
    Then user is able to login to github account