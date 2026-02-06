package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import factory.DriverManager;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pom.PageObjectManager;
import utils.ConfigReader;

public class LaunchStepDefinitions {
	
	private String appURL = null;
	private WebDriver driver;
	private PageObjectManager pom;

	// public ActivityInsightsMenuStepDefinitions(Hooks hooks) {
	// this.pom = hooks.getPom();
	// }

	public LaunchStepDefinitions(Hooks hooks) {
		driver = DriverManager.getDriver();
		driver.get(ConfigReader.getProperty("appURL"));
		this.pom = hooks.getPom();
		// launchPg = new LaunchPage(driver);
	}

	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		
	}

	@When("User enters app url")
	public void user_enters_app_url() {
		
	}

	@Then("Display cards for {string}, {string}, {string}, and {string}")
	public void display_cards_for_and(String menphase, String folliphase,
			String ovulphase, String lutphase) {
		Assert.assertTrue(pom.getLaunchPage().displayCards());
	}

	@Then("Details about the {string} and its features")
	public void details_about_the_and_its_features(String string) {
		Assert.assertTrue(pom.getLaunchPage().detailscycletrackingapp());
	}

	@Then("Login button should be visible")
	public void login_button_should_be_visible() {
		Assert.assertTrue(pom.getLaunchPage().btnLgn.isDisplayed());
	}

	@Then("Sign button should be visible")
	public void sign_button_should_be_visible() {
		Assert.assertTrue(pom.getLaunchPage().btnSignUp.isDisplayed());
	}

	@Then("Images in Sync' should be displayed")
	public void images_in_sync_should_be_displayed() {		
		Assert.assertTrue(pom.getLaunchPage().imagesinsync());
	}

	@Then("Display information about hormonal shifts and metabolism during the menstrual cycle")
	public void display_information_about_hormonal_shifts_and_metabolism_during_the_menstrual_cycle() {
		Assert.assertTrue(pom.getLaunchPage().txtEmpower.isDisplayed());
	}

	@Then("User should see a light purple background and readable text content")
	public void user_should_see_a_light_purple_background_and_readable_text_content() {
		Assert.assertTrue(pom.getLaunchPage().bgdColors.isDisplayed());
	}

	@Then("Display a {string} button in the footer section")
	public void display_a_button_in_the_footer_section(String string) {		
		Assert.assertTrue(pom.getLaunchPage().getstartednow());
	}

	@Then("Start Your Personalized' button should be displayed")
	public void start_your_personalized_button_should_be_displayed() {
		Assert.assertTrue(pom.getLaunchPage().startyourpersonalized());
	}

	@Given("User is in her balance home page")
	public void user_is_in_her_balance_home_page() {
		appURL = ConfigReader.getProperty("appURL");
		driver.get(appURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlContains("home"));
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, appURL);
	}
	/* commented because of duplicate with login */
	// @When("User clicks log in button")
	// public void user_clicks_log_in_button() {
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	// WebElement login =
	// wait.until(ExpectedConditions.elementToBeClickable(pom.getLaunchPage().btnLgn));
	// login.click();
	// }

	@When("User clicks log in button")
	public void user_clicks_log_in_button() {
	
	}
	@Then("User should be navigated to auth page login tab")
	public void user_should_be_navigated_to_auth_page_login_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains("auth"));
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("auth"),"User is not on login page" + currentUrl);
	}

	@When("User clicks sign up button")
	public void user_clicks_sign_up_button() {
		pom.getLaunchPage().clickSignUpButton();
	}

	@Then("User should be navigated to auth page sign up tab")
	public void user_should_be_navigated_to_auth_page_sign_up_tab() {
		pom.getLaunchPage().navigatingtoauthreg();
	}

	@When("User clicks Get Started button")
	public void user_clicks_get_started_button() {
		pom.getLaunchPage().clickGetStartedButton();
	}

	@When("User clicks Start your personalized journey button")
	public void user_clicks_start_your_personalized_journey_button() {
		pom.getLaunchPage().clickStartYourPersonalizedJourneyButton();
	}
}
