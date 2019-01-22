package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.AlertPage;
import page.MenuPage;

import java.net.MalformedURLException;

public class AlertTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AlertPage page = new AlertPage();

    @Test
    public void deveConfirmarAlerta() throws MalformedURLException {
        menu.acessarAlerta();
        page.clicaBotaoAlertConfirm();
        page.clicaBotaoConfirm();
        Assert.assertTrue(page.verificaConfirma("Confirmado"));
        page.clicaBotaoSair();
    }
}
