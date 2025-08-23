package Bai3.yc5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println("a / b = " + a/b);
        } catch (Exception ex) {
            System.out.println("Không thể chia cho 0");
        }
    }
}
