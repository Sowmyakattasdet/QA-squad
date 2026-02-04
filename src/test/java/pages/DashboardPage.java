package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	@FindBy(xpath="//*[@name='username']")
	private WebElement userName;

	@FindBy(xpath="//*[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[text()='Free Plan Dashboard']")
	WebElement title_freeplan;
	
	@FindBy(xpath = "//*[@stroke-linecap=\"round\"]")
	WebElement profileicon;
	
	@FindBy(xpath = "//*[text()='qa squad']")
	WebElement profilename;

	@FindBy(xpath = "//*[@class='lucide lucide-bell h-5 w-5 text-[#6A5ACD]']")
	WebElement bellicon;

	@FindBy(xpath ="//*[@placeholder='Search...']")
	WebElement searchbar;
	
	@FindBy(xpath ="//*[text()='Activity Insights']")
	WebElement activityinsight;
	
	@FindBy(xpath ="//*[text()='Diet Plan']")
	WebElement dietplan;
	
	@FindBy(xpath ="//*[text()='Workout']")
	WebElement workout;
	
	@FindBy(xpath ="//*[text()='Water Tracker']")
	WebElement watertracker;
	
	@FindBy(xpath ="//*[text()='View Full Cycle Details']")
	WebElement fullcycle;
	
	@FindBy(xpath ="//*[text()='Upload Blood Report']")
	WebElement uploadreport;
	
	@FindBy(xpath ="//*[text()='Upgrade to Premium']")
	WebElement upgradepremium;
	
	@FindBy(xpath ="//*[text()='Generate 7-Day Plan']")
	WebElement sevendayplan;
	
	@FindBy(xpath ="//*[text()='See Premium Plans']")
	WebElement premiumplan;
	
	@FindBy(xpath ="//*[text()='Free Plan • Access to Basic Features']")
	WebElement freeplanaccess;
	
	@FindBy(xpath ="//p[contains(text(),'Enjoy')]")
	WebElement enjoyfree;
	
	@FindBy(xpath ="//p[contains(text(),'Upload')]")
	WebElement subtext;
	
	@FindBy(xpath ="//*[text()='Weight & Body Metrics']")
	WebElement weightheading;
	
	@FindBy(xpath ="//*[text()='Health Conditions']")
	WebElement healthsection;
	
	@FindBy(xpath ="//*[text()='Blood Report Insights']")
	WebElement bloodrepsection;
	
	@FindBy(xpath ="//*[text()='Menstrual Cycle Insights']")
	WebElement menstrualsection;
	
	@FindBy(xpath ="//*[text()='Subscription Information']")
	WebElement subscriptionsection;
	
	@FindBy(xpath ="//*[text()='Current']")
	WebElement weight;
	
	@FindBy(xpath ="//*[text()='Height']")
	WebElement height;
	
	@FindBy(xpath ="//*[text()='BMI']")
	WebElement bmi;
	
	@FindBy(xpath ="//*[text()='Monthly Goal:']")
	WebElement sevendayg;

	@FindBy(xpath ="//*[text()='Starting']")
	WebElement starting;
	
	@FindBy(xpath ="//*[text()='Goal: ']")
	WebElement goal;
	
	@FindBy(xpath ="//*[text()='BMI Reference Guide']")
	WebElement bmireff;
	
	@FindBy(xpath ="//*[text()='Monthly Goal:']")
	WebElement weeklygoal;
	
	@FindBy(xpath ="//*[text()='Daily Weigh-in:']")
	WebElement dailyweight;
	
	@FindBy(xpath ="//*[@class='text-lg font-semibold text-green-600']")
	WebElement weightval;
	
	@FindBy(xpath ="//span[text()='Starting']//parent::div/parent::div//p[contains(@class,'font-semibold')]")
	WebElement onbweight;
	
	@FindBy(xpath ="//*[@class=\"text-[#6A5ACD] group-hover:text-[#9370DB] font-medium\"]")
	WebElement userhover;
	
	@FindBy(xpath ="//*[text()='Body Metrics']")
	WebElement bodymetrics;
	
	
	@FindBy(xpath ="//*[text()='Edit Profile']")
	WebElement editprofile;
	//*[text()='Edit Profile']
	
	@FindBy(xpath ="//*[text()='cm']/..")
	WebElement heightval;
	
	@FindBy(xpath ="//*[text()='BMI']/../..//p[1]")
	WebElement BMIval;
	
	@FindBy(xpath ="//*[@name='weight']")
	WebElement wtfromedit;
	
	@FindBy(xpath ="//*[@name=\"height\"]")
	WebElement htfromedit;
	
	
	@FindBy(xpath ="//button")
	List<WebElement> menus;
	
	@FindBy(xpath ="//h3/div/span")
	List<WebElement> section;
	
	@FindBy(xpath ="//*[text()='Monthly Weight Goal (4% of body weight)']")
	WebElement weeklygoalt;
	
	@FindBy(xpath ="//*[text()='Morning, before food']")
	WebElement dailyweigh;
	

	@FindBy(xpath ="//*[contains(text(),'personalized re')]")
	WebElement freep;
	
	@FindBy(xpath ="//*[@class='relative h-8 rounded-md mb-2']")
	WebElement bmisl;
	
	@FindBy(xpath ="//*[@class='w-3 h-3 bg-black rounded-full']")
	WebElement gradiant;
	
	@FindBy(xpath ="//*[text()='Info']")
	WebElement info;
	
	@FindBy(xpath ="//*[text()='Free plan includes 7 days of limited tracking']")
	WebElement fp;
	//*[text()='Free plan includes 7 days of limited tracking']
	
	public DashboardPage(WebDriver driver) {
		super(driver);

	}

	public void Login()  {

		userName.sendKeys("qasquad@gmail.com");
		password.sendKeys("HerBalance123");
		loginButton.click();
	}
		
	
		
	public String Dashboardtitletext(){
			//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(title_freeplan));
				return title_freeplan.getText();
				}
		
	public boolean profile_name(){
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(profilename)).isDisplayed();
		}

	public boolean profileicondisplay(){
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(profileicon)).isDisplayed();
		}
	
	public boolean bellicondisplay(){
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(bellicon)).isDisplayed();
		}
	public boolean searchbardisplay(){
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(searchbar)).isDisplayed();
		}
	public int countmenus(){
		wait.until(ExpectedConditions.visibilityOfAllElements(menus));
		return menus.size();
		}
	
	public String activityinsighttxt(){
		//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(activityinsight));
			return activityinsight.getText();
			}
	public String dietplantxt(){
		//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(dietplan));
			return dietplan.getText();
			}
	public String workouttxt(){
		//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(workout));
			return workout.getText();
			}
	public String watertrackertxt(){
		//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(watertracker));
			return watertracker.getText();
			}
	public String fullcycletxt(){
		wait.until(ExpectedConditions.visibilityOf(fullcycle));
			return fullcycle.getText();
			}
	public String uploadreporttxt(){
		wait.until(ExpectedConditions.visibilityOf(uploadreport));
			return uploadreport.getText();
			}
	public String upgradepremiumxt(){
		wait.until(ExpectedConditions.visibilityOf(upgradepremium));
			return upgradepremium.getText();
			}
	public String generatesevendayp(){
		wait.until(ExpectedConditions.visibilityOf(sevendayplan));
			return sevendayplan.getText();
			}
	public String premiumplantxt(){
		wait.until(ExpectedConditions.visibilityOf(premiumplan));
			return premiumplan.getText();
			}
	public String freeplanacctxt(){
		wait.until(ExpectedConditions.visibilityOf(freeplanaccess));
			return freeplanaccess.getText();
			}
	public String enjoyfreetxt(){
		wait.until(ExpectedConditions.visibilityOf(enjoyfree));
			return enjoyfree.getText();
			}
	public boolean subtextdisplay(){
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(subtext)).isDisplayed();
		}
	public int countsection(){
		wait.until(ExpectedConditions.visibilityOfAllElements(section));
		return section.size();
		}
	public String weightheading(){
		wait.until(ExpectedConditions.visibilityOf(weightheading));
			return weightheading.getText();
			}
	public String healthsectionhead(){
		wait.until(ExpectedConditions.visibilityOf(healthsection));
			return healthsection.getText();
			}
	public String bloodrepheadsec(){
		wait.until(ExpectedConditions.visibilityOf(bloodrepsection));
			return bloodrepsection.getText();
			}
	public String menstrualsechead(){
		wait.until(ExpectedConditions.visibilityOf(menstrualsection));
			return menstrualsection.getText();
			}
	public String subscriptionsecitonhead(){
		wait.until(ExpectedConditions.visibilityOf(subscriptionsection));
			return subscriptionsection.getText();
			}
	public String currentweight(){
		wait.until(ExpectedConditions.visibilityOf(weight));
			return weight.getText();
			}
	public String heighttxt(){
		wait.until(ExpectedConditions.visibilityOf(height));
			return height.getText();
			}
	public String bmitxt(){
		wait.until(ExpectedConditions.visibilityOf(bmi));
			return bmi.getText();
			}
	public String sevendaygoalxt(){
		wait.until(ExpectedConditions.visibilityOf(sevendayg));
			return sevendayg.getText();
			}
	public String bmireftxt(){
		wait.until(ExpectedConditions.visibilityOf(bmireff));
			return bmireff.getText();
			}
	public String startingwt(){
		wait.until(ExpectedConditions.visibilityOf(starting));
			return starting.getText();
			}
	public String goaltxt(){
		wait.until(ExpectedConditions.visibilityOf(goal));
			return goal.getText();
			}
	public String weeklygoaltx(){
		wait.until(ExpectedConditions.visibilityOf(weeklygoal));
			return weeklygoal.getText();
			}
	public String dailyweightx(){
		wait.until(ExpectedConditions.visibilityOf(dailyweight));
			return dailyweight.getText();
			}
	public Double weightvaltxt(){
		wait.until(ExpectedConditions.visibilityOf(weightval));
			 String wt= weightval.getText().replaceAll("[^0-9]", "");
			return Double.parseDouble(wt);
			
			}
	public Double heightvaltxt(){
		wait.until(ExpectedConditions.visibilityOf(heightval));
		String	ht= heightval.getText().replaceAll("[^0-9]", "");
		return Double.parseDouble(ht);
			}
	public Double bmivaltxt(){
		wait.until(ExpectedConditions.visibilityOf(BMIval));
		 String bm=BMIval.getText();
		 return Double.parseDouble(bm);
			}
	public String onbweighttxt(){
		wait.until(ExpectedConditions.visibilityOf(onbweight));
			return onbweight.getText().replaceAll("[^0-9]", "");
			}
	public Double getweightfromedit() {
		userhover.click();
		editprofile.click();
		bodymetrics.click();
		 String value= wtfromedit.getAttribute("value");
		 return Double.parseDouble(value);
		
		
	}
	public Double getheightfromedit() {
		userhover.click();
		editprofile.click();
		bodymetrics.click();
		 String value= htfromedit.getAttribute("value");
		 return Double.parseDouble(value);		
		
	}
	public String weeklytargwt() {
		wait.until(ExpectedConditions.visibilityOf(weeklygoalt));
		return weeklygoalt.getText().replaceAll("\\D+", "");
			
		 }
	public String dailyweightxt(){
		wait.until(ExpectedConditions.visibilityOf(dailyweigh));
			return dailyweigh.getText();
			}
	public boolean freeplandetails(){
		return wait.until(ExpectedConditions.visibilityOf(freep)).isDisplayed();
		}
	public boolean bmislider(){
		return wait.until(ExpectedConditions.visibilityOf(bmisl)).isDisplayed();
		}
	public boolean gradiantslider(){
		return wait.until(ExpectedConditions.visibilityOf(gradiant)).isDisplayed();
		}
	public String infolabel(){
		wait.until(ExpectedConditions.visibilityOf(info));
			return info.getText();
			}
	public String fptext(){
		wait.until(ExpectedConditions.visibilityOf(fp));
			return fp.getText();
			}
	public String fpt(){
		String v="Free plan includes 7 days of limited tracking";
			return v;
			}
	
	
	
	
	
		}
	


