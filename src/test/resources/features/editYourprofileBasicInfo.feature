Feature: Edit Your Profile-Basic Information -UI verifications

Background: 
Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks Edit Profile button 
 
Scenario: Header text inside the section
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded 
#When User clicks Basic Information tab
Then "Basic Information" should be visible inside section on basic tab

Scenario: Sub text for header 
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Basic Information tab
Then "Update your name and age" sub text should be visible on basic tab

Scenario: Name input field presence
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Basic Information tab
Then Should display the user’s Name as entered during the onboarding process basic tab

@editYourProfileBasicInfo
Scenario: Age input field presence
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Basic Information tab
Then Should display the user’s Age as entered during the onboarding process

#Scenario: Input field alignment and spacing
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Basic Information tab
#Then Name and Age fields should be properly aligned vertically with equal spacing

Scenario: “Next: Body Metrics” button presence and state
#Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
#When User clicks Next:Body Metrics Button
Then “Next: Body Metrics” button should be visible, enabled