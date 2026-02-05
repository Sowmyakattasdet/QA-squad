package pom;

import org.openqa.selenium.WebDriver;

import pages.ActivityInsightsMenuPage;
import pages.EditYourProfileBodyMetricsPage;
import pages.EditYourProfileFunctionalTestingPage;
import pages.EditYourProfilePageBasicInfo;
import pages.LaunchPageShiva;


public class PageObjectManager {

	private WebDriver driver;
	private LaunchPageShiva launchPage;
	private ActivityInsightsMenuPage activityInsightsMenuPage;
	private  EditYourProfilePageBasicInfo editYourProfilePageBasicInfo;
	private EditYourProfileFunctionalTestingPage editYourProfileFunctionalTestingPage;
	private EditYourProfileBodyMetricsPage editYourProfileBodyMetricsPage;


	public PageObjectManager(WebDriver driver) {
		// driverFactory = new DriverFactory();
		// driver = driverFactory.getDriver();
		this.driver = driver;

	}

	public LaunchPageShiva getLaunchPage() {

		if (launchPage == null) {
			launchPage = new LaunchPageShiva(driver);
		}
		return launchPage;

	}

	public ActivityInsightsMenuPage geActivityInsightsMenuPage() {

		if (activityInsightsMenuPage == null) {
			activityInsightsMenuPage = new ActivityInsightsMenuPage(driver);
		}
		return activityInsightsMenuPage;

	}
	
	public EditYourProfileBodyMetricsPage getEditYourProfileBodyMetricsPage() {

		if (editYourProfileBodyMetricsPage == null) {
			editYourProfileBodyMetricsPage = new EditYourProfileBodyMetricsPage(driver);
		}
		return editYourProfileBodyMetricsPage;
	}

	public EditYourProfilePageBasicInfo getEditYourProfilePageBasicInfo() {
		if (editYourProfilePageBasicInfo == null) {
			editYourProfilePageBasicInfo = new EditYourProfilePageBasicInfo(driver);
		}
		return editYourProfilePageBasicInfo;
	}
	
	public EditYourProfileFunctionalTestingPage getEditYourProfileFunctionalTestingPage() {
		if(editYourProfileFunctionalTestingPage == null) {
			editYourProfileFunctionalTestingPage = new EditYourProfileFunctionalTestingPage(driver);
			}
		return editYourProfileFunctionalTestingPage;
		
	}
	
}
