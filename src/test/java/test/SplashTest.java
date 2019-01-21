package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.MenuPage;
import page.SplashPage;

import java.net.MalformedURLException;

public class SplashTest extends BaseTest {

    public MenuPage menu = new MenuPage();
    public SplashPage page = new SplashPage();

    @Test
    public void deveAguardarSplashSumir() throws MalformedURLException {
        menu.acessarSplash();

        page.isTelaSplashVisivel();

        page.aguardarSplashSumir();

        Assert.assertTrue(page.existeElementoPorTexto("Splash"));
    }
}
