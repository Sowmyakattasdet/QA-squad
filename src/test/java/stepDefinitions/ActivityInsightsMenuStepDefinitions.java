package stepDefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;

public class ActivityInsightsMenuStepDefinitions {

	private PageObjectManager pom;

	public ActivityInsightsMenuStepDefinitions(Hooks hooks) {
		this.pom = hooks.getPom();
	}

	@Given("User is on the Her Balance Dashboard with the activity insights submenu expanded")
	public void user_is_on_the_her_balance_dashboard_with_the_activity_insights_submenu_expanded()
			throws InterruptedException {

		pom.geActivityInsightsMenuPage().Login();
		pom.geActivityInsightsMenuPage().clickOnMenu();
		Thread.sleep(2000);

	}

	@When("User clicks on track weight")
	public void user_clicks_on_track_weight() {

		pom.geActivityInsightsMenuPage().clickOnSubMenu();

	}

	@Then("Should see  header text {string}")
	public void should_see_header_text_weight_tracking(String headerText) {
		Assert.assertEquals(
				pom.geActivityInsightsMenuPage().validateSubMenuHeaderText(),
				headerText);
	}

	@Then("Should see {string}")
	public void should_see(String subTitle) {
		Assert.assertEquals(pom.geActivityInsightsMenuPage().validateSubTitle(),
				subTitle);
	}

	@Then("{string} button should be visible")
	public void button_should_be_visible(String string) {
		Assert.assertTrue(
				pom.geActivityInsightsMenuPage().validateBackToDashboard());
	}

	@Then("{int} cards should be present")
	public void cards_should_be_present(Integer noOfcards) {

		Assert.assertEquals(
				pom.geActivityInsightsMenuPage().validateThreeCards(),
				noOfcards);

	}

	@Then("Starting weight , Current weight and Goal weight card should be displayed")
	public void starting_weight_current_weight_and_goal_weight_card_should_be_displayed() {
		boolean result = pom.geActivityInsightsMenuPage()
				.validateStartingWeight();
		boolean result1 = pom.geActivityInsightsMenuPage()
				.validateCurrentWeight();
		boolean result2 = pom.geActivityInsightsMenuPage().validateGoalWeight();

		Assert.assertTrue(result && result1 && result2);
	}

	@Then("Label and weight values should be center-aligned")
	public void label_and_weight_values_should_be_center_aligned() {

	}

	@Then("Weight value should be mapped from the onboarding process")
	public void weight_value_should_be_mapped_from_the_onboarding_process()
			throws InterruptedException {

		pom.geActivityInsightsMenuPage().navigateBack();
		Thread.sleep(2000);
		String expectedWeight = pom.geActivityInsightsMenuPage()
				.getWeightfromDashboard();
		Thread.sleep(2000);
		pom.geActivityInsightsMenuPage().clickOnMenu();
		pom.geActivityInsightsMenuPage().clickOnSubMenu();
		String actualWeight = pom.geActivityInsightsMenuPage()
				.getStartingWeightfromInsight();
		// Thread.sleep(2000);
		Assert.assertEquals(actualWeight, expectedWeight);

	}

	@Then("Current Weight should be x value")
	public void current_weight_should_be_x_value() {
		String actualWeight = pom.geActivityInsightsMenuPage()
				.getCurrentWeight();
		pom.geActivityInsightsMenuPage().navigateBack();
		String expectedWeight = pom.geActivityInsightsMenuPage()
				.getCurrentWeightfromDashboard();
		Assert.assertEquals(actualWeight, expectedWeight);

	}

	@Then("Goal weight should be displayed")
	public void goal_weight_should_be_displayed() {

		String actualWeight = pom.geActivityInsightsMenuPage().getGoalWeight();
		pom.geActivityInsightsMenuPage().navigateBack();
		String expectedWeight = pom.geActivityInsightsMenuPage()
				.getGoalWeightfromDashboard();
		Assert.assertEquals(actualWeight, expectedWeight);

	}

	@Then("Header should be {string}")
	public void header_should_be(String header) {

		Assert.assertEquals(pom.geActivityInsightsMenuPage()
				.getProgressSectionHeader().toLowerCase(),
				header.toLowerCase());

	}

