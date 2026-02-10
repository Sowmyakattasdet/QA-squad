package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkoutPage extends BasePage {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
@FindBy(xpath = "//span[normalize-space()='Workout'] ")
private WebElement workoutBtn;
@FindBy(xpath = "//span[@class='text-sm']")
private WebElement backToDashBrdBtn;
@FindBy(xpath = "//div[contains(text(),'Daily Personalized Workouts')]")
private WebElement WorkoutLabel;
@FindBy(xpath = "//h2[normalize-space()='Daily Workout Plan']")
private WebElement dailyWorkoutPlanSection;
@FindBy(xpath = " //div[h3[contains(text(),'Benefits of Cycle-Synced Workouts')]]")
private WebElement planBenefitSection;
@FindBy(xpath = " //div[contains(text(), '+5 more exercises')]")
private WebElement moreExerciseLink;

@FindBy(xpath = "//button[normalize-space()='View All Exercises']")
private WebElement allExcerciselBtn;


	public WorkoutPage(WebDriver driver) {
		super(driver);

	}
	
	public void clickWorkoutBtn() {
	workoutBtn.click();
}
	public boolean backtoDashBrdBtnDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(backToDashBrdBtn));
		return backToDashBrdBtn.isDisplayed();
	}
	
	public boolean workoutLabelDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(WorkoutLabel));
	return WorkoutLabel.isDisplayed();

	}
	
	public boolean workoutPlanSectionDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(dailyWorkoutPlanSection));
		return dailyWorkoutPlanSection.isDisplayed();

	}
	
	public boolean workoutPlanBenefitSectionDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(planBenefitSection));
		return  planBenefitSection.isDisplayed();
	}
	
	
	public boolean moreExcerciseLinkDisplayed() {
	wait.until(ExpectedConditions.visibilityOf(moreExerciseLink));
	return moreExerciseLink.isDisplayed();

}
	public boolean allExcerciseLinkDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(allExcerciselBtn));
		return allExcerciselBtn.isDisplayed();

	}
}

