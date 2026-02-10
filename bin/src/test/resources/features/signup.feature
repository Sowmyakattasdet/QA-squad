@SignUp

Feature: Sign Up page functionality

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

  Scenario: "Show Passwords" presence
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then “Show password” should be visible

  Scenario: “Register” button presence and state
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then “Login” button should be visible, enabled

  Scenario: “Login" link visibility
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then “Sign Up” link should be visible and navigates to the Sign-Up page

  Scenario: Input field alignment and spacing
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then Email ID , Password , Confirm Password fields should be properly aligned vertically with equal spacing

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

  Scenario: Background and theme consistency
    Given User is on the HerBalance launch page
    When User clicks sign up button
    Then The background gradient (light purple) and fonts should match HerBalance theme



















