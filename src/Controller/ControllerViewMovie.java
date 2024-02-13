package Controller;

import Interface.Controller.IControllerViewMovie;
import Model.Entity.Favorite;
import Model.Library.Library;
import Utils.Utils;
import View.ViewMovie;

public class ControllerViewMovie implements IControllerViewMovie {
    private ViewMovie viewMovie;
    private Library library;

    public ControllerViewMovie() {
        this.viewMovie = new ViewMovie();
        this.library = new Library();
    }

    /**
     * @author Javier Fernández
     *  Método que maneja las operaciones CRUD para la entidad Movie.
     *  Muestra un mensaje de bienvenida, solicita la entrada del usuario, y realiza
     *  acciones según la opción seleccionada en el menú CRUD.
     *
     *  Method that handles CRUD operations for the Movie entity.
     *  Displays a welcome message, requests user input, and performs
     *  actions according to the option selected in the CRUD menu.
     */
    @Override
    public void crudMovie() {
        Utils utils = new Utils();
        viewMovie.displayMessageWelcome();
        viewMovie.displayMenuMovie();
        viewMovie.displayMenuMovieList();
        String userInput = utils.handleUserInput();

        try {
            int option = Integer.parseInt(userInput);

            switch (option) {
                case 1:
                    // Lógica para listar películas
                    System.out.println("\uD83D\uDCCB Listar películas...");
                    break;
                case 2:
                    // Lógica para buscar películas
                    System.out.println("\uD83D\uDD0D Buscar películas...");
                    break;
                case 3:
                    // Lógica para insertar películas
                    System.out.println("\uD83D\uDCE5 Insertar películas...");
                    break;
                case 4:
                    // Lógica para actualizar películas
                    System.out.println("\uD83D\uDD04 Actualizar películas...");
                    break;
                case 5:
                    // Lógica para borrar películas
                    System.out.println(" \uD83D\uDDD1 Borrar películas...");
                    break;
                case 6:
                    // Lógica para volver al menu principal
                    System.out.println("\uD83D\uDD19 Volviendo al Menu Principal...");
                    // LLAMAR AL MENU PRINCIPAL
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }catch (NumberFormatException e) {
            System.out.println("❌ Error al convertir la opción a un número.");
        }

        viewMovie.displayMenuMovie();
    }
}
