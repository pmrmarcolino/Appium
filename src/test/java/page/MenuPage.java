package page;

import core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.getTestObjectDriver;

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

    public void acessarOpcaoEscondida() throws MalformedURLException {
        scrollAndClick("Opção bem escondida");
    }
    
    public void acessarSwipe() throws MalformedURLException {
         scrollAndClick("Swipe");
    }

    public void acessarSwipeList() throws MalformedURLException {
         scrollAndClick("Swipe List");
    }

    public void acessarWebView() throws MalformedURLException {
         selecionaItemLista("SeuBarriga Híbrido");
    }

    public void acessarAbaCloud(){
        try {
            getTestObjectDriver().findElement(By.xpath("//*[@text='Abas']")).click();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
