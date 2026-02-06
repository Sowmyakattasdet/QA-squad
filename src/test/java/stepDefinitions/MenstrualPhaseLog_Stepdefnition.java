package stepDefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;

public class MenstrualPhaseLog_Stepdefnition {

	private PageObjectManager pom;

	public MenstrualPhaseLog_Stepdefnition(Hooks hooks) {
		this.pom = hooks.getPom();
	}

	@Given("User is on the Her Balance Dashboard with the Activity Insights submenu expanded")
	public void user_is_on_the_her_balance_dashboard_with_the_activity_insights_submenu_expanded()
			throws InterruptedException {
		pom.getSignUpPage().login();

		pom.getMenstrualPhaseLogs_Page().clickOnInsightsMenu();
		Thread.sleep(2000);
	}

	@When("User Clicks on Menstrual Phase Logs")
	public void user_clicks_on_menstrual_phase_logs() {

		pom.getMenstrualPhaseLogs_Page().menstrualPhaseLogs();

	}

	@Then("{int} sections should be visible\\(Current Cycle Status, Upcoming Phases, Recommended Activities, Nutrtion Tips, Next Period)")
	public void sections_should_be_visible_current_cycle_status_upcoming_phases_recommended_activities_nutrtion_tips_next_period(
			Integer int1) throws InterruptedException {

		Assert.assertTrue(
				pom.getMenstrualPhaseLogs_Page().detailsOnMenstrualPage());

	}

}
