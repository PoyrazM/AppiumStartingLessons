package tests;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;

public class Base2 extends BaseTest {


    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver =  capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Xpath for click Preference
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
        //Xpath for click Preference Dependencies
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();

        //id for Wifi checkBox
        driver.findElement(By.id("android:id/checkbox")).click();
        //class for Wifi Settings
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        //Class Name for textbox
        driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello Appium","");
        //Id for OK Button
        driver.findElement(By.id("android:id/button1")).click();

        if(driver !=null){
        driver.quit();
        }
    }
}


