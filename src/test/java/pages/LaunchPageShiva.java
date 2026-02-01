package pages;

import org.openqa.selenium.WebDriver;

import utils.ConfigReader;

public class LaunchPageShiva extends BasePage {

	public LaunchPage(WebDriver driver) {
		super(driver);

	}

	public void launchApplication() {

		driver.get(ConfigReader.getProperty("appURL"));

	}

}

