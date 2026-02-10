package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.LoggerFactory;
import webElementActions.ElementActions;

public class ActivityInsightsMenuPage extends BasePage {

	@FindBy(name = ("username"))
	private WebElement userName;

	@FindBy(name = ("password"))
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit' and text()='LogIn']")
	private WebElement loginButton;

	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement homePageloginButton;

	@FindBy(xpath = "//span[text()='Activity Insights']")
	private WebElement activityInsightsMenu;

	@FindBy(xpath = "//div[contains(text(),'Track Weight')]")
	private WebElement trackWeightSubMenu;

	//
	@FindBy(xpath = "//h1[text()='Weight Tracking']")
	private WebElement subMenuPageTitle;

	@FindBy(xpath = "//h1[text()='Weight Tracking']/../p")
	private WebElement subTitle;

	@FindBy(xpath = "//button[text()='Back to Dashboard']")
	private WebElement backToDashboard;

	@FindBy(xpath = "//p[text()='Starting Weight']")
	private WebElement cardStartWeight;

	@FindBy(xpath = "//p[text()='Starting Weight']/..//p[contains(@class,'font-bold')]")
	private WebElement getStartingWeight;

	@FindBy(xpath = "//p[text()='Current Weight']")
	private WebElement cardCurrentWeight;

	@FindBy(xpath = "//p[text()='Current Weight']/..//p[contains(@class,'font-bold')]")
	private WebElement getCurrentWeight;

	@FindBy(xpath = "//p[text()='Goal Weight']")
	private WebElement cardGoalWeight;

	@FindBy(xpath = "//p[text()='Goal Weight']/..//p[contains(@class,'font-bold')]")
	private WebElement getGoalWeight;

	@FindBy(xpath = "//button[contains(text(),'Log Weight')]")
	private WebElement weightLogButton;

	@FindBy(xpath = "//input[@type='number' and @placeholder='Enter your weight']")
	private WebElement enterWeightField;

	@FindBy(id = "bmi")
	private WebElement captureBMIField;

	@FindBy(xpath = "//span[contains(text(),'Day') and contains(@class,'text-sm')]")
	private WebElement daycountofPlan;

	@FindBy(xpath = "//label[contains(text(),'Weight (')]")
	private WebElement WeightLabel;

	@FindBy(xpath = "//label[text()='BMI (Auto-calculated)']")
	private WebElement bmiAutoCalculateLabel;

	@FindBy(xpath = "//label[text()='Note (Optional)']")
	private WebElement notelablel;

	@FindBy(xpath = "//div[contains(@class,'items-center') and contains(text(),'Log')]")
	// @FindBy(xpath = "//div[text()='Log Today's Weight']")

	private WebElement logTodaysWeightLabel;

	@FindBy(xpath = "//*[local-name()='line' and contains(@class,'recharts-reference-line-line')]")
	private WebElement goalRefLine;

	@FindBy(xpath = "//*[name()='tspan' and contains(text(),'Goal weight')]")
	private WebElement goalRefLinelabel;

	@FindBy(xpath = "//*[name()='tspan' and contains(text(),'Weight (kg)')]")
	private WebElement yAxisLabel;

	@FindBy(xpath = "//*[name()='g' and contains(@class,'recharts-xAxis xAxis')]//*[name()='g' and contains(@class,'recharts-layer')]")
	private List<WebElement> xAxislabel;

	@FindBy(xpath = "//h3[text()='Weight Progression Over Time']")
	private WebElement graphHeader;

	@FindBy(xpath = "//p[text()='Weight Lost']/following-sibling::p")
	private WebElement weightLost;

	@FindBy(xpath = "//p[text()='Remaining']/following-sibling::p")
	private WebElement remainingWeight;

	@FindBy(xpath = "//div[@role='progressbar']")
	private WebElement progressBar;

	@FindBy(xpath = "//h3[text()='Progress Overview']")
	private WebElement progressOverviewHeader;

	@FindBy(xpath = "//span[text()='Weight Loss Progress']")
	private WebElement weightLossProgressHeader;

