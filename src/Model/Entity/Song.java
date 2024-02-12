package Model.Entity;

public class Song extends Favorite{
    private int duration;
    private String nameArtist;

    public Song(int id, String name, String category,String genre, int duration,  String nameArtist) {
        super(id, name, category, genre);
        this.duration = duration;
        this.nameArtist = nameArtist;
    }

    public int getduration() {
        return duration;
    }

    public void setduration(int duration) {
        this.duration = duration;
    }

    public String getnameArtist() {
        return nameArtist;
    }

    public void setnameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }


    @Override
    public String toString() {
        return "Song{" + super.toString() +
                "duration=" + duration +
                ", nameArtist='" + nameArtist + '\'' +
                '}';
    }
}