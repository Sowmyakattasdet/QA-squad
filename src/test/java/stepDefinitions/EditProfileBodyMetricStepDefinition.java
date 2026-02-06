package stepDefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;

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
	public void user_click_profile_button_to_edit_profile()
			throws InterruptedException {
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
		Assert.assertTrue(
				pom.getEditYourProfileBodyMetricsPage().metricsLblDisplayed());
	}

	@Then("Should display the user’s Weight as entered during the onboarding process")
	public void should_display_the_user_s_weight_as_entered_during_the_onboarding_process()
			throws InterruptedException {
		String actualMessage = pom.getEditYourProfileBodyMetricsPage()
				.getWeightValue();
		String expectedMessage = "56";
		Assert.assertEquals(actualMessage, expectedMessage,
				"Correct label not displayed");
	}

	@Then("Should display the user’s Height as entered during the onboarding process")
	public void should_display_the_user_s_height_as_entered_during_the_onboarding_process() {
		String actualValueHeight = pom.getEditYourProfileBodyMetricsPage()
				.getHeightValue();
		String expectedHeightValue = "123";
		Assert.assertEquals(actualValueHeight, expectedHeightValue,
				"Correct label not displayed");
	}

	@Then("BMI Category section should present with BMI Category")
	public void bmi_category_section_should_present_with_bmi_category()
			throws InterruptedException {
		Assert.assertTrue(pom.getEditYourProfileBodyMetricsPage()
				.bmiCatergorySectionDisplayed());

		Assert.assertTrue(pom.getEditYourProfileBodyMetricsPage()
				.bmiCategoryValueDisplayed());

	}

	@Then("BMI Category note should be visible")
	public void bmi_category_note_should_be_visible()
			throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(
				pom.getEditYourProfileBodyMetricsPage().bmiNoteDisplayed());
	}

	@Then("{string} Button should be visible, enabled")
	public void button_should_be_visible_enabled(String string) {
		Assert.assertTrue(
				pom.getEditYourProfileBodyMetricsPage().backButtonDisplayed());
		Assert.assertTrue(
				pom.getEditYourProfileBodyMetricsPage().backButtonEnabled());
	}

}
