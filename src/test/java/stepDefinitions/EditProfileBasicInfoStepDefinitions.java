<<<<<<< HEAD
package stepDefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import pom.PageObjectManager;

public class EditProfileBasicInfoStepDefinitions {
	
	private PageObjectManager pom;
	
 public EditProfileBasicInfoStepDefinitions(Hooks hooks){
	 this.pom = hooks.getPom();
	 
 }
 
	
 @Then("{string} should be visible inside section on basic tab")
 public void should_be_visible_inside_section_on_basic_tab(String string) {
   Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().basicInfoLabelDisplayed());
    
 }

 @Then("{string} sub text should be visible on basic tab")
 public void sub_text_should_be_visible_on_basic_tab(String string) {
	 Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().updateInfoLblDisplayed());

 }

 @Then("Should display the user’s Name as entered during the onboarding process basic tab")
 public void should_display_the_user_s_name_as_entered_during_the_onboarding_process_basic_tab() {
		String actualValueName = pom.getEditYourProfilePageBasicInfo().getUserNameTxtBoxgetValue();
		String expectedValueName= "qa";
		Assert.assertEquals(actualValueName, expectedValueName, "Correct label not displayed");

 }
 
 @Then("Should display the user’s Age as entered during the onboarding process")
 public void should_display_the_user_s_age_as_entered_during_the_onboarding_process() {
	 String actualValueAge = pom.getEditYourProfilePageBasicInfo().etUserAgeTxtBxValue();
		String expectedValueAge= "30";
		Assert.assertEquals(actualValueAge, expectedValueAge, "Correct label not displayed");

}
	
 @Then("“Next: Body Metrics” button should be visible, enabled")
	public void next_body_metrics_button_should_be_visible_enabled() {
	   Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().metricsBtnEnabled());
	}
}





=======
package stepDefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import pom.PageObjectManager;

public class EditProfileBasicInfoStepDefinitions {
	
	private PageObjectManager pom;
	
 public EditProfileBasicInfoStepDefinitions(Hooks hooks){
	 this.pom = hooks.getPom();
	 
 }
 
	
 @Then("{string} should be visible inside section on basic tab")
 public void should_be_visible_inside_section_on_basic_tab(String string) {
   Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().basicInfoLabelDisplayed());
    
 }

 @Then("{string} sub text should be visible on basic tab")
 public void sub_text_should_be_visible_on_basic_tab(String string) {
	 Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().updateInfoLblDisplayed());

 }

 @Then("Should display the user’s Name as entered during the onboarding process basic tab")
 public void should_display_the_user_s_name_as_entered_during_the_onboarding_process_basic_tab() {
		String actualValueName = pom.getEditYourProfilePageBasicInfo().getUserNameTxtBoxgetValue();
		String expectedValueName= "qa";
		Assert.assertEquals(actualValueName, expectedValueName, "Correct label not displayed");

 }
 
 @Then("Should display the user’s Age as entered during the onboarding process")
 public void should_display_the_user_s_age_as_entered_during_the_onboarding_process() {
	 String actualValueAge = pom.getEditYourProfilePageBasicInfo().etUserAgeTxtBxValue();
		String expectedValueAge= "30";
		Assert.assertEquals(actualValueAge, expectedValueAge, "Correct label not displayed");

}
	
 @Then("“Next: Body Metrics” button should be visible, enabled")
	public void next_body_metrics_button_should_be_visible_enabled() {
	   Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().metricsBtnEnabled());
	}
}





>>>>>>> efd1d4efde4e4f879961e740b0b82d50034b7524