	@Then("Sub text should be {string}")
	public void sub_text_should_be_weight_loss_progress(String header) {

		Assert.assertEquals(
				pom.geActivityInsightsMenuPage().getProgressSectionSubHeader(),
				header);

	}

	@Then("Completion percentage should be displayed")
	public void completion_percentage_should_be_displayed() {
		Assert.assertTrue(
				pom.geActivityInsightsMenuPage().getCompletionPercentage());
	}

	@Then("Progress bar should be visible")
	public void progress_bar_should_be_visible() {
		Assert.assertTrue(
				pom.geActivityInsightsMenuPage().validateProgressBar());
	}

	@Then("weight lost should be displayed")
	public void weight_lost_should_be_displayed() {

		Assert.assertTrue(pom.geActivityInsightsMenuPage().getWeightLost());

	}

	@Then("Remaining weight  should be displayed")
	public void remaining_weight_should_be_displayed() {
		Assert.assertTrue(
				pom.geActivityInsightsMenuPage().getWeightRemaining());
	}

	@Then("Graph section header should be {string}")
	public void graph_section_header_should_be(String header) {

		Assert.assertEquals(
				pom.geActivityInsightsMenuPage().getGraphSectionHeader(),
				header);

	}

	@Then("Graph should be visible with x-axis showing days Day {int} to Day {int}")
	public void graph_should_be_visible_with_x_axis_showing_days_day_to_day(
			Integer int1, Integer int2) {

		Assert.assertTrue(pom.geActivityInsightsMenuPage().getxAxisLabel());

	}

	@Then("Y-axis should display weight values in kg")
	public void y_axis_should_display_weight_values_in_kg() {
		Assert.assertEquals(
				pom.geActivityInsightsMenuPage().yaxisLabelValidation(),
				"Weight (kg)");
	}

	@Then("{string} reference line should be displayed")
	public void reference_line_should_be_displayed(String header) {
		Assert.assertEquals(
				pom.geActivityInsightsMenuPage().validateReferenceline(),
				header);
	}

	@Then("{string} should be visible")
	public void should_be_visible(String header) {
		Assert.assertEquals(
				pom.geActivityInsightsMenuPage().validateLogTodayheader(),
				header);
	}

	@Then("{string} {string},{string} should be displayed")
	public void should_be_displayed(String Weight, String AutoCalculate,
			String Note) {

		String actualWeightlabel = pom.geActivityInsightsMenuPage()
				.bmiWeightFieldLable();
		String actualAutoCalclabel = pom.geActivityInsightsMenuPage()
				.bmiAutoCalcFieldLable();
		String actualNotelabel = pom.geActivityInsightsMenuPage()
				.bmiNotetFieldLable();

		System.out.print("labels are " + actualWeightlabel + actualAutoCalclabel
				+ actualNotelabel);
		Assert.assertTrue(actualWeightlabel.equals(Weight)
				&& actualAutoCalclabel.equals(AutoCalculate)
				&& actualNotelabel.equals(Note));

	}

	@Then("Section should indicate the current tracking day \\(e.g., {string})")
	public void section_should_indicate_the_current_tracking_day_e_g(
			String string) {

		String actualResult = pom.geActivityInsightsMenuPage()
				.getDaysCountInsightPage();
		pom.geActivityInsightsMenuPage().navigateBack();
		int Expected = pom.geActivityInsightsMenuPage().getDaysleftDB();

		String expectedResult = "Day " + Expected + " of 7";
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Then("BMI\" field should auto-calculate")
	public void bmi_field_should_auto_calculate() {

		Assert.assertTrue(
				pom.geActivityInsightsMenuPage().validatebmiAutoCalculate());

	}

	@Then("Log weight button should be disabled")
	public void log_weight_button_should_be_disabled() {
		Assert.assertFalse(pom.geActivityInsightsMenuPage()
				.validateLogWeightButtondisabled());
	}

	@Then("Log Weight button should be Enabled")
	public void log_weight_button_should_be_enabled() {
		Assert.assertTrue(pom.geActivityInsightsMenuPage()
				.validateLogWeightButtondEnabled());
	}

}
