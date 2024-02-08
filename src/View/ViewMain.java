package View;

import Interface.View.IViewMain;

public class ViewMain implements IViewMain {
    @Override
    public void Welcome() {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                           😎!BIENVENIDOS A FAVORITE¡😎              ");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("                          \uD83D\uDD79️  Bienvenido a nuestra app \uD83D\uDD79️              ");
        System.out.println("                      🧾   Donde puedes hacer tu lista favorita   🧾    ");
        System.out.println(" 🎵🎮🎬Puede hacer una lista tus Caciones, Juegos y Peliculas favoritas🎵🎮🎬  ");
        System.out.println("                         Comienza a ser más productivo hoy mismo.");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                     [App Favorite Proyect.]║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    @Override
    public void Menu() {
        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          === MENÚ Principal ===      ║");
        System.out.println("║ = [1]. Muestra lista de Favoritos \uD83D\uDCDC ║");
        System.out.println("║ == [2].  Apartado Peliculas \uD83C\uDFAC       ║");
        System.out.println("║ === [3].  Apartado Game\uD83C\uDFAE            ║");
        System.out.println("║ ==== [4].  Apartado Canciones \uD83C\uDFB5     ║");
        System.out.println("║ ===== [5].  Salir de la app \uD83D\uDEAA       ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

}
