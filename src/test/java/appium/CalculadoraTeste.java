package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CalculadoraTeste {

    AndroidDriver<MobileElement> driver;


    @Test
    public void DeveInstalarAPK() throws MalformedURLException{

        DesiredCapabilities desiredCapabilities;

        desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-555");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/home/usertqi/Documentos/Appium/src/test/java/resource/CTAppium-1-1.apk");

        driver = new AndroidDriver<MobileElement>( new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
