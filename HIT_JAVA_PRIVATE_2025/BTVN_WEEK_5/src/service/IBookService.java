package service;

import model.Book;

public interface IBookService {
    void addBook(Book book);
    Book getBookByID(String id);
    void getAllBooksByCategory(String category);
    boolean deleteBookByID(String id);
    void getAllBooks();
    double calculateTotalValue();
}
