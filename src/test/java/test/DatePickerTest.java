package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.DatePickerPage;
import page.MenuPage;

import java.net.MalformedURLException;

public class DatePickerTest extends BaseTest {

    MenuPage menu = new MenuPage();
    DatePickerPage page = new DatePickerPage();

    @Test
    public void datePicker() throws MalformedURLException {
        menu.acessarFormulario();
        page.selecionaComponente();
        page.selecionaAno();
        page.selecionaMes();
        page.selecionaDia();
        page.confirma();
        page.salvarDemorado();

        Assert.assertEquals("Data: 29/9/2004",page.verifica());
    }
}
