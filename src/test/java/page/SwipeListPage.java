package page;

import core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static core.DriverFactory.getDriver;

public class SwipeListPage extends BasePage {


    public void obterOpcaoDir(String opcao) throws MalformedURLException {
        swipeElemento(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")),0.9,0.1);
    }

    public void obterOpcaoEsq(String opcao) throws MalformedURLException {
        swipeElemento(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")),0.1,0.9);
    }

    public void clickMais() throws MalformedURLException {
        MobileElement element = getDriver().findElement(By.xpath("//*[@text='(+)']/.."));
        new TouchAction(getDriver())
                .tap(element,-50,0)
                .perform();
    }
}
