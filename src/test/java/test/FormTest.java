package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.FormularioPage;
import page.MenuPage;


import java.net.MalformedURLException;

// não deve ter locators
public class FormTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private FormularioPage forms = new FormularioPage();

    @Test
    public void preencherFormulario() throws MalformedURLException {
        menu.acessarFormulario();
        forms.escreverNome("Wagner");
        forms.selecionarCombo( "PS4" );
        forms.selecionarCheck("check");
        forms.selecionarCheck("switch");
        forms.selecionarSalvar();

        Assert.assertEquals("Nome: Wagner", forms.confirmDadosGridIndex("12"));
        Assert.assertEquals("Console: ps4",forms.confirmDadosGridIndex("13"));
        Assert.assertTrue(forms.confirmaDadosGridFimString("Off", "Switch"));
        Assert.assertTrue(forms.confirmaDadosGridFimString("Marcado","Checkbox"));
    }

    @Test
    public void datePicker() throws MalformedURLException {
        menu.acessarFormulario();
        forms.selecionaComponente();
        forms.selecionaAno();
        forms.selecionaMes();
        forms.selecionaDia();
        forms.confirma();
        forms.salvarDemorado();

        Assert.assertEquals("Data: 29/9/2004",forms.verificaDate());
    }

    @Test
    public void timePicker() throws MalformedURLException {
        menu.acessarFormulario();
        forms.selecionaTimePicker();
        forms.selecionaHora();
        forms.selecionaMinuto();
        forms.confirma();
        forms.selecionarSalvar();

        Assert.assertEquals("21:30", forms.verificaTime());
    }

    @Test
    public void seekBar() throws MalformedURLException {
        menu.acessarFormulario();
        forms.selecionaSlid(0.75);
        forms.selecionarSalvar();

        Assert.assertEquals("Slider: 75", forms.verificaSlide());

    }

}

