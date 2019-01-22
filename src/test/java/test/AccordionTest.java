package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.AccordionPage;
import page.MenuPage;

import java.net.MalformedURLException;

public class AccordionTest extends BaseTest {

    MenuPage menu = new MenuPage();
    AccordionPage page = new AccordionPage();

    @Test
    public void Accordion() throws MalformedURLException {
        menu.acessarAccordion();
        page.selecionarOpcao2();
        Assert.assertTrue( page.verificaTexto2());
    }
}
