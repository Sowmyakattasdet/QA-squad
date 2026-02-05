package pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;

public class DashboardPage extends BasePage {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	@FindBy(xpath="//*[@name='username']")
	private WebElement userName;

	@FindBy(xpath="//*[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[text()='Free Plan Dashboard']")
	private WebElement title_freeplan;
	
	@FindBy(xpath = "//*[@stroke-linecap=\"round\"]")
	private	WebElement profileicon;
	
	@FindBy(xpath = "//*[text()='qa squad']")
	private	WebElement profilename;

	@FindBy(xpath = "//*[@class='lucide lucide-bell h-5 w-5 text-[#6A5ACD]']")
	private	WebElement bellicon;

	@FindBy(xpath ="//*[@placeholder='Search...']")
	private	WebElement searchbar;
	
	@FindBy(xpath ="//*[text()='Activity Insights']")
	private	WebElement activityinsight;
	
	@FindBy(xpath ="//*[text()='Diet Plan']")
	private	WebElement dietplan;
	
	@FindBy(xpath ="//*[text()='Workout']")
	private	WebElement workout;
	
	@FindBy(xpath ="//*[text()='Water Tracker']")
	private	WebElement watertracker;
	
	@FindBy(xpath ="//*[text()='View Full Cycle Details']")
	private	WebElement fullcycle;
	
	@FindBy(xpath ="//*[text()='Upload Blood Report']")
	private	WebElement uploadreport;
	
	@FindBy(xpath ="//*[text()='Upgrade to Premium']")
	private	WebElement upgradepremium;
	
	@FindBy(xpath ="//*[text()='Generate 7-Day Plan']")
	private	WebElement sevendayplan;
	
	@FindBy(xpath ="//*[text()='See Premium Plans']")
	private	WebElement premiumplan;
	
	@FindBy(xpath ="//*[text()='Free Plan • Access to Basic Features']")
	private	WebElement freeplanaccess;
	
	@FindBy(xpath ="//p[contains(text(),'Enjoy')]")
	private	WebElement enjoyfree;
	
	@FindBy(xpath ="//p[contains(text(),'Upload')]")
	private	WebElement subtext;
	
	@FindBy(xpath ="//*[text()='Weight & Body Metrics']")
	private	WebElement weightheading;
	
	@FindBy(xpath ="//*[text()='Health Conditions']")
	private	WebElement healthsection;
	
	@FindBy(xpath ="//*[text()='Blood Report Insights']")
	private	WebElement bloodrepsection;
	
	@FindBy(xpath ="//*[text()='Menstrual Cycle Insights']")
	private	WebElement menstrualsection;
	
	@FindBy(xpath ="//*[text()='Subscription Information']")
	private	WebElement subscriptionsection;
	
	@FindBy(xpath ="//*[text()='Current']")
	private	WebElement weight;
	
	@FindBy(xpath ="//*[text()='Height']")
	private	WebElement height;
	
	@FindBy(xpath ="//*[text()='BMI']")
	private	WebElement bmi;
	
	@FindBy(xpath ="//*[text()='Monthly Goal:']")
	private	WebElement sevendayg;

	@FindBy(xpath ="//*[text()='Starting']")
	private	WebElement starting;
	
	@FindBy(xpath ="//*[text()='Goal: ']")
	private	WebElement goal;
	
	@FindBy(xpath ="//*[text()='BMI Reference Guide']")
	private	WebElement bmireff;
	
	@FindBy(xpath ="//*[text()='Monthly Goal:']")
	private	WebElement weeklygoal;
	
	@FindBy(xpath ="//*[text()='Daily Weigh-in:']")
	private	WebElement dailyweight;
	
	@FindBy(xpath ="//*[@class='text-lg font-semibold text-green-600']")
	private	WebElement weightval;
	
	@FindBy(xpath ="//span[text()='Starting']//parent::div/parent::div//p[contains(@class,'font-semibold')]")
	private	WebElement onbweight;
	
	@FindBy(xpath ="//*[@class=\"text-[#6A5ACD] group-hover:text-[#9370DB] font-medium\"]")
	private	WebElement userhover;
	
