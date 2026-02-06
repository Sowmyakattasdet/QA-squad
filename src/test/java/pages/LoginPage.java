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

	private By homeLoginBtn = By.xpath("//*[self::button or self::a]" +
		    "[normalize-space()='Log In' or normalize-space()='Login' or normalize-space()='Log in' or normalize-space()='LOG IN']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "img[alt*='HerBalance']")
	private WebElement logo;

	@FindBy(xpath = "//*[self::button or self::a][contains(normalize-space(.),'Login')]")
	private WebElement loginTab;

	@FindBy(css = "input[type='email']")
	private WebElement emailField;

	@FindBy(css = "input[type='password']")
	private WebElement passwordField;

	private By authLoginSubmit = By.cssSelector("button[type='submit'], form button[type='submit']");

	@FindBy(css = ".toast, .alert, .error, [role='alert']")
	private WebElement loginError;

	@FindBy(css = "a[href*='logout'], button[aria-label*='Logout'], a[href*='dashboard']")
	private WebElement loggedInMarker;
	@FindBy(xpath = "//*[normalize-space()='Show password' or normalize-space()='Show Password']")
	private WebElement showPassword;

	@FindBy(xpath = "//a[contains(normalize-space(.),'Forgot')] | //button[contains(normalize-space(.),'Forgot')]")
	private WebElement forgotPasswordLink;

	@FindBy(xpath = "//button[normalize-space()='Login' or normalize-space()='Log in' or normalize-space()='Log In']")
	private WebElement loginBtnOnAuth;

	@FindBy(xpath = "//a[contains(normalize-space(.),'Sign Up')] | //button[contains(normalize-space(.),'Sign Up')]")
	private WebElement signUpLinkOrTab;

	@FindBy(xpath = "//*[contains(normalize-space(.),'Cycle-Synced Plans')]")
	private WebElement cycleSyncedPlansText;

	@FindBy(xpath = "//*[contains(normalize-space(.),'Blood Work Analysis')]")
	private WebElement bloodWorkAnalysisText;

	@FindBy(xpath = "//*[contains(normalize-space(.),'Personalized Dashboard')]")
	private WebElement personalizedDashboardText;

	@FindBy(xpath = "//button[contains(normalize-space(.),'Sign Up')] | //a[contains(normalize-space(.),'Sign Up')]")
	private WebElement signUpTab;

	@FindBy(xpath = "//*[contains(normalize-space(.),'Show password')]/preceding::input[1]")
	private WebElement showPasswordRadioOrCheckbox;

	@FindBy(xpath = "//*[contains(normalize-space(.),'Sarah') and contains(normalize-space(.),'34')]")
	private WebElement testimonialSarah34;

	@FindBy(xpath = "//button[contains(normalize-space(.),'Login') or contains(normalize-space(.),'Sign Up')]"
			+ " | //a[contains(normalize-space(.),'Login') or contains(normalize-space(.),'Sign Up')]")
	private java.util.List<WebElement> authTabs;

	@FindBy(css = "input")
	private java.util.List<WebElement> allInputs;

	@FindBy(css = "body")
	private WebElement pageBody;

	@FindBy(xpath = "//label[contains(text(),'Show')] | //input[@type='checkbox']")
	private WebElement showPasswordToggle;

	public boolean isTestimonialDisplayed() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10))
					.until(ExpectedConditions.visibilityOf(testimonialSarah34));
			return testimonialSarah34.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public int getTabsCount() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(d -> authTabs.size() > 0);
			return authTabs.size();
		} catch (Exception e) {
			return 0;
		}
	}

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

			// vertical stacking: password should be below email
			boolean isBelow = passRect.getY() > emailRect.getY();

			// left aligned: X positions should be close
			int xDiff = Math.abs(emailRect.getX() - passRect.getX());
			boolean leftAligned = xDiff <= 5; // allow tiny pixel differences

			// equal width (optional but useful)
			int wDiff = Math.abs(emailRect.getWidth() - passRect.getWidth());
			boolean similarWidth = wDiff <= 5;

			// spacing: gap between email bottom and password top should be reasonable
			int gap = passRect.getY() - (emailRect.getY() + emailRect.getHeight());
			boolean reasonableGap = gap >= 5; // not overlapping

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

	public void clickHomeLoginButton() {
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
			
			System.out.println(actual);
			
			return emailField.isDisplayed() && actual != null
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
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(emailField));

		emailField.clear();
		emailField.sendKeys(email);

		passwordField.clear();
		passwordField.sendKeys(password);

		//loginButton.click();

		new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.not(ExpectedConditions.urlContains("/auth")));
	}

	public boolean isOnDashboard() {
		try {
			// success signal: either URL leaves /auth OR a logged-in marker appears
			return wait.until(d -> !d.getCurrentUrl().contains("/auth")) || isElementVisible(loggedInMarker);
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
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(showPassword));
			return showPassword.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isLoginButtonVisibleAndEnabled() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginBtnOnAuth));
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
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(signUpLinkOrTab));
			return signUpLinkOrTab.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickSignUpLink() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(signUpLinkOrTab)).click();
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

			return cycleSyncedPlansText.isDisplayed() && bloodWorkAnalysisText.isDisplayed()
					&& personalizedDashboardText.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isSignUpTabActive() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(signUpTab));

			String cls = signUpTab.getAttribute("class");
			String aria = signUpTab.getAttribute("aria-selected");

			return (cls != null && cls.toLowerCase().contains("active")) || "true".equalsIgnoreCase(aria);
		} catch (Exception e) {
			return false;
		}
	}

	public void clickSignUpTab() {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(signUpTab))
				.click();
	}

	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(emailField));
		emailField.clear();
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.clear();
		passwordField.sendKeys(password);
	}

	public void clickLoginOnAuthPage() {
	    WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(authLoginSubmit));
	    btn.click();
	}


	public boolean isOnAuthPage() {
		return driver.getCurrentUrl().contains("/auth") && isElementVisible(loginTab);
	}

	public boolean waitForDashboard() {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(20))
					.until(ExpectedConditions.not(ExpectedConditions.urlContains("/auth")));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String getLoginErrorMessage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(loginError));
			return loginError.getText().trim();
		} catch (Exception e) {
			return "";
		}
	}

	public String getPasswordInputType() {
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		return passwordField.getAttribute("type");
	}

	public void toggleShowPassword() {
		wait.until(ExpectedConditions.elementToBeClickable(showPasswordRadioOrCheckbox)).click();
	}

