package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

//import io.cucumber.messages.types.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;

public class UpdateCycle_Page extends BasePage {

	WebDriver driver;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@FindBy(xpath = "//*[text()='Menstrual Phase Logs']\")")
	private WebElement mp;

	@FindBy(xpath = "//*[text()='Update Cycle Information']")
	private WebElement up;

	// ------------------------------------------------
	@FindBy(xpath = "//*[text() = \"Activity Insights\"]")
	public WebElement activityInsights;
	@FindBy(xpath = "//*[text() ='Menstrual Phase Logs' and @class='flex items-center']")
	public WebElement menstrualPhaseLogs;
	@FindBy(xpath = "//*[text() ='Update Cycle Information']")
	public WebElement updateCycleInformation;
	@FindBy(xpath = "//*[@id='radix-:r5:']")
	public WebElement udateCycleInformationPopUp;
	@FindBy(xpath = "//button[@name='day' and @aria-selected='true']")
	public WebElement enableDateSelection;
	@FindBy(xpath = "//button[@name='previous-month' and @aria-label='Go to previous month']")
	public WebElement previousMonth;
	@FindBy(xpath = "//button[@name='next-month' and @aria-label='Go to next month']")
	public WebElement nextMonth;
	@FindBy(xpath = "//input[@type ='number']")
	public WebElement updateCycleLengthDays;
	@FindBy(xpath = "//button[text() ='Cancel']")
	public WebElement cancelButton;

	@FindBy(xpath = "//button[contains(.,'Save Changes')]")
	public WebElement saveChanges;
	@FindBy(xpath = "//*[@class='grid gap-1 flex-1']")
	public WebElement cycleLengthSaveChangepopupmessage;
	@FindBy(xpath = "class=\"space-y-4 rdp-caption_start rdp-caption_end\"]")
	public WebElement dateCalendar;
	@FindBy(xpath = "//*[@name=\"day\" and text() =\"3\"]")
	public WebElement calendarspecificdate;
	@FindBy(xpath = " //a[@href=\"/track/menstrual-cycle\"]/div[contains(text(), 'Menstrual Phase Logs')]")
	public WebElement menstrualphaselogs1;

	@FindBy(xpath = "//button[@name='day' and not(@disabled)]")
	private List<WebElement> selectdate;

	public UpdateCycle_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	// --------------signup webelements-------------------

	@FindBy(xpath = "//*[@name='username']")
	private WebElement userName;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginButton;
	// ---------------------------- signup methods
	// ----------------------------------
	public void Login() {

		userName.sendKeys("qasquad@gmail.com");
		password.sendKeys("HerBalance123");
		loginButton.click();
	}

	public void launchApplication() {

		driver.get(ConfigReader.getProperty("appURL"));

	}

	// ------------------------------------------------
	public void menstrualclkMpl() {
		wait.until(ExpectedConditions.visibilityOf(mp));
	}

	public void menstrualclickUci() {
		wait.until(ExpectedConditions.visibilityOf(up));
	}

	// ----------------------------------------------------------------

	public void activityInsights() {
		activityInsights.click();
	}

	public void clickmenstrualphaselogs1() {
		menstrualphaselogs1.click();
	}

	public String menstrualphaselogs1gettext() {
		return menstrualphaselogs1.getText();
	}

	public void openMenstrualphaselogs1() {
		activityInsights.click();
		menstrualphaselogs1.click();

		Actions actions = new Actions(driver);
		actions.click(menstrualPhaseLogs).perform();

	}

	public boolean isUpdateCycleInformationDisplayed() {
		return updateCycleInformation.isDisplayed();
	}

	public void navigateTomenstrualPhaseLogs() {

		Actions actions = new Actions(driver);
		actions.moveToElement(menstrualphaselogs1);
		actions.click(menstrualPhaseLogs).perform();

	}

	public void updateCycleInformation() {

		wait.until(ExpectedConditions.visibilityOf(updateCycleInformation));
		updateCycleInformation.click();
	}

	public void enableDateSelection() {

		int selecteddate = selectdate.size();
		String xpath = String.format("//button[@name='day' and text()='%d']",
				selecteddate);
		WebElement dayButton = driver.findElement(By.xpath(xpath));
		dayButton.click();
		enableDateSelection.click();

	}

	public boolean isDateSelected() {

		int selecteddate = selectdate.size();

		String xpath = String.format("//button[@name='day' and text()='%d']",
				selecteddate);
		String isSelected1 = driver.findElement(By.xpath(xpath))
				.getAttribute("tabindex");
		System.out.println(isSelected1 + isSelected1);
		return (isSelected1.equals("0"));
	}

	public boolean isDateHighlightedByColor() {
		String bgColor = calendarspecificdate.getCssValue("background-color");
		return bgColor.equals("rgba(0, 123, 255, 1)");
	}

	public void previousMonth() {
		previousMonth.click();
	}

	public void nextMonth() {
		nextMonth.click();
	}

	public void updateCycleLengthDays(String action, int value) {

		switch (action.toLowerCase()) {

			case "up" :
				for (int i = 0; i < value; i++) {
					updateCycleLengthDays.sendKeys(Keys.ARROW_UP);
				}

			case "down" :
				for (int i = 0; i < value; i++) {
					updateCycleLengthDays.sendKeys(Keys.ARROW_DOWN);
				}

			case "type" :
				for (int i = 0; i < value; i++) {
					updateCycleLengthDays.clear();

					updateCycleLengthDays.sendKeys(String.valueOf(value));
				}
		}

	}

	public void cancelButton() {
		cancelButton.click();

	}

	public void clicksaveChanges() {
		saveChanges.click();
	}

}
