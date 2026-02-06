#Sign up Functionality on HerBalance Auth Page

Feature: Signup
Scenario: Successful registration with valid credentials
Given User is on the HerBalance auth page
When The user enters valid  details (Email ID, Password, and Confirm Password) and clicks the Register button
Then The user should be redirected to the onboarding step

Scenario: Registration attempt with invalid details in user name
Given User is on the HerBalance auth page
When The user clicks the Register button after entering invalid details in user name
Then An error message "Invalid email address" should be displayed

Scenario: 
