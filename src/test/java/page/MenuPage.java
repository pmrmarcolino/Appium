package page;

import core.BasePage;

import java.net.MalformedURLException;

public class MenuPage extends BasePage {

     public void acessarFormulario() throws MalformedURLException {
         selecionaItemLista("Formulário");
     }

     public void acessarAlerta() throws MalformedURLException{
         selecionaItemLista("Alertas");
     }

     public void acessarSplash() throws MalformedURLException {
         selecionaItemLista("Splash");
     }

    public void acessarAbas() throws MalformedURLException {
        selecionaItemLista("Abas");
    }

    public void acessarAccordion() throws MalformedURLException {
        selecionaItemLista("Accordion");
    }

    public void acessarClick() throws MalformedURLException{
         selecionaItemLista("Cliques");
    }

    public void opcaoEscondida() throws MalformedURLException {
        scrollAndClick("Opção bem escondida");
    }

}
