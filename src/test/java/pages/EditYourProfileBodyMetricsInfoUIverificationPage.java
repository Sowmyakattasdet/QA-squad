package pages;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;


public class EditYourProfileBodyMetricsInfoUIverificationPage extends BasePage {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	 @FindBy(css = ".lucide.lucide-user.h-5.w-5.text-white")
	 public WebElement profileBtn;
	
	 @FindBy(xpath = "//div[contains(text(),'Edit Profile')]") 
	 public WebElement editProfileBtn;
	
	 @FindBy(xpath = "//h1[@class='text-2xl font-semibold text-[#6A5ACD] mt-2']")
	 public WebElement editProfileLabel;
	 
	 @FindBy(xpath = "//button[contains(text(), 'Body Metrics')]")
	 public WebElement metrictsbTab;
	 
	 @FindBy(xpath = "//h3[normalize-space()='Body Metrics']")
	 public WebElement metricsLbl;
	 @FindBy(id = "weight")
	 public WebElement weightTxtBxValue;
	 @FindBy(id = "height")
	 public WebElement heightTxtBxValue;
     @FindBy(xpath = "//select/option[1]")
	 public WebElement weightDropdownValue;
     @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/button[1]")
	 public WebElement backBtn;
   	 @FindBy(xpath = "//*[@class=\"lucide lucide-chevron-down h-4 w-4 opacity-50\"]")
	 public WebElement dropdown;
     //@FindBy(xpath = "//h4[normalize-space()='BMI Calculation: 36.4']")
     @FindBy(xpath = "//h4[contains(text), 'BMI Calculation:']")
     public WebElement bmiNumber;
     @FindBy(xpath = "//p[contains(text(), 'Your BMI suggests')]")
     public WebElement bmiNote;
     
     @FindBy(xpath = "h5[class='font-medium text-[#6A5ACD] mb-2']")
     public WebElement bmiCategory;
	 
	 
	public EditYourProfileBodyMetricsInfoUIverificationPage(WebDriver driver) {
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
	
	public String getHeightValue(){
		return heightTxtBxValue.getAttribute("value");
	}
	
	public void VerifyWeightUnitFrmDropdown() {
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(dropdown));     
		dropdown.click();
		wait.until(ExpectedConditions.visibilityOf(weightDropdownValue));   
		weightDropdownValue.isDisplayed();*/
		
		dropdown.click();
		weightDropdownValue.isDisplayed();
		
		//weightDropdownValue.isEnabled();
	
																											
}
	public  WebElement bmiCategoryDisplay(){
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(bmiCategory));
		}
	
}





