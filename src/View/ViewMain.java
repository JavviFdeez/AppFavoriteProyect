package View;

import Interface.View.IViewMain;

public class ViewMain implements IViewMain {
    @Override
    public void Welcome() {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                           😎!BIENVENIDOS A FAVORITE¡😎              ");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("                    \uD83D\uDD79️  Bienvenido a nuestra app \uD83D\uDD79️              ");
        System.out.println("                      🧾   Donde puedes hacer tu lista favorita   🧾    ");
        System.out.println(" 🎵🎮🎬Puede hacer una lista tus Caciones, Juegos y Peliculas favoritas🎵🎮🎬  ");
        System.out.println("                            Comienza a ser más productivo hoy mismo.");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                     [App Favorite Proyect.]║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    @Override
    public void createMovie() {

    }

    @Override
    public void createGame() {

    }

    @Override
    public void createSong() {

    }
}
