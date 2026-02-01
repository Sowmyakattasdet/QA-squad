package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityInsightsMenuPage extends BasePage {

	@FindBy(name = ("username"))
	private WebElement userName;

	@FindBy(name = ("password"))
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit' and text()='LogIn']")
	private WebElement loginButton;

	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement homePageloginButton;

	public ActivityInsightsMenuPage(WebDriver driver) {
		super(driver);

	}

	public void Login() throws InterruptedException {

		homePageloginButton.click();
		userName.clear();
		userName.sendKeys("qasquadteam3@gmail.com");
		password.clear();
		password.click();
		password.sendKeys("herbalance123");
		loginButton.click();

		Thread.sleep(2000);
		// Actions actions = new Actions(driver);
		// actions.click(password).build().perform();
		// actions.sendKeys(password, "herbalance123").perform();
		// System.out.println(password.getAttribute("value"));
		//
		// Thread.sleep(2000);
		// // password.click();
		// // password.sendKeys("You2026");
		// Thread.sleep(2000);
		// loginButton.click();
		// Thread.sleep(2000);
	}

}
