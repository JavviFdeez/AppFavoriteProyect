package Utils;

import Interface.IUtils;

import javax.swing.*;

public class Utils implements IUtils {

    // Metodo Valida Opción
    @Override
    public boolean isValidOption(String userInput) {
        try {
            int option = Integer.parseInt(userInput);
            return option >= 1 && option <= 5;
        } catch (Exception e) {
            return false;
        }
    }

    // Metodo maneja la entrada del usuario
    @Override
    public String handleUserInput() {
        for (int attempt = 1; attempt <= 3; attempt++) {
            String userInput = JOptionPane.showInputDialog(null, "· Selecciona una opción (Intento " + attempt + " de 3):");

            if (isValidOption(userInput)) {
                return userInput;
            } else {
                System.out.println("❌ Opción no válida. Por favor, ingresa un número entre 1 y 5.");
                if (attempt < 3) {
                    System.out.println("Inténtalo de nuevo.");
                } else {
                    System.out.println("Has agotado los intentos.");
                }
            }
        }
        return "-1";  // Si llega aquí, algo salió mal
    }
}