	@FindBy(xpath = "//span[text()='Weight Loss Progress']/following-sibling::span")
	private WebElement weightLossPercentage;

	@FindBy(xpath = "//div[contains(@class,'md:grid-cols-3')]//div[contains(@class,'space-x-3')]")
	private List<WebElement> threeCards;

	@FindBy(xpath = "//span[text()='Starting']//parent::div/parent::div//p[contains(@class,'font-semibold')]")
	private WebElement dashBoardWeight;

	@FindBy(xpath = "//span[text()='Current']//parent::div/parent::div//p[contains(@class,'font-semibold')]")
	private WebElement dashBoardCurrentWeight;

	@FindBy(xpath = "//span[contains(text(),'Goal:')]")
	private WebElement dashBoardGoalWeight;

	@FindBy(xpath = "//span[contains(text(),'days left')]")
	private WebElement daysleftfromDB;

	@FindBy(xpath = "//span[contains(text(),'Day')]")
	private WebElement dayscountfromInsight;

	@FindBy(xpath = "//ul/li//span[@class='recharts-tooltip-item-value']")
	private WebElement tooltipWeight;

	@FindBy(xpath = "//p[@class='recharts-tooltip-label']")
	private WebElement tooltipDay;

	// div[text()='Invalid Weight']
	// div[text()='Please enter a valid weight value.']
	@FindBy(xpath = "//div[text()='Invalid Weight']")
	private WebElement alertWindow;

	@FindBy(xpath = "//div[text()='Please enter a valid weight value.']")
	private WebElement alertMessage;

	@FindBy(xpath = "//div[text()='Weight Logged Successfully']")
	private WebElement weightUpdateMessage;

	@FindBy(xpath = "//div//h3[text()='Weight History']/../..//p")
	private List<WebElement> weightsfromWeightLog;

	@FindBy(xpath = "//*[name()='path'  and contains(@class,'recharts-curve recharts-line-curve')]")
	private WebElement lineChartCurve;

	@FindBy(xpath = "//*[name()='circle' and @r='7'][last()]")
	private WebElement lineChartCircle;

	@FindBy(xpath = "//*[name()='g' and contains(@class,'recharts-active-dot')]//*[name()='circle']")
	private WebElement activeCircle;

	ElementActions elementActions;

	public ActivityInsightsMenuPage(WebDriver driver) {
		super(driver);
		elementActions = new ElementActions(driver);

	}

	public void Login() throws InterruptedException {

		homePageloginButton.click();
		userName.clear();
		userName.sendKeys("qasquadteam3@gmail.com");
		password.clear();
		password.click();
		password.sendKeys("herbalance123");
		loginButton.click();

		Thread.sleep(2000);

	}

	public void clickOnMenu() {
		elementActions.clickAction(activityInsightsMenu);

	}

	public void clickOnSubMenu() {
		elementActions.clickAction(trackWeightSubMenu);

	}

	public String validateSubMenuHeaderText() {
		return (elementActions.getText(subMenuPageTitle));
	}

	public String validateSubTitle() {
		LoggerFactory.getLogger()
				.info("Validate activity Insight page Sub Title");
		return (elementActions.getText(subTitle));
	}

	public boolean validateBackToDashboard() {
		LoggerFactory.getLogger()
				.info("Validate activity Insight page Back to Dashboard");
		return (elementActions.isElemnetDisplayed(backToDashboard));

	}

	public int validateThreeCards() {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page Back Three Cards");
		return (elementActions.getElementCount(threeCards));
	}

	public boolean validateStartingWeight() {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page Start weight");
		return (elementActions.isElemnetDisplayed(cardStartWeight));

	}

	public boolean validateCurrentWeight() {
		return (elementActions.isElemnetDisplayed(cardCurrentWeight));
	}

	public boolean validateGoalWeight() {
		return (elementActions.isElemnetDisplayed(cardGoalWeight));
	}

	public String getWeightfromDashboard() {
		String weightonDashboard = (elementActions.getText(dashBoardWeight));
		return changeValueToDecimal(weightonDashboard);

	}

