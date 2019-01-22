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

    public void clicarForaCaixa() throws MalformedURLException {
        tap(100,150);
    }

    public void clicaAlertaSimples() throws MalformedURLException {
        clickBotao("ALERTA SIMPLES");
    }

    public boolean verificaModal() throws  MalformedURLException{
        return existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair");
    }
}
