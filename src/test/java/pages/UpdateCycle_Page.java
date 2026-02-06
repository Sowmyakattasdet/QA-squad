package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;
import utils.ConfigReader;
import webElementActions.ElementActions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

//import io.cucumber.messages.types.Duration;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;



public class UpdateCycle_Page extends BasePage {

	WebDriver driver;
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

	
	
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	@FindBy(xpath="//*[text()='Menstrual Phase Logs']\")")
	private WebElement mp;

	@FindBy(xpath="//*[text()='Update Cycle Information']")
	private WebElement up;
	
	//------------------------------------------------
	@FindBy(xpath = "//*[text() = \"Activity Insights\"]") public WebElement activityInsights;
	@FindBy(xpath = "//*[text() ='Menstrual Phase Logs' and @class='flex items-center']") public WebElement menstrualPhaseLogs;
	@FindBy(xpath = "//*[text() ='Update Cycle Information']") public WebElement updateCycleInformation;
	@FindBy(xpath = "//*[@id='radix-:r5:']") public WebElement udateCycleInformationPopUp;
	@FindBy(xpath = "//button[@name='day' and @aria-selected='true']") public WebElement enableDateSelection;
	@FindBy(xpath = "//button[@name='previous-month' and @aria-label='Go to previous month']") public WebElement previousMonth;
	@FindBy(xpath = "//button[@name='next-month' and @aria-label='Go to next month']") public WebElement nextMonth;
	@FindBy(xpath = "//input[@type ='number']") public WebElement updateCycleLengthDays;
	@FindBy(xpath = "//button[text() ='Cancel']") public WebElement cancelButton;
	//@FindBy(xpath = "//button[text() ='Save Changes']") public WebElement saveChanges;
	@FindBy(xpath = "//button[contains(.,'Save Changes')]") public WebElement saveChanges;
	@FindBy(xpath = "//*[@class='grid gap-1 flex-1']") public WebElement cycleLengthSaveChangepopupmessage;
	@FindBy(xpath = "class=\"space-y-4 rdp-caption_start rdp-caption_end\"]") public WebElement dateCalendar;
	@FindBy(xpath ="//*[@name=\"day\" and text() =\"3\"]") public WebElement calendarspecificdate;
	@FindBy(xpath =" //a[@href=\"/track/menstrual-cycle\"]/div[contains(text(), 'Menstrual Phase Logs')]") public WebElement menstrualphaselogs1;	
	
	//button[contains(.,'Save Changes')]

	
	ElementActions elementActions;

	public  UpdateCycle_Page(WebDriver driver) {
		super(driver);
		elementActions = new ElementActions(driver);

	}

	
	
	
	// --------------signup webelements-------------------
	
	
	@FindBy(xpath="//*[@name='username']")
	private WebElement userName;

