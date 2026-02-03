package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import factory.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LaunchPage;
import pages.SignUpPage;
import utils.ConfigReader;


public class SignUpUIStepDefinitions {
	 
	    private WebDriver driver;
	    private LaunchPage launchPg;
	    private SignUpPage signupPage;

	    public SignUpUIStepDefinitions() {
	        driver = DriverManager.getDriver();
	        driver.get(ConfigReader.getProperty("appURL"));
	        launchPg = new LaunchPage(driver);
	        signupPage = new SignUpPage(driver);	       
	    }
	
	


}
