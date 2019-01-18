package page;

import core.BasePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

// não deve ter asserts
public class FormularioPage extends BasePage {

    public void escreverNome(String nome) throws MalformedURLException {
        escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public void selecionarCombo(String combo) throws MalformedURLException {
        selecionarCombo(By.className("android.widget.Spinner"), combo );
    }

    public void selecionarCheck(String opcao) throws MalformedURLException {
        selecionarCheckSwitch(opcao);
    }

    public void selecionarSalvar(String botao) throws MalformedURLException {
        clickBotao(By.xpath("//*[@text='"+botao+"']"));
    }


    public String confirmDadosGridIndex(String index) throws MalformedURLException {
        return buscaPorAtributo(By.xpath("//android.widget.TextView[@index='" + index + "']"), "text");
    }
    public boolean confirmaDadosGridFimString(String end,String tipo) throws MalformedURLException {
        return buscaPorFimString(By.xpath("//android.widget.TextView[starts-with(@text, '"+tipo+": ')]"), end);
    }

}
