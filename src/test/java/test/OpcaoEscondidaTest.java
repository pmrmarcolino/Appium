package test;

import core.BasePage;
import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.CliquePage;
import page.MenuPage;

import java.net.MalformedURLException;

public class OpcaoEscondidaTest extends BasePage {

    MenuPage menu = new MenuPage();
    CliquePage clique = new CliquePage();

    @Test
    public void escondidaClick() throws MalformedURLException {
        menu.opcaoEscondida();
        Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
        menu.clickBotao("OK");
    }
}
