package com.easycal_pages;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pnr_status_page {
	
	WebDriver driver;
	public pnr_status_page(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.ID,using="inputPnrNo")
	WebElement pnr1;
	
	@FindBy(how = How.ID, using = "modal1")
	WebElement submit;
	
	
	public void pnrmethod(CharSequence pnr_no) throws InterruptedException, IOException {
		pnr1.sendKeys(pnr_no);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scroll(0,300)");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots1/PNR_status1.png"));
		submit.click();
		
	} 
}

