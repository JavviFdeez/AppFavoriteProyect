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
        return "Favorite{" + super.toString() +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }


    public Movie createFavoriteMovie(int duration, String company) {
        return new Movie(id ,name, category, genre, duration, company);
    }
    public Song createFavoriteSong(int duration, String nameArtist) {
        return new Song(id ,name, category,genre , duration, nameArtist);
    }
    public Game createFavoriteGame(String company, int price) {
        return new Game(id ,name, category, genre, company, price);
    }

    public void dateCreate(int i,int n, String s){          //n es significado numero y s String
        switch (category){
            case "song":
            case "Song":
                createFavoriteSong(n, s);
                break;
            case "movie":
            case "Movie":
                createFavoriteMovie(n, s);
                break;
            case "game":
            case "Game":
                createFavoriteGame(s, n);
                break;
        }
    }
}

