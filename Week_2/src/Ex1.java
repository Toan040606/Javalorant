public class Ex1 {
    public static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[101];

        for (int i = 1; i <= 100; i++) {
            a[i] = i;
        }

        int sum = 0;
        long sumProduct = 1;
        for (int x = 1; x < 101; x++) {
            sum += a[x];
            sumProduct *= a[x];
        }

        System.out.println("Tổng = " + sum);
        System.out.println("Tích = " + sumProduct);

        System.out.print("Các phần tử là số nguyên tố: ");
        for (int x = 1; x < 101; x++) {
            if (isPrime(a[x])) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}