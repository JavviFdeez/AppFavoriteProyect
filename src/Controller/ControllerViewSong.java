package Controller;

import Interface.Controller.IControllerViewSong;
import Utils.Utils;
import View.ViewSong;

public class ControllerViewSong implements IControllerViewSong {
    private ViewSong viewSong;

    public ControllerViewSong() {
        this.viewSong = new ViewSong();
    }

    /**
     * @author Javier Fernández
     *  Método que maneja las operaciones CRUD para la entidad Song.
     *  Muestra un mensaje de bienvenida, solicita la entrada del usuario, y realiza
     *  acciones según la opción seleccionada en el menú CRUD.
     *
     *  Method that handles CRUD operations for the Song entity.
     *  Displays a welcome message, requests user input, and performs
     *  actions according to the option selected in the CRUD menu.
     */
    @Override
    public void crudSong() {
        Utils utils = new Utils();
        viewSong.displayMessageWelcome();
        String userInput = utils.handleUserInput();

        try {
            int option = Integer.parseInt(userInput);

            switch (option) {
                case 1:
                    // Lógica para listar canciones
                    System.out.println("\uD83D\uDCCB Listar canciones...");
                    break;
                case 2:
                    // Lógica para buscar canciones
                    System.out.println("\uD83D\uDD0D Buscar canciones...");
                    break;
                case 3:
                    // Lógica para insertar canciones
                    System.out.println("\uD83D\uDCE5 Insertar canciones...");
                    break;
                case 4:
                    // Lógica para actualizar canciones
                    System.out.println("\uD83D\uDD04 Actualizar canciones...");
                    break;
                case 5:
                    // Lógica para borrar canciones
                    System.out.println(" \uD83D\uDDD1 Borrar canciones...");
                    break;
                case 6:
                    // Lógica para volver al menu pirncipal
                    System.out.println("\uD83D\uDD19 Volviendo al Menu Principal...");
                    // LLAMAR AL MENU PRINCIPAL
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }catch (NumberFormatException e) {
            System.out.println("❌ Error al convertir la opción a un número.");
        }

        viewSong.displayMenuSong();
    }
}
