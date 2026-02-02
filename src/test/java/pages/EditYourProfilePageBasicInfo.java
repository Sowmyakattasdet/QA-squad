package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class EditYourProfilePageBasicInfo extends BasePage {
	
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
	
	public void basicInfoLblDisplayed() {
		basicinfoLbl.isDisplayed();
	}

	public void updateInfoLblDisplayed() {
		updatePersonalInfoLbl.isDisplayed();
		
	}
	
	public void getUserNameTxtBoxgetValue() {
		userNameTxtBxInput.getText();
	}
	
	public void getUserAgeTxtBxValue() {
		updateAgeTxtBxInput.getText();
	}
	
	public void metricsBtnEnabled() {
		metricsButton.isEnabled();
	}
}






