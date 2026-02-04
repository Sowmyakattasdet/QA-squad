
Feature: Feature Edit Your Profile-Body Metrics -UI verifications


Background:
Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User click profile button to edit profile
When User clicks Edit Profile button 

Scenario: Weight input field presence
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks Body Metrics Tab
Then Should display the user’s Weight as entered during the onboarding process.

Scenario: Height input field presence
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks Body Metrics Tab
Then Should display the user’s Height as entered during the onboarding process.

#Scenario: Dropdown for weight measurement presence and state
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Body Metrics Tab
#Then "kg" or "lb" unit values in dropdown should be visible, enabled on body metric page

#Scenario: input field alignment and spacing
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Body Metrics Tab
#Then Weight and Height fields should be properly aligned vertically with equal spacing

#Scenario: BMI Calculation section is visible
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Body Metrics Tab
#Then BMI Calculation Number should be displayed with a gradient slider and labels

Scenario: BMI Category section is visible
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Body Metrics Tab
#Then BMI Category section should present with BMI Category
 
#Scenario: BMI Category note is visible
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Body Metrics Tab 
#Then BMI Category note should be visible

#Scenario: gradient color representation
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Body Metrics Tab 
#Then slider should display a continuous gradient from blue → yellow → orange → red, representing increasing BMI values

Scenario: "Back" Button presence and state
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Body Metrics Tab
Then "Back" Button should be visible, enabled


 