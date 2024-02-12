package Test;

import Model.Library.Library;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        library.insertFavorite(1,"No game no life zero", "movie","action", 2, "Toey");
        library.insertFavorite(2,"No game no life zero", "movie","action", 2, "Toey");
        library.insertFavorite(3,"No game no life zero", "movie","action", 2, "Toey");
        System.out.println(library);
    }
}
