Feature: Edit Your Profile-Basic Information -UI verifications

Background: 
Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks Edit Profile button 
 
Scenario: Header text inside the section
Then "Basic Information" should be visible inside section on basic tab

Scenario: Sub text for header 
Then "Update your name and age" sub text should be visible on basic tab

Scenario: Name input field presence
Then Should display the user’s Name as entered during the onboarding process basic tab

Scenario: Age input field presence
Then Should display the user’s Age as entered during the onboarding process

Scenario: “Next: Body Metrics” button presence and state
Then “Next: Body Metrics” button should be visible, enabled