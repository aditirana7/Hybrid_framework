package com.easycal_pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import uti.Config_reader;
import uti.excel2;
import uti.browser_f;



public class Base_class_pnr  {
	public WebDriver driver;
	public excel2 excel;
	public Config_reader config;

	@BeforeSuite
	public void SetUp() throws IOException {
		excel = new excel2();
		config = new Config_reader();
	}

	@BeforeClass
	public void BrowserTest() throws Exception {
		driver = browser_f.BrowserOptions(driver, config.getBrowser(), config.getAppURL());
	}

	@AfterClass
	public void tearDown() {
		browser_f.quitBrowser(driver);
	}

	}

