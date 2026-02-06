package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import factory.DriverManager;
import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.UpdateCycle_Page;
import pom.PageObjectManager;
import pages.*;


	
public class Updatecycle_Stepdefnition {

	
	
	
	//----------------------------

	private PageObjectManager pom;

	public Updatecycle_Stepdefnition(Hooks hooks)
	{
		this.pom = hooks.getPom();
	}	
	
	
	
	@Given("User is on Update Cycle Information popup")
	public void user_is_on_update_cycle_information_popup() throws InterruptedException {
		
		
		
		pom.geActivityInsightsMenuPage().Login();
		Thread.sleep(5000);
		pom.geActivityInsightsMenuPage().clickOnMenu();
		
		Thread.sleep(3000);

		//pom.getUpdateCycle_Page().menstrualclkMpl().click();
		Thread.sleep(3000);
	//	pom.getUpdateCycle_Page().menstrualclkMpl();
		
		
		
		
		/*driver.get("https://herbalance.numpyninja.com/auth");
		//	driver.get("https://herbalance.numpyninja.com/profile/edit");
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys("qasquadteam3@gmail.com");
			driver.findElement(By.xpath("//*[@type='password']")).sendKeys("herbalance123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(5000);
			*/
		
		/*
		.navigateTomenstrualPhaseLogs();
		//pom.getUpdateCycle_Page().menstrualPhaseLogs();
	
	
	  
	 */
		
		
		
		
		
		
		/*pom.geActivityInsightsMenuPage().Login();
		pom.geActivityInsightsMenuPage().clickOnMenu();
		Thread.sleep(2000);

		//pom.getUpdateCycle_Page().navigateTomenstrualPhaseLogs();
		//pom.getUpdateCycle_Page().menstrualPhaseLogs();
	
	*/
		

	}

//@UpdateCycleInformation
	@When("User selects the date from the calendar")
	public void user_selects_the_date_from_the_calendar() {
	     
		pom.getUpdateCycle_Page().enableDateSelection();
	}

	@Then("The date selected should be highlighted")
	public void the_date_selected_should_be_highlighted() {
	   
	Assert.assertTrue(pom.getUpdateCycle_Page().isDateSelected(),
		        "Selected date is not highlighted");
	
	
	}

//@upif1
	@When("User clicks the “<” icon on the calendar")
	public void user_clicks_the_icon_on_the_calendar() {
    
		
	}

	@Then("Calendar should shift to the previuos month")
	public void calendar_should_shift_to_the_previuos_month() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	

/*@When("User clicks the “>” icon on the calendar")
public void user_clicks_the_icon_on_the_calendar() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();

    if (direction.equals("<")) {
        // click previous month icon
    } else if (direction.equals(">")) {
        // click next month icon
    }
}
*/
//@upif2
@When("User clicks the {string} right icon on the calendar")
public void user_clicks_the_right_icon_on_the_calendar(String string) {

	pom.getUpdateCycle_Page().nextMonth();

}
	
@Then("Calendar should shift to the next month")
public void calendar_should_shift_to_the_next_month() {
    
	
}

	
//@upif3

@When("User enters the new Cycle Length")
public void user_enters_the_new_cycle_length() {
}

@Then("User should be able to edit the cycle length")
public void user_should_be_able_to_edit_the_cycle_length() {
   
}

//@upif4

@When("User clicks on Cancel button")
public void user_clicks_on_cancel_button() {
   
	pom.getUpdateCycle_Page().cancelButton();
}

@Then("User should be redirected to {string} page")
public void user_should_be_redirected_to_page(String expected) {
   
	String actual = pom.getUpdateCycle_Page().menstrualphaselogs1gettext();
    Assert.assertEquals(actual, expected);


}
	

//@upif5

@When("User clicks on Save Changes button after editing date or cycle length")
public void user_clicks_on_save_changes_button_after_editing_date_or_cycle_length() {


	pom.getUpdateCycle_Page().clicksaveChanges();
}

@Then("{string} message should popup")
public void message_should_popup(String expectedMessage) {

//	String actualMessage =pom.getUpdateCycle_Page().cycleLengthSaveChangepopupmessage();
	
	Assert.assertTrue(
	        pom.getUpdateCycle_Page().cycleLengthSaveChangepopupmessage(),
	        "Saved Successfully popup was not displayed"
	    );
	
	//Assert.assertEquals(actualMessage, expectedMessage,"Displayed message matched");
	//Assert.assertNotEquals(actualMessage, expectedMessage,"Displayed message matched");


}

	

	
}


/*
 pom.getActivityInsightsPage().openMenstrualPhaseLogs();
Assert.assertTrue(
pom.getUpdateCycle_Page().isUpdateCyclePageDisplayed(),
"Update Cycle Information page is not displayed"




**/






/*pom.geActivityInsightsMenuPage().Login();
pom.geActivityInsightsMenuPage().clickOnMenu();
Thread.sleep(2000);

//pom.getUpdateCycle_Page().navigateTomenstrualPhaseLogs();
//pom.getUpdateCycle_Page().menstrualPhaseLogs();

*/
