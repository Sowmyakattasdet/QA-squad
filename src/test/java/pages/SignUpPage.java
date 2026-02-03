package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
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

	@FindBy(xpath = "//p[@id=':rh:-form-item-message']")
	public WebElement txtTermsAndConditions;

	@FindBy(xpath = "//button[normalize-space()='Register']")
	public WebElement btnRegister;

	@FindBy(xpath = "//button[normalize-space()='Log in']")
	public WebElement lnkLogin;

	@FindBy(xpath = "//p[text()='Invalid email address']")
	public WebElement errInvalidEmail;

	@FindBy(xpath = "//p[contains(@class,'text-destructive') and contains(text(),'confirm your password')]")
	public WebElement errCfmPwd;

	@FindBy(xpath = "//p[@class='text-sm font-medium text-destructive' and normalize-space()='Password must be at least 6 characters']")
	public WebElement errPwdLgth;

	@FindBy(xpath = "//p[@class='text-sm font-medium text-destructive' and normalize-space()='You must accept the Terms & Conditions and Privacy Policy' ]")
	public WebElement errTerms;

	@FindBy(xpath = "//*[contains(@class,'destructive') or contains(@role,'alert')]")
	private List<WebElement> errorMessages;

	@FindBy(xpath = "//button[@id='radix-:r0:-trigger-login']")
	public WebElement tabLogin;

	public SignUpPage(WebDriver indriver) {
		this.driver = indriver;
		PageFactory.initElements(indriver, this);
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

	public void getBrowserValidationMessage() {
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.getAttribute("validationMessage");
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

	public WebElement eyeIconAction(String passwordValue, String field, String action) {
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
}
