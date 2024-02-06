package Controller;

import Interface.Controller.IControllerViewGame;
import View.ViewGame;

public class ControllerViewGame implements IControllerViewGame {

    private ViewGame viewGame;

    public ControllerViewGame() {
        this.viewGame = new ViewGame();
    }

    @Override
    public void listar() {
        viewGame.displayMessageWelcome();
        // Lógica para listar juegos
        System.out.println("\uD83C\uDFAE Listar juegos...");
        viewGame.displayMenuGame();
    }

    @Override
    public void buscar() {
        viewGame.displayMessageWelcome();
        // Lógica para buscar juegos
        System.out.println("\uD83D\uDD0D Buscar juegos...");
        viewGame.displayMenuGame();
    }

    @Override
    public void insertar() {
        viewGame.displayMessageWelcome();
        // Lógica para insertar juegos
        System.out.println("\uD83D\uDCE5 Insertar juegos...");
        viewGame.displayMenuGame();
    }

    @Override
    public void actulizar() {
        viewGame.displayMessageWelcome();
        // Lógica para actualizar juegos
        System.out.println("\uD83D\uDD04 Actualizar juegos...");
        viewGame.displayMenuGame();
    }

    @Override
    public void borrar() {
        viewGame.displayMessageWelcome();
        // Lógica para borrar juegos
        System.out.println("\uD83D\uDDD1 Borrar juegos...");
        viewGame.displayMenuGame();
    }
}

