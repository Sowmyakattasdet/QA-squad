package hooks;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import factory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import pom.PageObjectManager;
import utils.ConfigReader;
import utils.LoggerFactory;

public class Hooks {

	PageObjectManager pom;

	@Before
	public void Setup() throws IOException {

		DriverManager.initBrowser();
		pom = new PageObjectManager(DriverManager.getDriver());
		pom.getLaunchPage().launchApplication();

	}
	public PageObjectManager getPom() {
		return pom;
	}
	@Before("@requiresLogin")
	public void loginBeforeScenario() {

	    String email = ConfigReader.getProperty("app.username");
	    String password = ConfigReader.getProperty("app.password");

	    
	    pom.getLoginPage().clickLoginButton();
	    pom.getLoginPage().login(email, password);

	   
	}
	@After
	public void tearDown(Scenario scenario) {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
		}
		LoggerFactory.getLogger().info("DONE tearDown()..");
	}

	@AfterStep
	public void takeScreenShot(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot takesScreenshot = (TakesScreenshot) DriverManager
					.getDriver();
			byte[] screenShot = takesScreenshot
					.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", scenario.getName());
			Allure.addAttachment(scenario.getName(),
					new ByteArrayInputStream(screenShot));
		}
	}
}
