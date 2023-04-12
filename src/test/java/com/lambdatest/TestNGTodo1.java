package com.lambdatest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTodo1 extends Threadlocal {

    private String Status = "failed";

    // @BeforeMethod
    // public void setup(Method m, ITestContext ctx) throws MalformedURLException {
    //     String username = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
    //     String authkey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");
    //     ;
    //     String hub = "@hub.lambdatest.com/wd/hub";

    //     ChromeOptions browserOptions = new ChromeOptions();
    //     browserOptions.setPlatformName("Windows 10");
    //     browserOptions.setBrowserVersion("113.0");
    //     HashMap<String, Object> ltOptions = new HashMap<String, Object>();
    //     ltOptions.put("visual", true);
    //     ltOptions.put("video", true);
    //     ltOptions.put("seCdp", true);
    //     ltOptions.put("project", "Untitled");
    //     ltOptions.put("name", "test");
    //     ltOptions.put("tunnel", true);
    //     ltOptions.put("console", "true");
    //     ltOptions.put("selenium_version", "4.0.0");
    //     ltOptions.put("getdriver()_version", "113.0");
    //     ltOptions.put("w3c", true);
    //     browserOptions.setCapability("LT:Options", ltOptions);

    //     getdriver() = new RemoteWebGetDriver()(new URL("https://" + username + ":" + authkey + hub), browserOptions);

    // }

    @Test
    public void basicTest1() throws InterruptedException {
        String spanText;
        System.out.println("Loading Url");

        getDriver().get("https://lambdatest.github.io/sample-todo-app/");

        System.out.println("Checking Box");
        getDriver().findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li2")).click();

        System.out.println("Checking Box");
        getDriver().findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li4")).click();

        getDriver().findElement(By.id("sampletodotext")).sendKeys(" List Item 6");
        getDriver().findElement(By.id("addbutton")).click();

        getDriver().findElement(By.id("sampletodotext")).sendKeys(" List Item 7");
        getDriver().findElement(By.id("addbutton")).click();

        getDriver().findElement(By.id("sampletodotext")).sendKeys(" List Item 8");
        getDriver().findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li7")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li8")).click();
        Thread.sleep(300);

        System.out.println("Entering Text");
        getDriver().findElement(By.id("sampletodotext")).sendKeys("Get Taste of Lambda and Stick to It");

        getDriver().findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li9")).click();

        // Let's also assert that the todo we added is present in the list.

        // spanText = getdriver().findElementByXPath("/html/body/div/div/div/ul/li[9]/span").getText();
        // Assert.assertEquals("Get Taste of Lambda and Stick to It", spanText);
        Status = "passed";
        Thread.sleep(150);

        System.out.println("TestFinished");

    }

    @Test
    public void basicTest2() throws InterruptedException {
        String spanText;
        System.out.println("Loading Url");

        getDriver().get("https://lambdatest.github.io/sample-todo-app/");

        System.out.println("Checking Box");
        getDriver().findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li2")).click();

        System.out.println("Checking Box");
        getDriver().findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li4")).click();

        getDriver().findElement(By.id("sampletodotext")).sendKeys(" List Item 6");
        getDriver().findElement(By.id("addbutton")).click();

        getDriver().findElement(By.id("sampletodotext")).sendKeys(" List Item 7");
        getDriver().findElement(By.id("addbutton")).click();

        getDriver().findElement(By.id("sampletodotext")).sendKeys(" List Item 8");
        getDriver().findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li7")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li8")).click();
        Thread.sleep(300);

        System.out.println("Entering Text");
        getDriver().findElement(By.id("sampletodotext")).sendKeys("Get Taste of Lambda and Stick to It");

        getDriver().findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        getDriver().findElement(By.name("li9")).click();

        // Let's also assert that the todo we added is present in the list.

        // spanText = getdriver().findElementByXPath("/html/body/div/div/div/ul/li[9]/span").getText();
        // Assert.assertEquals("Get Taste of Lambda and Stick to It", spanText);
        // Status = "passed";
        Thread.sleep(150);

        System.out.println("TestFinished");

    }    

    // // @AfterMethod
    // public void tearDown() {
    //     getDriver().executeScript("lambda-status=" + Status);
    //     getDriver().quit();
    // }

}