package page;

import core.BasePage;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.util.Set;

import java.util.logging.Logger;

import static core.DriverFactory.getDriver;

public class WebViewPage extends BasePage {

    public void entrarContextoWeb() throws MalformedURLException {
        Logger Logger = java.util.logging.Logger.getLogger(WebViewPage.class.getName());
        Set<String> context =  getDriver().getContextHandles();
        Logger.info((String) context.toArray()[1]);
        getDriver().context((String) context.toArray()[1]);
    }

    public void setEmail(String valor) throws MalformedURLException {
        getDriver().findElement(By.id("email")).sendKeys(valor);
    }

    public void setSenha(String valor) throws MalformedURLException {
        getDriver().findElement(By.id("senha")).sendKeys(valor);
    }

    public String getMensagem() throws MalformedURLException {
        return getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
    }

    public void entrar() throws MalformedURLException {
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void sairContextoWeb() throws MalformedURLException {
        Set<String> context =  getDriver().getContextHandles();
        getDriver().context((String) context.toArray()[0]);
    }


}
