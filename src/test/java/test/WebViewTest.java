package test;

import core.BaseTest;
import org.junit.Test;
import page.MenuPage;
import page.WebViewPage;

import java.net.MalformedURLException;

public class WebViewTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private WebViewPage web = new WebViewPage();

    @Test
    public void deveFazerlogin() throws MalformedURLException {
        menu.acessarWebView();
        web.entrarContextoWeb();
        //web.setEmail();
    }
}
