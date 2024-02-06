package Test;

import Interface.View.IViewSong;
import View.ViewSong;
import org.junit.Test;

public class ViewSongTest {

    @Test
    public void testSong() {
        // Crear una instancia de ViewGame y llamar al método a probar
        IViewSong viewSong = new ViewSong();
        viewSong.displayMessageWelcome();
        viewSong.displayMenuSong();
        viewSong.displayMessageGoodbye();
    }
}
