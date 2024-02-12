package Model.Entity;

import java.util.Objects;

public class Favorite {
    protected int id;
    protected String name;
    protected String category;
    protected String genre;

    public Favorite(){
        this.id = -1;
        this.name = null;
        this.category = null;
        this.genre = null;
    }
    public Favorite(int id, String name, String category, String genre) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.genre = genre;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorite favorite = (Favorite) o;
        return id == favorite.id;
    }

    @Override
    public String toString() {
        return "Favorite{" + "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}' +'\n';
    }

}

