package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditYourProfileBodyMetricsPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(css = ".lucide.lucide-user.h-5.w-5.text-white")
	private WebElement profileBtn;

	@FindBy(xpath = "//div[contains(text(),'Edit Profile')]")
	private WebElement editProfileBtn;

	@FindBy(xpath = "//h1[@class='text-2xl font-semibold text-[#6A5ACD] mt-2']")
	private WebElement editProfileLabel;

	@FindBy(xpath = "//button[contains(text(), 'Body Metrics')]")
	private WebElement metrictsbTab;

	@FindBy(xpath = "//h3[normalize-space()='Body Metrics']")
	private WebElement metricsLbl;
	@FindBy(id = "weight")
	private WebElement weightTxtBxValue;
	@FindBy(id = "height")
	private WebElement heightTxtBxValue;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement backBtn;
	@FindBy(xpath = "//p[contains(text(), 'Your BMI suggests')]")
	private WebElement bmiNote;
	@FindBy(xpath = "//div[contains(@class, 'mt-3') and contains(@class, 'border-[#D8BFD8]')]")
	private WebElement bmiSection;
	@FindBy(xpath = "//h5[contains(text(), 'BMI Category:')]")
	private WebElement bmiCategoryValue;

	public EditYourProfileBodyMetricsPage(WebDriver driver) {
		super(driver);

	}

	public void clickProfileBtn() throws InterruptedException {
		profileBtn.click();
		Thread.sleep(3000);
		editProfileBtn.click();
	}

	public void editProfileLblDisplayed() {
		editProfileLabel.isDisplayed();
	}

	public void clickMetricsTab() throws InterruptedException {
		Thread.sleep(3000);
		metrictsbTab.click();
	}

	public void metricslblDisplayed() {
		metricsLbl.isDisplayed();
	}

	public String getWeightValue() {
		return weightTxtBxValue.getAttribute("value");
	}

	public String getHeightValue() {
		return heightTxtBxValue.getAttribute("value");
	}

	public boolean bmiNoteDisplayed() {
		return bmiNote.isDisplayed();
	}

	public boolean backButtonDisplayed() {
		return backBtn.isDisplayed();
	}

	public boolean backButtonEnabled() {
		return backBtn.isEnabled();
	}

	public boolean metricsLblDisplayed() {
		return metricsLbl.isDisplayed();
	}
	
	public boolean bmiCatergorySectionDisplayed() {
	    wait.until(ExpectedConditions.visibilityOf(bmiSection));
	    return bmiSection.isDisplayed();
	}
	
	
	public boolean bmiCategoryValueDisplayed() throws InterruptedException {
	    wait.until(ExpectedConditions.visibilityOf(bmiCategoryValue));
       return bmiCategoryValue.isDisplayed();
}
}
