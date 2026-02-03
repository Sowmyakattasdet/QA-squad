@SignUpFunctional
Feature: Signup Functionality on HerBalance Auth Page

  Background:
    Given User clicked Sign up button in home page
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
    Given User is on the HerBalance auth page
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
