package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ConfigReader;
import utils.LoggerFactory;

public class DriverManager {
	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static final ThreadLocal<String> driverbrowser = new ThreadLocal<>();

	public static void initBrowser() {

		String browserType = null;
		BrowserOptions browserOptions = new BrowserOptions();
		browserType = ConfigReader.getProperty("browser");

		// browserType = driverbrowser.get();
		//
		// if (browserType == null) {
		//
		// browserType = ConfigReader.getProperty("browser");
		// }

		switch (browserType) {
			case "chrome" :
				driver.set(new ChromeDriver(browserOptions.chromeOption()));
				break;
			case "edge" :
				driver.set(new EdgeDriver(browserOptions.edgeOption()));
				break;
			case "firefox" :
				driver.set(new FirefoxDriver(browserOptions.firefoxOption()));
				break;
			default :
				LoggerFactory.getLogger()
						.error("Unexpected value for browser: {}", browserType);
				throw new IllegalStateException(
						"Unexpected value for browserType: " + browserType);
		}

	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setBrowser(String browser) {
		driverbrowser.set(browser);
	}

}
