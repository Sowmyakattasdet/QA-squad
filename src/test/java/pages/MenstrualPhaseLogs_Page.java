package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenstrualPhaseLogs_Page extends BasePage {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@FindBy(xpath = "//*[text() = \"Activity Insights\"]")
	private WebElement activityInsights;

	@FindBy(xpath = "//*[text() ='Menstrual Phase Logs']")
	private WebElement menstrualPhaseLogs;
	@FindBy(xpath = " //*[@aria-controls=\"radix-:r2q:\"]")
	public WebElement addPeriodLog;
	@FindBy(xpath = " //*[text() =\"Cycle Overview\"] ")
	public WebElement cycleOverview;
	@FindBy(xpath = "//*[text() = 'Menstrual Calendar']")
	public WebElement menstrualCalendar;

	@FindBy(xpath = "//*[text() =\"Period History\"]")
	public WebElement periodhistory;
	@FindBy(xpath = "//*[text()='Current Cycle Status']")
	public WebElement currentCycleStatus;
	@FindBy(xpath = "//*[@class=\"text-[#FFC0CB]\"  and text() =\"Menstrual\"]")
	public WebElement menstrual;
	@FindBy(xpath = "//*[@class=\"text-[#9370DB]\"  and text() =\"Follicular\"]")
	public WebElement follicular;
	@FindBy(xpath = "//*[@class=\"text-[#6A5ACD]\"  and text() =\"Ovulation\"]")
	public WebElement ovulation;
	@FindBy(xpath = "//*[@class=\"text-[#D8BFD8]\" and text() =\"Luteal\"]")
	public WebElement luteal;
	@FindBy(xpath = " //*[text() =\"Current Phase\" or @class=\"text-lg font-medium\"]")
	public WebElement currentPhase;
	@FindBy(xpath = " //*[text() =\"Last period started\" ]")
	public WebElement lastperiodstarted;
	@FindBy(xpath = " //*[text() =\"Next period expected\"]")
	public WebElement nextperiodexpected;
	@FindBy(xpath = " //*[text() =\"Upcoming Phases\"]")
	public WebElement upcomingphases;
	@FindBy(xpath = " //*[text() =\"Plan ahead with your cycle phases\"]")
	public WebElement planWithCyclePhase;
	@FindBy(xpath = " //*[@class=\"font-medium text-[#6A5ACD]\"]")
	public WebElement subsectionMenstrualPhase;
	@FindBy(xpath = " //*[text() = \"Follicular Phase\"]")
	public WebElement subsectionFollicularphase;
	@FindBy(xpath = "//*[text() = \"Ovulation Phase\"]")
	public WebElement sebsectionOvulationphase;
	@FindBy(xpath = " //*[text() = \"Luteal Phase\"]")
	public WebElement subsectionLutealphase;
	@FindBy(xpath = " //*[text() = \"Perimenopause\"]")
	public WebElement subsectionPerimenopause;
	@FindBy(xpath = "//*[@data-state=\"indeterminate\" and @role=\"progressbar\"]")
	public WebElement progressbar;

	@FindBy(xpath = "//*[@data-state=\"indeterminate\" and @class=\"h-full w-full flex-1 bg-primary transition-all\"]")
	public WebElement highlightedProgressbar;
	@FindBy(xpath = " //*[text() =\"Recommended Activities\"]")
	public WebElement recommendedActivities;
	@FindBy(xpath = " //*[text() =\"Nutrition Tips\"]")
	public WebElement nutrtionTips;
	@FindBy(xpath = " //*[text()='Next Period']")
	public WebElement nextPeriod;

	public MenstrualPhaseLogs_Page(WebDriver driver) {
		super(driver);
		// elementActions = new ElementActions(driver);

	}

	// --------------signup webelements-------------------

	@FindBy(xpath = "//*[@name='username']")
	private WebElement userName;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginButton;

	// ----------------------------------------------------------------------------------

	public void menstrualPhaseLogs() {
		menstrualPhaseLogs.click();
	}

	public boolean isaddPeriodLogvisible() {
		return addPeriodLog.isDisplayed();
	}

	public boolean iscycleOverviewVisible() {
		return cycleOverview.isDisplayed();

	}

	public boolean ismenstrualCalendarVisible() {
		return menstrualCalendar.isDisplayed();
	}

	public void navigatetomenstrualphaselogs() {
		Actions actions = new Actions(driver);
		actions.moveToElement(activityInsights).pause(Duration.ofMillis(500))
				.click(menstrualPhaseLogs).build().perform();

	}

	public void clickOnInsightsMenu() {

		activityInsights.click();

	}

	public void clickOnMenstrualPhaseLog() {
		menstrualPhaseLogs.click();
	}

	public boolean detailsOnMenstrualPage() throws InterruptedException {
		Thread.sleep(2000);

		return (currentCycleStatus.isDisplayed() && upcomingphases.isDisplayed()
				&& recommendedActivities.isDisplayed()
				&& nutrtionTips.isDisplayed() && nextPeriod.isDisplayed());
	}

}
