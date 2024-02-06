package Model.Library;

import Interface.Library.ILibrary;
import Model.Entity.Favorite;

public class Library implements ILibrary {
    private Favorite[] favorite;
    @Override
    public void crud(int opcion) {

    }

    @Override
    public void findAll() {
        for (int i = 0; i<favorite.length; i++){
            System.out.println(favorite[i]);
        }
    }

    @Override
    public void findByld() {

    }

    @Override
    public void findByClass() {

    }

    @Override
    public void findByName() {
        for (int i = 0; i<favorite.length; i++){
            System.out.println(favorite[i].getname());
        }
    }

    @Override
    public void insertFavorite(int id, String name, String category) {


    }

    @Override
    public void deleteFavorite(String name) {
        for (int i = 0; i<favorite.length; i++){
            if (favorite[i].getname() == name){
                if (favorite[i].getname().equals(name)){
                    favorite[i].setId(0);
                    favorite[i].setname(null);
                    favorite[i].setcategory(null);

                }
            }
        }
    }
}
