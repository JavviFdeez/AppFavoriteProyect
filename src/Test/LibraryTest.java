package Test;

import Model.Entity.Favorite;
import Model.Library.Library;

import java.util.Arrays;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        Favorite favorite = new Favorite(1,"No game no life zero", "movie","action");
        Favorite favorite1 = new Favorite(1,"No game no life zero", "movie","action");

        library.insertFavorite(favorite);
        library.insertFavorite(favorite1);
        System.out.println("Buscar posiciones");
        int[] pos = library.findAll();
        System.out.println(library);
    }
}
