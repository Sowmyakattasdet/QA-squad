@dashboardpage
Feature: Testing dashboardpage in Herbalance
  
  Background: User is in login page
    Given User is on the HerBalance auth page
    When User clicks login in button after entering  a valid credential

  @D2
  Scenario: Title of the Dashboard
    Then User should see "Free Plan Dashboard" title
 
  
  @D3
  Scenario: Profile Name visibility
    Then User should see user name on the top right side
    
  @D4
  Scenario: Profile icon Visibility
    Then User should see profile icon near user name
    
  @D5
  Scenario: Notification Icon visibility
    Then User should see bell icon for notification
    
    @D6
  Scenario: Search bar visibility
    Then User should see search bar in dashboard
    
    @D7
  Scenario: Button count
    Then User should see 12 menus in dashboard
    
     @D8
  Scenario: Button text
    Then User Name, "Activity Insights","Diet Plan","Workout","Water Tracker", "View Full Cycle Details","Upload Blood Report", "Upgrade to Premium", "Generate 7-Day Plan",  "See Premium Plans"
    
    @D9
  Scenario: Sub text for title
    Then  User should see  "Free Plan • Access to Basic Features","Enjoy our free plan with basic features and exclusive workout planning."
    
       @D10
  Scenario: Sub text location
    Then Sub text should be located at the centre of the page
    
     @D11
  Scenario: 5 Section visibility
    Then 5 section should be visible
    
       @D12
  Scenario: Section heading text
    Then "Weight & Body Metrics","Health Conditions","Blood Report Insights","Menstrual Cycle Insights","Subscription Information"
    
        @D13
  Scenario: Metrics Section Displays All Relevant Sub-sections
    Then "Weight" , "Height" , "BMI" , "7-Day Goal","BMI Reference Guide"
    
    
     @D14
  Scenario: 7-Day Goal section details
    Then App should have "Starting" weight, "Goal: 126.8 lbs" , "Weekly target", "Daily Weigh-in:"  
    
        
     @D15
  Scenario: Weight Value Displayed from Onboarding
    Then Should display the user’s weight as entered during the onboarding process.
    
        
     @D16
  Scenario: Height Value Displayed from Onboarding
    Then Should display the user’s Height as entered during the onboarding process.
    
     @D17
  Scenario: BMI Calculation on Dashboard
    Then BMI should be correctly calculated using the formula (Weight in kg / (Height in m)^2)
    
      @D18
  Scenario: Starting weight value check
    Then Should display weight entered by user
    
    @D19
  Scenario: Goal weight value check
    Then Goal weight should be displayed as the difference from the weekly target
    
    
       @D20
  Scenario: Weekly target value check
    Then Weekly target should be .7 kg
    
       @D21
  Scenario: Daily weigh in schedule display
    Then Daily weigh in should be - "Morning, before food"
    
       @D22
  Scenario: subcription details should be displayed in 7-day goal
    Then Subcription details should be present in 7-day goal section
    
       @D23
  Scenario: Presence of slider in BMI reference guide
    Then Slider should be present in BMI reference guide
    
       @D24
  Scenario: BMI reference guide section is visible
    Then BMI Reference Guide component should be displayed with a gradient slider and labeled ranges
    
       @D25
  Scenario: gradient color representation
    Then slider should display a continuous gradient from blue → yellow → orange → red, representing increasing BMI values
    
       @D26
  Scenario: BMI category labels
    Then Labels "Underweight (18.5)", "Normal (25)", "Overweight (30)", and "Obese (40+)" should be visible and color-coded accordingly
    
       @D27
  Scenario: BMI pointer position based on user’s BMI
    Then Circular pointer should automatically be positioned on the slider corresponding to the user’s BMI value
    
       @D28
  Scenario: Slider is non-interactive
    Then Slider should not allow manual movement; it should remain fixed based on the user’s BMI
    
     @D29
  Scenario: Info label visibility
    Then "Info" label should be visible above the slider
    
     @D30
  Scenario: Free plan note
    Then Message “Free plan includes 7 days of limited tracking” should be displayed clearly below the slider
    
    
    
    
    