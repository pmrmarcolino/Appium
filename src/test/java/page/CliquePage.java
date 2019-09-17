package page;

import core.BasePage;
import core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static core.DriverFactory.*;
import static org.openqa.selenium.By.*;


public class CliqueLongo extends BasePage {

    public void cliqueLongo() throws MalformedURLException {
        try {
            TouchActions action = new TouchActions(getDriver());
            MobileElement element = getDriver().findElement(xpath("//*[@text='Clique Longo']"));
            action.longPress(element);
            action.perform();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public String obterTextoCampo() throws MalformedURLException {
        return getDriver().findElement(xpath("(//android.widget.TextView)[3]")).getText();
    }

}
