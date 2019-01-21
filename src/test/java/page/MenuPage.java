package page;

import core.BasePage;

import java.net.MalformedURLException;

public class MenuPage extends BasePage {

     public void acessarFormulario() throws MalformedURLException {
         selecionaItemLista(1);
     }

     public void acessarAlerta() throws MalformedURLException{
         selecionaItemLista(4);
     }

     public void acessarSplash() throws MalformedURLException {
         selecionaItemLista(5);
     }

}
