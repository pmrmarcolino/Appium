package test;

import org.junit.Assert;
import org.junit.Test;
import page.MenuPage;
import page.SwipeListPage;

import java.net.MalformedURLException;

public class SwipeListTest {
    MenuPage menu = new MenuPage();
    SwipeListPage swipe = new SwipeListPage();

    @Test
    public void swipeTest() throws MalformedURLException {

        menu.swipeList();
        swipe.obterOpcaoDir("Opção 1");
        swipe.clickMais();
        Assert.assertTrue(swipe.existeElementoPorTexto("Opção 1 (+)"));
        swipe.obterOpcaoDir("Opção 3");
        swipe.clickBotaoPorTexto("(-)");
        Assert.assertTrue(swipe.existeElementoPorTexto("Opção 3 (-)"));
        swipe.obterOpcaoEsq("Opção 5 (-)");
        Assert.assertTrue(swipe.existeElementoPorTexto("Opção 5"));

    }
}
