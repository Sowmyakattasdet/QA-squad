package pom;

import org.openqa.selenium.WebDriver;

import pages.ActivityInsightsMenuPage;
import pages.DashboardPage;
import pages.EditYourProfileBodyMetricsPage;
import pages.EditYourProfileFunctionalTestingPage;
import pages.EditYourProfilePageBasicInfo;
import pages.LaunchPage;
import pages.LoginPage;
import pages.MenstrualPhaseLogs_Page;
import pages.SignUpPage;
import pages.UpdateCycle_Page;

public class PageObjectManager {

	private WebDriver driver;
	private LaunchPage launchPage;
	private ActivityInsightsMenuPage activityInsightsMenuPage;
	private SignUpPage signUpPage;
	private EditYourProfilePageBasicInfo editYourProfilePageBasicInfo;
	private EditYourProfileFunctionalTestingPage editYourProfileFunctionalTestingPage;
	private EditYourProfileBodyMetricsPage editYourProfileBodyMetricsPage;
	private LoginPage loginPage;
	private DashboardPage dashboardpage;
	private MenstrualPhaseLogs_Page menstrualPhaseLogPage;
	private UpdateCycle_Page updateCyclePage;

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

	public LoginPage getLoginPage() {

		if (loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;

	}

	public DashboardPage getDashboardPage() {
		if (dashboardpage == null) {
			dashboardpage = new DashboardPage(driver);
		}
		return dashboardpage;
	}

	public EditYourProfileBodyMetricsPage getEditYourProfileBodyMetricsPage() {

		if (editYourProfileBodyMetricsPage == null) {
			editYourProfileBodyMetricsPage = new EditYourProfileBodyMetricsPage(
					driver);
		}
		return editYourProfileBodyMetricsPage;
	}

	public EditYourProfilePageBasicInfo getEditYourProfilePageBasicInfo() {
		if (editYourProfilePageBasicInfo == null) {
			editYourProfilePageBasicInfo = new EditYourProfilePageBasicInfo(
					driver);
		}
		return editYourProfilePageBasicInfo;
	}

	public EditYourProfileFunctionalTestingPage getEditYourProfileFunctionalTestingPage() {
		if (editYourProfileFunctionalTestingPage == null) {
			editYourProfileFunctionalTestingPage = new EditYourProfileFunctionalTestingPage(
					driver);
		}
		return editYourProfileFunctionalTestingPage;

	}

	public MenstrualPhaseLogs_Page getMenstrualPhaseLogs_Page() {
		if (menstrualPhaseLogPage == null) {
			menstrualPhaseLogPage = new MenstrualPhaseLogs_Page(driver);
		}
		return menstrualPhaseLogPage;

	}

	public UpdateCycle_Page getUpdateCycle_Page() {
		if (updateCyclePage == null) {
			updateCyclePage = new UpdateCycle_Page(driver);
		}
		return updateCyclePage;

	}

}
