package Interface.Library;

import Model.Entity.Favorite;


public interface ILibrary {
    //Opciones obligatorias

    public String toString();

    // 1 listar && 2 buscar:

    public int[] findAll();
    public int findById(int id);
    public int findByName(String name);
    public int[] findByCategory(String ategory);


    //Opciones que creo que son importantes para el crud



    // 3 insertar


    // 4 actualizar



    boolean insertFavorite(Favorite favorite);

    // 5 borrar
    Favorite deleteFavorite(int id, String name, String category, String genre);
}
