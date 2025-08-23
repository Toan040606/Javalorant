package Bai2.yc1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();

        book.add(new Book("AAA", "da"));
        book.add(new Book("ABB", "sa"));
        book.add(new Book("ABC", "dfw"));

        for (Book i : book) {
            System.out.println(i);
        }
    }
}
