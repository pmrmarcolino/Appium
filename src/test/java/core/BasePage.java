package core;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static core.DriverFactory.getDriver;

public class BasePage {

    public void escrever(By by, String texto) throws MalformedURLException {
        getDriver().findElement(by).sendKeys(texto);
    }

    public void selecionarCombo(By classe, String opcao) throws MalformedURLException {
        getDriver().findElement(classe).click();
        getDriver().findElement(By.xpath("//*[@text='"+opcao+"']")).click();
    }

    public void  selecionarCheckSwitch(String opcao) throws MalformedURLException {
        getDriver().findElement(MobileBy.AccessibilityId(opcao)).click();
    }

    public void clickBotao(By by) throws MalformedURLException {
        getDriver().findElement(by).click();
    }
    public void selecionaItemLista(Integer numero) throws MalformedURLException {
        getDriver().findElements(By.className("android.widget.TextView")).get(numero).click();
    }
    public String buscaPorAtributo(By by, String atributo) throws MalformedURLException {
        return getDriver().findElement(by).getAttribute(atributo);
    }
    public boolean buscaPorFimString(By by, String string) throws MalformedURLException {
        return getDriver().findElement(by).getText().endsWith(string);
    }
}
