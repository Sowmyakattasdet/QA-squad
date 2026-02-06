
package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;
import utils.LoggerFactory;

import org.testng.Assert;

public class EditProfileBodyMetricStepDefinition {

	private PageObjectManager pom;

	public EditProfileBodyMetricStepDefinition(Hooks hooks) {
		this.pom = hooks.getPom();
	}

	@Given("User is on the Her Balance Dashboard with the Edit Profile submenu expanded")
	public void user_is_on_the_her_balance_dashboard_with_the_edit_profile_submenu_expanded()
		throws InterruptedException {
		pom.geActivityInsightsMenuPage().Login();
		Thread.sleep(2000);
	}

	@When("User click profile button to edit profile")
	public void user_click_profile_button_to_edit_profile() throws InterruptedException {
		pom.getEditYourProfileBodyMetricsPage().clickProfileBtn();
	}

	@When("User clicks Edit Profile button")
	public void user_clicks_edit_profile_button() throws InterruptedException {
		pom.getEditYourProfileBodyMetricsPage().clickProfileBtn();
	}

	@When("User clicks Body Metrics Tab")
	public void user_clicks_body_metrics_tab() throws InterruptedException {
		pom.getEditYourProfileBodyMetricsPage().clickMetricsTab();
	}

	@Then("{string} should be visible inside section")
	public void should_be_visible_inside_section(String string) {
		Assert.assertTrue(pom.getEditYourProfileBodyMetricsPage().metricsLblDisplayed());
		LoggerFactory.getLogger().info("Body Metrics label is visible.");

	}

	@Then("Should display the user’s Weight as entered during the onboarding process.")
	public void should_display_the_user_s_weight_as_entered_during_the_onboarding_process()
		throws InterruptedException {
		String actualMessage = pom.getEditYourProfileBodyMetricsPage().getWeightValue();
		String expectedMessage = "56";
		Assert.assertEquals(actualMessage, expectedMessage, "Correct weight is not displayed");
		LoggerFactory.getLogger().info("Weight value is visible in the weight text box.");

		
	}

	/*@Then("Should display the user’s Height as entered during the onboarding process.")
	public void should_display_the_user_s_height_as_entered_during_the_onboarding_process() {
		String actualValueHeight = pom.getEditYourProfileBodyMetricsPage().getHeightValue();
		String expectedHeightValue = "123";
		Assert.assertEquals(actualValueHeight, expectedHeightValue, "Correct label not displayed");
	}*/

	@Then("BMI Category section should present with BMI Category")
	public void bmi_category_section_should_present_with_bmi_category() throws InterruptedException {
		Assert.assertTrue(pom.getEditYourProfileBodyMetricsPage().bmiCatergorySectionDisplayed());
		LoggerFactory.getLogger().info("Section to display information about user's info metrics is displayed.");
        Assert.assertTrue(pom.getEditYourProfileBodyMetricsPage().bmiCategoryValueDisplayed());
		LoggerFactory.getLogger().info("BMI category is displayed in BMI section.");
	}

	@Then("BMI Category note should be visible")
	public void bmi_category_note_should_be_visible() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(pom.getEditYourProfileBodyMetricsPage().bmiNoteDisplayed());
		LoggerFactory.getLogger().info("BMI category note is displayed in BMI section.");

	}

	@Then("{string} Button should be visible, enabled")
	public void button_should_be_visible_enabled(String string) {
		Assert.assertTrue(pom.getEditYourProfileBodyMetricsPage().backButtonDisplayed());
		LoggerFactory.getLogger().info("Back button below the BMI section is visible .");
		Assert.assertTrue(pom.getEditYourProfileBodyMetricsPage().backButtonEnabled());
		LoggerFactory.getLogger().info("Back button below the BMI section is enabled.");

	}

}

