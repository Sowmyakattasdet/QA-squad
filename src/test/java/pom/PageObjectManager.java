package pom;

import org.openqa.selenium.WebDriver;

import pages.ActivityInsightsMenuPage;
import pages.LaunchPage;

public class PageObjectManager {

	private WebDriver driver;
	private LaunchPageShiva launchPage;
	private ActivityInsightsMenuPage activityInsightsMenuPage;

	public PageObjectManager(WebDriver driver) {
		// driverFactory = new DriverFactory();
		// driver = driverFactory.getDriver();
		this.driver = driver;

	}

	public LaunchPage getLaunchPage() {

		if (launchPage == null) {
			launchPage = new LaunchPage(driver);
		}
		return launchPage;

	}

	public ActivityInsightsMenuPage geActivityInsightsMenuPage() {

		if (activityInsightsMenuPage == null) {
			activityInsightsMenuPage = new ActivityInsightsMenuPage(driver);
		}
		return activityInsightsMenuPage;

	}
}

