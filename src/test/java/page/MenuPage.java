package page;

import core.DSL;

import java.net.MalformedURLException;

public class MenuPage {

    private DSL dsl = new DSL();

     public void acessarFormulario() throws MalformedURLException {
         dsl.selecionaItemLista(1);
     }
}
