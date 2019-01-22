package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.AbasPage;
import page.MenuPage;

import java.net.MalformedURLException;

public class AbasTest extends BaseTest {

    public MenuPage menu = new MenuPage();
    public AbasPage page = new AbasPage();

    @Test
    public void iteracaoComAbas() throws MalformedURLException {
        menu.acessarAbas();
        page.clicaAba2();

        Assert.assertTrue(page.confirmaAba("Este é o conteúdo da Aba 2"));

        page.clicaAba1();

        Assert.assertTrue(page.confirmaAba("Este é o conteúdo da Aba 1"));
    }

}
