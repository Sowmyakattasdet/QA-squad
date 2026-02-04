package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import pom.PageObjectManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
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

	// close class
	@When("User click profile button to edit profile")
	public void user_click_profile_button_to_edit_profile() throws InterruptedException {
		pom.getEditYourMetricProfilePage().clickProfileBtn();
		Thread.sleep(2000);

	}

	@When("User clicks Edit Profile button")
	public void user_clicks_edit_profile_button() throws InterruptedException {
		// pom.getEditYourProfilePage().clickProfileBtn();
		pom.getEditYourMetricProfilePage().clickProfileBtn();
	}

	/*
	 * @Then("{string} should be visible")//Edit your profile public void
	 * should_be_visible(String string) { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 */

	@When("User clicks Body Metrics Tab")
	public void user_clicks_body_metrics_tab() throws InterruptedException {
		pom.getEditYourMetricProfilePage().clickMetricsTab();
	}

	@Then("{string} should be visible inside section")
	public void should_be_visible_inside_section(String string) {
		
		Assert.assertTrue(pom.getEditYourMetricProfilePage().metricsLbl.isDisplayed());

	}

	@Then("Should display the user’s Weight as entered during the onboarding process.")
	public void should_display_the_user_s_weight_as_entered_during_the_onboarding_process()
			throws InterruptedException {
		
		String actualMessage = pom.getEditYourMetricProfilePage().getWeightValue();
		String expectedMessage = "55";
		Assert.assertEquals(actualMessage, expectedMessage, "Correct label not displayed");

	}

	@Then("Should display the user’s Height as entered during the onboarding process.")
	public void should_display_the_user_s_height_as_entered_during_the_onboarding_process() {
		String actualValueHeight = pom.getEditYourMetricProfilePage().getHeightValue();
		String expectedHeightValue = "123";
		Assert.assertEquals(actualValueHeight, expectedHeightValue, "Correct label not displayed");

	}

	
	@Then("{string} or {string} unit values in dropdown should be visible, enabled on body metric page")
	public void or_unit_values_in_dropdown_should_be_visible_enabled_on_body_metric_page(String string,
			String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} or {string} unit values in dropdown should be visible, enabled")
	public void or_unit_values_in_dropdown_should_be_visible_enabled(String string, String string2) {
		// pom.getEditYourMetricProfilePage().VerifyWeightUnitFrmDropdown();
		// WebDriver driver = null;
		// driver.findElement(By.xpath("//*[@class=\"lucide lucide-chevron-down h-4 w-4
		// opacity-50\"]")).click();
	}

	@Then("Weight and Height fields should be properly aligned vertically with equal spacing")
	public void weight_and_height_fields_should_be_properly_aligned_vertically_with_equal_spacing() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("BMI Calculation Number should be displayed with a gradient slider and labels")
	public void bmi_calculation_number_should_be_displayed_with_a_gradient_slider_and_labels() {
		Assert.assertTrue(pom.getEditYourMetricProfilePage().bmiNumber.isDisplayed());
	}

	@Then("BMI Category section should present with BMI Category")
	public void bmi_category_section_should_present_with_bmi_category() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(pom.getEditYourMetricProfilePage().bmiCategoryDisplay().isDisplayed());

	}

	@Then("BMI Category note should be visible")
	public void bmi_category_note_should_be_visible() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(pom.getEditYourMetricProfilePage().bmiNote.isDisplayed());
	}

	@Then("slider should display a continuous gradient from blue → yellow → orange → red, representing increasing BMI values")
	public void slider_should_display_a_continuous_gradient_from_blue_yellow_orange_red_representing_increasing_bmi_values() {
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} Button should be visible, enabled")
	public void button_should_be_visible_enabled(String string) {
		Assert.assertTrue(pom.getEditYourMetricProfilePage().backBtn.isDisplayed());
		Assert.assertTrue(pom.getEditYourMetricProfilePage().backBtn.isEnabled());
	}

}
