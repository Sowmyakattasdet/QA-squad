package pom;

import org.openqa.selenium.WebDriver;

import pages.ActivityInsightsMenuPage;
import pages.LaunchPageShiva;

public class PageObjectManager {

	private WebDriver driver;
	private LaunchPageShiva launchPage;
	private ActivityInsightsMenuPage activityInsightsMenuPage;

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
}
