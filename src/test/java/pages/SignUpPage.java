package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;

public class SignUpPage extends BasePage {
	WebDriver driver;

	@FindBy(xpath = "//input[@type='email' and @name='username']")
	public WebElement txtEmail;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement txtPassword;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement txtCfmPassword;

	@FindBy(xpath = "//input[contains(@name,'password')]/parent::div//button")
	public WebElement pwdEye;

	@FindBy(xpath = "//input[contains(@name,'confirm')]/parent::div//button")
	public WebElement cfmPwdEye;

	@FindBy(xpath = "//button[@id='showPasswordRegister']")
	public WebElement btnRadioShowPwd;

	@FindBy(xpath = "//div[.//text()[contains(.,'Terms')]]//button[@role='checkbox']")
	public WebElement btnRadioAgree;

	@FindBy(xpath = "//*[contains(text(),'Terms') and contains(text(),'Conditions')]")
	public WebElement txtTermsAndConditions;

	@FindBy(xpath = "//button[normalize-space()='Register']")
	public WebElement btnRegister;

	@FindBy(xpath = "//button[normalize-space()='Log in']")
	public WebElement lnkLogin;

	@FindBy(xpath = "//*[contains(@class,'destructive') or contains(@role,'alert')]")
	private List<WebElement> errorMessages;

	@FindBy(xpath = "//button[contains(text(), 'Login')]")
	public WebElement tabLogin;

	@FindBy(xpath = "//input[(@type='email' or @type='password')]")
	public List<WebElement> inputFields;

	@FindBy(name = ("username"))
	private WebElement userName;

	@FindBy(name = ("password"))
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit' and text()='LogIn']")
	private WebElement loginButton;

	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement homePageloginButton;

	public SignUpPage(WebDriver indriver) {

		super(indriver);
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void enterPasswordConfirmation(String passwordConfirmation) {
		txtCfmPassword.sendKeys(passwordConfirmation);
	}

	public void clickRegisterBtn() {
		btnRegister.click();
	}

	public void registerUserwithoutclickingTerms() {
		enterEmail("qasquadhackathon@gmail.com");
		enterPassword("herbalance");
		enterPasswordConfirmation("herbalance");
		btnRadioShowPwd.click();
		clickRegisterBtn();
	}

	public List<String> getAllErrorMessages() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(errorMessages));

		return errorMessages.stream().map(e -> e.getText().trim()).toList();
	}

	public WebElement eyeIconAction(String passwordValue, String field,
			String action) {
		WebElement inputField;
		WebElement eyeIcon;

		if (field.equalsIgnoreCase("password")) {
			inputField = txtPassword;
			eyeIcon = pwdEye;
		} else {
			inputField = txtCfmPassword;
			eyeIcon = cfmPwdEye;
		}
		inputField.clear();
		inputField.sendKeys(passwordValue);
		if (action.equalsIgnoreCase("click eye icon")) {
			eyeIcon.click();
		} else if (action.equalsIgnoreCase("click eye icon again")) {
			eyeIcon.click();
			eyeIcon.click();
		}
		return inputField;
	}

	public boolean isEmailIdDisplayed() {
		return txtEmail.isDisplayed();
	}

	public String getEmailIdPlaceholder_text() {
		String placeholder = txtEmail.getDomAttribute("placeholder");
		return placeholder;
	}

	public boolean isPasswordDisplayed() {
		return txtPassword.isDisplayed();
	}

	public boolean isPasswordMasked() {
		String type = txtPassword.getDomAttribute("type");
		return type.equalsIgnoreCase("password");
	}

	public boolean isConfirmPasswordDisplayed() {
		return txtCfmPassword.isDisplayed();
	}

	public boolean isConfirmPasswordMasked() {
		String type = txtCfmPassword.getDomAttribute("type");
		return type.equalsIgnoreCase("password");
	}

	public boolean isLoginButtonEnabled() {
		return tabLogin.isEnabled();
	}

	public boolean isLoginLinkVisible() {
		return lnkLogin.isDisplayed();
	}

	public void clickLoginLink() {
		lnkLogin.click();
	}

	public boolean isOnLoginPage() {
		String title = driver.getTitle();
		return title != null && title.toLowerCase().contains("login");
	}

	// ========================= Layout Checks ========================= //

	public boolean verifyingInputFields() {
		List<WebElement> fields = inputFields;
		return fields.size() == 3;
	}

	public boolean verifyShowPasswordRadioButton() {
		WebElement showPwd = btnRadioShowPwd;
		boolean result = showPwd.isDisplayed();
		return result;
	}

	public boolean verifyTermsAndConditionsPresent() {
		boolean visible = txtTermsAndConditions.isDisplayed();
		return visible;
	}

	public boolean verifyTermsandConditionRadioButton() {
		WebElement termsRadio = btnRadioAgree;
		boolean result = termsRadio.isDisplayed();
		return result;
	}

	public void login() throws InterruptedException {
		String email = ConfigReader.getProperty("app.username");
		String password1 = ConfigReader.getProperty("app.password");
		homePageloginButton.click();
		userName.clear();
		userName.sendKeys(email);
		password.clear();
		password.sendKeys(password1);
		loginButton.click();
		Thread.sleep(3000);

	}

}