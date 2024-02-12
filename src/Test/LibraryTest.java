package Test;

import Model.Entity.Favorite;
import Model.Library.Library;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        Favorite favorite = new Favorite(1,"No game no life zero", "movie","action");
        library.insertFavorite(favorite);
        System.out.println(library);
    }
}
