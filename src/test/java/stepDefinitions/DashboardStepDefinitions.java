
package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import factory.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
//import pageObjects.LaunchPage;

public class DashboardStepDefinitions {

	private DashboardPage dashboardPg;
 private String appURL = null;
 private WebDriver driver;
 SoftAssert soft=new SoftAssert();
 

 public DashboardStepDefinitions() {
     driver = DriverManager.getDriver();
 
     dashboardPg= new DashboardPage(driver);
     
 }
	
@Given("User is on the HerBalance auth page")
public void user_is_on_the_her_balance_auth_page()  {
	
	driver.get("https://herbalance.numpyninja.com/auth");
	
}

@When("User clicks login in button after entering  a valid credential")
public void user_clicks_login_in_button_after_entering_a_valid_credential()  {
	dashboardPg.Login();

}

@Then("User should see {string} title")
public void user_should_see_title(String exptitle)  {
	String acttitle=dashboardPg.Dashboardtitletext();
	Assert.assertEquals(acttitle, exptitle,"user is not on Free Plan Dashboard");
}

@Then("User should see user name on the top right side")
public void user_should_see_user_name_on_the_top_right_side() {
	boolean actout=dashboardPg.profile_name();
	Assert.assertTrue(actout,"user name is not displayed");

}

@Then("User should see profile icon near user name")
public void user_should_see_profile_icon_near_user_name() {
	boolean actout=dashboardPg.profileicondisplay();
	Assert.assertTrue(actout,"profile icon is not displayed");
	
}

@Then("User should see bell icon for notification")
public void user_should_see_bell_icon_for_notification() {
	boolean actout=dashboardPg.bellicondisplay();
	Assert.assertTrue(actout,"bell icon is not displayed");
	
}
	
@Then("User should see search bar in dashboard")
public void user_should_see_search_bar_in_dashboard() {
	boolean actout=dashboardPg.searchbardisplay();
	Assert.assertTrue(actout,"bell icon is not displayed");
}

@Then("User should see {int} menus in dashboard")
public void user_should_see_menus_in_dashboard(Integer expout) {
 int actout=dashboardPg.countmenus();
	Assert.assertEquals(actout, expout,"count of menus is not 12");
}

@Then("User Name, {string},{string},{string},{string}, {string},{string}, {string}, {string},  {string}")
public void user_name(String expout, String expout2, String expout3, String expout4, String expout5, String expout6, String expout7, String expout8, String expout9) {
    String actout=dashboardPg.activityinsighttxt();
    String actout2=dashboardPg.dietplantxt();
    String actout3=dashboardPg.workouttxt();
    String actout4=dashboardPg.watertrackertxt();
    String actout5=dashboardPg.fullcycletxt();
    String actout6=dashboardPg.uploadreporttxt();
    String actout7=dashboardPg.upgradepremiumxt();
    String actout8=dashboardPg.generatesevendayp();
    String actout9=dashboardPg.premiumplantxt();
    soft.assertEquals(actout, expout,"Activity insight is invisible");
    soft.assertEquals(actout2, expout2,"Diet plan is invisible");
    soft.assertEquals(actout3, expout3,"workout is invisible");
    soft.assertEquals(actout4, expout4,"watertracker is invisible");
   soft.assertEquals(actout5, expout5,"view full cycle details is invisible");
    soft.assertEquals(actout6, expout6,"upload blood report is invisible");
    soft.assertEquals(actout7, expout7,"upgrade to premium is invisible");
    soft.assertEquals(actout8, expout8,"generate 7day plan  is invisible");
    soft.assertEquals(actout9, expout9,"see premium plan is invisible");
    soft.assertAll();
}




@Then("User should see  {string},{string}")
public void user_should_see(String expout, String expout2) {
	 String actout=dashboardPg.freeplanacctxt();
	 String actout2=dashboardPg.enjoyfreetxt();
	  soft.assertEquals(actout, expout,"User should see  Free Plan • Access to Basic Features is not visible");
	  soft.assertEquals(actout2, expout2,"User should see  Free Plan • Access to Basic Features is not visible");
	  soft.assertAll();
	 }

@Then("Sub text should be located at the centre of the page")
public void sub_text_should_be_located_at_the_centre_of_the_page() {
	boolean actout=dashboardPg.subtextdisplay();
	Assert.assertTrue(actout,"subtext is not located");
}

@Then("{int} section should be visible")
public void section_should_be_visible(Integer expout1) {
	int actout=dashboardPg.countsection();
	Assert.assertEquals(actout, expout1,"count of sections is not 5");
}

@Then("{string},{string},{string},{string},{string}")
public void string_string_string_string_string(String expout, String expout2, String expout3, String expout4, String expout5) {
	 String actout=dashboardPg.weightheading();
	 String actout2=dashboardPg.healthsectionhead();
	 String actout3=dashboardPg.bloodrepheadsec();
	 String actout4=dashboardPg.menstrualsechead();
	 String actout5=dashboardPg.subscriptionsecitonhead();
	 soft.assertEquals(actout, expout,"Weight & Body Metrics heading is not visible");
	 soft.assertEquals(actout2, expout2,"Health Conditions is not visible");
	 soft.assertEquals(actout3, expout3,"Blood Report Insights is not visible");
	soft.assertEquals(actout4, expout4,"Menstrual Cycle Insights is not visible");
	 soft.assertEquals(actout5, expout5,"Subscription Information is not visible");
	 soft.assertAll();
}




@Then("{string} , {string} , {string} , {string},{string}")
public void string_string_string_string_string1(String expout, String expout2, String expout3, String expout4, String expout5) {
	String actout=dashboardPg.currentweight();
	soft.assertEquals(actout, expout,"Weight  is not visible");
	String actout2=dashboardPg.heighttxt();
	soft.assertEquals(actout2, expout2,"height  is not visible");
	String actout3=dashboardPg.bmitxt();
	soft.assertEquals(actout3, expout3,"BMI  is not visible");
	String actout4=dashboardPg.sevendaygoalxt();
	soft.assertEquals(actout4, expout4,"7-day goal is not visible");
	String actout5=dashboardPg.bmireftxt();
	soft.assertEquals(actout5, expout5,"BMI Reference Guide is not visible");
	soft.assertAll();
}

@Then("App should have {string} weight, {string} , {string}, {string}")
public void app_should_have_weight(String expout, String expout2, String expout3, String expout4) {
	String actout=dashboardPg.startingwt();
	soft.assertEquals(actout, expout,"Starting Weight  is not visible");
	String actout2=dashboardPg.goaltxt();
	soft.assertEquals(actout2, expout2,"Goal  is not visible");
	String actout3=dashboardPg.weeklygoaltx();
	soft.assertEquals(actout3, expout3,"weekly target  is not visible");
	String actout4=dashboardPg.dailyweightx();
	soft.assertEquals(actout4, expout4,"dailyweigh  is not visible");
	soft.assertAll();
}


@Then("Should display the user’s weight as entered during the onboarding process.")
public void should_display_the_user_s_weight_as_entered_during_the_onboarding_process() {
	 String actout=dashboardPg.onbweighttxt();
	  
}


@Then("Should display the user’s Height as entered during the onboarding process.")
public void should_display_the_user_s_height_as_entered_during_the_onboarding_process() {
	double actout=dashboardPg.heightvaltxt();
    double expout=dashboardPg.getheightfromedit();
    Assert.assertEquals(actout, expout,"height is not matching");
    
}

@Then("BMI should be correctly calculated using the formula \\(Weight in kg \\/ \\(Height in m)^{int})")
public void bmi_should_be_correctly_calculated_using_the_formula_weight_in_kg_height_in_m(Integer int1) {
	double weight=dashboardPg.weightvaltxt();
    double  height=dashboardPg.heightvaltxt()/100;
	double expout =Math.round((weight)/(height*height)*10.0)/10.0;
     double actout=dashboardPg.bmivaltxt();
     Assert.assertEquals(actout, expout,"BMI is not matching");
	}

@Then("Should display weight entered by user")
public void should_display_weight_entered_by_user() {
	double expout=dashboardPg.weightvaltxt();
	double actout=dashboardPg.getweightfromedit();
	Assert.assertEquals(actout, expout,"weight is not matching");
}

@Then("Goal weight should be displayed as the difference from the weekly target")
public void goal_weight_should_be_displayed_as_the_difference_from_the_weekly_target() {
    
}

@Then("Weekly target should be {double} kg")
public void weekly_target_should_be_kg(Double expout) {
	String actout=dashboardPg.weeklytargwt();
	Assert.assertEquals(actout, expout,"target is not matching");
	
}
@Then("Daily weigh in should be - {string}")
public void daily_weigh_in_should_be(String expout) {
	String actout=dashboardPg.dailyweightxt();
	Assert.assertEquals(actout, expout,"Morning, before food is not visible");

}

@Then("Subcription details should be present in {int}-day goal section")
public void subcription_details_should_be_present_in_day_goal_section(Integer int1) {
	boolean actout=dashboardPg.freeplandetails();
	Assert.assertTrue(actout,"subtext is not located");
}

@Then("Slider should be present in BMI reference guide")
public void slider_should_be_present_in_bmi_reference_guide() {
	boolean actout=dashboardPg.bmislider();
	Assert.assertTrue(actout,"bmi slider is not present");
}

@Then("BMI Reference Guide component should be displayed with a gradient slider and labeled ranges")
public void bmi_reference_guide_component_should_be_displayed_with_a_gradient_slider_and_labeled_ranges() {
	boolean actout=dashboardPg.gradiantslider();
	Assert.assertTrue(actout,"gradiant slider is not displayed");
	
}
@Then("slider should display a continuous gradient from blue → yellow → orange → red, representing increasing BMI values")
public void slider_should_display_a_continuous_gradient_from_blue_yellow_orange_red_representing_increasing_bmi_values() {
    
}

@Then("Labels {string}, {string}, {string}, and {string} should be visible and color-coded accordingly")
public void labels_and_should_be_visible_and_color_coded_accordingly(String string, String string2, String string3, String string4) {
   
}
@Then("Circular pointer should automatically be positioned on the slider corresponding to the user’s BMI value")
public void circular_pointer_should_automatically_be_positioned_on_the_slider_corresponding_to_the_user_s_bmi_value() {
  
}
@Then("Slider should not allow manual movement; it should remain fixed based on the user’s BMI")
public void slider_should_not_allow_manual_movement_it_should_remain_fixed_based_on_the_user_s_bmi() {
    
}
@Then("{string} label should be visible above the slider")
public void label_should_be_visible_above_the_slider(String expout) {
	String actout=dashboardPg.infolabel();
	Assert.assertEquals(actout, expout,"info label is not present");
}
@Then("Message “Free plan includes {int} days of limited tracking” should be displayed clearly below the slider")
public void message_free_plan_includes_days_of_limited_tracking_should_be_displayed_clearly_below_the_slider(Integer int1) {
	String actout=dashboardPg.fptext();
	String expout=dashboardPg.fpt();
	Assert.assertEquals(actout, expout,"info label is not present");
}






	}




