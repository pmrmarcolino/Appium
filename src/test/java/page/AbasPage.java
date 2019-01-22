package page;

import core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class AbasPage extends BasePage {

    public void clicaAba1() throws MalformedURLException {
        clickBotao("ABA 1");
    }

    public void clicaAba2() throws MalformedURLException {
        clickBotao("ABA 2");
    }


    public boolean confirmaAba(String texto)throws MalformedURLException{
        return existeElementoPorTexto(texto);
    }
}
