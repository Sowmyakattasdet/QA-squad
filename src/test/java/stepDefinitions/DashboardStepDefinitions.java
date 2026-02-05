
package stepDefinitions;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;

public class DashboardStepDefinitions {

	SoftAssert soft = new SoftAssert();
	private PageObjectManager pom;
	public DashboardStepDefinitions(Hooks hooks) {
		this.pom = hooks.getPom();
	}

	@Given("User is on the HerBalance auth page")
	public void user_is_on_the_her_balance_auth_page() {

		// pom.getDashboardPage().launchApplication();
		pom.getLaunchPage().clickLoginButton();

	}

	@When("User clicks login in button after entering  a valid credential")
	public void user_clicks_login_in_button_after_entering_a_valid_credential() {
		pom.getDashboardPage().Login();

	}

	@Then("User should see {string} title")
	public void user_should_see_title(String exptitle) {
		String acttitle = pom.getDashboardPage().Dashboardtitletext();
		Assert.assertEquals(acttitle, exptitle,
				"user is not on Free Plan Dashboard");
	}

	@Then("User should see user name on the top right side")
	public void user_should_see_user_name_on_the_top_right_side() {
		boolean actout = pom.getDashboardPage().profile_name();
		Assert.assertTrue(actout, "user name is not displayed");
	}

	@Then("User should see profile icon near user name")
	public void user_should_see_profile_icon_near_user_name() {
		boolean actout = pom.getDashboardPage().profileicondisplay();
		Assert.assertTrue(actout, "profile icon is not displayed");
	}

	@Then("User should see bell icon for notification")
	public void user_should_see_bell_icon_for_notification() {
		boolean actout = pom.getDashboardPage().bellicondisplay();
		Assert.assertTrue(actout, "bell icon is not displayed");
	}

	@Then("User should see search bar in dashboard")
	public void user_should_see_search_bar_in_dashboard() {
		boolean actout = pom.getDashboardPage().searchbardisplay();
		Assert.assertTrue(actout, "bell icon is not displayed");
	}

	@Then("User should see {int} menus in dashboard")
	public void user_should_see_menus_in_dashboard(Integer expout) {
		int actout = pom.getDashboardPage().countmenus();
		Assert.assertEquals(actout, expout, "count of menus is not 12");
	}

	@Then("User Name, {string},{string},{string},{string}, {string},{string}, {string}, {string},  {string}")
	public void user_name(String expout, String expout2, String expout3,
			String expout4, String expout5, String expout6, String expout7,
			String expout8, String expout9) {
		String actout = pom.getDashboardPage().activityinsighttxt();
		String actout2 = pom.getDashboardPage().dietplantxt();
		String actout3 = pom.getDashboardPage().workouttxt();
		String actout4 = pom.getDashboardPage().watertrackertxt();
		String actout5 = pom.getDashboardPage().fullcycletxt();
		String actout6 = pom.getDashboardPage().uploadreporttxt();
		String actout7 = pom.getDashboardPage().upgradepremiumxt();
		String actout8 = pom.getDashboardPage().generatesevendayp();
		String actout9 = pom.getDashboardPage().premiumplantxt();
		soft.assertEquals(actout, expout, "Activity insight is invisible");
		soft.assertEquals(actout2, expout2, "Diet plan is invisible");
		soft.assertEquals(actout3, expout3, "workout is invisible");
		soft.assertEquals(actout4, expout4, "watertracker is invisible");
		soft.assertEquals(actout5, expout5,
				"view full cycle details is invisible");
		soft.assertEquals(actout6, expout6, "upload blood report is invisible");
		soft.assertEquals(actout7, expout7, "upgrade to premium is invisible");
		soft.assertEquals(actout8, expout8, "generate 7day plan  is invisible");
		soft.assertEquals(actout9, expout9, "see premium plan is invisible");
		soft.assertAll();
	}

	@Then("User should see  {string},{string}")
	public void user_should_see(String expout, String expout2) {
		String actout = pom.getDashboardPage().freeplanacctxt();
		String actout2 = pom.getDashboardPage().enjoyfreetxt();
		soft.assertEquals(actout, expout,
				"User should see  Free Plan • Access to Basic Features is not visible");
		soft.assertEquals(actout2, expout2,
				"User should see  Free Plan • Access to Basic Features is not visible");
		soft.assertAll();
	}

	@Then("Sub text should be located at the centre of the page")
	public void sub_text_should_be_located_at_the_centre_of_the_page() {
		boolean actout = pom.getDashboardPage().subtextdisplay();
		Assert.assertTrue(actout, "subtext is not located");
	}

	@Then("{int} section should be visible")
	public void section_should_be_visible(Integer expout1) {
		int actout = pom.getDashboardPage().countsection();
		Assert.assertEquals(actout, expout1, "count of sections is not 5");
	}

