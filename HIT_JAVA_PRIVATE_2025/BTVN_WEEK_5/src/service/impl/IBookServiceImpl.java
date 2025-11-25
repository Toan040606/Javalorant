package service.impl;

import constant.ErrorMessage;
import model.Book;
import model.Novel;
import model.TextBook;
import service.IBookService;

import java.util.ArrayList;

public class IBookServiceImpl implements IBookService {
    public static ArrayList<Book> allBooks = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        allBooks.add(book);
    }

    @Override
    public Book getBookByID(String id) {
        for (Book b : allBooks) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public void getAllBooksByCategory(String category) {
        if (category.equalsIgnoreCase("TextBook")) {
            allBooks.stream()
                    .filter(book -> book instanceof TextBook)
                    .forEach(book -> System.out.println(book.displayInfo()));
        } else if (category.equalsIgnoreCase("Novel"))  {
            allBooks.stream()
                    .filter(book -> book instanceof Novel)
                    .forEach(book -> System.out.println(book.displayInfo()));
        } else {
            System.out.println(ErrorMessage.INVALID_CATEGORY);
        }
    }

    @Override
    public boolean deleteBookByID(String id) {
        for (Book b : allBooks) {
            if (b.getId().equals(id)) {
                allBooks.remove(b);
                return true;
            }
        }
        return false;
    }

    @Override
    public void getAllBooks() {
        System.out.println("List of books: ");
        System.out.println("TextBook: ");
        allBooks.stream()
                    .filter(book -> book instanceof TextBook)
                    .forEach(book -> System.out.println(book.displayInfo()));
        System.out.println("Novel");
        allBooks.stream()
                .filter(book -> book instanceof Novel)
                .forEach(book -> System.out.println(book.displayInfo()));
    }

    @Override
    public double calculateTotalValue() {
        double sum = 0;
        for (Book b : allBooks) {
            sum += b.getPrice() * b.getQuantity();
        }
        return sum;
    }
}
