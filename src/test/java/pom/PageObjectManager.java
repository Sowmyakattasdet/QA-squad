package pom;

import org.openqa.selenium.WebDriver;

import pages.ActivityInsightsMenuPage;
import pages.LaunchPageShiva;
import pages.LoginPage;

public class PageObjectManager {

	private WebDriver driver;
	private LaunchPageShiva launchPage;
	private LoginPage loginPage;
	private ActivityInsightsMenuPage activityInsightsMenuPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public LaunchPageShiva getLaunchPage() {

		if (launchPage == null) {
			launchPage = new LaunchPageShiva(driver);
		}
		return launchPage;

	}
 public LoginPage getLoginPage() {
	 if(loginPage == null) {
		 loginPage = new LoginPage(driver);
	 }
	 return loginPage;
 }
	public ActivityInsightsMenuPage geActivityInsightsMenuPage() {

		if (activityInsightsMenuPage == null) {
			activityInsightsMenuPage = new ActivityInsightsMenuPage(driver);
		}
		return activityInsightsMenuPage;

	}
}
