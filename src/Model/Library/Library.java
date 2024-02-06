package Model.Library;

import Interface.Library.ILibrary;
import Model.Entity.Favorite;

public class Library<T> implements ILibrary {
    private Favorite[] favorite = new Favorite[30];

    @Override
    public void crud(int option) {
        switch (option) {
            case 1:
                findAll();
                break;
            case 2:
                /*Por que carcateristica quieres buscar "Apartado tambien de la vista". esto tambien devuelve una opcion*/
                int searchedData = 1;
                switch (searchedData) {
                    case 1: //Buscar por ID
                        /*Se le tiene que pedir una ID*/
                        findById(id);
                        break;
                    case 2: //Buscar por nombre
                        /*Se le tiene que pedir un nombre*/
                        findByName(name);
                        break;
                    case 3: //Buscar por Categoria
                        /*Se le tiene que pedir una Categoria*/
                        findByCategory(category);
                        break;
                    default:
                        /*fallo de poner numero*/
                }
                break;
            case 3:
                insertFavorite(id, name, category);
                break;
            case 4:
                break;
            case 5:
                deleteFavorite(id);
                break;
            default:
                /* Aqui hay que hablar con javi para que salga un cartelito de opcion no valida en la vista*/
        }
    }

    /**
     * Encontrar todos los favoritos. Alberto del futuro si no entiendes la funcion piensa que si no hay
     * nada los filtra
     *
     * @return devuelve un arrays con todas las ubicaciones donde que hay favoritos
     */
    @Override
    public int[] findAll() {
        int[] positions = new int[30];
        boolean first = true;

        for (int i = 0; i < favorite.length; i++) {                     //bucle que controla favorite
            boolean order = true;                                       //orden de almacenamiento de posicion
            if (favorite[i].getId() != -1) {                            //comprobador de null
                for (int j = 0; j > positions.length || order; j++) {   //bucle que controla la posición
                    if (positions[j] == -1) {                           // si posicion es igual que -1 entra
                        positions[j] = i;
                        order = false;
                    }
                }
            }
        }
        return positions;                   // Se devuelven todas las posiciones que hay ya información"las ID"
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
    public void insertFavorite(int id, String name, String category) {
        boolean empty = false;      //empty significa vacio
        for (int i = 0; i < favorite.length; i++) {
            if (favorite[i].getId() == -1) {
                favorite[i].setId(id);
                favorite[i].setname(name);
                favorite[i].setcategory(category);
            }
        }

    }

    @Override
    public void deleteFavorite(int id) {
        for (int i = 0; i < favorite.length; i++) {
            if (favorite[i].getId() == id) {
                favorite[i].setId(0);
                favorite[i].setname(null);
                favorite[i].setcategory(null);
            }
        }
    }
}
