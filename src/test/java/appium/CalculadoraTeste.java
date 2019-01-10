package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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
    public void DeveSomarDoisValoes() throws MalformedURLException{

        DesiredCapabilities desiredCapabilities;

        desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-555");
        //desiredCapabilities.setCapability("automationName", "uiautomator");
        desiredCapabilities.setCapability("appPackage", "com.asus.calculator");
        desiredCapabilities.setCapability("appActivity", "com.asus.calculator.Calculator");

        driver = new AndroidDriver<MobileElement>( new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

         MobileElement mobile = (MobileElement) driver.findElementById("com.asus.calculator:id/digit2");
         mobile.click();
         mobile = (MobileElement) driver.findElementByAccessibilityId("mais");
         mobile.click();
         mobile = (MobileElement) driver.findElementById("com.asus.calculator:id/digit2");
         mobile.click();
         mobile = (MobileElement) driver.findElementByAccessibilityId("igual");
         mobile.click();
         mobile = (MobileElement) driver.findElementByAccessibilityId("4");


        Assert.assertEquals("4",mobile.getText());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