	@Then("{string},{string},{string},{string},{string}")
	public void string_string_string_string_string(String expout,
			String expout2, String expout3, String expout4, String expout5) {
		String actout = pom.getDashboardPage().weightheading();
		String actout2 = pom.getDashboardPage().healthsectionhead();
		String actout3 = pom.getDashboardPage().bloodrepheadsec();
		String actout4 = pom.getDashboardPage().menstrualsechead();
		String actout5 = pom.getDashboardPage().subscriptionsecitonhead();
		soft.assertEquals(actout, expout,
				"Weight & Body Metrics heading is not visible");
		soft.assertEquals(actout2, expout2, "Health Conditions is not visible");
		soft.assertEquals(actout3, expout3,
				"Blood Report Insights is not visible");
		soft.assertEquals(actout4, expout4,
				"Menstrual Cycle Insights is not visible");
		soft.assertEquals(actout5, expout5,
				"Subscription Information is not visible");
		soft.assertAll();
	}

	@Then("{string} , {string} , {string} , {string},{string}")
	public void string_string_string_string_string1(String expout,
			String expout2, String expout3, String expout4, String expout5) {
		String actout = pom.getDashboardPage().currentweight();
		soft.assertEquals(actout, expout, "Weight  is not visible");
		String actout2 = pom.getDashboardPage().heighttxt();
		soft.assertEquals(actout2, expout2, "height  is not visible");
		String actout3 = pom.getDashboardPage().bmitxt();
		soft.assertEquals(actout3, expout3, "BMI  is not visible");
		String actout4 = pom.getDashboardPage().sevendaygoalxt();
		soft.assertEquals(actout4, expout4, "7-day goal is not visible");
		String actout5 = pom.getDashboardPage().bmireftxt();
		soft.assertEquals(actout5, expout5,
				"BMI Reference Guide is not visible");
		soft.assertAll();
	}

	@Then("App should have {string} weight, {string} , {string}, {string}")
	public void app_should_have_weight(String expout, String expout2,
			String expout3, String expout4) {
		String actout = pom.getDashboardPage().startingwt();
		soft.assertEquals(actout, expout, "Starting Weight  is not visible");
		String actout2 = pom.getDashboardPage().goaltxt();
		soft.assertEquals(actout2, expout2, "Goal  is not visible");
		String actout3 = pom.getDashboardPage().weeklygoaltx();
		soft.assertEquals(actout3, expout3, "weekly target  is not visible");
		String actout4 = pom.getDashboardPage().dailyweightx();
		soft.assertEquals(actout4, expout4, "dailyweigh  is not visible");
		soft.assertAll();
	}

	@Then("Should display the user’s weight as entered during the onboarding process.")
	public void should_display_the_user_s_weight_as_entered_during_the_onboarding_process() {
		Double actout = pom.getDashboardPage().weightvaltxt();
		Double expout = pom.getDashboardPage().weightvaltxt();
		Assert.assertEquals(actout, expout, "weight is not matching");
	}

	@Then("Should display the user’s Height as entered during the onboarding process.")
	public void should_display_the_user_s_height_as_entered_during_the_onboarding_process() {
		double actout = pom.getDashboardPage().heightvaltxt();
		double expout = pom.getDashboardPage().getheightfromedit();
		Assert.assertEquals(actout, expout, "height is not matching");

	}

	@Then("BMI should be correctly calculated using the formula \\(Weight in kg \\/ \\(Height in m)^{int})")
	public void bmi_should_be_correctly_calculated_using_the_formula_weight_in_kg_height_in_m(
			Integer int1) {
		double weight = pom.getDashboardPage().weightvaltxt();
		double height = pom.getDashboardPage().heightvaltxt() / 100;
		double expout = Math.round((weight) / (height * height) * 10.0) / 10.0;
		double actout = pom.getDashboardPage().bmivaltxt();
		Assert.assertEquals(actout, expout, "BMI is not matching");
	}

	@Then("Should display weight entered by user")
	public void should_display_weight_entered_by_user() {
		double expout = pom.getDashboardPage().weightvaltxt();
		double actout = pom.getDashboardPage().getweightfromedit();
		Assert.assertEquals(actout, expout, "weight is not matching");
	}

	@Then("Goal weight should be displayed as the difference from the weekly target")
	public void goal_weight_should_be_displayed_as_the_difference_from_the_weekly_target() {

	}

	@Then("Weekly target should be {double} kg")
	public void weekly_target_should_be_kg(Double expout) {
		String actout = pom.getDashboardPage().weeklytargwt();
		Assert.assertEquals(actout, expout, "target is not matching");

	}
	@Then("Daily weigh in should be - {string}")
	public void daily_weigh_in_should_be(String expout) {
		String actout = pom.getDashboardPage().dailyweightxt();
		Assert.assertEquals(actout, expout,
				"Morning, before food is not visible");

	}

	@Then("Subcription details should be present in {int}-day goal section")
	public void subcription_details_should_be_present_in_day_goal_section(
			Integer int1) {
		boolean actout = pom.getDashboardPage().freeplandetails();
		Assert.assertTrue(actout, "subtext is not located");
	}

