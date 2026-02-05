
@loginui
Feature: Auth Page UI Verification

  @loginui01
  Scenario: HerBalance logo visibility
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then HerBalance logo should be visible on the top-left corner
    
 @loginui02
  Scenario: Login and Sign Up tabs are displayed
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then "Login" tabs should be visible
    And "Sign Up" tabs should be visible
    
  @loginui03
  Scenario: Default selected tab is “Login”
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then “Login” tab should be active by default
    
    @loginui04
Scenario: User can log in with valid credentials
  Given User is on the HerBalance launch page
  When User clicks log in button
  And User logs in with valid credentials
  Then User should be redirected to the dashboard

@loginui05
Scenario: Email ID input field presence
  Given User is on the HerBalance launch page
  When User clicks log in button
  Then Email ID input field with placeholder "you@example.com" should be visible

@loginui06
Scenario: Password input field presence
  Given User is on the HerBalance launch page
  When User clicks log in button
  Then Password input field with masked entry should be visible


  @loginui07
  Scenario: “Show Password”  presence
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then “Show password” should be visible 

  @loginui08
  Scenario: “Login” button presence and state
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then “Login” button should be visible, enabled

    @loginui09
  Scenario: “Forgot password?” link presence
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then “Forgot password?” link should be visible
    
    @loginui10
  Scenario: “Sign Up” link visibility
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then “Sign Up” link should be visible and navigates to the Sign-Up page
    
    @loginui11
  Scenario: Right panel content (Transform Your Weight Loss Journey)
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then The right section should display “Cycle-Synced Plans”, “Blood Work Analysis”, and “Personalized Dashboard” content
    
    @loginui12
  Scenario: Testimonial section presence
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then A testimonial with text and name (e.g., “Sarah, 34”) should be displayed
    
    @loginui13
  Scenario: total number of tabs
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then There should be exactly 2 tabs — “Login” and “Sign Up”
    
    @loginui14
  Scenario: input field alignment and spacing
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then Email ID fields should be properly aligned vertically with equal spacing
    And Password fields should be properly aligned vertically with equal spacing
    
    @loginui15
  Scenario: Two input field 
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then There should be exactly 2 input field
    
    @loginui1
  Scenario: Radio button for show password
    Given User is on the HerBalance launch page
    When User clicks log in button
    Then Radio button for show password
    
    
    
    