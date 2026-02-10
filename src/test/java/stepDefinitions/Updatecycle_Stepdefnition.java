package stepDefinitions;

import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageObjectManager;

public class Updatecycle_Stepdefnition {

	// ----------------------------

	private PageObjectManager pom;

	public Updatecycle_Stepdefnition(Hooks hooks) {
		this.pom = hooks.getPom();
	}

	@Given("User is on Update Cycle Information popup")
	public void user_is_on_update_cycle_information_popup()
			throws InterruptedException {

		pom.getSignUpPage().login();
		Thread.sleep(5000);
		pom.getMenstrualPhaseLogs_Page().clickOnInsightsMenu();
		pom.getMenstrualPhaseLogs_Page().clickOnMenstrualPhaseLog();
		pom.getUpdateCycle_Page().updateCycleInformation.click();
		Thread.sleep(3000);

	}

	@When("User selects the date from the calendar")
	public void user_selects_the_date_from_the_calendar() {

		pom.getUpdateCycle_Page().enableDateSelection();
	}

	@Then("The date selected should be highlighted")
	public void the_date_selected_should_be_highlighted() {

		Assert.assertTrue(pom.getUpdateCycle_Page().isDateSelected());;

	}

	// @upif1
	@When("User clicks the “<” icon on the calendar")
	public void user_clicks_the_icon_on_the_calendar() {

	}

	@Then("Calendar should shift to the previuos month")
	public void calendar_should_shift_to_the_previuos_month() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	// @upif2
	@When("User clicks the {string} right icon on the calendar")
	public void user_clicks_the_right_icon_on_the_calendar(String string) {

		pom.getUpdateCycle_Page().nextMonth();

	}

	@Then("Calendar should shift to the next month")
	public void calendar_should_shift_to_the_next_month() {

	}

	// @upif3

	@When("User enters the new Cycle Length")
	public void user_enters_the_new_cycle_length() {
	}

	@Then("User should be able to edit the cycle length")
	public void user_should_be_able_to_edit_the_cycle_length() {

	}

	// @upif4

	@When("User clicks on Cancel button")
	public void user_clicks_on_cancel_button() {

		pom.getUpdateCycle_Page().cancelButton();
	}

	@Then("User should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String expected) {

		String actual = pom.getUpdateCycle_Page().menstrualphaselogs1gettext();
		Assert.assertEquals(actual, expected);

	}

	// @upif5

	@When("User clicks on Save Changes button after editing date or cycle length")
	public void user_clicks_on_save_changes_button_after_editing_date_or_cycle_length() {

		pom.getUpdateCycle_Page().clicksaveChanges();
	}

}
