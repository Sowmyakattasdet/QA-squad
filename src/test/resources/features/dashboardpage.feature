@dashboardpage
Feature: Free Plan Dashboard - UI verfication
  
  Background: User is in login page
    Given User is on the HerBalance auth page
    When User clicks login in button after entering  a valid credential

  @DTitle_Dashboar/
  Scenario: Title of the Dashboard
    Then User should see "Free Plan Dashboard" title
 
  
  @profile_name
  Scenario: Profile Name visibility
    Then User should see user name on the top right side
    
  @profile_icon
  Scenario: Profile icon Visibility
    Then User should see profile icon near user name
    
  @notification_icon
  Scenario: Notification Icon visibility
    Then User should see bell icon for notification
    
    @search_bar
  Scenario: Search bar visibility
    Then User should see search bar in dashboard
    
    @button_count
  Scenario: Button count
    Then User should see 12 menus in dashboard
    
     @button_txt
  Scenario: Button text
    Then User Name, "Activity Insights","Diet Plan","Workout","Water Tracker", "View Full Cycle Details","Upload Blood Report", "Upgrade to Premium", "Generate 7-Day Plan",  "See Premium Plans"
    
    @subtxt_title
  Scenario: Sub text for title
    Then  User should see  "Free Plan • Access to Basic Features","Enjoy our free plan with basic features and exclusive workout planning."
    
       @subt_txt_loc
  Scenario: Sub text location
    Then Sub text should be located at the centre of the page
    
     @5section
  Scenario: 5 Section visibility
    Then 5 section should be visible
    
       @section_head
  Scenario: Section heading text
    Then "Weight & Body Metrics","Health Conditions","Blood Report Insights","Menstrual Cycle Insights","Subscription Information"
    
        @sub_sections
  Scenario: Metrics Section Displays All Relevant Sub-sections
    Then "Weight" , "Height" , "BMI" , "7-Day Goal","BMI Reference Guide"
    
    
     @section_details
  Scenario: 7-Day Goal section details
    Then App should have "Starting" weight, "Goal: " , "Weekly target", "Daily Weigh-in:"  
    
        
     @weightval
  Scenario: Weight Value Displayed from Onboarding
    Then Should display the user’s weight as entered during the onboarding process.
    
        
     @Heightval
  Scenario: Height Value Displayed from Onboarding
    Then Should display the user’s Height as entered during the onboarding process.
    
     @bmical
  Scenario: BMI Calculation on Dashboard
    Then BMI should be correctly calculated using the formula (Weight in kg / (Height in m)^2)
    
      @startingwt
  Scenario: Starting weight value check
    Then Should display weight entered by user
    
    @goalwtck
  Scenario: Goal weight value check
    Then Goal weight should be displayed as the difference from the weekly target
    
    
       @weeklytarget
  Scenario: Weekly target value check
    Then Weekly target should be .7 kg
    
       @dailyweigh
  Scenario: Daily weigh in schedule display
    Then Daily weigh in should be - "Morning, before food"
    
       @subscription_details
  Scenario: subcription details should be displayed in 7-day goal
    Then Subcription details should be present in 7-day goal section
    
       @bmislider
  Scenario: Presence of slider in BMI reference guide
    Then Slider should be present in BMI reference guide
    
       @bmiref
  Scenario: BMI reference guide section is visible
    Then BMI Reference Guide component should be displayed with a gradient slider and labeled ranges
    
    
     @infolabel
  Scenario: Info label visibility
    Then "Info" label should be visible above the slider
    
     @freeplanNote
  Scenario: Free plan note
    Then Message “Free plan includes 7 days of limited tracking” should be displayed clearly below the slider
    
   
     @automatic_datamaping
     Scenario: Automatic data mapping from onboarding
    Then Displayed condition(s) match exactly what was selected during onboarding, without requiring user input again 
   
       
    @conditiondiscription
     Scenario: Condition description message
    Then Message appears below condition card explaining how the plan is adjusted
    
     @Styling
     Scenario: Styling and icon display
    Then Card includes heart icon, condition name , and info icon with related text
    
    
     @nohealthissue
     Scenario: No condition scenario
    Then Message like “No health conditions selected” or an empty state is displayed
    
    @nobloodrep
     Scenario: Display Blood Report Insights based on report uploaded
    Then Blood Report Insights section should display the personalized values and insights
    
     @Bloodrepbtn
     Scenario: Display Blood Report Insights based on report not uploaded
     Then User should see the "Upload Blood Report" button
     
     @Messagebloodre
     Scenario: Message for Blood report
     Then Message prompting them to upload their medical blood test report
     
      @uploadrb
     Scenario: Upload report button 
     Then "Upload Blood Report" button should be enabled
     
     @joineddate
     Scenario: Presence of start / joined date of subcription 
     Then Joined date should be displayed
    
       @todaydate
     Scenario: Presence of todays date section 
     Then Todays date should be display
     
       @subplan
     Scenario: Plan details is displayed 
     Then Subcription plan should be displayed
     
        @remdays
     Scenario: Status of the plan 
     Then Status of plan should be displayed(how many days left out of 7 days free plan)
     
        @upgrade
     Scenario: Presence of Upgrade to Premium button
     Then "Upgrade to Premium" button should be displayed
     
    
    
    
    
    
    
    
    
    
    
    
    
    