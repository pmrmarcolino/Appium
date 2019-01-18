package core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import static core.DriverFactory.*;

public class BaseTest {

    @Rule
    public TestName testName = new TestName();

    @AfterClass // é executado ao final da da execução da classe
    public static void finalizaClasse(){
        DriverFactory.killDriver();
    }

    @After // é executado sempre ao final de cada método
    public void tearDown() throws IOException {
        gerarScreenshot();
        getDriver().resetApp(); // para não matar a sessão do app a cada execução de métodos de teste
    }

    public void gerarScreenshot() throws IOException {
        File image = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(image, new File("target/screenshots/"+testName.getMethodName()+".png"));
    }
}
