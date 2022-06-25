package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragDropDemo extends BaseTest{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver =  capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@text='Views']")).click();
        driver.findElement(By.xpath("//*[@text='Drag and Drop']")).click();

        TouchAction t = new TouchAction(driver);

        WebElement source = driver.findElement(
                By.id("io.appium.android.apis:id/drag_dot_1"));

        WebElement destination = driver.findElement(
        By.id("io.appium.android.apis:id/drag_dot_2"));

        /*t.longPress(longPressOptions()
                .withElement(element(source)))
                .moveTo(element(destination))
                .release().perform();*/

        t.longPress(element(source))
                .moveTo(element(destination))
                .release().perform();

        if (driver!=null) {
            driver.quit();
        }
    }
}
