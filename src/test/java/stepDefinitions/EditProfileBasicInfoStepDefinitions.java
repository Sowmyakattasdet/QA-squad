package stepDefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;

public class EditProfileBasicInfoStepDefinitions {
	
	private PageObjectManager pom;
	
 public EditProfileBasicInfoStepDefinitions(Hooks hooks){
	 this.pom = hooks.getPom();
	 
 }
 

	/*@Given("User is on the Her Balance Dashboard with the Edit Profile submenu expanded")
	public void user_is_on_the_her_balance_dashboard_with_the_edit_profile_submenu_expanded() throws InterruptedException {
		pom.geActivityInsightsMenuPage().Login();
		Thread.sleep(2000);

	}
	
	@When("User click profile button to edit profile")
	public void user_click_profile_button_to_edit_profile() throws InterruptedException {
	    pom.getEditYourMetricProfilePage().clickProfileBtn();
		Thread.sleep(2000);

	}*/
	
 @Then("{string} should be visible inside section on basic tab")
 public void should_be_visible_inside_section_on_basic_tab(String string) {
   Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().basicinfoLbl.isDisplayed());
    
 }

 @Then("{string} sub text should be visible on basic tab")
 public void sub_text_should_be_visible_on_basic_tab(String string) {
	 Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().updatePersonalInfoLbl.isDisplayed());

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
	   Assert.assertTrue(pom.getEditYourProfilePageBasicInfo().metricsButton.isEnabled());
	}



/*@Then("Name and Age fields should be properly aligned vertically with equal spacing")
public void name_and_age_fields_should_be_properly_aligned_vertically_with_equal_spacing() {
 
}*/
}





