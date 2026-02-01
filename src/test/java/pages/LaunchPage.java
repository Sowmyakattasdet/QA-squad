package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ConfigReader;
import utils.LoggerFactory;

public class LaunchPage {

    WebDriver driver;

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

    public LaunchPage(WebDriver indriver) {
        LoggerFactory.getLogger().info("Incoming Driver:{}", indriver);
        this.driver = indriver;
        PageFactory.initElements(indriver, this);
    }

    public void clickLoginButton() {
        btnLgn.click();
    }

    public void clickSignUpButton() {
        btnSignUp.click();
    }

    public void clickGetStartedButton() {
        BtnGetStarted.click();
    }

    public void clickStartYourPersonalizedJourneyButton() {
        BtnStartPersonJny.click();
    }

    public String getLaunchPageURL() {

        return driver.getCurrentUrl();
    }
    public void launchApplication() {
		driver.get(ConfigReader.getProperty("appURL"));
	}
}
