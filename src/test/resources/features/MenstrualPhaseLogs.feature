Feature: Testing Menstrual Phase Log

Background: User clicks Activity Insights button after logged in
Given User is on the Her Balance Dashboard with the Activity Insights submenu expanded
When User Clicks on Menstrual Phase Logs


#-----------------  MenstrualCycleTracker - UI Verification ------------------------------

# @MenstrualCycleTracker 

@mctUi1
Scenario: Five Sections are Visible
Then 5 sections should be visible(Current Cycle Status, Upcoming Phases, Recommended Activities, Nutrtion Tips, Next Period)  

