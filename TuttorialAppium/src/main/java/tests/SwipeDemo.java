package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class SwipeDemo extends BaseTest{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver =  capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();

        //driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();

        driver.findElement(MobileBy.AndroidUIAutomator("text(\"2. Inline\")")).click();

        //driver.findElement(By.xpath("//*[@attribute='value']")).click();
        driver.findElement(By.xpath("//*[@content-desc='9']")).click();

        TouchAction t = new TouchAction(driver);
        WebElement swipeMinute15 = driver.findElement(By.xpath("//*[@content-desc='15']"));
        WebElement swipeMinute45 = driver.findElement(By.xpath("//*[@content-desc='45']"));

        t.longPress(longPressOptions()
                .withElement(element(swipeMinute15))
                .withDuration(Duration.ofSeconds(2)))
                .moveTo(element(swipeMinute45))
                .release().perform();

        if (driver !=null){
            driver.quit();
        }


    }

}
