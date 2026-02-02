package stepDefinitions;

import org.testng.Assert;

import factory.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LaunchPageShiva;
import pages.LoginPage;

public class LoginStepDefinitions {

	 private LaunchPageShiva launchPage;
	    private LoginPage loginPage;
//---------------------------  Login-UI  --------------------------
	

	@Given("User is on the HerBalance launch page")
    public void user_is_on_the_her_balance_launch_page() {
        DriverManager.getDriver().get("https://herbalance.numpyninja.com/home");
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("User clicks log in button")
    public void user_clicks_log_in_button() {
        loginPage.clickLoginButton();
    }

    @Then("HerBalance logo should be visible on the top-left corner")
    public void her_balance_logo_should_be_visible_on_the_top_left_corner() {
        Assert.assertTrue(loginPage.isLogoDisplayed(), "HerBalance logo not visible");
    }
}
//@Then("{string} tabs should be visible")
//public void tabs_should_be_visible(String string) {
//    
//}
//
//@Then("“Login” tab should be active by default")
//public void login_tab_should_be_active_by_default() {
//    
//}
//
//@Then("Email ID input field with placeholder {string} should be visible")
//public void email_id_input_field_with_placeholder_should_be_visible(String string) {
//    
//}
//
//@Then("Password input field with masked entry should be visible")
//public void password_input_field_with_masked_entry_should_be_visible() {
//    
//}
//
//@Then("“Show password” should be visible")
//public void show_password_should_be_visible() {
//    
//}
//
//@Then("“Login” button should be visible, enabled")
//public void login_button_should_be_visible_enabled() {
//    
//}
//
//@Then("“Forgot password?” link should be visible")
//public void forgot_password_link_should_be_visible() {
//    
//}
//
//@Then("“Sign Up” link should be visible and navigates to the Sign-Up page")
//public void sign_up_link_should_be_visible_and_navigates_to_the_sign_up_page() {
//    
//}
//
//@Then("The right section should display “Cycle-Synced Plans”, “Blood Work Analysis”, and “Personalized Dashboard” content")
//public void the_right_section_should_display_cycle_synced_plans_blood_work_analysis_and_personalized_dashboard_content() {
//    
//}
//
//@Then("A testimonial with text and name \\(e.g., “Sarah, {int}”) should be displayed")
//public void a_testimonial_with_text_and_name_e_g_sarah_should_be_displayed(Integer int1) {
//    
//}
//
//@Then("There should be exactly {int} tabs — “Login” and “Sign Up”")
//public void there_should_be_exactly_tabs_login_and_sign_up(Integer int1) {
//    
//}
//
//@Then("Email ID fields should be properly aligned vertically with equal spacing")
//public void email_id_fields_should_be_properly_aligned_vertically_with_equal_spacing() {
//    
//}
//
//@Then("Password fields should be properly aligned vertically with equal spacing")
//public void password_fields_should_be_properly_aligned_vertically_with_equal_spacing() {
//    
//}
//
//@Then("There should be exactly {int} input field")
//public void there_should_be_exactly_input_field(Integer int1) {
//    
//}
//
//@Then("Radio button for show password")
//public void radio_button_for_show_password() {
//    
//}
//
//@Then("The background gradient \\(light purple) and fonts should match HerBalance theme")
//public void the_background_gradient_light_purple_and_fonts_should_match_her_balance_theme() {
//    
//}
//}
