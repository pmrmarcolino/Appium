package test;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.MenuPage;
import page.WebViewPage;

import java.net.MalformedURLException;

public class WebViewTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private WebViewPage web = new WebViewPage();


    @Before
    public void setUp() throws MalformedURLException {
        menu.acessarWebView();
        web.entrarContextoWeb();
    }

    @Test
    public void deveFazerlogin() throws MalformedURLException {
        web.setEmail("a@a");
    }

    @After
    public void tearDown() throws MalformedURLException {
        web.sairContextoWeb();
    }
}
