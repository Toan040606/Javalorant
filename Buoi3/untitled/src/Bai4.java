import java.util.Scanner;

public class Bai4 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        for (int i=0; i<=n; i++) {
            System.out.print(fibonacci(i) + " ");
            if (fibonacci(i) % 2 != 0) {
                sum += fibonacci(i);
            }
        }
        System.out.println();
        System.out.println("Tổng các số Fibonacci lẻ trong dãy là: " + sum);
    }
}
