package model;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, double price, int quantity, String genre) {
        super(title, author, price, quantity);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Novel{" +
                "genre='" + genre + '\'' + "}}";
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
