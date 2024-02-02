package Test;

import Interface.View.IViewMovie;
import View.ViewMovie;
import org.junit.Test;

public class ViewMovieTest {
    @Test
    public void testMovie() {
        // Crear una instancia de ViewGame y llamar al método a probar
        IViewMovie viewMovie = new ViewMovie();
        // viewMovie.displayMessageWelcome();
         viewMovie.displayMenuMovie();
        // viewMovie.displayMessageGoodbye();

    }
}
