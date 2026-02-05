
Feature: Feature Edit Your Profile-Body Metrics -UI verifications


Background:
Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks Edit Profile button 


Scenario: Weight input field presence
When User clicks Body Metrics Tab
Then Should display the user’s Weight as entered during the onboarding process.

Scenario: Height input field presence
When User clicks Body Metrics Tab
Then Should display the user’s Height as entered during the onboarding process.

Scenario: BMI Category section is visible
When User clicks Body Metrics Tab
Then BMI Category section should present with BMI Category
 
Scenario: BMI Category note is visible
When User clicks Body Metrics Tab 
Then BMI Category note should be visible

Scenario: "Back" Button presence and state
When User clicks Body Metrics Tab
Then "Back" Button should be visible, enabled