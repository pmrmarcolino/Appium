package page;

import core.DSL;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

// não deve ter asserts
public class FormularioPage {

    private  DSL dsl = new DSL();

    public void escreverNome(String nome) throws MalformedURLException {
        dsl.escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public void selecionarCombo(String combo) throws MalformedURLException {
        dsl.selecionarCombo(By.className("android.widget.Spinner"), combo );
    }

    public void selecionarCheck(String opcao) throws MalformedURLException {
        dsl.selecionarCheckSwitch(opcao);
    }

    public void selecionarSalvar(String botao) throws MalformedURLException {
        dsl.clickBotao(By.xpath("//*[@text='"+botao+"']"));
    }


    public String confirmDadosGridIndex(String index) throws MalformedURLException {
        return dsl.buscaPorAtributo(By.xpath("//android.widget.TextView[@index='" + index + "']"), "text");
    }
    public boolean confirmaDadosGridFimString(String end,String tipo) throws MalformedURLException {
        return dsl.buscaPorFimString(By.xpath("//android.widget.TextView[starts-with(@text, '"+tipo+": ')]"), end);
    }

}
