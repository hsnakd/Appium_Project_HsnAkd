package com.cydeo.tests;

import com.cydeo.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;

public class SwagLabRemoteTest {

    @Test
    public void Test(){
        AppiumDriver<MobileElement> driver = Driver.getDriver();

        System.out.println(driver.getDeviceTime());
        System.out.println(driver.getPlatformName());

     //   Assertions.assertEquals("Android",driver.getPlatformName());
        driver.findElement(MobileBy.AccessibilityId("test-Username")).sendKeys("standard_user");
        driver.findElement(MobileBy.AccessibilityId("test-Password")).sendKeys("secret_sauce");
        driver.findElement(MobileBy.AccessibilityId("test-LOGIN")).click();

        // to scroll down we are using a method like in Selenium we had JSE
       // ((AndroidDriver)driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Policy\"));");

        driver.closeApp();
    }
}
