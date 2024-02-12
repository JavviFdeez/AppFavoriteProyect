package Model.Entity;

public class Game extends Favorite{
    private String company;
    private int price;


    public Game(int id, String name, String category, String genre , String company, int price) {
        super(id, name, category, genre);
        this.company = company;
        this.price = price;

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


    @Override
    public String toString() {
        return "Game{" + super.toString() +
                "company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}