	@FindBy(xpath="//*[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginButton;
// ---------------------------- signup methods ----------------------------------	
	public void Login()  {

		userName.sendKeys("qasquad@gmail.com");
		password.sendKeys("HerBalance123");
		loginButton.click();
	}
		
	public void launchApplication() {

		driver.get(ConfigReader.getProperty("appURL"));

	}
	
//------------------------------------------------
	public void menstrualclkMpl(){
		wait.until(ExpectedConditions.visibilityOf(mp));
		}
	
	public void menstrualclickUci(){
		wait.until(ExpectedConditions.visibilityOf(up));
		}
	
	
	
	
	
	
	// ----------------------------------------------------------------
	
	
	
	public void  activityInsights()
	{
		activityInsights.click();
	}
	
	public void clickmenstrualphaselogs1()
	{
		menstrualphaselogs1.click();
	}
	
	public String menstrualphaselogs1gettext()
	{
		return menstrualphaselogs1.getText();
	}
	
	public void openMenstrualphaselogs1()
	{
		activityInsights.click();
		menstrualphaselogs1.click();
	
		Actions actions = new Actions(driver);
		actions.click(menstrualPhaseLogs).perform();
	
	}
	
	public boolean isUpdateCycleInformationDisplayed()
	{
		return updateCycleInformation.isDisplayed();
	}
	
	public void navigateTomenstrualPhaseLogs()
	{
		//Actions actions = new Actions(driver);

		Actions actions = new Actions(driver);
		actions.moveToElement(menstrualphaselogs1);
		actions.click(menstrualPhaseLogs).perform();
		
		
		//wait.until(ExpectedConditions.visibilityOf(menstrualPhaseLogs));
		//actions.click(menstrualPhaseLogs).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", menstrualPhaseLogs);
		
		
		
		
		//elementActions.clickAction(activityInsights);
		//actions.moveToElement(activityInsights).pause(Duration.ofMillis(500)).click(menstrualphaselogs1).build().perform();
		//wait().until(ExpectedConditions.invisibilityOfElementLocated(menstrualPhaseLogs));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(menstrualPhaseLogs));
		//actions.click(menstrualPhaseLogs).perform();
		//elementActions.clickAction(menstrualPhaseLogs);
		//actions.moveToElement(menstrualPhaseLogs).perform();
		
		  // elementActions.clickElementByText(menstrualPhaseLogs.getText(), "Menstrual Phase Logs");
		    	
		  // elementActions.getWait().until(ExpectedConditons.urlContains("menstrual-cycle"));
		    		
		    		
		    		
		    	//	wait.until(
		    //    ExpectedConditions.visibilityOfElementLocated(activityInsightsBtn)
		//    );
		//    actions.moveToElement(menu).perform();

		//    wait.until(ExpectedConditions.elementToBeClickable(menstrualPhaseLogsOption)).click();
		

		
      // wait.until(ExpectedConditions.elementToBeClickable(activityInsights)).click();
       // wait.until(ExpectedConditions.elementToBeClickable(menstrualPhaseLogs)).click();
    	
}
	
	public void updateCycleInformation()
	{
		updateCycleInformation.click();
	}
 
	public void enableDateSelection()
	{
		enableDateSelection.click();
		
	}
	
	public boolean isDateSelected() {
	    return calendarspecificdate
	           .getAttribute("aria-selected")
	           .equals("true");
	}
	
	public boolean isDateHighlightedByColor() {
	    String bgColor = calendarspecificdate.getCssValue("background-color");
	    return bgColor.equals("rgba(0, 123, 255, 1)"); 
	}
	
	/*public boolean isDateHighlighted() {
        String classValue = calendarspecificdate.getAttribute("class");
        return classValue.contains("selected")
                || classValue.contains("active")
                || classValue.contains("highlight");
    }
	
	*/
	
	
	public void previousMonth()
	{
		previousMonth.click();
	}

	public void nextMonth()
	{
		nextMonth.click();
	}
	
	/*	public String movingIcon()
	{
		if (direction.equals("<")) {
	        // click previous month icon
	    } else if (direction.equals(">")) {
	        // click next month icon
	    }
	
	}
	*/

	public void updateCycleLengthDays(String action, int  value)
	{
		
		switch (action.toLowerCase()) {
		
		case "up":
			for(int i=0;i<value; i++)
			{
				updateCycleLengthDays.sendKeys(Keys.ARROW_UP);
			}
			
		case "down":
			for(int i=0;i<value; i++)
			{
				updateCycleLengthDays.sendKeys(Keys.ARROW_DOWN);
			}
			
		case "type":
			for(int i=0;i<value; i++)
			{
				updateCycleLengthDays.clear();

				updateCycleLengthDays.sendKeys(String.valueOf(value));
			}
		}
		
		
	}
	
	public void cancelButton()
	{
		cancelButton.click();
		
	}

	public void clicksaveChanges()
	{
		saveChanges.click();
	}


	public boolean cycleLengthSaveChangepopupmessage()
	{
		 return elementActions.isElemnetDisplayed(cycleLengthSaveChangepopupmessage);
	}



}
