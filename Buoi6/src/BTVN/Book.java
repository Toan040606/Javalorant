package BTVN;

public class Book {
    private static int counter = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;
    private boolean check;

    public Book(String title, String author, double price, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.check = true;
        this.bookId = counter++;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.check = false;
        this.bookId = counter++;
    }

    public void displayInfo(boolean showPublisher) {
        if (showPublisher) {
            System.out.print(this.bookId + " " + this.title + " " + this.author + " " + this.price + " ");
            if (this.check) {
                System.out.println(publisher.toString());
            } else {
                System.out.println("Publisher: Unknown");
            }
        } else {
            System.out.println(this.bookId + " " + this.title + " " + this.author + " " + this.price + " ");
        }
    }

    public void displayInfo() {
        System.out.print(this.bookId + " " + this.title + " " + this.author + " " + this.price + " ");
        if (this.check) {
            System.out.println(publisher.toString());
        } else {
            System.out.println("Publisher: Unknown");
        }
    }

    public Book() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
