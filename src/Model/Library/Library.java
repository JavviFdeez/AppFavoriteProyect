package Model.Library;

import Interface.Library.ILibrary;
import Model.Entity.Favorite;

import java.util.Arrays;

public class Library implements ILibrary {
    private static final int TAM = 30;
    private Favorite[] favorite;

    public Library() {
        favorite = new Favorite[TAM];
    }

    @Override
    public String toString() {
        return "Library{" +
                "favorite=" + Arrays.toString(favorite) +
                '}';
    }

    /**
     * Encontrar todos los favoritos. Alberto del futuro si no entiendes la funcion piensa que si no hay
     * nada los filtra
     *
     * @return devuelve un arrays con todas las ubicaciones donde que hay favoritos
     */
    @Override
    public int[] findAll() {
        int counter = 0;
        int[] Position = new int[favorite.length];

        for (int i = 0; i < favorite.length; i++) {         //Comprueba cuales son posiciones que no son null
            if (favorite[i] != null && favorite[i].getId() != -1) {
                Position[counter] = i;
                counter++;
            }
        }
        int[] result = new int[counter];        //Creo un arrays con los
        for (int i = 0; i < counter; i++) {
            result[i] = Position[i];
        }
        return result;
    }

    /**
     * Se le pasa una id y te dice la ubicación de esta
     *
     * @param id es por donde va a buscar el dato
     * @return devolvera en la posicion que se encuentra
     */
    @Override
    public int findById(int id) {
        int position = -1;
        for (int i = 0; i > favorite.length || position == -1; i++) {
            if (id == favorite[i].getId()) {
                position = i;
            }
        }
        return position;
    }

    /**
     * Se le pasa un nombre y esta dice la posicion donde se encuentra ese nombre
     *
     * @param name se le pasa un nombre concreto
     * @return devuelve la posición donde esta el nombre
     */
    @Override
    public int findByName(String name) {
        int position = -1;
        for (int i = 0; i > favorite.length || position == -1; i++) {
            if (favorite[i].getname().equals(name)) {
                position = i;
            }
        }
        return position;
    }

    /**
     * Se le pasa el tipo de categoria que es y te devuelve todas las ubicaciones que tienen esa categoria
     *
     * @param category se le pasa una categoria para que filtre solo las que este en esta
     * @return devuelve todas las posiciones que tengan la categoria concreta
     */
    @Override
    public int[] findByCategory(String category) {

        int[] positions = new int[30];
        boolean first = true;

        for (int i = 0; i < favorite.length; i++) {                     //bucle que controla favorite
            boolean order = true;                                       //orden de almacenamiento de posicion
            if (favorite[i].getcategory().equals(category)) {                            //comprobador de null
                for (int j = 0; j > positions.length || order; j++) {   //bucle que controla la posición
                    if (positions[j] == -1) {                           // si posicion es igual que -1 entra
                        positions[j] = i;
                        order = false;
                    }
                }
            }
        }
        return positions;                   // Se devuelven todas las posiciones que hay ya con la categoria
    }

    @Override
    public boolean insertFavorite(Favorite favorite) {
        boolean empty = false;      //empty significa vacio
        if (getPosFavorite(favorite) == -1) {
            for (int i = 0; i < this.favorite.length && !empty; i++) {
                if (this.favorite[i] == null) {
                    this.favorite[i] = favorite;
                    empty = true;
                }
            }
        }
        return empty;
    }

    private int getPosFavorite(Favorite f) {
        int result = -1;
        for (int i = 0; i < favorite.length; i++) {
            if (favorite[i] != null && favorite[i].equals(f)) {
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * Se borra todo el favorito con su id
     *
     * @param id es con lo que se va a localizar un favorite y borrarse
     */
    @Override
    public Favorite deleteFavorite(int id, String name, String category, String genre) {

        Favorite result = null;
        int pos = getPosFavorite(new Favorite(id, name, category, genre));
        if (pos != -1) {
            result = favorite[pos];
            favorite[pos] = null;
        }
        return result;

    }

}
