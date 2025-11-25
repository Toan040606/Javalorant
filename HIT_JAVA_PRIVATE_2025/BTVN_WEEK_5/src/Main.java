import constant.DoingMessage;
import constant.ErrorMessage;
import constant.SuccessMessage;
import model.Book;
import model.Novel;
import model.TextBook;
import service.IBookService;
import service.impl.IBookServiceImpl;

import java.util.Scanner;

import static service.impl.IBookServiceImpl.allBooks;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBookService bookService = new IBookServiceImpl();

        allBooks.add(new TextBook("a", "a", 234, 2, "bruh"));
        allBooks.add(new TextBook("b", "b", 567, 4, "haha"));
        allBooks.add(new Novel("c", "a", 123, 6, "huh?"));
        allBooks.add(new Novel("d", "a", 890, 8, "broooo"));

        while(true) {
            System.out.print(DoingMessage.MAIN_MENU);
            int choice = sc.nextInt();
            sc.nextLine();
            String id;
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println(DoingMessage.ADD_BOOK_MENU);
                    System.out.print(DoingMessage.ENTER_TITLE);
                    String title = sc.nextLine();
                    System.out.print(DoingMessage.ENTER_AUTHOR);
                    String author = sc.nextLine();
                    System.out.print(DoingMessage.ENTER_PRICE);
                    double price = sc.nextDouble();
                    System.out.print(DoingMessage.ENTER_QUANTITY);
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    System.out.print(DoingMessage.ENTER_BOOK_TYPE);
                    int type = sc.nextInt();
                    sc.nextLine();
                    Book newBook = null;
                    boolean flag = false;
                    switch (type) {
                        case 1:
                            flag = true;
                            System.out.print(DoingMessage.ENTER_SUBJECT);
                            String subject = sc.nextLine();
                            newBook = new TextBook(title, author, price, quantity, subject);
                            break;
                        case 2:
                            flag = true;
                            System.out.print(DoingMessage.ENTER_GENRE);
                            String genre = sc.nextLine();
                            newBook = new Novel(title, author, price, quantity, genre);
                            break;
                        default:
                            System.out.println(ErrorMessage.INVALID_CHOICE);
                    }
                    if (flag) {
                        System.out.println();
                        System.out.println(SuccessMessage.SUCCESSFULLY_ADDED);
                        System.out.println();
                        bookService.addBook(newBook);
                        break;
                    } else {
                        System.out.println();
                        System.out.println(DoingMessage.RETURN_MENU);
                        System.out.println();
                        break;
                    }
                case 2:
                    System.out.println();
                    System.out.print(DoingMessage.ENTER_BOOK_ID);
                    id = sc.nextLine();
                    Book book = bookService.getBookByID(id);
                    System.out.println();
                    if (book != null) {
                        System.out.println(book.displayInfo());
                    } else {
                        System.out.println(ErrorMessage.BOOK_ID_NOT_FOUND);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.print(DoingMessage.ENTER_BOOK_CATEGORY);
                    String category = sc.nextLine();
                    System.out.println();
                    bookService.getAllBooksByCategory(category);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    bookService.getAllBooks();
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.print(DoingMessage.ENTER_BOOK_ID);
                    id = sc.nextLine();
                    System.out.println();
                    if (bookService.deleteBookByID(id)) {
                        System.out.println(SuccessMessage.SUCCESSFULLY_DELETED);
                    } else  {
                        System.out.println(ErrorMessage.BOOK_ID_NOT_FOUND);
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    System.out.printf("Total value is: %.2f\n", bookService.calculateTotalValue());
                    System.out.println();
                    break;
                case 7:
                    return;
                default:
                    System.out.println();
                    System.out.println(ErrorMessage.INVALID_CHOICE);
                    System.out.println();
            }
        }

    }
}
