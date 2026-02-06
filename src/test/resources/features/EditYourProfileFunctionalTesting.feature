@editYourProfileFunctionalTests
Feature: Edit Your Profile Functionality Basic Information, Body Metric and Preference and Health 

Background: 
Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks Edit Profile button
 
@editYourProfileFunctionalTests1
Scenario: Header text inside the section
Then "Basic Information" should be visible inside section on basic tab

@editourProfileFunctionalTests2
Scenario: Navigation of Body Metric tab
When User clicks on Body Metric tab
Then User should see Body Metric Section

@editYourProfileFunctionalTests3
Scenario: Navigation of Preferences & Health tab
When User clicks on Preferences & Health tab
Then User should see  Preferences & Health Section

@editYourProfileFunctionalTests4
Scenario: Navigation of “Next: Body Metrics” button 
When User clicks on Next: Body Metrics Button on basic tab
Then User should see "Body Metrics" Section

@editYourProfileFunctionalTests5
Scenario:Navigation of “Next: Preferences” button 
When User clicks on Body Metric tab
And User clicks on “Next: Preferences” button for preference tab
Then User should see "Preferences & Health" tab section 

@editYourProfileFunctionalTests6
Scenario: Navigation of “Back” button from   Body Metric section
When User clicks on Body Metric tab
And User clicks on Back Button on Body Metric section
Then User should see "Basic Information" section for basic tab

@editYourProfileFunctionalTests7
Scenario: Navigation of “Back” button from Preferences & Health section
When User clicks on Preferences & Health tab
And User clicks on Back Button on  Preferences & Health section
Then User should see "Body Metric" info section for Body metric tab

@editYourProfileFunctionalTests8
Scenario: Message after clicking  Save Profile Button  
When User clicks on Preferences & Health tab
And User clicks on Save Profile on  Preferences & Health section after editing values in any field
Then User should see success message "Your profile information has been successfully updated."

@editYourProfileFunctionalTests9
Scenario: Navigation of "Add Medication" Button
When User clicks on Preferences & Health tab
And User clicks on Add Medication Button
Then User should see "Pop Up Enter Medication name" message

@editYourProfileFunctionalTests10
Scenario: Header text
When User clicks on Preferences & Health tab
And User clicks on Add Medication Button
Then Enter Medication name should be visible

@editYourProfileFunctionalTests11
Scenario: Enter Medication name Input field presence
When User clicks on Preferences & Health tab
And User clicks on Add Medication Button
Then Should display empty input field for entering medication name

@editYourProfileFunctionalTests12
Scenario: Cancel the Medication pop up window
When User clicks on Preferences & Health tab
And User clicks on Ok button after adding medication
Then User should navigate back to Preferences & Health Section page

