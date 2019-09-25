package core;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import javax.xml.datatype.Duration;
import java.net.MalformedURLException;
import java.util.List;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.getTestObjectDriver;

public class BasePage {

     public void escrever(By by, String texto) throws MalformedURLException {
        getDriver().findElement(by).sendKeys(texto);
    }

    public void selecionarComboPorTexto(By classe, String opcao) throws MalformedURLException {
        getDriver().findElement(classe).click();
        getDriver().findElement(By.xpath("//*[@text='"+opcao+"']")).click();
    }

    public void  selecionarCheckSwitch(String opcao) throws MalformedURLException {
        getDriver().findElement(MobileBy.AccessibilityId(opcao)).click();
    }

    public void clickBotaoPorTexto(String botao) throws MalformedURLException {
        getDriver().findElement(By.xpath("//*[@text='"+botao+"']")).click();
    }
    public void selecionaItemLista(String menu) throws MalformedURLException {
        getDriver().findElement(By.xpath("//*[@text='"+menu+"']")).click();
    }
    public String buscaPorAtributo(By by, String atributo) throws MalformedURLException {
        return getDriver().findElement(by).getAttribute(atributo);
    }
    public boolean buscaPorFimString(By by, String string) throws MalformedURLException {
        return getDriver().findElement(by).getText().endsWith(string);
    }

    public MobileElement buscaIndice(String indice) throws MalformedURLException {
        return getDriver().findElement(By.xpath("//*[@index='"+indice+"']"));
    }

    public boolean existeElementoPorTexto(String texto) throws MalformedURLException{
        List<MobileElement> elemento = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
        return elemento.size() > 0;
    }
    public void cliquePorId(String id) throws MalformedURLException{
        getDriver().findElement(By.id("android:id/"+id+"")).click();
    }

    public void cliquePorAccId(String acc) throws MalformedURLException{
        getDriver().findElement(MobileBy.AccessibilityId(acc)).click();
    }


    public void tap(int x, int y) throws MalformedURLException{
        new TouchAction(getDriver()).tap(x,y).perform();
    }

    public String pegaTextoPorText(String texto) throws MalformedURLException {
        return getDriver().findElement(By.xpath("//*[@text='"+texto+"']")).getText();
    }

    public MobileElement obterPorTexto(String texto) throws MalformedURLException {
         return getDriver().findElement(By.xpath("//*[@text='"+texto+"']/"));
    }

    public void scrollAndClick(String visibleText) throws MalformedURLException {
        String uiSelector = "new UiSelector().textMatches(\"" + visibleText + "\")";

        String command =
                "new UiScrollable(new UiSelector()).scrollIntoView(" + uiSelector + ");";

        getDriver().findElementByAndroidUIAutomator(command).click();
    }
    public String obterMensagemAlertaPorId() throws MalformedURLException {
         return getDriver().findElement(By.id("android:id/message")).getText();
    }
    public void swipeAteEncontrarTexto(String visibleText) throws MalformedURLException {
        String uiSelector = "new UiSelector().textMatches(\"" + visibleText + "\")";

        String command =
                "new UiScrollable(new UiSelector()).setAsHorizontalList().scrollIntoView(" + uiSelector + ");";

        getDriver().findElementByAndroidUIAutomator(command);
    }

    public void swipeElemento(MobileElement elemento, double inicio, double fim) throws MalformedURLException {
        int y = elemento.getLocation().y + (elemento.getSize().height/2);

        int start_x = (int) (elemento.getSize().width*inicio);
        int end_x = (int) (elemento.getSize().width*fim);

        new TouchAction(getDriver())
                .press(start_x,y)
                .waitAction(5000)
                .moveTo(end_x,y)
                .release()
                .perform();
    }


    public String obterTextoPorClasse() throws MalformedURLException {
        return getDriver().findElement(By.className("android.widget.TextView")).getText();
    }
}
