package page;

import core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static core.DriverFactory.getDriver;

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

    public void selecionarSalvar() throws MalformedURLException {
        clickBotao("SALVAR");
    }

    public String confirmDadosGridIndex(String index) throws MalformedURLException {
        return buscaPorAtributo(By.xpath("//android.widget.TextView[@index='" + index + "']"), "text");
    }
    public boolean confirmaDadosGridFimString(String end,String tipo) throws MalformedURLException {
        return buscaPorFimString(By.xpath("//android.widget.TextView[starts-with(@text, '"+tipo+": ')]"), end);
    }

    public void selecionaComponente() throws MalformedURLException {
        clickBotao("01/01/2000");
    }

    public void selecionaAno() throws MalformedURLException {
        findId("date_picker_header_year");
        selecionaItemLista("2004");
    }

    public void confirma() throws MalformedURLException {
        clickBotao("OK");
    }

    public void selecionaMes() throws MalformedURLException{
        int quantMeses = 7;// setembro
        while(quantMeses!=0){
            findId("next");
            quantMeses--;
        }
    }

    public void selecionaDia() throws MalformedURLException {
        selecionaItemLista("29");
    }

    public void salvarDemorado() throws MalformedURLException {
        clickBotao("SALVAR DEMORADO");
    }

    public String verificaDate() throws MalformedURLException{
        return buscaIndice("17").getText();
    }

    public String verificaTime() throws MalformedURLException{
        return pegaTexto("21:30");
    }

    public void selecionaTimePicker() throws MalformedURLException {
        clickBotao("06:00");
    }
    public  void selecionaHora() throws MalformedURLException{
        findAccId("21");
    }
    public void selecionaMinuto() throws MalformedURLException{
        findAccId("30");
    }

    public void selecionaSlid(double posicao) throws MalformedURLException{
        int delta = 40;
        MobileElement slid = getDriver().findElementByAccessibilityId("slid");
        int y = slid.getLocation().y + (slid.getSize().height/2);
        int x = delta + (int)(slid.getLocation().x +  ((slid.getSize().width - 2*delta)* posicao));
        tap(x,y);
    }

    public String verificaSlide() throws  MalformedURLException{
        return buscaIndice("14").getText();
    }

}
