package appium;

import core.DSL;
import core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


import java.net.MalformedURLException;


public class TesteAPP {

    private AndroidDriver<MobileElement> driver;
    private DSL dsl = new DSL();

    @Before
    public void inicializaAppium() throws MalformedURLException {
        driver = DriverFactory.getDriver();
    }

    @Test
    public void preencherFormulario() throws MalformedURLException {
        dsl.selecionaItemLista(1);
        dsl.escrever(MobileBy.AccessibilityId("nome"), "Wagner");
        dsl.selecionarCombo(By.className("android.widget.Spinner"), "PS4" );
        dsl.selecionarCheckSwitch("check");
        dsl.selecionarCheckSwitch("switch");
        dsl.clickBotao(By.xpath("//*[@text='SALVAR']"));


        Assert.assertEquals("Nome: Wagner",
                driver.findElement(By.xpath("//android.widget.TextView[@index='12']")).getAttribute("text"));
        Assert.assertEquals("Console: ps4",
                driver.findElement(By.xpath("//android.widget.TextView[@index='13']")).getAttribute("text"));
        Assert.assertTrue(
                driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch: ')]")).getText().endsWith("Off"));
        Assert.assertTrue(
                driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox: ')]")).getText().endsWith("Marcado"));
    }

    @After
    public void tearDown(){
        DriverFactory.killDriver();
    }
}

