package core;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
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

    public void findAccId(String acc) throws MalformedURLException{
        getDriver().findElement(MobileBy.AccessibilityId(acc)).click();
    }

    public void tap(int x, int y) throws MalformedURLException{
        new TouchAction(getDriver()).tap(x,y).perform();
    }

    public String pegaTexto(String texto) throws MalformedURLException {
        return getDriver().findElement(By.xpath("//*[@text='"+texto+"']")).getText();
    }

}
