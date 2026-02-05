package stepDefinitions;

import org.testng.Assert;

import factory.DriverManager;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginStepDefinitions {

    private LoginPage loginPage;
	//---------------------------  Login-UI  --------------------------

    @Given("User is on the HerBalance launch page")
    public void user_is_on_the_her_balance_launch_page() {
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("User clicks log in button")
    public void user_clicks_log_in_button() {
        loginPage.clickLoginButton();
    }


    @Then("HerBalance logo should be visible on the top-left corner")
    public void her_balance_logo_should_be_visible_on_the_top_left_corner() {
        Assert.assertTrue(loginPage.isLogoDisplayed(), "HerBalance logo is NOT visible");
    }

    @Then("{string} tabs should be visible")
    public void tabs_should_be_visible(String tabName) {
        Assert.assertTrue(loginPage.isTabVisible(tabName), tabName + " tab is NOT visible");
    }

    @Then("“Login” tab should be active by default")
    public void login_tab_should_be_active_by_default() {
        Assert.assertTrue(loginPage.isLoginTabActive(), "Login tab is NOT active by default");
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        String email = ConfigReader.getProperty("app.username");
        String password = ConfigReader.getProperty("app.password");
        loginPage.login(email, password);
    }

    @Then("User should be redirected to the dashboard")
    public void user_should_be_redirected_to_the_dashboard() {
        String url = DriverManager.getDriver().getCurrentUrl();
        Assert.assertTrue(loginPage.isOnDashboard(),
                "User was NOT redirected. Current URL: " + url);
    }
    @Then("Email ID input field with placeholder {string} should be visible")
    public void email_id_input_field_with_placeholder_should_be_visible(String placeholder) {
        Assert.assertTrue(loginPage.isEmailFieldVisibleWithPlaceholder(placeholder),
                "Email field not visible OR placeholder mismatch: " + placeholder);
    }
    @Then("Password input field with masked entry should be visible")
    public void password_input_field_with_masked_entry_should_be_visible() {
        Assert.assertTrue(loginPage.isPasswordFieldVisibleAndMasked(),
                "Password field not visible OR not masked (type!=password)");
    }

    @Then("“Show password” should be visible")
    public void show_password_should_be_visible() {
        Assert.assertTrue(loginPage.isShowPasswordVisible(),
                "Show password is NOT visible");
    }

    @Then("“Login” button should be visible, enabled")
    public void login_button_should_be_visible_enabled() {
        Assert.assertTrue(loginPage.isLoginButtonVisibleAndEnabled(),
                "Login button is NOT visible/enabled");
    }

    @Then("“Forgot password?” link should be visible")
    public void forgot_password_link_should_be_visible() {
        Assert.assertTrue(loginPage.isForgotPasswordVisible(),
                "Forgot password link is NOT visible");
    }

    @Then("“Sign Up” link should be visible and navigates to the Sign-Up page")
    public void sign_up_link_should_be_visible_and_navigates_to_the_sign_up_page() {
        Assert.assertTrue(loginPage.isTabVisible("Sign Up"), "Sign Up tab/link is NOT visible");

        loginPage.clickSignUpTab();

        Assert.assertTrue(loginPage.isSignUpTabActive(),
                "Sign Up tab did NOT become active. Current URL: " + DriverManager.getDriver().getCurrentUrl());
    }


    @Then("The right section should display “Cycle-Synced Plans”, “Blood Work Analysis”, and “Personalized Dashboard” content")
    public void the_right_section_should_display_cycle_synced_plans_blood_work_analysis_and_personalized_dashboard_content() {
        Assert.assertTrue(loginPage.isRightPanelContentPresent(),
                "Right panel content missing: Cycle-Synced Plans / Blood Work Analysis / Personalized Dashboard");
    }
    @Then("Radio button for show password")
    public void radio_button_for_show_password() {
        Assert.assertTrue(loginPage.isShowPasswordRadioVisible(),
                "Show password radio/checkbox is NOT visible");
    }

    @Then("A testimonial with text and name \\(e.g., “Sarah, {int}”) should be displayed")
    public void a_testimonial_with_text_and_name_e_g_sarah_should_be_displayed(Integer age) {
        Assert.assertTrue(loginPage.isTestimonialDisplayed(),
                "Testimonial like 'Sarah, " + age + "' is NOT displayed");
    }

    @Then("There should be exactly {int} tabs — “Login” and “Sign Up”")
    public void there_should_be_exactly_tabs_login_and_sign_up(Integer expected) {
        Assert.assertEquals(loginPage.getTabsCount(), expected.intValue(),
                "Tabs count mismatch");
    }

    @Then("There should be exactly {int} input field")
    public void there_should_be_exactly_input_field(Integer expected) {
        Assert.assertEquals(loginPage.getEmailAndPasswordInputCount(), expected.intValue(),
                "Email+Password input count mismatch");
    }

@Then("Email ID fields should be properly aligned vertically with equal spacing")
public void email_id_fields_should_be_properly_aligned_vertically_with_equal_spacing() {
    Assert.assertTrue(loginPage.isFieldsVerticallyAlignedWithSpacing(),
            "Email/Password fields are NOT vertically aligned with spacing");
}

@Then("Password fields should be properly aligned vertically with equal spacing")
public void password_fields_should_be_properly_aligned_vertically_with_equal_spacing() {
    Assert.assertTrue(loginPage.isFieldsVerticallyAlignedWithSpacing(),
            "Email/Password fields are NOT vertically aligned with spacing");
}




@Then("The background gradient \\(light purple) and fonts should match HerBalance theme")
public void the_background_gradient_light_purple_and_fonts_should_match_her_balance_theme() {
    Assert.assertTrue(loginPage.isThemeLoaded(),
            "Theme/background not loaded correctly");
}
//---------------------------  Login-func  --------------------------

}
