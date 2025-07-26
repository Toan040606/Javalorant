import java.util.Scanner;

public class Bai1 {
    public static boolean isOdd(int n) {
        return n%2!=0;
    }

    public static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i=2; i<= Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        System.out.print("Nhập dãy số: ");
        int[] arr = new int[n];

        int sumOfEven = 0;
        int sumOfOdd = 0;
        int count = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (isOdd(arr[i])) {
                sumOfOdd += arr[i];
            } else {
                sumOfEven += arr[i];
            }
            if (isPrime(arr[i])) {
                count++;
            }
        }

        System.out.println("Tổng các phẩn tử chẵn: " + sumOfEven);
        System.out.println("Tổng các phẩn tử lẻ: " + sumOfOdd);
        System.out.println("Số các số nguyên tố: " + count);
    }
}
