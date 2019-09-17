package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.BemEscondidaPage;
import page.MenuPage;

import java.net.MalformedURLException;

public class OpcaoEscondidaTest extends BaseTest {

    MenuPage menu = new MenuPage();
    BemEscondidaPage be = new BemEscondidaPage();

    @Test
    public void escondidaClick() throws MalformedURLException {
        menu.opcaoEscondida();
        Assert.assertEquals("Você achou essa opção", be.obterTexto());
        be.okClique();
    }
}
