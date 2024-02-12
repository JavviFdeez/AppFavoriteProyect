package Model.Entity;

public class Movie extends Favorite{
    private int duration;
    private String company;

    public Movie(int id, String name, String category,String genre, int duration, String company) {
        super(id, name, category, genre);
        this.duration = duration;
        this.company = company;
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

    @Override
    public String toString() {
        return "Movie{" + super.toString() +
                "duration=" + duration +
                ", company='" + company + '\'' +
                '}';
    }
}