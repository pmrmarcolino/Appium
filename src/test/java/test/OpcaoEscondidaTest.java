package test;

import core.BasePage;
import org.junit.Assert;
import org.junit.Test;
import page.MenuPage;

import java.net.MalformedURLException;

public class OpcaoEscondidaTest extends BasePage {

    MenuPage menu = new MenuPage();

    @Test
    public void escondidaClick() throws MalformedURLException {
        menu.opcaoEscondida();
        Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlertaPorId());
        menu.clickBotaoPorTexto("OK");
    }
}
