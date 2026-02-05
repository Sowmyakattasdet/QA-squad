package pom;

import org.openqa.selenium.WebDriver;

import pages.ActivityInsightsMenuPage;
import pages.LaunchPage;
import pages.LaunchPageShiva;
import pages.SignUpPage;

public class PageObjectManager {

	private WebDriver driver;
	private LaunchPage launchPage;
	private ActivityInsightsMenuPage activityInsightsMenuPage;
	private SignUpPage signUpPage;

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
	
	public SignUpPage getSignUpPage() {

		if (signUpPage == null) {
			signUpPage = new SignUpPage(driver);
		}
		return signUpPage;

	}
}
