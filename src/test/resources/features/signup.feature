@SignUp
@Run
Feature: Sign Up page functionality
  Background:
    Given User clicked Sign up button in home page

#Auth Page UI Verification - sign up tab

  Scenario: Email ID input field presence
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Email ID input field with placeholder "you@example.com" should be visible

  Scenario: Password input field presence
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Password input field with masked entry should be visible

  Scenario: Confirm password input field presence
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Confirm password input field with masked entry should be visible

  Scenario: “Register” button presence and state
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Login button should be visible, enabled

  Scenario: “Login" link visibility
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Sign Up link should be visible and navigates to the Sign-Up page

  Scenario: Three input field
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then There should be exactly 3 input field

  Scenario: Radio button for show passwords
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Radio button for show passwords is present

  Scenario: Terms and condition presence
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Terms and conditions details should be present

  Scenario: Radio button for Terms and condition
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Radio button for Terms and condition is present


#Signup Functionality on HerBalance Auth Page
# valid credentials

  Scenario: Successful registration with valid credentials
    Given User is on the HerBalance auth page
    When User enters valid  details (Email ID, Password, and Confirm Password) and clicks the Register button from given "<ScenarioName>"
    Then User should be redirected to the onboarding step

    Examples:
      | ScenarioName                |
      | Valid Username and Password |

  # invalid credentials
  Scenario Outline: User enters invalid registration data
    Given User is on the HerBalance auth page.
    When User clicks Register button after entering the data from given "<ScenarioName>"
    Then An error message should be displayed for "<ScenarioName>"

    Examples:
      | ScenarioName                           |
      | Invalid details in email id            |
      | Entering password with length 5        |
      | Mismatch password                      |
      | Empty Credentials                      |
      | Without accepting terms and conditions |

  Scenario Outline: Verify password visibility toggle behavior
    Given User is on the HerBalance auth page
    When User enters "<password>" in "<field>" field and performs "<action>"
    Then The "<field>" field should display password as "<visibility>"

    Examples:
      | password | field            | action               | visibility |
      | User@123 | password         | click eye icon       | visible    |
      | User@123 | password         | click eye icon again | masked     |
      | User@123 | confirm password | click eye icon       | visible    |
      | User@123 | confirm password | click eye icon again | masked     |

  Scenario: Navigate to login page
    Given User is on the HerBalance auth page
    When user clicks on "Login"
    Then User should be redirected to the login tab
