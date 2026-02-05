package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By homeLoginBtn = By.xpath("//button[normalize-space()='Log In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "img[alt*='HerBalance']")
    private WebElement logo;

    // Tabs (make them flexible)
    @FindBy(xpath = "//*[self::button or self::a][contains(normalize-space(.),'Login')]")
    private WebElement loginTab;

//    @FindBy(xpath = "//*[self::button or self::a][contains(normalize-space(.),'Sign Up')]")
//    private WebElement signUpTab;

    @FindBy(css = "input[type='email']")
    private WebElement emailField;

    @FindBy(css = "input[type='password']")
    private WebElement passwordField;

    @FindBy(css = "form button[type='submit']")
    private WebElement loginButton;

    
    @FindBy(css = ".toast, .alert, .error, [role='alert']")
    private WebElement loginError;

    @FindBy(css = "a[href*='logout'], button[aria-label*='Logout'], a[href*='dashboard']")
    private WebElement loggedInMarker;
    @FindBy(xpath = "//*[normalize-space()='Show password' or normalize-space()='Show Password']")
    private WebElement showPassword;

    @FindBy(xpath = "//a[contains(normalize-space(.),'Forgot')] | //button[contains(normalize-space(.),'Forgot')]")
    private WebElement forgotPasswordLink;

    // Login button on auth page (not the home page Log In)
    @FindBy(xpath = "//button[normalize-space()='Login' or normalize-space()='Log in' or normalize-space()='Log In']")
    private WebElement loginBtnOnAuth;
  
    @FindBy(xpath = "//a[contains(normalize-space(.),'Sign Up')] | //button[contains(normalize-space(.),'Sign Up')]")
    private WebElement signUpLinkOrTab;

    // right panel feature bullets (use contains to be resilient)
    @FindBy(xpath = "//*[contains(normalize-space(.),'Cycle-Synced Plans')]")
    private WebElement cycleSyncedPlansText;

    @FindBy(xpath = "//*[contains(normalize-space(.),'Blood Work Analysis')]")
    private WebElement bloodWorkAnalysisText;

    @FindBy(xpath = "//*[contains(normalize-space(.),'Personalized Dashboard')]")
    private WebElement personalizedDashboardText;

    @FindBy(xpath = "//button[contains(normalize-space(.),'Sign Up')] | //a[contains(normalize-space(.),'Sign Up')]")
    private WebElement signUpTab;

    public void clickSignUpTab() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(signUpTab))
                .click();
    }
    
    @FindBy(xpath = "//*[contains(normalize-space(.),'Show password')]/preceding::input[1]")
    private WebElement showPasswordRadioOrCheckbox;
    
    @FindBy(xpath = "//*[contains(normalize-space(.),'Sarah') and contains(normalize-space(.),'34')]")
    private WebElement testimonialSarah34;

    public boolean isTestimonialDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(testimonialSarah34));
            return testimonialSarah34.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    @FindBy(xpath = "//button[contains(normalize-space(.),'Login') or contains(normalize-space(.),'Sign Up')]"
            + " | //a[contains(normalize-space(.),'Login') or contains(normalize-space(.),'Sign Up')]")
    private java.util.List<WebElement> authTabs;

    public int getTabsCount() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(d -> authTabs.size() > 0);
            return authTabs.size();
        } catch (Exception e) {
            return 0;
        }
    }

    @FindBy(css = "input")
    private java.util.List<WebElement> allInputs;
    
    @FindBy(css = "body")
    private WebElement pageBody;
    
    @FindBy(xpath = "//label[contains(text(),'Show')] | //input[@type='checkbox']")
    private WebElement showPasswordToggle;



    public boolean isThemeLoaded() {
        try {
            String bg = pageBody.getCssValue("background");
            return bg != null && !bg.isEmpty();
        } catch (Exception e) {
            return false;
        }
    }

    public int getInputFieldCount() {
        return driver.findElements(By.cssSelector("input")).size();
    }

    

    public int getEmailAndPasswordInputCount() {
        int count = 0;
        for (WebElement e : allInputs) {
            String type = e.getAttribute("type");
            if ("email".equalsIgnoreCase(type) || "password".equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    public boolean isFieldsVerticallyAlignedWithSpacing() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(emailField));
            wait.until(ExpectedConditions.visibilityOf(passwordField));

            Rectangle emailRect = emailField.getRect();
            Rectangle passRect = passwordField.getRect();


            // 1) vertical stacking: password should be below email
            boolean isBelow = passRect.getY() > emailRect.getY();

            // 2) left aligned: X positions should be close
            int xDiff = Math.abs(emailRect.getX() - passRect.getX());
            boolean leftAligned = xDiff <= 5;   // allow tiny pixel differences

            // 3) equal width (optional but useful)
            int wDiff = Math.abs(emailRect.getWidth() - passRect.getWidth());
            boolean similarWidth = wDiff <= 5;

            // 4) spacing: gap between email bottom and password top should be reasonable
            int gap = passRect.getY() - (emailRect.getY() + emailRect.getHeight());
            boolean reasonableGap = gap >= 5;   // not overlapping

            return isBelow && leftAligned && similarWidth && reasonableGap;

        } catch (Exception e) {
            return false;
        }
    }


    public boolean isShowPasswordRadioVisible() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(showPasswordRadioOrCheckbox));
            return showPasswordRadioOrCheckbox.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    
    public void clickLoginButton() {
        driver.findElement(homeLoginBtn).click();
        wait.until(ExpectedConditions.urlContains("/auth"));
        wait.until(ExpectedConditions.visibilityOf(loginTab));
    }

    public boolean isLogoDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOf(logo));
            return logo.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isTabVisible(String tabName) {
        String t = tabName.toLowerCase().trim();
        if (t.equals("login")) {
            return isElementVisible(loginTab);
        }
        if (t.equals("sign up") || t.equals("signup")) {
            return isElementVisible(signUpTab);
        }
        throw new IllegalArgumentException("Unknown tab: " + tabName);
    }

    public boolean isLoginTabActive() {
        try {
            wait.until(ExpectedConditions.visibilityOf(loginTab));
            String classAttr = loginTab.getAttribute("class");
            String ariaSelected = loginTab.getAttribute("aria-selected");

            return (classAttr != null && classAttr.toLowerCase().contains("active"))
                    || "true".equalsIgnoreCase(ariaSelected);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isEmailFieldVisibleWithPlaceholder(String expectedPlaceholder) {
        try {
            wait.until(ExpectedConditions.visibilityOf(emailField));
            String actual = emailField.getAttribute("placeholder");
            return emailField.isDisplayed()
                    && actual != null
                    && actual.trim().equalsIgnoreCase(expectedPlaceholder.trim());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPasswordFieldVisibleAndMasked() {
        try {
            wait.until(ExpectedConditions.visibilityOf(passwordField));
            String type = passwordField.getAttribute("type");
            return passwordField.isDisplayed() && "password".equalsIgnoreCase(type);
        } catch (Exception e) {
            return false;
        }
    }

    public void login(String email, String password) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(emailField));

        emailField.clear();
        emailField.sendKeys(email);

        passwordField.clear();
        passwordField.sendKeys(password);

        loginButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.not(ExpectedConditions.urlContains("/auth")));
    }



   
    public boolean isOnDashboard() {
        try {
            // success signal: either URL leaves /auth OR a logged-in marker appears
            return wait.until(d ->
                    !d.getCurrentUrl().contains("/auth")
            ) || isElementVisible(loggedInMarker);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginErrorVisible() {
        return isElementVisible(loginError);
    }


    private boolean isElementVisible(WebElement el) {
        try {
            wait.until(ExpectedConditions.visibilityOf(el));
            return el.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isShowPasswordVisible() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(showPassword));
            return showPassword.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginButtonVisibleAndEnabled() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(loginBtnOnAuth));
            return loginBtnOnAuth.isDisplayed() && loginBtnOnAuth.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isForgotPasswordVisible() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(forgotPasswordLink));
            return forgotPasswordLink.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isSignUpLinkVisible() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(signUpLinkOrTab));
            return signUpLinkOrTab.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickSignUpLink() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(signUpLinkOrTab))
                .click();
    }

    public boolean isOnSignUpPage() {
        // simplest: URL OR page content check
        String url = driver.getCurrentUrl();
        return url.toLowerCase().contains("signup") || url.toLowerCase().contains("sign-up");
    }

    public boolean isRightPanelContentPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(cycleSyncedPlansText));
            wait.until(ExpectedConditions.visibilityOf(bloodWorkAnalysisText));
            wait.until(ExpectedConditions.visibilityOf(personalizedDashboardText));

            return cycleSyncedPlansText.isDisplayed()
                    && bloodWorkAnalysisText.isDisplayed()
                    && personalizedDashboardText.isDisplayed();
        } catch (Exception e) {
            return false;
        }
  }
    public boolean isSignUpTabActive() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(signUpTab));

            String cls = signUpTab.getAttribute("class");
            String aria = signUpTab.getAttribute("aria-selected");

            return (cls != null && cls.toLowerCase().contains("active"))
                    || "true".equalsIgnoreCase(aria);
        } catch (Exception e) {
            return false;
        }
    }
}
