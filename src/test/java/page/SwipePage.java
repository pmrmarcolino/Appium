package page;

import core.BasePage;

import java.net.MalformedURLException;

public class SwipePage extends BasePage {

    public void scrollVertical(String input) throws MalformedURLException {
        swipeAteEncontrarTexto(input);
    }

    public void cliqueVoltar() throws MalformedURLException {
        clickBotaoPorTexto("‹");
    }

    public String textoPrimeiraTela() throws MalformedURLException {
        return pegaTextoPorText("Mova a tela para");
    }
}
