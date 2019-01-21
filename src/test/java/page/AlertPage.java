package page;

import core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class AlertPage extends BasePage {

    public void clicaBotao(String botao) throws MalformedURLException {
         clickBotao(By.xpath("//*[@text='"+botao+"']"));
    }

    public boolean verificaConfirma(String texto)throws MalformedURLException{
        return existeElementoPorTexto(texto);
    }

}
