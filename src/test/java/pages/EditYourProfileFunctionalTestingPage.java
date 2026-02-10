package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditYourProfileFunctionalTestingPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(xpath = "//button[contains(text(), 'Body Metrics')]")
	private WebElement metrictsbTab;
	@FindBy(xpath = "//div[@class='rounded-lg border bg-card text-card-foreground shadow-sm']")
	private WebElement metricsTabSection;
	@FindBy(xpath = "//button[normalize-space()='Next: Body Metrics']")
	private WebElement metricsButton;
	@FindBy(xpath = "//button[normalize-space()='Preferences & Health']")
	private WebElement preferenceBtn;
	@FindBy(xpath = "//div[@class='w-full']")
	private WebElement preferenceTabSection;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Back']")
	private WebElement backBtn;
	@FindBy(xpath = "//div[@id='radix-:r0:-content-body']")
	private WebElement basicTabSection;
	@FindBy(css = "button[type='submit']")
	private WebElement saveProfileBtn;
	@FindBy(xpath = "//div[contains(normalize-space(.), 'Basic Information')]")
	private WebElement basicInfoSection;
	@FindBy(xpath = "//li[@role='status']//div[contains(text(), 'successfully updated')]")
	private WebElement profileSaveMsg;
	@FindBy(xpath = "//button[normalize-space()='Add Medication']")
	private WebElement addMedicationBtn;
	@FindBy(xpath = "//button[@id='radix-:rt:-trigger-preferences']")
	private WebElement preferenceTab;

	public EditYourProfileFunctionalTestingPage(WebDriver driver) {
		super(driver);
	}

	public void clickmetricsTab() {
		metrictsbTab.click();
	}

	public void clickPreferenceBtn() {
		preferenceBtn.click();
	}

	public boolean metricsTabDisplayed() {
		return metricsTabSection.isDisplayed();
	}

	public boolean preferenceTabDisplayed() {
		return preferenceTabSection.isDisplayed();
	}

	public void clickMetricsBtn() {
		metricsButton.click();
	}

	public void clickBackButtonFrmMetricsTab() {
		backBtn.click();
	}

	public void clickPrefernceBtn() {
		clickmetricsTab();
		clickPreferenceBtn();
	}

	public boolean basicinfoSectionDisplayed() throws InterruptedException {
		return wait.until(ExpectedConditions.visibilityOf(basicInfoSection))
				.isDisplayed();
	}

	public void clickSaveProfileBtn() {
		saveProfileBtn.click();
	}

	public void saveProfileMsgDisplayed() {
		profileSaveMsg.isDisplayed();
	}

	public String getProfilSaveMsgTxt() {
		return wait.until(ExpectedConditions.visibilityOf(profileSaveMsg))
				.getText();

	}

	public void clickAddMedicationBtn() {
		addMedicationBtn.click();
	}

	public void clickPreferenceTab() {
		preferenceTab.click();
	}

	public String verifyPopupAlertDisplayed() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String alertText = alert.getText();
		alert.accept();
		return alertText;

	}

	public void dismissPopupAfterAddingMedicine() throws InterruptedException {
		Thread.sleep(3000);
		addMedicationBtn.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Motrin");
		Thread.sleep(5000);
		alert.accept();
	}

	public void verifyInputFieldInPopup() {
		try {
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert();
			Thread.sleep(3000);
			alert.sendKeys("Motrin");
			Thread.sleep(5000);
			alert.accept();

		} catch (Exception e) {

		}

	}
}
