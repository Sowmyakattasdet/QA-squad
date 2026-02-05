@Launch @Run
Feature: Launch Page Functionality

  # Launch Page in Her Balance - Non functional
  Scenario: Cycle phases information is displayed
    Given User is on the browser
    When User enters app url
    Then Display cards for 'Menstrual Phase', 'Follicular Phase', 'Ovulation Phase', and 'Luteal Phase'

  Scenario: Cycle tracking app information is visible
    Given User is on the browser
    When User enters app url
    Then Details about the 'Cycle Tracking App' and its features

  Scenario: Login buttons are visible
    Given User is on the browser
    When User enters app url
    Then Login button should be visible

  Scenario: Sign up buttons are visible
    Given User is on the browser
    When User enters app url
    Then Sign button should be visible

  Scenario: Images in Sync your weight loss journey section are displayed
    Given User is on the browser
    When User enters app url
    Then Images in Sync' should be displayed

  Scenario: Informational text under Empower weight loss section
    Given User is on the browser
    When User enters app url
    Then Display information about hormonal shifts and metabolism during the menstrual cycle

  Scenario: Layout and colors are loaded correctly
    Given User is on the browser
    When User enters app url
    Then User should see a light purple background and readable text content

  Scenario: Get started now button are visible
    Given User is on the browser
    When User enters app url
    Then Display a 'Get Started Now' button in the footer section

  Scenario: Start Your Personalized Journey is visible
    Given User is on the browser
    When User enters app url
    Then Start Your Personalized' button should be displayed

  # Launch Page in Her Balance -   functional
  Scenario: Login button is clickable
    Given User is in her balance home page
    When User clicks log in button
    Then User should be navigated to auth page login tab

  Scenario: Sign up button is clickable
    Given User is in her balance home page
    When User clicks sign up button
    Then User should be navigated to auth page sign up tab

  Scenario: Get started now button are Clickable
    Given User is in her balance home page
    When User clicks Get Started button
    Then User should be navigated to auth page login tab

  Scenario: Start Your Personalized Journey is clickable
    Given User is in her balance home page
    When User clicks Start your personalized journey button
    Then User should be navigated to auth page login tab
