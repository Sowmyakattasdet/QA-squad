package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class EditYourProfilePageBasicInfo extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 @FindBy(css = ".lucide.lucide-user.h-5.w-5.text-white")
	 private WebElement profileBtn;
	
	 @FindBy(xpath = "//div[contains(text(),'Edit Profile')]") 
	 private WebElement editProfileBtn;
	
	 @FindBy(xpath = "//h1[@class='text-2xl font-semibold text-[#6A5ACD] mt-2']")
	 private WebElement editProfileLabel;
	 
	 @FindBy(xpath = "//h3[normalize-space()='Basic Information']")
	 private WebElement basicinfoLbl;
	 
	 @FindBy(xpath = "//p[@class='text-sm text-muted-foreground']")
	 private WebElement updatePersonalInfoLbl;
	 
	 @FindBy(xpath = "//input[@id='name']")
	 private WebElement userNameTxtBxInput;
	 @FindBy(xpath = "//button[normalize-space()='Next: Body Metrics']")
	 private WebElement metricsButton;
	 @FindBy(xpath = "//input[@id='age']")
	 private WebElement updateAgeTxtBxInput;
	 
	 public EditYourProfilePageBasicInfo(WebDriver driver) {
		super(driver);

	}
	
	public void clickProfileBtn() throws InterruptedException {
		profileBtn.click();
		editProfileBtn.click();
	}
	
	public void editProfileLblDisplayed() {
		editProfileLabel.isDisplayed();
	}
	
	public boolean updateInfoLblDisplayed() {
		return updatePersonalInfoLbl.isDisplayed();
	}
	
	public String getUserNameTxtBoxgetValue() {
		return userNameTxtBxInput.getAttribute("value");
	}
	
	public String etUserAgeTxtBxValue() {
		return updateAgeTxtBxInput.getAttribute("value");
	}
	
	public boolean metricsBtnEnabled() {
		return metricsButton.isEnabled();
	}
	
	public boolean basicInfoLabelDisplayed() {
	return basicinfoLbl.isDisplayed();
}
}






