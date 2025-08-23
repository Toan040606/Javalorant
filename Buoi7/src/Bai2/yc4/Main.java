package Bai2.yc4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double d = sc.nextDouble();
        double e = sc.nextDouble();

        Calculator cal = new Calculator();
        System.out.println(cal.sum(a,b));
        System.out.println(cal.sum(d,e));
        System.out.println(cal.sum(a,b,c));

    }
}
