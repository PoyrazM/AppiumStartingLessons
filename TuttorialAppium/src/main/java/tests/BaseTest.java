package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
    public static AndroidDriver capabilities() throws MalformedURLException {

        File appDir = new File("src/main/java");

        File app = new File(appDir,"ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 31");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        //UIAutomator

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        return driver;
    }

}
