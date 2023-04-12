package com.lambdatest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;

public class BrowserUtility {
    public static WebDriver createDriverInstance(String browserType) throws MalformedURLException {

		WebDriver driver = null;

        String username = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
        String authkey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");

        String hub = "@hub.lambdatest.com/wd/hub";

		if(browserType.equals("chrome")) {

    
            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setPlatformName("Windows 10");
            browserOptions.setBrowserVersion("113.0");
            HashMap<String, Object> ltOptions = new HashMap<String, Object>();
            ltOptions.put("visual", true);
            ltOptions.put("video", true);
            ltOptions.put("project", "iSpotTV_Threadlocal");
            ltOptions.put("name", "test_threadlocal");
            // ltOptions.put("tunnel", true);
            ltOptions.put("console", "true");
            ltOptions.put("selenium_version", "4.0.0");
            ltOptions.put("w3c", true);
            browserOptions.setCapability("LT:Options", ltOptions);
    
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), browserOptions);

		}

		return driver;

	}
}
