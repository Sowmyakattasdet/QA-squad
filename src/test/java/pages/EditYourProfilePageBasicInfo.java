package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class EditYourProfilePageBasicInfo extends BasePage {
	
	 @FindBy(css = ".lucide.lucide-user.h-5.w-5.text-white")
	 public WebElement profileBtn;
	
	 @FindBy(xpath = "//div[contains(text(),'Edit Profile')]") 
	 public WebElement editProfileBtn;
	
	 @FindBy(xpath = "//h1[@class='text-2xl font-semibold text-[#6A5ACD] mt-2']")
	 public WebElement editProfileLabel;
	 
	 @FindBy(xpath = "//h3[normalize-space()='Basic Information']")
	 public WebElement basicinfoLbl;
	 
	 @FindBy(xpath = "//p[@class='text-sm text-muted-foreground']")
	 public WebElement updatePersonalInfoLbl;
	 
	 @FindBy(xpath = "//input[@id='name']")
	 public WebElement userNameTxtBxInput;
	 @FindBy(xpath = "//button[normalize-space()='Next: Body Metrics']")
	 public WebElement metricsButton;
	 @FindBy(xpath = "//input[@id='age']")
	 public WebElement updateAgeTxtBxInput;
	 
	public EditYourProfilePageBasicInfo(WebDriver driver) {
		super(driver);

	}
	
	
	/*public void clickprofileBtn() {
		profileBtn.click();
	}*/
	
	
	public void clickProfileBtn() throws InterruptedException {
		profileBtn.click();
		Thread.sleep(3000);
		editProfileBtn.click();
	}
	
	public void editProfileLblDisplayed() {
		editProfileLabel.isDisplayed();
	}
	
	public void updateInfoLblDisplayed() {
		updatePersonalInfoLbl.isDisplayed();
	}
	
	public String getUserNameTxtBoxgetValue() {
		return userNameTxtBxInput.getAttribute("value");
	}
	
	public String etUserAgeTxtBxValue() {
		return updateAgeTxtBxInput.getAttribute("value");
	}
	
	public void metricsBtnEnabled() {
		metricsButton.isEnabled();
	}
}






