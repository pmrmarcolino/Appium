package page;

import core.BasePage;

import java.net.MalformedURLException;

public class AccordionPage extends BasePage {

    public void selecionarOpcao2() throws MalformedURLException {
        selecionaItemLista("Opção 2");
    }

    public boolean verificaTexto2() throws MalformedURLException {
        return existeElementoPorTexto("Esta é a descrição da opção 2");
    }

}
