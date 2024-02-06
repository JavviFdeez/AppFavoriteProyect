package Interface.Library;

import Model.Entity.Favorite;

public interface ILibrary {
    //Opciones obligatorias
    public void crud(int opcion);

    // 1 listar && 2 buscar:

    public void findAll();
    public void findByld();
    public void findByClass();
    public void findByName();

    //Opciones que creo que son importantes para el crud

    // 3 insertar
    public void insertFavorite(int id, String name, String category);

    // 4 actualizar

    // 5 borrar
    public void deleteFavorite(String name);

}
