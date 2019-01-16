package appium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalculadoraTeste {


    DesiredCapabilities desiredCapabilities;
    AndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-555");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/home/usertqi/Documentos/Appium/src/test/java/resource/CTAppium-1-1.apk");
        driver = new AndroidDriver<MobileElement>( new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void preencherFormulario() throws MalformedURLException{

        driver.findElements(By.className("android.widget.TextView")).get(1).click(); // seleciona um item da lista

        driver.findElement(MobileBy.AccessibilityId("nome")).sendKeys("Wagner");

        driver.findElement(MobileBy.AccessibilityId("console")).click();

        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='XBox One']")).click();

        MobileElement check = driver.findElement(MobileBy.AccessibilityId("check"));
        check.click();

        Assert.assertTrue(check.getAttribute("checked").equals("true"));

        MobileElement switc = driver.findElement(MobileBy.AccessibilityId("switch"));
        switc.click();

        Assert.assertTrue(switc.getAttribute("checked").equals("false"));

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}

