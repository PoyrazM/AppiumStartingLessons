package tests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class UIAutomator extends BaseTest {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver =  capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.findElement(MobileBy.AndroidUIAutomator("attribute("\value\")"));

        driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
        //driver.findElement(MobileBy.AndroidUIAutomator("text(\"Animation\")")).click();

        // Validate clickable feature for all options
        // Syntax = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().property(value)"));

        System.out.println(driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)"))
                .getSize());

        if (driver !=null){
            driver.quit();
        }

    }



}


