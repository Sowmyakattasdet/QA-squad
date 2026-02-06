
package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import factory.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LaunchPage;
import pages.SignUpPage;
import utils.ConfigReader;
import utils.ExcelReader;
import utils.LoggerFactory;

public class SignUpStepDefinitions {
	private WebDriver driver;
	private LaunchPage launchPg;
	private SignUpPage signupPage;
	public final static String CONFIG_DATA_FILE_NAME = "config.properties";

	public final static String TEST_DATA_FILE_NAME = "TestData.xlsx";
	WebElement inputField;
	String expectedError;
	String actualError;

	public SignUpStepDefinitions() {
		driver = DriverManager.getDriver();
		driver.get(ConfigReader.getProperty("appURL"));
		launchPg = new LaunchPage(driver);
		signupPage = new SignUpPage(driver);
	}

	@Given("User clicked Sign up button in home page")
	public void user_clicked_sign_up_button_in_home_page() {
		launchPg.clickSignUpButton();
	}

	@Given("User is on the HerBalance launch page")
	public void user_is_on_the_herBalance_launch_page() {
		driver.get(ConfigReader.getProperty("appURL"));
	}

	@Given("User is on the HerBalance auth page.")
	public void user_is_on_the_her_balance_auth_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains("auth"));
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("auth"),
				"User is not on login page" + currentUrl);
	}

	@When("User enters valid  details \\(Email ID, Password, and Confirm Password) and clicks the Register button from given {string}")
	public void user_enters_valid_details_email_id_password_and_confirm_password_and_clicks_the_register_button_from_given(
			String ScenarioName) {
		ExcelReader reader = new ExcelReader(
				"/testData/" + TEST_DATA_FILE_NAME);
		String sheetName = "Register_valid";
		Map<String, String> testData = reader.getDataByScenarioName(sheetName,
				ScenarioName);
		signupPage.enterEmail(testData.get("Email ID"));
		signupPage.enterPassword(testData.get("Password"));
		signupPage.enterPasswordConfirmation(testData.get("Confirm Password"));
		signupPage.clickRegisterBtn();
		LoggerFactory.getLogger().info("User entering the Valid data");

	}

	@Then("User should be redirected to the onboarding step")
	public void user_should_be_redirected_to_the_onboarding_step() {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,
		 * Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.urlContains("onboarding")); String
		 * currentUrl = driver.getCurrentUrl();
		 * Assert.assertTrue(currentUrl.contains("onboarding"),
		 * "User is not on onboarding page" + currentUrl);
		 */
		driver.navigate().to(ConfigReader.getProperty("appURL") + "onboarding");
	}

	@When("User clicks Register button after entering the data from given {string}")
	public void user_clicks_register_button_after_entering_the_data_from_given(
			String ScenarioName) {
		ExcelReader reader = new ExcelReader(
				"/testData/" + TEST_DATA_FILE_NAME);
		String sheetName = "Register_invalid";
		Map<String, String> testData = reader.getDataByScenarioName(sheetName,
				ScenarioName);
		signupPage.enterEmail(testData.get("Email ID"));
		signupPage.enterPassword(testData.get("Password"));
		signupPage.enterPasswordConfirmation(testData.get("Confirm Password"));
		if (!signupPage.btnRadioAgree.isSelected()) {
			signupPage.btnRadioAgree.click();
		}
		signupPage.clickRegisterBtn();
		LoggerFactory.getLogger().info("User entering the invalid data");
		if (testData.containsKey("Without accepting terms")) {
			signupPage.registerUserwithoutclickingTerms();
		}
	}

	@Then("An error message should be displayed for {string}")
	public void an_error_message_should_be_displayed_for(String scenarioName) {

		ExcelReader reader = new ExcelReader(
				"/testData/" + TEST_DATA_FILE_NAME);
		Map<String, String> testData = reader
				.getDataByScenarioName("Register_invalid", scenarioName);

		String expectedError = testData.get("Expected Error");

		List<String> actualErrors = signupPage.getAllErrorMessages();

		Assert.assertFalse(actualErrors.isEmpty(),
				"No error messages displayed on UI");

		for (String expected : expectedError.split(",")) {
			String trimmedExpected = expected.trim();
			Assert.assertTrue(
					actualErrors.stream()
							.anyMatch(e -> e.equals(trimmedExpected)),
					"Expected error not found: " + trimmedExpected
							+ "\nActual errors: " + actualErrors);
		}
	}

	@When("User enters {string} in {string} field and performs {string}")
	public void user_enters_in_field_and_performs(String password, String field,
			String action) {
		inputField = signupPage.eyeIconAction(password, field, action);
	}

	@Then("The {string} field should display password as {string}")
	public void the_field_should_display_password_as(String field,
			String visibility) {
		String type = inputField.getDomAttribute("type");
		if (visibility.equalsIgnoreCase("visible")) {
			Assert.assertEquals(type, "text",
					field + " should be visible but it's masked");
		} else {
			Assert.assertEquals(type, "password",
					field + " should be masked but it's visible");
		}
	}

	@When("user clicks on {string}")
	public void user_clicks_on(String login) {
		signupPage.lnkLogin.click();
	}

	@Then("User should be redirected to the login tab")
	public void user_should_be_redirected_to_the_login_tab() {
		Assert.assertTrue(signupPage.tabLogin.isDisplayed());
	}

	// ========================================================================================================
	@Then("Email ID input field with placeholder {string} should be visible")
	public void email_id_input_field_with_placeholder_should_be_visible(
			String placeholder) {
		LoggerFactory.getLogger().info(
				"Verifying Email input field and its placeholder text...");
		Assert.assertTrue(signupPage.isEmailIdDisplayed(),
				"Email field not visible");
		Assert.assertEquals(signupPage.getEmailIdPlaceholder_text(),
				placeholder, "Placeholder mismatch");
		LoggerFactory.getLogger().info(
				"Email input field is visible with placeholder '{}'.",
				placeholder);
	}

	@Then("Password input field with masked entry should be visible")
	public void password_input_field_with_masked_entry_should_be_visible() {
		LoggerFactory.getLogger().info(
				"Verifying Password input field visibility and masking...");
		Assert.assertTrue(signupPage.isPasswordDisplayed(),
				"Password field is not visible");
		Assert.assertTrue(signupPage.isPasswordMasked(),
				"Password field is not masked");
		LoggerFactory.getLogger()
				.info("Password field is visible and masked correctly.");
	}

	@Then("Confirm password input field with masked entry should be visible")
	public void confirm_password_input_field_with_masked_entry_should_be_visible() {
		LoggerFactory.getLogger().info(
				"Verifying Confirm Password input field visibility and masking...");
		Assert.assertTrue(signupPage.isConfirmPasswordDisplayed(),
				"Confirm Password field is not visible");
		Assert.assertTrue(signupPage.isConfirmPasswordMasked(),
				"Confirm Password field is not masked");
		LoggerFactory.getLogger().info(
				"Confirm Password field is visible and masked correctly.");
	}

	@Then("Login button should be visible, enabled")
	public void login_button_should_be_visible_enabled() {
		LoggerFactory.getLogger()
				.info("Verifying Login button visibility and enablement...");
		Assert.assertTrue(signupPage.isLoginButtonEnabled(),
				"Login Button not enabled");
		LoggerFactory.getLogger().info("Login button is visible and enabled.");
	}

	@Then("Sign Up link should be visible and navigates to the Sign-Up page")
	public void signuplinkshouldbevisibleandnavigatestothesignuppage() {

	}

	@Then("\"Login\" link should be visible and navigates to the Login page")
	public void login_link_should_be_visible_and_navigates_to_the_login_page() {
		LoggerFactory.getLogger().info("Checking if Login link is visible...");
		Assert.assertTrue(signupPage.isLoginLinkVisible(),
				"Login link is not visible on the page");
		LoggerFactory.getLogger().info("Clicking on Login link...");
		signupPage.clickLoginLink();
		Assert.assertTrue(signupPage.isOnLoginPage(),
				"Navigation failed — user did not reach the Login page");
		LoggerFactory.getLogger()
				.info("User successfully navigated to the Login page.");
	}

	@Then("There should be exactly {int} input field")
	public void there_should_be_exactly_input_field(Integer expectedCount) {
		LoggerFactory.getLogger().info(
				"Verifying total number of input fields expected: {}",
				expectedCount);
		Assert.assertTrue(signupPage.verifyingInputFields(),
				"Input fields count mismatch.");
		LoggerFactory.getLogger()
				.info("Correct number of input fields are displayed.");
	}

	@Then("Radio button for show passwords is present")
	public void radio_button_for_show_passwords_is_present() {
		LoggerFactory.getLogger()
				.info("Verifying presence of Show Password radio button...");
		Assert.assertTrue(signupPage.verifyShowPasswordRadioButton(),
				"Show Password Radio Button not present");
		LoggerFactory.getLogger()
				.info("Show Password radio button is present.");
	}

	@Then("Terms and conditions details should be present")
	public void terms_and_conditions_details_should_be_present() {
		LoggerFactory.getLogger()
				.info("Verifying presence of Terms and Conditions details...");
		Assert.assertTrue(signupPage.verifyTermsAndConditionsPresent(),
				"Terms and Conditions not present");
		LoggerFactory.getLogger()
				.info("Terms and Conditions details are displayed correctly.");
	}

	@Then("Radio button for Terms and condition is present")
	public void radio_button_for_terms_and_condition_is_present() {
		LoggerFactory.getLogger().info(
				"Verifying presence of Terms and Conditions acceptance radio button...");
		Assert.assertTrue(signupPage.verifyTermsandConditionRadioButton(),
				"Terms and Conditions radio button not present");
		LoggerFactory.getLogger()
				.info("Terms and Conditions radio button is present.");
	}

}
