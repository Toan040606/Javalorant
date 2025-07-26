import java.util.Scanner;

public class Bai3_ThuatToan {
    public static boolean check(int a, int b, int c) {
        return a+b == c;
    }

    public static void solve(Scanner sc) {
        String bruh = sc.nextLine();

        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

        int c = (int)(Math.random() * 200);

        System.out.println(a + " + " + b + " = " + c);
        if ((check(a, b ,c) && bruh.equalsIgnoreCase("phép tính đúng")) || (!check(a, b, c) && bruh.equalsIgnoreCase("phép tính sai"))) {
            System.out.println("Bạn đã trả lời đúng!");
        } else {
            System.out.println("Bạn đã trả lời sai!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);

    }
}
