package Model.Entity;

public class Game extends Favorite{
    private String company;
    private int price;
    protected String genre;


    public Game(int id, String name, String category, String company, int price, String genre) {
        super(id, name, category);
        this.company = company;
        this.price = price;
        this.genre = genre;
    }

    public String getcompany() {
        return company;
    }

    public void setcompany(String company) {
        this.company = company;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Game{" + super.toString() +
                "company='" + company + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                '}';
    }
}