	public String getCurrentWeightfromDashboard() {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page-DB Current  weight");
		String weightonDashboard = (elementActions
				.getText(dashBoardCurrentWeight));
		return changeValueToDecimal(weightonDashboard);

	}

	public String getGoalWeightfromDashboard() {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page-DB  Goal weight");
		String weightonDashboard = (elementActions
				.getText(dashBoardGoalWeight));

		String weigtArray[] = weightonDashboard.split(":");

		return (weigtArray[1].trim());

	}

	public String changeValueToDecimal(String stringToChange) {
		String[] weight = stringToChange.split(" ");
		String number = weight[0];
		String unit = weight[1];

		if (!number.contains(".")) {
			number = number + ".0";
		}

		return (number + " " + unit);
	}
	public String getStartingWeightfromInsight() {
		return (elementActions.getText(getStartingWeight));
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public String getCurrentWeight() {
		LoggerFactory.getLogger()
				.info("Validate activity Insight page Current weight");
		return (elementActions.getText(getCurrentWeight));
	}

	public String getGoalWeight() {
		LoggerFactory.getLogger()
				.info("Validate activity Insight page Goal weight");

		return (elementActions.getText(getGoalWeight));

	}

	public String getProgressSectionHeader() {
		return (elementActions.getText(progressOverviewHeader));
	}

	public String getProgressSectionSubHeader() {
		return (elementActions.getText(weightLossProgressHeader));
	}

	public boolean getCompletionPercentage() {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page Completion %");
		String actualPercentage = (elementActions
				.getText(weightLossPercentage));
		String regex = "(100(\\.0+)?|[1-9]?\\d(\\.\\d+)?)% Complete";
		return (actualPercentage.matches(regex));
	}

	public boolean validateProgressBar() {
		return (elementActions.isElemnetDisplayed(progressBar));
	}

	public boolean getWeightLost() {
		LoggerFactory.getLogger()
				.info("Validate activity Insight page Weight lost");
		String weightLostvalue = (elementActions.getText(weightLost));
		String regex = "-?\\d+(\\.\\d+)?\\skg";
		return (weightLostvalue.matches(regex));
	}

	public boolean getWeightRemaining() {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page Remaining weight");
		String weightRemaining = elementActions.getText(remainingWeight);
		String regex = "-?\\d+(\\.\\d+)?\\skg";
		return (weightRemaining.matches(regex));
	}

	public String getGraphSectionHeader() {
		return (elementActions.getText(graphHeader));
	}

	public boolean getxAxisLabel() {
		LoggerFactory.getLogger()
				.info("Validate activity Insight page XAxis label");
		int labelcnt = elementActions.getElementCount(xAxislabel);
		if (labelcnt == 7) {

			labelcnt = 1;
			for (WebElement elements : xAxislabel) {

				String actualxlabel = elements.getText();
				String expectedlabel = "Day " + labelcnt;
				labelcnt++;
				if (!actualxlabel.equals(expectedlabel)) {
					return false;
				}

			}
			return true;
		}
		return false;
	}

	public String yaxisLabelValidation() {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page YAxis label");
		return (elementActions.getText(yAxisLabel));
	}

	public String validateReferenceline() {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page Reference Line");
		return elementActions.getText(goalRefLinelabel);

	}

	public String validateLogTodayheader() {

		if (elementActions.isElemnetDisplayed(logTodaysWeightLabel)) {

			return elementActions.getText(logTodaysWeightLabel);
		}
		return null;

	}

	public String bmiWeightFieldLable() {
		return elementActions.getText(WeightLabel);
	}

	public String bmiNotetFieldLable() {
		return elementActions.getText(notelablel);
	}

	public String bmiAutoCalcFieldLable() {
		return elementActions.getText(bmiAutoCalculateLabel);
	}

	public int getDaysleftDB() {
		String daysLeft = elementActions.getText(daysleftfromDB);
		String[] day = daysLeft.split(" ");
		return (7 - (Integer.parseInt(day[0])) + 1);
	}

	public String getDaysCountInsightPage() {
		return elementActions.getText(dayscountfromInsight);
	}

	public boolean validatebmiAutoCalculate() {
		LoggerFactory.getLogger()
				.info("Validate activity Insight page BMI auto Calculate");
		if (elementActions.getAttribute(captureBMIField, "value")
				.equalsIgnoreCase("")) {

			elementActions.sendKeys(enterWeightField, "22");

			String BMI = elementActions.getAttribute(captureBMIField, "value");
			return (BMI.matches("\\d+\\.\\d+"));
		}

		return false;

	}

	public boolean validateLogWeightButtondisabled() {
		return (elementActions.isElementEnabled(weightLogButton));
	}

	public boolean validateLogWeightButtondEnabled() {
		elementActions.sendKeys(enterWeightField, "22");
		return (elementActions.isElementEnabled(weightLogButton));
	}

	public void updateValidWeight(String userWeight)
			throws InterruptedException {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page Valid weight");

		elementActions.sendKeys(enterWeightField, userWeight);
		if (elementActions.isElementEnabled(weightLogButton)) {
			elementActions.clickAction(weightLogButton);
			if (elementActions.isElemnetDisplayed(weightUpdateMessage))
				;
			{
				Thread.sleep(2000);
				try {
					elementActions.isElemnetDisplayed(weightUpdateMessage);
				} catch (Exception e) {
					System.out.println("exception " + e);
				}
			}

		}
	}

	public void updateInvalidWeight(String userWeight) {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page Invalid Weight");

		elementActions.sendKeys(enterWeightField, userWeight);
		if (elementActions.isElementEnabled(weightLogButton)) {
			elementActions.clickAction(weightLogButton);
		}

	}
	public String getErrorMsg() {

		try {
			elementActions.isElemnetDisplayed(alertWindow);
			return elementActions.getText(alertMessage);
		} catch (Exception e) {

			return null;
		}
	}

	public boolean validateGraphlinechart() throws InterruptedException {
		LoggerFactory.getLogger()
				.info("Validate activity Insight page LineGraph");

		String graphDay = null;
		String graphWeight = null;

		if (elementActions.getElementCount(weightsfromWeightLog) > 0) {
			String weightlog = weightsfromWeightLog.get(0).getText();
			String daylog = weightsfromWeightLog.get(1).getText();
			String[] logday = daylog.split("Day");
			daylog = logday[logday.length - 1];

			Thread.sleep(5000);
			try {
				elementActions.mouseOverAnElement(lineChartCircle);
				Thread.sleep(5000);
				if (elementActions.isElemnetDisplayed(tooltipDay)) {
					graphDay = elementActions.getText(tooltipDay);
					graphWeight = elementActions.getText(tooltipWeight);

				}

			} catch (Exception e) {

				return false;
			}

			if (weightlog.trim().equalsIgnoreCase(graphWeight.trim())
					&& daylog.trim().equalsIgnoreCase(graphDay.trim())) {
				return true;
			}
		}
		return false;
	}

	public boolean validateWeightProgressOvertime()
			throws InterruptedException {

		LoggerFactory.getLogger()
				.info("Validate activity Insight page WeightProgressOvertime");
		String graphDay = null;
		String graphWeight = null;

		if (elementActions.getElementCount(weightsfromWeightLog) > 0) {
			String weightlog = weightsfromWeightLog.get(0).getText();
			String daylog = weightsfromWeightLog.get(1).getText();

			String[] logday = daylog.split(" • ");

			daylog = logday[logday.length - 1];

			Thread.sleep(5000);

			elementActions.mouseOverAnElement(lineChartCircle);
			Thread.sleep(5000);
			if (elementActions.isElemnetDisplayed(tooltipDay)) {

				graphWeight = elementActions.getText(tooltipWeight);

				String i = elementActions.getAttribute(activeCircle, "cx");
				String xpath = String.format("//*[name()='tspan' and @x='%s']",
						i);
				WebElement xaxis = driver.findElement(By.xpath(xpath));
				graphDay = elementActions.getText(xaxis);

			}
			if (weightlog.trim().equalsIgnoreCase(graphWeight.trim())
					&& graphDay.trim().equalsIgnoreCase(daylog.trim())) {
				return true;

			}

		}
		return false;
	}
}