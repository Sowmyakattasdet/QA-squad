package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(.,'Log in') or contains(.,'Login')]")
    private WebElement loginBtn;

    @FindBy(css = "img[alt*='HerBalance']")
    private WebElement logo;

    public void clickLoginButton() {
        loginBtn.click();
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
}
