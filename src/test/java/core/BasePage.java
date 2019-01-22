package core;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import javax.lang.model.element.Element;
import java.net.MalformedURLException;
import java.util.List;

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

    public void clickBotao(String botao) throws MalformedURLException {
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
    public void findId(String id) throws MalformedURLException{
        getDriver().findElement(By.id("android:id/"+id+"")).click();
    }



}
