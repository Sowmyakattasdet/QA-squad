package stepDefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;

public class EditYourProfileFunctionalTestingStepDefinition {
	private PageObjectManager pom;

	public EditYourProfileFunctionalTestingStepDefinition(Hooks hooks) {
		this.pom = hooks.getPom();
	}

	@When("User clicks on Body Metric tab")
	public void user_clicks_on_body_metric_tab() {
		pom.getEditYourProfileFunctionalTestingPage().clickmetricsTab();
	}

	@Then("User should see Body Metric Section")
	public void user_should_see_body_metric_section() {
		Assert.assertTrue(pom.getEditYourProfileFunctionalTestingPage()
				.metricsTabDisplayed());
	}

	@When("User clicks on Preferences & Health tab")
	public void user_clicks_on_preferences_health_tab()
			throws InterruptedException {
		Thread.sleep(3000);
		pom.getEditYourProfileFunctionalTestingPage().clickPreferenceBtn();
	}

	@Then("User should see  Preferences & Health Section")
	public void user_should_see_preferences_health_section() {
		Assert.assertTrue(pom.getEditYourProfileFunctionalTestingPage()
				.preferenceTabDisplayed());
	}

	@When("User clicks on Next: Body Metrics Button on basic tab")
	public void user_clicks_on_next_body_metrics_button_on_basic_tab() {
		pom.getEditYourProfileFunctionalTestingPage().clickMetricsBtn();
	}

	@Then("User should see {string} Section") // for metrictab
	public void user_should_see_section(String string) {
		pom.getEditYourProfileFunctionalTestingPage().metricsTabDisplayed();
	}

	@Then("User should see {string} info section") // for preference tab
	public void user_should_see_info_section(String string) {
		pom.getEditYourProfileFunctionalTestingPage().preferenceTabDisplayed();
	}

	@When("User clicks on “Next: Preferences” button for preference tab")
	public void user_clicks_on_next_preferences_button_for_preference_tab() {
		pom.getEditYourProfileFunctionalTestingPage().clickPrefernceBtn();
	}

	@Then("User should see {string} tab section")
	public void user_should_see_tab_section(String string) {
		Assert.assertTrue(pom.getEditYourProfileFunctionalTestingPage()
				.preferenceTabDisplayed());
	}

	@When("User clicks on Back Button on Body Metric section")
	public void user_clicks_on_back_button_on_body_metric_section() {
		pom.getEditYourProfileFunctionalTestingPage()
				.clickBackButtonFrmMetricsTab();
	}

	@Then("User should see {string} section for basic tab")
	public void user_should_see_section_for_basic_tab(String string)
			throws InterruptedException {
		Assert.assertTrue(pom.getEditYourProfileFunctionalTestingPage()
				.basicinfoSectionDisplayed());
	}
	@When("User clicks on Back Button on  Preferences & Health section")
	public void user_clicks_on_back_button_on_preferences_health_section() {
		pom.getEditYourProfileFunctionalTestingPage()
				.clickBackButtonFrmMetricsTab();
	}

	@When("User clicks on Save Profile on  Preferences & Health section after editing values in any field")
	public void user_clicks_on_save_profile_on_preferences_health_section_after_editing_values_in_any_field() {
		pom.getEditYourProfileFunctionalTestingPage().clickSaveProfileBtn();
	}

	@Then("User should see success message {string}")
	public void user_should_see_success_message(String string) {
		String actualValueSaveMsg = pom
				.getEditYourProfileFunctionalTestingPage()
				.getProfilSaveMsgTxt();
		String expectedValueSaveMsg = "Your profile information has been successfully updated.";
		Assert.assertEquals(actualValueSaveMsg, expectedValueSaveMsg,
				"Correct message not displayed");
	}

	/*
	 * @Given("User is on the Preferences and Health section") public void
	 * user_is_on_the_preferences_and_health_section() {
	 * pom.getEditYourProfileFunctionalTestingPage().clickPreferenceTab(); }
	 */

	@When("User clicks on Add Medication Button")
	public void user_clicks_on_add_medication_button() {
		pom.getEditYourProfileFunctionalTestingPage().clickAddMedicationBtn();
	}

	@Then("User should see {string} message")
	public void user_should_see_message(String string)
			throws InterruptedException {
		String actualPopupMsg = pom.getEditYourProfileFunctionalTestingPage()
				.verifyPopupAlertDisplayed();
		String expectedPopmsg = "Enter medication name";
		Assert.assertEquals(actualPopupMsg, expectedPopmsg,
				"Correct label not displayed");

	}

	@Then("Enter Medication name should be visible")
	public void enter_medication_name_should_be_visible()
			throws InterruptedException {
		String actualPopupMsg = pom.getEditYourProfileFunctionalTestingPage()
				.verifyPopupAlertDisplayed();
		String expectedPopmsg = "Enter medication name";
		Assert.assertEquals(actualPopupMsg, expectedPopmsg,
				"Correct label not displayed");
	}

	@Then("Should display empty input field for entering medication name")
	public void should_display_empty_input_field_for_entering_medication_name() {
		pom.getEditYourProfileFunctionalTestingPage().verifyInputFieldInPopup();
	}

	@Then("{string} and {string} buttons should displayed")
	public void and_buttons_should_displayed(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Then("There should be exactly {int} Buttons --“Ok” and  {string}")
	public void there_should_be_exactly_buttons_ok_and(Integer int1,
			String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Ok button after adding medication")
	public void user_clicks_on_ok_button_after_adding_medication()
			throws InterruptedException {

		pom.getEditYourProfileFunctionalTestingPage()
				.dismissPopupAfterAddingMedicine();
	}

	@Then("User should navigate back to Preferences & Health Section page")
	public void user_should_navigate_back_to_preferences_health_section_page() {
		Assert.assertTrue(pom.getEditYourProfileFunctionalTestingPage()
				.preferenceTabDisplayed());
	}

	@Then("User should see {string} info section for Body metric tab")
	public void user_should_see_info_section_for_body_metric_tab(
			String string) {
		pom.getEditYourProfileFunctionalTestingPage().metricsTabDisplayed();
	}

}
