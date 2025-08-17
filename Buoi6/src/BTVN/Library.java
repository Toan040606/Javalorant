package BTVN;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks(boolean showPublisher) {
        for (Book book : books) {
            book.displayInfo(showPublisher);
        }
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void searchAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayInfo();
            }
        }
    }

    public void removeBookById(int bookId) {
        boolean check = false;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                System.out.println("Danh sách sách sau khi xoá: ");
                displayAllBooks();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy mã sách");
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
