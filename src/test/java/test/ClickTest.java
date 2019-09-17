package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.CliquePage;
import page.MenuPage;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class ClickTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private CliquePage click = new CliquePage();

    @Test
    public void deveRealizarClickLongo() throws MalformedURLException, InterruptedException {
        menu.acessarClick();
        sleep(5000);
        //click.cliqueLongo();
        Assert.assertEquals("Clique Longo",click.obterTextoCampo());
    }

    @Test
    public void deveRealizarClickDuplo() throws MalformedURLException, InterruptedException {
        menu.acessarClick();
        sleep(5000);
        click.doubleClick();
        click.doubleClick();
        Assert.assertEquals("Duplo Clique",click.obterTextoCampo());
    }

}
