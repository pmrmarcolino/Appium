package page;

import core.BasePage;

import java.net.MalformedURLException;

public class DatePickerPage extends BasePage {

    public void selecionaComponente() throws MalformedURLException {
        clickBotao("01/01/2000");
    }

    public void selecionaAno() throws MalformedURLException {
        findId("date_picker_header_year");
        selecionaItemLista("2004");
    }

    public void confirma() throws MalformedURLException {
        clickBotao("OK");
    }

    public void selecionaMes() throws MalformedURLException{
        int quantMeses = 7;// setembro
        while(quantMeses!=0){
            findId("next");
            quantMeses--;
        }
    }

    public void selecionaDia() throws MalformedURLException {
        selecionaItemLista("29");
    }

    public void salvarDemorado() throws MalformedURLException {
        clickBotao("SALVAR DEMORADO");
    }

    public String verifica() throws MalformedURLException{
        return buscaIndice("17").getText();
    }
}
