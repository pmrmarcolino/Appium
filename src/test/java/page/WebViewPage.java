package page;

import com.oracle.tools.packager.Log;
import core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.Set;

import static core.DriverFactory.getDriver;

public class WebViewPage extends BasePage {

    public void entrarContextoWeb() throws MalformedURLException {
        String context = getDriver().getContext();
            Log.info(context);

        //getDriver().context((String) contexHandlres.toArray()[1]);
    }

    public void setEmail() throws MalformedURLException {
        getDriver().findElement(By.id("email"));
    }
}
