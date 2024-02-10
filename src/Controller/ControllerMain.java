package Controller;

import Interface.Controller.IControllerMain;
import Model.Library.Library;
import Utils.Utils;
import View.ViewMain;
import View.ViewMovie;

import javax.swing.*;

public class ControllerMain implements IControllerMain {
    ViewMain view = new ViewMain();
    Library library= new Library();

    @Override
    public void Empezar() {
        int option;
        do{
            view.Welcome();
            view.Menu();
            option=Utils.readInt("Introduce unas de la opciones posibles");
            Menus(option);
        }while (option!=5);
        Finalizar();
    }

    @Override
    public void Menus(int op) {
        switch (op){
            case 1:

                break;
            case 2:
                ViewMovie vip =new ViewMovie();
                break;
            case 3:
                ViewMovie vig =new ViewMovie();
                break;
            case 4:
                ViewMovie vic =new ViewMovie();
                break;
            default:
                System.out.println("EL numero introducido no es correcto, por favor introduzca uno de nuevo");
        }

    }

    @Override
    public void Finalizar() {
        view.End();
    }
}
