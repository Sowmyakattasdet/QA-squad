package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;
import utils.LoggerFactory;

public class WorkoutModuleStepDefinition {
	private PageObjectManager pom;
	
 public WorkoutModuleStepDefinition(Hooks hooks){
	 this.pom = hooks.getPom();	 
 }
 
 @When("User clicks workout button on navigation bar")
 public void user_clicks_workout_button_on_navigation_bar() {
   pom.getWorkoutPage().clickWorkoutBtn();;
 }

 @Then("User should see the link Back to dashboard")
 public void user_should_see_the_link_back_to_dashboard() {
	Assert.assertTrue(pom.getWorkoutPage().backtoDashBrdBtnDisplayed());
	LoggerFactory.getLogger().info("Back to Dashboard button is visible.");

 }
 
 @Then("User should see page title as {string}")
 public void user_should_see_page_title_as(String string) {
  Assert.assertTrue(pom.getWorkoutPage().workoutLabelDisplayed());
  LoggerFactory.getLogger().info("Daily Personalized Workouts label is visible.");
 }

 @Then("User should see the {string} section")
 public void user_should_see_the_section(String string) {
     Assert.assertTrue(pom.getWorkoutPage().workoutPlanSectionDisplayed());
     LoggerFactory.getLogger().info("Daily Workout Plan section is visible.");
 }

@Then("User should see a {string} section")
public void user_should_see_a_section(String string) {
	Assert.assertTrue(pom.getWorkoutPage().workoutPlanBenefitSectionDisplayed());
    LoggerFactory.getLogger().info("Daily Workout Plan benefit section is visible.");
}

@Then("Verify {string} link presence")
public void verify_link_presence(String string) {
	Assert.assertTrue(pom.getWorkoutPage().moreExcerciseLinkDisplayed());
    LoggerFactory.getLogger().info("+5 more excercise link is displayed");

}

@Then("User should see “View All Exercises” button displayed below the exercise list")
public void user_should_see_view_all_exercises_button_displayed_below_the_exercise_list() {
	Assert.assertTrue(pom.getWorkoutPage().allExcerciseLinkDisplayed());
    LoggerFactory.getLogger().info("All Excercises Button is displayed");
}

}



