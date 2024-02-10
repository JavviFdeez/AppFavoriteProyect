package Utils;

import Interface.IUtils;

import javax.swing.*;
import java.util.Scanner;

public class Utils implements IUtils {
    @Override
    public boolean isValidOption(String userInput, int op) {
        try {
            op = Integer.parseInt(userInput);
            return op >= 1 && op <= 5;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public String handleUserInput(int op) {
        boolean correc=false;
        for (int attempt = 1; attempt <= 3 && correc!=true; attempt++) {
            String userInput = JOptionPane.showInputDialog(null, "· Selecciona una opción (Intento " + attempt + " de 3):");

            if (isValidOption(userInput,op)) {
                correc=true;
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
    public static int readInt(String msg){
        boolean valido=false;
        int num=-1;

        Scanner teclado = new Scanner(System.in);
        while(!valido) {

            try{
                System.out.print(msg+": ");
                num = teclado.nextInt();
                valido = true;

            }catch(Exception e) {
                teclado.nextLine();
                System.out.print("Por favor introduce un numero: ");
            }
        }
        return num;
    }
}
