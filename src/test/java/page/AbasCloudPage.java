package page;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.List;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.getTestObjectDriver;

public class AbasCloudPage {

    public void clickBotaoPorTexto(String botao) throws MalformedURLException {
        getTestObjectDriver().findElement(By.xpath("//*[@text='"+botao+"']")).click();
    }

    public boolean existeElementoPorTexto(String texto) throws MalformedURLException{
        List<MobileElement> elemento = getTestObjectDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
        return elemento.size() > 0;
    }

    public void clicaAba1() throws MalformedURLException {
        clickBotaoPorTexto("ABA 1");
    }

    public void clicaAba2() throws MalformedURLException {
        clickBotaoPorTexto("ABA 2");
    }

    public boolean confirmaAba(String texto)throws MalformedURLException{
        return existeElementoPorTexto(texto);
    }
}
