//package stepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import factory.DriverManager;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LaunchPage;
//
//public class LaunchStepDefinitions {
//    private LaunchPage launchPg;
//    private String appURL = null;
//    private WebDriver driver;
//
//    public LaunchStepDefinitions() {
//        driver = DriverManager.getDriver();
//        driver.get(DriverManager.getAppUrl());
//        launchPg = new LaunchPage(driver);
//    }
//
//    @Given("User is on the browser")
//    public void user_is_on_the_browser() {
//        driver = DriverManager.getDriver();
//    }
//
//    @When("User enters app url")
//    public void user_enters_app_url() {
//        appURL = DriverManager.getAppUrl();
//        if (driver == null) {
//            driver = DriverManager.getDriver();
//        }
//        driver.get(appURL);
//    }
//
//    @Then("Display cards for {string}, {string}, {string}, and {string}")
//    public void display_cards_for_and(String menphase, String folliphase, String ovulphase, String lutphase) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.visibilityOf(launchPg.txtCycleMenstrualPhase));
//        Assert.assertTrue(element.isDisplayed(), "Menstrual Phase card is not displayed");
//        Assert.assertTrue(launchPg.txtCycleMenstrualPhase.isDisplayed());
//        Assert.assertTrue(launchPg.txtCycleFollicularPhase.isDisplayed());
//        Assert.assertTrue(launchPg.txtCycleOvulationPhase.isDisplayed());
//        Assert.assertTrue(launchPg.txtCycleLutealPhase.isDisplayed());
//    }
//
//    @Then("Details about the {string} and its features")
//    public void details_about_the_and_its_features(String string) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement cycleTracking = wait.until(ExpectedConditions.visibilityOf(launchPg.txtCycleTracking));
//        Assert.assertTrue(cycleTracking.isDisplayed());
//    }
//
//    @Then("Login button should be visible")
//    public void login_button_should_be_visible() {
//        Assert.assertTrue(launchPg.btnLgn.isDisplayed());
//    }
//
//    @Then("Sign button should be visible")
//    public void sign_button_should_be_visible() {
//        Assert.assertTrue(launchPg.btnSignUp.isDisplayed());
//    }
//
//    @Then("Images in Sync' should be displayed")
//    public void images_in_sync_should_be_displayed() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement imagedisplay = wait.until(ExpectedConditions.visibilityOf(launchPg.imgWgtLoss));
//        Assert.assertTrue(imagedisplay.isDisplayed());
//    }
//
//    @Then("Display information about hormonal shifts and metabolism during the menstrual cycle")
//    public void display_information_about_hormonal_shifts_and_metabolism_during_the_menstrual_cycle() {
//        Assert.assertTrue(launchPg.txtEmpower.isDisplayed());
//    }
//
//    @Then("User should see a light purple background and readable text content")
//    public void user_should_see_a_light_purple_background_and_readable_text_content() {
//        Assert.assertTrue(launchPg.bgdColors.isDisplayed());
//    }
//
//    @Then("Display a {string} button in the footer section")
//    public void display_a_button_in_the_footer_section(String string) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement getstdbtn = wait.until(ExpectedConditions.visibilityOf(launchPg.BtnGetStarted));
//        Assert.assertTrue(getstdbtn.isDisplayed());
//    }
//
//    @Then("Start Your Personalized' button should be displayed")
//    public void start_your_personalized_button_should_be_displayed() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement persjnybtn = wait.until(ExpectedConditions.visibilityOf(launchPg.BtnStartPersonJny));
//        Assert.assertTrue(persjnybtn.isDisplayed());
//    }
//
//    @Given("User is in her balance home page")
//    public void user_is_in_her_balance_home_page() {
//        appURL = DriverManager.getAppUrl();
//        driver.get(appURL);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.urlContains("home"));
//        String currentUrl = driver.getCurrentUrl();
//        Assert.assertEquals(currentUrl, appURL);
//    }
//
//    @When("User clicks log in button")
//    public void user_clicks_log_in_button() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(launchPg.btnLgn));
//        login.click();
//    }
//
//    @Then("User should be navigated to auth page login tab")
//    public void user_should_be_navigated_to_auth_page_login_tab() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.urlContains("auth"));
//        String currentUrl = driver.getCurrentUrl();
//        Assert.assertTrue(currentUrl.contains("auth"), "User is not on login page" + currentUrl);
//    }
//
//    @When("User clicks sign up button")
//    public void user_clicks_sign_up_button() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(launchPg.btnSignUp));
//        signup.click();
//    }
//
//    @Then("User should be navigated to auth page sign up tab")
//    public void user_should_be_navigated_to_auth_page_sign_up_tab() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.urlContains("auth?tab=register"));
//        String currentUrl = driver.getCurrentUrl();
//        Assert.assertTrue(currentUrl.contains("auth?tab=register"), "User is not on signup page" + currentUrl);
//    }
//
//    @When("User clicks Get Started button")
//    public void user_clicks_get_started_button() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement getStarted = wait.until(ExpectedConditions.elementToBeClickable(launchPg.BtnGetStarted));
//        getStarted.click();
//    }
//
//    @When("User clicks Start your personalized journey button")
//    public void user_clicks_start_your_personalized_journey_button() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement startper = wait.until(ExpectedConditions.elementToBeClickable(launchPg.BtnStartPersonJny));
//        startper.click();
//    }
//}
