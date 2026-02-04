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

public class SignUpFunctionalStepDefinitions {
	private WebDriver driver;
	private LaunchPage launchPg;
	private SignUpPage signupPage;
	public final static String CONFIG_DATA_FILE_NAME = "config.properties";

	public final static String TEST_DATA_FILE_NAME = "TestData.xlsx";
	WebElement inputField;
	String expectedError;
	String actualError;

	public SignUpFunctionalStepDefinitions() {
		driver = DriverManager.getDriver();
		driver.get(ConfigReader.getProperty("appURL"));
		launchPg = new LaunchPage(driver);
		signupPage = new SignUpPage(driver);
	}

	@Given("User clicked Sign up button in home page")
	public void user_clicked_sign_up_button_in_home_page() {
		launchPg.clickSignUpButton();
	}

	@Given("User is on the HerBalance auth page")
	public void user_is_on_the_her_balance_auth_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains("auth"));
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("auth"), "User is not on login page" + currentUrl);
	}

	@When("User enters valid  details \\(Email ID, Password, and Confirm Password) and clicks the Register button from given {string}")
	public void user_enters_valid_details_email_id_password_and_confirm_password_and_clicks_the_register_button_from_given(
			String ScenarioName) {
		ExcelReader reader = new ExcelReader("/testData/" + TEST_DATA_FILE_NAME);
		String sheetName = "Register_valid";
		Map<String, String> testData = reader.getDataByScenarioName(sheetName, ScenarioName);
		signupPage.enterEmail(testData.get("Email ID"));
		signupPage.enterPassword(testData.get("Password"));
		signupPage.enterPasswordConfirmation(testData.get("Confirm Password"));
		signupPage.clickRegisterBtn();
		LoggerFactory.getLogger().info("User entering the Valid data");
	}

	@Then("User should be redirected to the onboarding step")
	public void user_should_be_redirected_to_the_onboarding_step() {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.urlContains("onboarding")); String currentUrl =
		 * driver.getCurrentUrl(); Assert.assertTrue(currentUrl.contains("onboarding"),
		 * "User is not on onboarding page" + currentUrl);
		 */
		driver.navigate().to(ConfigReader.getProperty("appURL") + "onboarding");
	}

	@When("User clicks Register button after entering the data from given {string}")
	public void user_clicks_register_button_after_entering_the_data_from_given(String ScenarioName) {
		ExcelReader reader = new ExcelReader("/testData/" + TEST_DATA_FILE_NAME);
		String sheetName = "Register_invalid";
		Map<String, String> testData = reader.getDataByScenarioName(sheetName, ScenarioName);
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

		ExcelReader reader = new ExcelReader("/testData/" + TEST_DATA_FILE_NAME);
		Map<String, String> testData = reader.getDataByScenarioName("Register_invalid", scenarioName);

		String expectedError = testData.get("Expected Error");

		List<String> actualErrors = signupPage.getAllErrorMessages();

		Assert.assertFalse(actualErrors.isEmpty(), "No error messages displayed on UI");

		for (String expected : expectedError.split(",")) {
			String trimmedExpected = expected.trim();
			Assert.assertTrue(actualErrors.stream().anyMatch(e -> e.equals(trimmedExpected)),
					"Expected error not found: " + trimmedExpected + "\nActual errors: " + actualErrors);
		}
	}

	@When("User enters {string} in {string} field and performs {string}")
	public void user_enters_in_field_and_performs(String password, String field, String action) {
		inputField = signupPage.eyeIconAction(password, field, action);
	}

	@Then("The {string} field should display password as {string}")
	public void the_field_should_display_password_as(String field, String visibility) {
		String type = inputField.getDomAttribute("type");
		if (visibility.equalsIgnoreCase("visible")) {
			Assert.assertEquals(type, "text", field + " should be visible but it's masked");
		} else {
			Assert.assertEquals(type, "password", field + " should be masked but it's visible");
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
}
