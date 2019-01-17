package appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static AndroidDriver<MobileElement> driver;

    private static void createDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-555");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,
                "/home/usertqi/Documentos/Appium/src/test/java/resource/CTAppium-1-1.apk");
        driver = new AndroidDriver<MobileElement>( new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static AndroidDriver<MobileElement> getDriver() throws MalformedURLException {
        if (driver == null) createDriver();
        return driver;
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
