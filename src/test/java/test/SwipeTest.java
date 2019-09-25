package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.MenuPage;
import page.SwipePage;

import java.net.MalformedURLException;

public class SwipeTest extends BaseTest {
    MenuPage menu = new MenuPage();
    SwipePage swipe = new SwipePage();

    @Test
    public void swipeTest() throws MalformedURLException {
        menu.acessarSwipe();
        swipe.scrollVertical("Chegar até o fim!");
        swipe.cliqueVoltar();
        swipe.cliqueVoltar();
        Assert.assertEquals("Mova a tela para", swipe.textoPrimeiraTela());
    }
}
