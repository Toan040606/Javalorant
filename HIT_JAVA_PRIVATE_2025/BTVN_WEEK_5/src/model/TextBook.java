package model;

public class TextBook extends Book{
    private String subject;

    public TextBook(String title, String author, double price, int quantity, String subject) {
        super(title, author, price, quantity);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @Override
    public String displayInfo(){
        return super.displayInfo() + ", " + "TextBook{" +
                "subject='" + subject + '\'' +
                "}}";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