//-------- clear fields ----------
	public void clearEmail() {
		wait.until(ExpectedConditions.visibilityOf(emailField));
		emailField.clear();
	}

	public void clearPassword() {
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.clear();
	}

//-------- validation messages ----------
	public String getEmailValidationMessage() {
		try {
			return emailField.getAttribute("validationMessage");
		} catch (Exception e) {
			return "";
		}
	}

	public String getPasswordValidationMessage() {
		try {
			return passwordField.getAttribute("validationMessage");
		} catch (Exception e) {
			return "";
		}
	}

//-------- show password ----------
	public void enableShowPassword() {
		wait.until(ExpectedConditions.elementToBeClickable(showPasswordRadioOrCheckbox)).click();
	}

	public void disableShowPassword() {
		wait.until(ExpectedConditions.elementToBeClickable(showPasswordRadioOrCheckbox)).click();
	}


//---------- eye icon (show/hide password) ----------
	public void clickEyeIcon() {
		By eyeBtn = By.cssSelector("button[aria-label*='password'], button[aria-label*='Password'], "
				+ "button[type='button'][aria-label*='Show'], button[type='button'][aria-label*='Hide']");

		WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(eyeBtn));
		btn.click();
	}

//---------- generic link click by visible text ----------
	public void clickLinkByText(String linkText) {
		By link = By.xpath("//*[self::a or self::button][normalize-space()='" + linkText + "']");
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(link)).click();
	}

//---------- forgot password page check ----------
	public boolean isOnForgotPasswordPage() {
		String url = driver.getCurrentUrl().toLowerCase();
		return url.contains("forgot") || url.contains("reset");
	}

//---------- tab click (Login / Sign Up) ----------
	public void clickTab(String tab) {
		String t = tab.toLowerCase().trim();
		if (t.equals("login")) {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(loginTab))
					.click();
			return;
		}
		if (t.equals("sign up") || t.equals("signup")) {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(signUpTab))
					.click();
			return;
		}
		throw new IllegalArgumentException("Unknown tab: " + tab);
	}

}
