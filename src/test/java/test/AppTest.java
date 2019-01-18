package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.FormularioPage;
import page.MenuPage;


import java.net.MalformedURLException;

// não deve ter locators
public class AppTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private FormularioPage forms = new FormularioPage();

    @Before
    public void inicializaAppium() throws MalformedURLException {
        menu.acessarFormulario();
    }

    @Test
    public void preencherFormulario() throws MalformedURLException {

        forms.escreverNome("Wagner");
        forms.selecionarCombo( "PS4" );
        forms.selecionarCheck("check");
        forms.selecionarCheck("switch");
        forms.selecionarSalvar("SALVAR");

        Assert.assertEquals("Nome: Wagner", forms.confirmDadosGridIndex("12"));
        Assert.assertEquals("Console: ps4",forms.confirmDadosGridIndex("13"));
        Assert.assertTrue(forms.confirmaDadosGridFimString("Off", "Switch"));
        Assert.assertTrue(forms.confirmaDadosGridFimString("Marcado","Checkbox"));
    }

}

