package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.ConfigReader;
import utils.LoggerFactory;

public class LaunchPage extends BasePage {

   // WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Menstrual']")
    public WebElement txtCycleMenstrualPhase;

    @FindBy(xpath = "//span[normalize-space()='Follicular']")
    public WebElement txtCycleFollicularPhase;

    @FindBy(xpath = "//span[normalize-space()='Ovulation']")
    public WebElement txtCycleOvulationPhase;

    @FindBy(xpath = "//span[normalize-space()='Luteal']")
    public WebElement txtCycleLutealPhase;

    @FindBy(xpath = "//h3[normalize-space()='Cycle Tracking App']")
    public WebElement txtCycleTracking;

    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    public WebElement btnLgn;

    @FindBy(xpath = "//button[contains(text(),'Sign Up')]")
    public WebElement btnSignUp;

    @FindBy(xpath = "//img[@alt='Workout Exercises for Women']")
    public WebElement imgWgtLoss;

    @FindBy(xpath = "//h1[contains(text(),'Empower Your Weight Loss')]")
    public WebElement txtEmpower;

    @FindBy(xpath = "//section[@class='py-16 px-6 bg-gradient-to-b from-[#E6E6FA] to-white']")
    public WebElement bgdColors;

    @FindBy(xpath = "//button[contains(text(),'Get Started Now')]")
    public WebElement BtnGetStarted;

    @FindBy(xpath = "//button[normalize-space()='Start Your Personalized Journey']")
    public WebElement BtnStartPersonJny;

    public LaunchPage(WebDriver driver) {
       // LoggerFactory.getLogger().info("Incoming Driver:{}", indriver);
       // this.driver = indriver;
        super(driver);
       
    }

    public void clickLoginButton() {
        btnLgn.click();
    }
    public void clickSignUpButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement signup = wait
				.until(ExpectedConditions.elementToBeClickable(btnSignUp));
		signup.click();
	}
  
    public void clickGetStartedButton() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement getStarted = wait.until(ExpectedConditions
				.elementToBeClickable(BtnGetStarted));
		getStarted.click();
    }

    public void clickStartYourPersonalizedJourneyButton() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement startper = wait.until(ExpectedConditions
				.elementToBeClickable(BtnStartPersonJny));
		startper.click();
    }

    public String getLaunchPageURL() {

        return driver.getCurrentUrl();
    }
    public void launchApplication() {
		driver.get(ConfigReader.getProperty("appURL"));
	}
    public boolean displayCards() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOf(txtCycleMenstrualPhase));
		if (element.isDisplayed() && txtCycleMenstrualPhase.isDisplayed()
				&& txtCycleFollicularPhase.isDisplayed()
				&& txtCycleOvulationPhase.isDisplayed()
				&& txtCycleLutealPhase.isDisplayed())
			;
		{
			return true;
		}
    }
    public boolean detailscycletrackingapp()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cycleTracking = wait.until(ExpectedConditions
				.visibilityOf(txtCycleTracking));
		cycleTracking.isDisplayed();
		return true;
    }
    public boolean imagesinsync()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement imagedisplay = wait.until(ExpectedConditions
				.visibilityOf(imgWgtLoss));
		imagedisplay.isDisplayed();
		return true;
    }
    public boolean getstartednow()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement getstdbtn = wait.until(ExpectedConditions
				.visibilityOf(BtnGetStarted));
		getstdbtn.isDisplayed();
		return true;
    }
    public boolean startyourpersonalized()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement persjnybtn = wait.until(ExpectedConditions
				.visibilityOf(BtnStartPersonJny));
		persjnybtn.isDisplayed();
		return true;
    }
    public boolean navigatingtoauthreg()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains("auth?tab=register"));
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("auth?tab=register"),
				"User is not on signup page" + currentUrl);
		return true;
    }
    
}
