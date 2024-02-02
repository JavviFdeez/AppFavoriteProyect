package View;

import Interface.View.IViewGame;

import javax.swing.*;

public class ViewGame implements IViewGame {

    /**
     * @author Javier Fernández
     * Método para mostrar un mensaje de bienvenida de la vista Game
     * Method to display a Game view welcome message
     */

    @Override
    public void displayMessageWelcome() {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                    \uD83C\uDFAE \uD83D\uDD79️ !BIENVENIDOS AL MENU GAME¡ \uD83C\uDFAE \uD83D\uDD79              ");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("                   \uD83D\uDD79️  Bienvenido al Gestor de Juegos \uD83D\uDD79️              ");
        System.out.println("          \uD83C\uDFAE Listar: Descubre nuevos títulos y revisa tus favoritos \uD83C\uDFAE               ");
        System.out.println("             \uD83D\uDD0D Buscar: Encuentra rápidamente lo que estás buscando \uD83D\uDD0D");
        System.out.println("                   \uD83D\uDCE5 Insertar: Agrega tus propios juegos \uD83D\uDCE5");
        System.out.println("      \uD83D\uDDD1 Borrar: Elimina juegos que ya no forman parte de tu repertorio \uD83D\uDDD1");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                     [App Favorite Proyect.]║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }


    /**
     * @author Javier Fernández
     * Método para mostrar un menu de 6 opciones para elegir en la vista Game
     * Method to display a menu of 6 options to choose from in Game view
     */

    // Muestra el menu
    @Override
    public void displayMenuGame() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          === MENÚ GAME ===           ║");
        System.out.println("║ = [1]. Listar \uD83D\uDCCB                     ║");
        System.out.println("║ == [2]. Buscar \uD83D\uDD0D                    ║");
        System.out.println("║ === [3]. Insertar \uD83D\uDCE5                 ║");
        System.out.println("║ ==== [4]. Actualizar \uD83D\uDD04              ║");
        System.out.println("║ ===== [5]. Borrar \uD83D\uDDD1️                 ║");
        System.out.println("║ ====== [6]. Volver Menu Principal \uD83D\uDD19️ ║");
        System.out.println("╚══════════════════════════════════════╝");

        int maxAttempts = 3;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            String userInput = JOptionPane.showInputDialog(null, "· Selecciona una opción (Intento " + attempt + " de " + maxAttempts + "):");

            if (isValidOption(userInput)) {
                handleUserInput(userInput);
                break; // Salir del bucle si la opción es válida
            } else {
                System.out.println("❌ Opción no válida. Por favor, ingresa un número entre 1 y 5.");
                if (attempt < maxAttempts) {
                    System.out.println("Inténtalo de nuevo.");
                } else {
                    System.out.println("Has agotado los intentos. Adiós.");
                    // Puedes decidir qué hacer después de agotar los intentos, por ejemplo, cerrar la aplicación.
                }
            }
        }
    }

    // Metodo Valida Opción
    private boolean isValidOption(String userInput) {
        try {
            int option = Integer.parseInt(userInput);
            return option >= 1 && option <= 5;
        } catch (Exception e) {
            return false;
        }
    }


    // Metodo maneja la entrada del usuario
    private void handleUserInput(String userInput) {
        int option = Integer.parseInt(userInput);
        System.out.println("Has seleccionado la opción " + option);
        // Realizar acciones según la opción seleccionada
    }


    /**
     * @author Javier Fernández
     * Método para mostrar un mensaje de despedida de la vista Game
     * Method to display a Game view goodbye message
     */

    @Override
    public void displayMessageGoodbye() {
        System.out.println();
        System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║           === ¡Ha sido un placer tenerte en nuestro Gestor de Juegos! ===         ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ \uD83D\uDD0D Esperamos que hayas encontrado todo lo que buscabas \uD83D\uDD0D                         ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ ⭐ Recuerda que siempre estamos aquí para satisfacer tus necesidades ⭐           ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ \uD83D\uDC4B ¡Esperamos verte pronto para nuevas aventuras en el mundo del gaming! \uD83D\uDC4B       ║");
        System.out.println("║                           \uD83D\uDE80\uD83C\uDFAE ¡Hasta la próxima! \uD83D\uDE80\uD83C\uDFAE                           ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ 🌟 Con gratitud, El equipo del App Favorite Proyect 🌟                            ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }
}
