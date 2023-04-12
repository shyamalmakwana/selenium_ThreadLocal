package com.lambdatest;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Threadlocal {
    protected static ThreadLocal<WebDriver> threadLocalDriver =  new ThreadLocal<WebDriver>();
    // private String Status = "failed";
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setDriver(String browserType) throws MalformedURLException {
		WebDriver driver = BrowserUtility.createDriverInstance(browserType);
		threadLocalDriver.set(driver);
	}
	
	public static WebDriver getDriver() {
		return threadLocalDriver.get();
	}	
	
	@AfterMethod
    public void tearDown() {
        // driver.executeScript("lambda-status=" + Status);
        getDriver().quit();
    }

    // @AfterMethod
	// public void removeDriver() {
	// 	getDriver().quit();
	// 	threadLocalDriver.remove();
	// }

}
