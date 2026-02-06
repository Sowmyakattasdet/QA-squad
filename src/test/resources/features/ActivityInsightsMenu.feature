Feature: Weight Tracking UI Verification/Weight Tracking functional verification


Background:
Given User is on the Her Balance Dashboard with the activity insights submenu expanded
When  User clicks on track weight

Scenario: Header text is displayed
	Then Should see  header text "Weight Tracking"

Scenario: Subtitle is displayed
	Then Should see "Free Plan - 7 Days Tracking"

Scenario: Back to Dashboard is visible
	Then "Back to Dashboard" button should be visible
	
Scenario: 3 Cards for Weight info
	Then 3 cards should be present	
	
Scenario: Card text is displayed correctly
	Then Starting weight , Current weight and Goal weight card should be displayed

Scenario: Labels and weight values are aligned
	Then Label and weight values should be center-aligned
	
Scenario: Starting weight value is displayed
	Then Weight value should be mapped from the onboarding process
	
Scenario: Current weight value is displayed
	Then Current Weight should be x value
	
Scenario: Goal weight value is displayed
	Then Goal weight should be displayed
	
Scenario: Progress section is visible
	Then Header should be "Progress overview"
	
Scenario: Subtext in progress section is displayed
	Then Sub text should be "Weight Loss Progress"
	
Scenario: Completion percentage is shown
	Then Completion percentage should be displayed
	
Scenario: Progress bar should be visible
	Then Progress bar should be visible
	
Scenario: Weight lost is displayed
	Then weight lost should be displayed
	
Scenario: Remaining weight is displayed
	Then Remaining weight  should be displayed
	
Scenario: Graph section header is displayed
	Then Graph section header should be 'Weight Progression Over Time'
	
Scenario: X-axis labels are displayed
	Then Graph should be visible with x-axis showing days Day 1 to Day 7
	
Scenario: Y-axis labels are displayed
	Then Y-axis should display weight values in kg
	
Scenario: Reference line appears on the graph
	Then "Goal weight" reference line should be displayed
	
Scenario: Log section header
	Then "Log Today's Weight" should be visible
	
Scenario: Fields in log section
	Then "Weight (kg)" "BMI (Auto-calculated)","Note (Optional)" should be displayed
	 
	
Scenario: Tracking details should be displayed
	Then Section should indicate the current tracking day (e.g., "Day 7 of 7")
	
Scenario: BMI auto-calculation after entering weight
	Then BMI" field should auto-calculate
	
Scenario: Log Weight button appears in default state
	Then Log weight button should be disabled
	
Scenario: Log Weight button enables after valid input
	Then Log Weight button should be Enabled


Scenario Outline: New tracking record appears after logging weight
	When User clicks Log Weight button after entering valid value in <UserWeight>
	Then Entered <UserWeight> should be added to the tracking record
	
	Examples:
      | UserWeight     |
      | "75.0"         |
      |	"23.0"		   |
      
Scenario Outline: Invalid weight entries show error handling
	When User enter value in <UserWeight> after clicking track weight in sub menu
	Then Error message " Enter valid weight " should be displayed
	

	Examples:
      | UserWeight      |
      | "-23.0"         |        
      | "-345"      	|
     
Scenario Outline: Graph updates after weight entry
	When User clicks save button after entering valid <UserWeight> in weight
	Then "Weight Progression Over Time" graph should plot the new value for that day
	

	Examples:
      | UserWeight      |
      | "43.0"         	|        
      | "56.0"   		|
      
 Scenario Outline: Line chart reflects recent changes
	When User clicks save button after entering valid <UserWeight> in weight
	Then Line chart should reflect weight trend changes
	

	Examples:
      | UserWeight      |
      | "43.0"         	|        
      | "56.0"   		|     
      
      
      
      



