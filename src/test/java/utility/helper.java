package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class helper {

	public static void capturedScreenShot(WebDriver driver) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ScreenShots/EasyCalcul_" + getCurrentDateTime() + ".png"));
			System.out.println("Captured ScreenShot - On Failure");
		} catch (Exception e) {
			System.out.println("Exception While Taking ScreenShot" + e.getMessage());
		}
	}

	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customFormat.format(currentdate);
	}
}