	@FindBy(xpath ="//*[text()='Body Metrics']")
	private	WebElement bodymetrics;
	
	
	@FindBy(xpath ="//*[text()='Edit Profile']")
	private	WebElement editprofile;
	//*[text()='Edit Profile']
	
	@FindBy(xpath ="//*[text()='cm']/..")
	private	WebElement heightval;
	
	@FindBy(xpath ="//*[text()='BMI']/../..//p[1]")
	private	WebElement BMIval;
	
	@FindBy(xpath ="//*[@name='weight']")
	private	WebElement wtfromedit;
	
	@FindBy(xpath ="//*[@name=\"height\"]")
	private	WebElement htfromedit;
	
	
	@FindBy(xpath ="//button")
	private	List<WebElement> menus;
	
	@FindBy(xpath ="//h3/div/span")
	private	List<WebElement> section;
	
	@FindBy(xpath ="//*[text()='Monthly Weight Goal (4% of body weight)']")
	private	WebElement weeklygoalt;
	
	@FindBy(xpath ="//*[text()='Morning, before food']")
	private	WebElement dailyweigh;
	

	@FindBy(xpath ="//*[contains(text(),'personalized re')]")
	private	WebElement freep;
	
	@FindBy(xpath ="//*[@class='relative h-8 rounded-md mb-2']")
	private	WebElement bmisl;
	
	@FindBy(xpath ="//*[@class='w-3 h-3 bg-black rounded-full']")
	private	WebElement gradiant;
	
	@FindBy(xpath ="//*[text()='Info']")
	private	WebElement info;
	
	@FindBy(xpath ="//*[text()='Free plan includes 7 days of limited tracking']")
	private	WebElement fp;
	
	@FindBy(xpath ="//*[text()='Digestive Issues (IBS, Leaky Gut, etc.)']")
	private	WebElement healthissue;   
	
	@FindBy(xpath ="//*[@data-testid='button-edit-health-conditions']")
	private	WebElement edithealth;
	
	@FindBy(xpath ="//*[@data-testid='button-upload-blood-report']")
	private	WebElement bloodrpbtn;
	

	@FindBy(xpath ="//*[contains(text(),'Your plan')]")
	private	WebElement healthplan;
	
	@FindBy(xpath ="//*[contains(text(),'Sleep Apnea')]")
	private	WebElement sleepapna;
	
	@FindBy(xpath ="//*[@class='lucide lucide-heart h-4 w-4']")
	private	WebElement heart;
	
	@FindBy(xpath ="//*[text()='Health Conditions']")
	private	WebElement heartcond;
	
	@FindBy(xpath ="//*[text()='No Health Issues']")
	private	WebElement noissue;
	
	
	@FindBy(xpath ="//*[@class=\"lucide lucide-circle-alert h-4 w-4 text-[#6A5ACD] flex-shrink-0 mt-0.5\"]")
	private	WebElement healthed;
	
	@FindBy(xpath ="//*[@id='condition-sleep_apnea']")
	private	WebElement selectsleep;
	
	@FindBy(xpath ="//*[@data-testid='checkbox-condition-digestive_issues']")
	private	WebElement selectdigist;
	
	@FindBy(xpath ="//*[@data-testid='button-save-health-conditions']")
	private	WebElement selectsavehealth;
	
	@FindBy(xpath ="//*[contains(@class,\"text-base font-medium text-g\")]")
	private	WebElement uploaddynamic;
	
	@FindBy(xpath ="//*[@data-testid='button-upload-blood-report']")
	private	WebElement uploadbn;
	
	@FindBy(xpath ="//*[@class=\"text-sm text-gray-500 mb-6 max-w-sm\"]")
	private	WebElement reporttxt;
	
	@FindBy(xpath ="//*[text()='Joined Date']")
	private	WebElement joind;
	
	@FindBy(xpath ="//*[text()=\"Today's Date\"]")
	private	WebElement todatd;
	
	@FindBy(xpath ="//*[@class=\"font-medium text-sm\"]")
	private	WebElement subplan;
	
	@FindBy(xpath ="//*[contains(@class,\"text-xs text-w\")]")
	private	WebElement rmd;
	
	@FindBy(xpath ="//*[text()='Upgrade to Premium']")
	private	WebElement upgradebtn;
	