	@Then("Slider should be present in BMI reference guide")
	public void slider_should_be_present_in_bmi_reference_guide() {
		boolean actout = pom.getDashboardPage().bmislider();
		Assert.assertTrue(actout, "bmi slider is not present");
	}

	@Then("BMI Reference Guide component should be displayed with a gradient slider and labeled ranges")
	public void bmi_reference_guide_component_should_be_displayed_with_a_gradient_slider_and_labeled_ranges() {
		boolean actout = pom.getDashboardPage().gradiantslider();
		Assert.assertTrue(actout, "gradiant slider is not displayed");

	}

	@Then("{string} label should be visible above the slider")
	public void label_should_be_visible_above_the_slider(String expout) {
		String actout = pom.getDashboardPage().infolabel();
		Assert.assertEquals(actout, expout, "info label is not present");
	}
	@Then("Message “Free plan includes {int} days of limited tracking” should be displayed clearly below the slider")
	public void message_free_plan_includes_days_of_limited_tracking_should_be_displayed_clearly_below_the_slider(
			Integer int1) {
		String actout = pom.getDashboardPage().fptext();
		String expout = pom.getDashboardPage().fpt();
		Assert.assertEquals(actout, expout, "info label is not present");
	}
	@Then("Displayed condition\\(s) match exactly what was selected during onboarding, without requiring user input again")
	public void displayed_condition_s_match_exactly_what_was_selected_during_onboarding_without_requiring_user_input_again() {
		String actout = pom.getDashboardPage().healthissuetext();
		String expout = pom.getDashboardPage().healthiss();

		Assert.assertEquals(actout, expout, "health condition is not visible");
	}

	@Then("Message appears below condition card explaining how the plan is adjusted")
	public void message_appears_below_condition_card_explaining_how_the_plan_is_adjusted() {
		boolean actout = pom.getDashboardPage().healthplantxt();
		Assert.assertTrue(actout, "health condition message is not displayed");
	}
	@Then("Card includes heart icon, condition name , and info icon with related text")
	public void card_includes_heart_icon_condition_name_and_info_icon_with_related_text() {
		boolean actout = pom.getDashboardPage().heartsym();
		boolean actout2 = pom.getDashboardPage().heartcondisplayl();
		boolean actout3 = pom.getDashboardPage().heartcondisplayl();
		soft.assertEquals(actout, "heart symbol is not displayed");
		soft.assertEquals(actout3, "icon with relatedtext is not displayed");
		soft.assertEquals(actout2, "health conditon  is not displayed");
	}
	@Then("Message like “No health conditions selected” or an empty state is displayed")
	public void message_like_no_health_conditions_selected_or_an_empty_state_is_displayed() {
		boolean actout = pom.getDashboardPage().nohealthissue();
		Assert.assertTrue(actout, "no healthissue   is not displayed");
	}

	@Then("Blood Report Insights section should display the personalized values and insights")
	public void blood_report_insights_section_should_display_the_personalized_values_and_insights() {
		boolean actout = pom.getDashboardPage().uploadfiledyanamic();
		Assert.assertTrue(actout,
				"personalized values in blood report insight   is not displayed");
	}

	@Then("User should see the {string} button")
	public void user_should_see_the_button(String expout) {
		String actout = pom.getDashboardPage().uploadbutton();
		Assert.assertEquals(actout, expout,
				"blood report button    is not displayed");
	}
	@Then("Message prompting them to upload their medical blood test report")
	public void message_prompting_them_to_upload_their_medical_blood_test_report() {
		boolean actout = pom.getDashboardPage().reporttex();
		Assert.assertTrue(actout, "blood report button    is not displayed");
	}

	@Then("{string} button should be enabled")
	public void button_should_be_enabled(String string) {
		boolean actout = pom.getDashboardPage().btnenable();
		Assert.assertTrue(actout,
				"upload blood report button    is not enable");
	}
	@Then("Joined date should be displayed")
	public void joined_date_should_be_displayed() {
		boolean actout = pom.getDashboardPage().joineddate();
		Assert.assertTrue(actout, "joined date    is not displayed");

	}
	@Then("Todays date should be display")
	public void todays_date_should_be_display() {
		boolean actout = pom.getDashboardPage().todaydate();
		Assert.assertTrue(actout, "todays date  is not displayed");
	}
	@Then("Subcription plan should be displayed")
	public void subcription_plan_should_be_displayed() {
		boolean actout = pom.getDashboardPage().subscriptionplan();
		Assert.assertTrue(actout, "subscription plan  is not displayed");
	}

	@Then("Status of plan should be displayed\\(how many days left out of {int} days free plan)")
	public void status_of_plan_should_be_displayed_how_many_days_left_out_of_days_free_plan(
			Integer int1) {
		boolean actout = pom.getDashboardPage().subsplanrem();
		Assert.assertTrue(actout,
				"subscription plan reamaining days  is not displayed");

	}
	@Then("{string} button should be displayed")
	public void button_should_be_displayed(String string) {
		boolean actout = pom.getDashboardPage().premiumbtn();
		Assert.assertTrue(actout, "Upgrade to Premium  is not displayed");

	}

}
