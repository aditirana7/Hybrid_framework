package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

	WebDriver driver;

	@Test
	public static WebDriver BrowserOptions(WebDriver driver, String browserName, String AppUrl) throws Exception{
		
		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\Aditi Rana\\HYbrid_framework\\HF\\Browsers.geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Administrator\\Documents\\Aditi Rana\\HYbrid_framework\\HF\\Browsers\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else {
			System.out.println("Browser Does Not Support...");
		}

		driver.manage().window().maximize();		
		driver.get(AppUrl);
		Thread.sleep(5000);
		
		return driver;
	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}


