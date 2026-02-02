package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ConfigReader;


public class EditYourProfileBodyMetricsInfoUIverificationPage extends BasePage {
	
	 @FindBy(css = ".lucide.lucide-user.h-5.w-5.text-white")
	 private WebElement profileBtn;
	
	 @FindBy(xpath = "//div[contains(text(),'Edit Profile')]") 
	 private WebElement editProfileBtn;
	
	 @FindBy(xpath = "//h1[@class='text-2xl font-semibold text-[#6A5ACD] mt-2']")
	 private WebElement editProfileLabel;
	 
	public EditYourProfileBodyMetricsInfoUIverificationPage(WebDriver driver) {
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

}



