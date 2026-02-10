@workoutModule
Feature: Verify the workout page title Workout Page UI verification
  
 Background: 
Given User is on the Her Balance Dashboard with the Edit Profile submenu expanded
When User clicks workout button on navigation bar


@workoutModule1
Scenario: Verify the workout page title
Then User should see page title as "Daily  Workouts"

@workoutModule2
 Scenario: Verify the workout page title
 Then User should see the link Back to dashboard
 
 @workoutModule3
 Scenario: Verify the presence of daily workout plan section
 Then User should see the "Daily Workout Plan" section

 @workoutModule4
 Scenario: Verify the description under daily workout plan section
 Then User should see a "Benefits of Cycle-Synced Workouts" section
 
 @workoutModule5
 Scenario: Verify "+5 more exercises" link presence
 Then Verify "+5 more exercises" link presence
 
 @workoutModule6
 Scenario: Verify “View All Exercises” button presence
 Then User should see “View All Exercises” button displayed below the exercise list