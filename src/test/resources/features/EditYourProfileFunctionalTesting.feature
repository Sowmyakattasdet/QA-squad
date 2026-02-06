
Feature: Edit Your Profile Functionality Basic Information, Body Metric and Preference and Health 

Background: 
Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks Edit Profile button 

Scenario: Navigation of Body Metric tab
When User clicks on Body Metric tab
Then User should see Body Metric Section

Scenario: Navigation of Preferences & Health tab
When User clicks on Preferences & Health tab
Then User should see  Preferences & Health Section


Scenario: Navigation of “Next: Body Metrics” button 
When User clicks on Next: Body Metrics Button on basic tab
Then User should see "Body Metrics" Section

Scenario:Navigation of “Next: Preferences” button 
When User clicks on Body Metric tab
And User clicks on “Next: Preferences” button for preference tab
Then User should see "Preferences & Health" tab section 

Scenario: Navigation of “Back” button from   Body Metric section
When User clicks on Body Metric tab
And User clicks on Back Button on Body Metric section
Then User should see "Basic Information" section for basic tab

Scenario: Navigation of “Back” button from Preferences & Health section
When User clicks on Preferences & Health tab
And User clicks on Back Button on  Preferences & Health section
Then User should see "Body Metric" info section for Body metric tab

@editYourProfileBasicInfo
Scenario: Message after clicking  Save Profile Button  
When User clicks on Preferences & Health tab
And User clicks on Save Profile on  Preferences & Health section after editing values in any field
Then User should see success message "Your profile information has been successfully updated."

Scenario: Navigation of "Add Medication" Button
When User clicks on Preferences & Health tab
And User clicks on Add Medication Button
Then User should see "Pop Up Enter Medication name" message


Scenario: Header text
When User clicks on Preferences & Health tab
And User clicks on Add Medication Button
Then Enter Medication name should be visible

Scenario: Enter Medication name Input field presence
When User clicks on Preferences & Health tab
And User clicks on Add Medication Button
Then Should display empty input field for entering medication name

#Scenario: Button text
#Given User is on the Preferences and Health section
#When User clicks on Add Medication Button
#Then "Ok" and "Cancel" buttons should displayed

#Scenario: Total no of Buttons
#Given User is on the Preferences and Health section
#When User clicks on Add Medication Button
# There should be exactly 2 Buttons --“Ok” and  "Cancel "

Scenario: Cancel the Medication pop up window
When User clicks on Preferences & Health tab
And User clicks on Ok button after adding medication
Then User should navigate back to Preferences & Health Section page

