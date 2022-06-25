package tests;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.net.MalformedURLException;
import java.time.Duration;


public class Gestures extends BaseTest{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver =  capabilities();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();

        TouchAction t = new TouchAction(driver);
        WebElement expandList = driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
        t.tap(tapOptions()
                .withElement(element(expandList)))
                .perform();

        WebElement customerAdapter = driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']"));
        t.tap(tapOptions()
                .withElement(element(customerAdapter)))
                .perform();



        WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        t.longPress(longPressOptions()
                .withElement(element(peopleNames))
                .withDuration(Duration.ofSeconds(2)))
                .release().perform();

        WebElement sampleMenu = driver.findElement(By.id("android:id/title"));
        System.out.println("Sample Menu is Displayed : "+sampleMenu.isDisplayed());

        WebElement sampleNameTxt = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample action']"));
        System.out.println("Sample Menu Text is : "+sampleNameTxt.getText());

        if (driver !=null){
        driver.quit();
        }
    }

}