	@FindBy(xpath ="//*[@class='text-sm']")
	private	WebElement stwt;
	
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		
		
	}

	public void Login()  {

		userName.sendKeys("qasquad@gmail.com");
		password.sendKeys("HerBalance123");
		loginButton.click();
	}
		
	public void launchApplication() {

		driver.get(ConfigReader.getProperty("appURL"));

	}
	
		
	public String Dashboardtitletext(){
				wait.until(ExpectedConditions.visibilityOf(title_freeplan));
				return title_freeplan.getText();
				}
		
	public boolean profile_name(){
		return wait.until(ExpectedConditions.visibilityOf(profilename)).isDisplayed();
		}

	public boolean profileicondisplay(){
		return wait.until(ExpectedConditions.visibilityOf(profileicon)).isDisplayed();
		}
	
	public boolean bellicondisplay(){
		return wait.until(ExpectedConditions.visibilityOf(bellicon)).isDisplayed();
		}
	public boolean searchbardisplay(){
		return wait.until(ExpectedConditions.visibilityOf(searchbar)).isDisplayed();
		}
	public int countmenus(){
		wait.until(ExpectedConditions.visibilityOfAllElements(menus));
		return menus.size();
		}
	
	public String activityinsighttxt(){
			wait.until(ExpectedConditions.visibilityOf(activityinsight));
			return activityinsight.getText();
			}
	public String dietplantxt(){
			wait.until(ExpectedConditions.visibilityOf(dietplan));
			return dietplan.getText();
			}
	public String workouttxt(){
			wait.until(ExpectedConditions.visibilityOf(workout));
			return workout.getText();
			}
	public String watertrackertxt(){
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
	public String startwt(){
		wait.until(ExpectedConditions.visibilityOf(stwt));
			return stwt.getText().replaceAll("[^0-9]", "");
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
	public String healthissuetext(){
		wait.until(ExpectedConditions.visibilityOf(healthissue));
			return healthissue.getText();
			}
	
	public String healthiss(){
		String v="Digestive Issues (IBS, Leaky Gut, etc.)";
			return v;
			}
	public boolean healthplantxt(){
		return wait.until(ExpectedConditions.visibilityOf(healthplan)).isDisplayed();
		}
	public String sleepapneatext(){
		wait.until(ExpectedConditions.visibilityOf(sleepapna));
			return sleepapna.getText();
			}
	public boolean heartsym(){
		return wait.until(ExpectedConditions.visibilityOf(heart)).isDisplayed();
		}
	public boolean heartcondisplayl(){
		return wait.until(ExpectedConditions.visibilityOf(heartcond)).isDisplayed();
		}
	public boolean healthedit(){
		return wait.until(ExpectedConditions.visibilityOf(healthed)).isDisplayed();
		}
	public boolean nohealthissue(){
		wait.until(ExpectedConditions.visibilityOf(edithealth)).click();
		selectsleep.click();
		selectdigist.click();
		selectsavehealth.click();
		return wait.until(ExpectedConditions.visibilityOf(noissue)).isDisplayed();
		}
	public boolean uploadfiledyanamic(){
		return wait.until(ExpectedConditions.visibilityOf(uploaddynamic)).isDisplayed();
		}
	public String uploadbutton(){
		String text= wait.until(ExpectedConditions.visibilityOf(uploadbn)).getText();
				return text ;
		}
	public boolean reporttex(){
		return wait.until(ExpectedConditions.visibilityOf(reporttxt)).isDisplayed();
				
		}
	public boolean btnenable(){
		return wait.until(ExpectedConditions.visibilityOf(uploadbn)).isEnabled();
				
		}
	public boolean joineddate(){
		return wait.until(ExpectedConditions.visibilityOf(joind)).isDisplayed();
				
		}
	public boolean todaydate(){
		return wait.until(ExpectedConditions.visibilityOf(todatd)).isDisplayed();
				
		}
	public boolean subscriptionplan(){
		return wait.until(ExpectedConditions.visibilityOf(subplan)).isDisplayed();
				
		}
	public boolean subsplanrem(){
		return wait.until(ExpectedConditions.visibilityOf(rmd)).isDisplayed();
				
		}
	public boolean premiumbtn(){
		return wait.until(ExpectedConditions.visibilityOf(upgradebtn)).isDisplayed();
				
		}
	
		}
	


