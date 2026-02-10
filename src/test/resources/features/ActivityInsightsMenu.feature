
Feature: Weight Tracking UI Verification/Weight Tracking functional verification


Background:
Given User is on the Her Balance Dashboard with the activity insights submenu expanded
When  User clicks on track weight

@ActivityInsightMenu
Scenario: Header text is displayed
	Then Should see  header text "Weight Tracking"

@ActivityInsightSubtitle
Scenario: Subtitle is displayed
	Then Should see "Free Plan - 7 Days Tracking"


@ActivityInsightDashboard
Scenario: Back to Dashboard is visible
	Then "Back to Dashboard" button should be visible

@ActivityInsight3Cards
Scenario: 3 Cards for Weight info
	Then 3 cards should be present	


@ActivityInsightCardtext
Scenario: Card text is displayed correctly
	Then Starting weight , Current weight and Goal weight card should be displayed


@ActivityInsightStartWeight
Scenario: Starting weight value is displayed
	Then Weight value should be mapped from the onboarding process
	

@ActivityInsightCurrentWeight
Scenario: Current weight value is displayed
	Then Current Weight should be x value
	

@ActivityInsightGoalWeight
Scenario: Goal weight value is displayed
	Then Goal weight should be displayed
	

@ActivityInsightProgress
Scenario: Progress section is visible
	Then Header should be "Progress overview"

@ActivityInsightProgressSubtext
Scenario: Subtext in progress section is displayed
	Then Sub text should be "Weight Loss Progress"

@ActivityInsightProgresCompletion%	
Scenario: Completion percentage is shown
	Then Completion percentage should be displayed

@ActivityInsightProgresbar
Scenario: Progress bar should be visible
	Then Progress bar should be visible
	
@ActivityInsightWeightLost
Scenario: Weight lost is displayed
	Then weight lost should be displayed
	
@ActivityInsightWeightRemaning	
Scenario: Remaining weight is displayed
	Then Remaining weight  should be displayed

@ActivityInsightGraph
Scenario: Graph section header is displayed
	Then Graph section header should be 'Weight Progression Over Time'
	
@ActivityInsightx-Axis
Scenario: X-axis labels are displayed
	Then Graph should be visible with x-axis showing days Day 1 to Day 7
	
@ActivityInsightx-YAxisi
Scenario: Y-axis labels are displayed
	Then Y-axis should display weight values in kg

@ActivityInsightxReferenceLine
Scenario: Reference line appears on the graph
	Then "Goal weight" reference line should be displayed

@ActivityInsightxlogSection
Scenario: Log section header
	Then "Log Today's Weight" should be visible

@ActivityInsightFieldSection
Scenario: Fields in log section
	Then "Weight (kg)" "BMI (Auto-calculated)","Note (Optional)" should be displayed
	 
@ActivityInsightxTrackDay
Scenario: Tracking details should be displayed
	Then Section should indicate the current tracking day (e.g., "Day 7 of 7")

@ActivityInsightxBMIAutoCalculate
Scenario: BMI auto-calculation after entering weight
	Then BMI" field should auto-calculate

@ActivityInsightLogWeight
Scenario: Log Weight button appears in default state
	Then Log weight button should be disabled

@ActivityInsightbuttondisabled
Scenario: Log Weight button enables after valid input
	Then Log Weight button should be Enabled
	
@ActivityInsightxlogginWeight
Scenario Outline: New tracking record appears after logging weight
	When User clicks Log Weight button after entering valid value in <UserWeight>
	Then Entered <UserWeight> should be added to the tracking record
	
	Examples:
      | UserWeight     |
      | "75.0"         |
      |	"23.0"		   |
 
@ActivityInsightxInvalidWeights     
Scenario Outline: Invalid weight entries show error handling
	When User enter value in <UserWeight> after clicking track weight in sub menu
	Then Error message " Enter valid weight " should be displayed
	

	Examples:
      | UserWeight      |
      | "-23.0"         |        
      | "-345"      	|
 
@ActivityInsightWPO    
Scenario Outline: Graph updates after weight entry
	When User clicks save button after entering valid <UserWeight> in weight
	Then "Weight Progression Over Time" graph should plot the new value for that day
	

	Examples:
      | UserWeight      |
      | "43.0"         	|        
      | "56.0"   		|
 
 @ActivityInsightLineChart     
 Scenario Outline: Line chart reflects recent changes
	When User clicks save button after entering valid <UserWeight> in weight
	Then Line chart should reflect weight trend changes
	

	Examples:
      | UserWeight      |
      | "43.0"         	|        
      | "56.0"   		|     
      
      
      
      



