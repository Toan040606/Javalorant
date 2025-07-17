import java.util.Scanner;

public class Bai2_ThuatToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int dif;
        for (int i=0; i<n; i++) {
            if (i%2!=0) {
                if (i==(n-1) && (n-1)%2!=0){
                    dif = a[i-1];
                } else {
                    if (a[i+1] > a[i-1]) {
                        dif = a[i+1] - a[i-1];
                    } else if (a[i-1] > a[i+1]) {
                        dif = a[i-1] - a[i+1];
                    } else {
                        dif = 0;
                    }
                }
                a[i] += dif;
            }
        }

        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
