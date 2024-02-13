package Controller;

import Interface.Controller.IControllerViewGame;
import View.ViewGame;
import Utils.Utils;

public class ControllerViewGame implements IControllerViewGame {

    private ViewGame viewGame;

    public ControllerViewGame() {
        this.viewGame = new ViewGame();
    }

    /**
     * @author Javier Fernández
     *  Método que maneja las operaciones CRUD para la entidad Game.
     *  Muestra un mensaje de bienvenida, solicita la entrada del usuario, y realiza
     *  acciones según la opción seleccionada en el menú CRUD.
     *
     *  Method that handles CRUD operations for the Game entity.
     *  Displays a welcome message, requests user input, and performs
     *  actions according to the option selected in the CRUD menu.
     */
    @Override
    public void crudGame() {
        Utils utils = new Utils();
        viewGame.displayMessageWelcome();
        String userInput = utils.handleUserInput();

        try {
            int option = Integer.parseInt(userInput);


            switch (option) {
                case 1:
                    // Lógica para listar juegos
                    System.out.println("\uD83D\uDCCB Listar juegos...");
                    break;
                case 2:
                    // Lógica para buscar juegos
                    System.out.println("\uD83D\uDD0D Buscar juegos...");
                    break;
                case 3:
                    // Lógica para insertar juegos
                    System.out.println("\uD83D\uDCE5 Insertar juegos...");
                    break;
                case 4:
                    // Lógica para actualizar juegos
                    System.out.println("\uD83D\uDD04 Actualizar juegos...");
                    break;
                case 5:
                    // Lógica para borrar juegos
                    System.out.println(" \uD83D\uDDD1 Borrar juegos...");
                    break;
                case 6:
                    // Lógica para volver al menu
                    System.out.println("\uD83D\uDD19 Volviendo al Menu Principal...");
                    // LLAMAR AL MENU PRINCIPAL
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }catch (NumberFormatException e) {
            System.out.println("❌ Error al convertir la opción a un número.");
        }
        viewGame.displayMenuGame();
    }
}

