Feature: Update Cycle Information Functionality

Background: User clicks Update Cycle Information button
Given User is on Update Cycle Information popup

@UpdateCycleInformation 	
Scenario Outline: Enabled dates in the calendar can be selected			
When User selects the date from the calendar 	
Then The date selected should be highlighted


@up1
Scenario: Previous month navigation in calendar			
When User clicks the “<” icon on the calendar	
Then Calendar should shift to the previuos month		

@upif2		
Scenario: Next month navigation in calendar			
When User clicks the ">" right icon on the calendar	
Then Calendar should shift to the next month			

@upif3
Scenario: Update Cycle Length (days)			
When User enters the new Cycle Length	
Then User should be able to edit the cycle length				

@upif4
Scenario: Cancel button function			
When User clicks on Cancel button	
Then User should be redirected to "Menstrual Cycle Tracker" page																				

																			




























																																																																				