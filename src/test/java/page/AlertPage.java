package page;

import core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class AlertPage extends BasePage {

    public void clicaBotaoAlertConfirm() throws MalformedURLException {
         clickBotao("ALERTA CONFIRM");
    }

    public void clicaBotaoConfirm() throws MalformedURLException {
        clickBotao("CONFIRMAR");
    }


    public boolean verificaConfirma(String texto)throws MalformedURLException{
        return existeElementoPorTexto(texto);
    }

    public void clicaBotaoSair() throws MalformedURLException {
        clickBotao("SAIR");
    }
}
