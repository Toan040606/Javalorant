package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        Library library = new Library(books);

       while (true) {
           System.out.println("------------Menu------------");
           System.out.println("1. Nhập thêm sách vào thư viện");
           System.out.println("2. Hiển thị danh sách");
           System.out.println("3. Tìm sách theo tác giả");
           System.out.println("4. Xoá sách theo mã sách và hiển thị kết quả");
           System.out.println("5. Kết thúc");

           int choose = sc.nextInt();

           switch (choose) {
               case 1:
                   System.out.print("Nhập thể loại: "); String title = sc.nextLine();
                   sc.nextLine();
                   System.out.print("Nhập tác giả: "); String author = sc.nextLine();
                   System.out.print("Nhập giá cả: "); double price = sc.nextDouble();
                   sc.nextLine();
                   System.out.println("Có nhà xuất bản không (Y/N): "); String option = sc.nextLine();
                   if (option.equalsIgnoreCase("Y")) {
                       Publisher publisher = new Publisher(sc.nextLine(), sc.nextLine());
                       library.addBook(new Book(title, author, price, publisher));
                   } else {
                       library.addBook(new Book(title, author, price));
                   }
                   break;
               case 2:
                   System.out.println("Có muốn xem nhà xuất bản không? (Y/N)");
                   sc.nextLine();
                   String option1 = sc.nextLine();
                   library.displayAllBooks(option1.equalsIgnoreCase("y"));
                   break;
               case 3:
                   System.out.print("Nhập tên tác giả: "); sc.nextLine(); String authorName = sc.nextLine();
                   library.searchAuthor(authorName);
                   break;
               case 4:
                   System.out.print("Nhập mã sách: "); sc.nextLine(); int bookId = sc.nextInt();
                   library.removeBookById(bookId);
                   break;
               case 5:
                   System.exit(0);
           }
       }
    }
}
