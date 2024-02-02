package Model.Entity;

public class Song extends Favorite{
    private int duration;
    private String band;
    private String nameArtist;
    protected String genre;

    public Song(int id, String name, String category, int duration, String band, String nameArtist, String genre) {
        super(id, name, category);
        this.duration = duration;
        this.band = band;
        this.nameArtist = nameArtist;
        this.genre = genre;
    }

    public int getduration() {
        return duration;
    }

    public void setduration(int duration) {
        this.duration = duration;
    }

    public String getband() {
        return band;
    }

    public void setband(String band) {
        this.band = band;
    }

    public String getnameArtist() {
        return nameArtist;
    }

    public void setnameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" + super.toString() +
                "duration=" + duration +
                ", band='" + band + '\'' +
                ", nameArtist='" + nameArtist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}