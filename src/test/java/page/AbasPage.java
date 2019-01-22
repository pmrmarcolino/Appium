package page;

import core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class AbasPage extends BasePage {

    public void clicaAba(String botao) throws MalformedURLException {
        clickBotao(By.xpath("//*[@text='"+botao+"']"));
    }

    public boolean confirmaAba(String texto)throws MalformedURLException{
        return existeElementoPorTexto(texto);
    }
}
