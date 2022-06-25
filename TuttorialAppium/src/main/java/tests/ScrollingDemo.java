package tests;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ScrollingDemo extends BaseTest{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver =  capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@text='Views']")).click();

        // Scroll Syntax = new UiScrollable(new UiSelector()).scrollIntoView(text("WebView3"));
        System.out.println(driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));")).getText());

        driver.findElement(By.xpath("//*[@text='WebView3']")).click();

        if (driver !=null){
            driver.quit();
        }
    }


}
