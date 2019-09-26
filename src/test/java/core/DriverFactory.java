package core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static AndroidDriver<MobileElement> driver;

    private static void createDriver() throws MalformedURLException {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.usingAnyFreePort();
        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder);
        service.start();

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        //Com emulador
        desiredCapabilities.setCapability("deviceName", "4200400800fc957d");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,
                "/Users/patriciamarcolino/workspace/repos/appium-course/src/test/java/resource/CTAppium-1-1.apk");
                // Instalar o app:
                // Liste os devices e adb install -r path


        driver = new AndroidDriver<MobileElement>(service.getUrl(), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // espera implicita: ATÉ 10 segundos.
    }

    public static AndroidDriver<MobileElement> getDriver() throws MalformedURLException {

        if (driver == null) createDriver();
        return driver;
    }

    public static AndroidDriver<MobileElement> getTestObjectDriver() throws MalformedURLException {

        if (driver == null) createTestObjectDriver();
        return driver;
    }

    private static void createTestObjectDriver() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("testobject_api_key","");// inserrir chave
        //desiredCapabilities.setCapability("appiumVersion", "1.13.0");

        driver = new AndroidDriver<MobileElement>(
                new URL("https://us1-manual.app.testobject.com/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // espera implicita: ATÉ 10 segundos.
    }

    public static void killDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
