package Test;
import Interface.View.IViewMain;
import View.ViewMain;
import org.junit.Test;
public class ViewMainTest {
    @Test
    public void ViewMainTest() {
        // Crear una instancia de ViewGame y llamar al método a probar
        ViewMain viewMain = new ViewMain();
        viewMain.Welcome();
        // viewGame.displayMenuGame();
        // viewGame.displayMessageGoodbye();
        viewMain.Menu();
        viewMain.End();
    }
}
