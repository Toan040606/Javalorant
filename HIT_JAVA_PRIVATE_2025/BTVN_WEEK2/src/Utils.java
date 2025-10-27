public class Utils {
    public static int sumOfArray(int n, int[] a) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void printMinMax(int n, int[] a) {
        int min = a[0], max = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            } else if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng: " + max);
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
    }

    public static void arrange(int n, int[] a) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }

        }
    }

    public static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int[] a) {
        boolean check = false;
        int maxPrime = 0;
        for (int i : a) {
            if (isPrime(i)) {
                check = true;
                if (maxPrime < i) {
                    maxPrime = i;
                }
            }
        }
        if (!check) System.out.println("Không có");
        else {
            System.out.println(maxPrime);
        }
    }
}
