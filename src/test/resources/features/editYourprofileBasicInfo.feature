@editYourProfileBasicInfo
Feature: Edit Your Profile-Basic Information -UI verifications

Background: 
Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks Edit Profile button
 
@editYourProfileBasicInfo1
Scenario: Header text inside the section
Then "Basic Information" should be visible inside section on basic tab

@editYourProfileBasicInfo2
Scenario: Sub text for header 
Then "Update your name and age" sub text should be visible on basic tab

@editYourProfileBasicInfo3
Scenario: Name input field presence
Then Should display the user’s Name as entered during the onboarding process basic tab

@editYourProfileBasicInfo4
Scenario: Age input field presence
Then Should display the user’s Age as entered during the onboarding process

@editYourProfileBasicInfo5
Scenario: “Next: Body Metrics” button presence and state
Then “Next: Body Metrics” button should be visible, enabled
