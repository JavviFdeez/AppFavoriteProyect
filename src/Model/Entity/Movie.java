package Model.Entity;

public class Movie extends Favorite{
    private int duration;
    private String company;
    private String actors;
    protected String genre;

    public Movie(int id, String name, String category, int duration, String company, String actors, String genre) {
        super(id, name, category);
        this.duration = duration;
        this.company = company;
        this.actors = actors;
        this.genre = genre;
    }

    public int getduration() {
        return duration;
    }

    public void setduration(int duration) {
        this.duration = duration;
    }

    public String getcompany() {
        return company;
    }

    public void setcompany(String company) {
        this.company = company;
    }

    public String getactors() {
        return actors;
    }

    public void setactors(String actors) {
        this.actors = actors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" + super.toString() +
                "duration=" + duration +
                ", company='" + company + '\'' +
                ", actors='" + actors + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}