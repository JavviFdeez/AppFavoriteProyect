package Interface.Library;

public interface ILibrary {
    //Opciones obligatorias
    public void crud(int opcion);

    // 1 listar && 2 buscar:

    public int[] findAll();
    public int findById(int id);
    public int findByName(String name);
    public int[] findByCategory(String ategory);


    //Opciones que creo que son importantes para el crud



    // 3 insertar
    public void insertFavorite(int id, String name, String category);

    // 4 actualizar

    // 5 borrar
    public void deleteFavorite(int id);

}
