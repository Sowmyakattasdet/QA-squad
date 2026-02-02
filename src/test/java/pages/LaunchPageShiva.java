package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ConfigReader;

public class LaunchPageShiva extends BasePage {
	

	public LaunchPageShiva(WebDriver driver) {
		super(driver);

	}

	public void launchApplication() {

		driver.get(ConfigReader.getProperty("appURL"));

	}
	
	 
	 

}


