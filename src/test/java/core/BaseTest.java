package core;

import org.junit.After;
import org.junit.AfterClass;

import java.net.MalformedURLException;

import static core.DriverFactory.*;

public class BaseTest {

    @AfterClass // é executado ao final da da execução da classe
    public static void finalizaClasse(){
        DriverFactory.killDriver();
    }

    @After // é executado sempre ao final de cada método
    public void tearDown() throws MalformedURLException {
        getDriver().resetApp(); // para não matar a sessão do app a cada execução de métodos de teste
    }
}
