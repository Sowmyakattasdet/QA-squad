package pom;

import org.openqa.selenium.WebDriver;

import pages.ActivityInsightsMenuPage;
import pages.EditYourProfileBodyMetricsInfoUIverificationPage;
import pages.EditYourProfilePageBasicInfo;
import pages.LaunchPageShiva;


public class PageObjectManager {

	private WebDriver driver;
	private LaunchPageShiva launchPage;
	private ActivityInsightsMenuPage activityInsightsMenuPage;
	private EditYourProfileBodyMetricsInfoUIverificationPage editYourMetricProfilePage;
	private  EditYourProfilePageBasicInfo editYourProfilePageBasicInfo;
	


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
	
	public EditYourProfileBodyMetricsInfoUIverificationPage getEditYourMetricProfilePage() {

		if (editYourMetricProfilePage == null) {
			editYourMetricProfilePage = new EditYourProfileBodyMetricsInfoUIverificationPage(driver);
		}
		return editYourMetricProfilePage;
	}

	public EditYourProfilePageBasicInfo getEditYourProfilePageBasicInfo() {
		if (editYourProfilePageBasicInfo == null) {
			editYourProfilePageBasicInfo = new EditYourProfilePageBasicInfo(driver);
		}
		return editYourProfilePageBasicInfo;
	}
	
}
