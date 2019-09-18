package page;

import core.BasePage;

import java.net.MalformedURLException;

public class AlertPage extends BasePage {

    public void clicaBotaoAlertConfirm() throws MalformedURLException {
         clickBotaoPorTexto("ALERTA CONFIRM");
    }

    public void clicaBotaoConfirm() throws MalformedURLException {
        clickBotaoPorTexto("CONFIRMAR");
    }


    public boolean verificaConfirma(String texto)throws MalformedURLException{
        return existeElementoPorTexto(texto);
    }

    public void clicaBotaoSair() throws MalformedURLException {
        clickBotaoPorTexto("SAIR");
    }

    public void clicarForaCaixa() throws MalformedURLException {
        tap(100,150);
    }

    public void clicaAlertaSimples() throws MalformedURLException {
        clickBotaoPorTexto("ALERTA SIMPLES");
    }

    public boolean verificaModal() throws  MalformedURLException{
        return existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair");
    }
}
