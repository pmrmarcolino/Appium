package test;

import org.junit.Assert;
import org.junit.Test;
import page.AbasCloudPage;
import page.AbasPage;
import page.MenuPage;

import java.net.MalformedURLException;

public class AbaCloudPage extends AbasCloudPage{
    public MenuPage menu = new MenuPage();
    public AbasCloudPage page = new AbasCloudPage();

    @Test
    public void iteracaoComAbas() throws MalformedURLException {
        menu.acessarAbaCloud();
        page.clicaAba2();

        Assert.assertTrue(page.confirmaAba("Este é o conteúdo da Aba 2"));

        page.clicaAba1();

        Assert.assertTrue(page.confirmaAba("Este é o conteúdo da Aba 1"));
    }
}
