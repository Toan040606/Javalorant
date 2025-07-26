import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[n][n];

        int i1=0, i2=n-1, j1=0, j2=n-1, dem = 1;
        while(i1<=i2 && j1<=j2) {
            for (int i=i1; i<=i2; i++) {
                a[i1][i] = dem;
                dem++;
            }
            i1++;
            for (int i=i1; i<=i2; i++) {
                a[i][j2] = dem;
                dem++;
            }
            j2--;
            for (int i=j2; j1<=i; i--) {
                a[i2][i] = dem;
                dem++;
            }
            i2--;
            for (int i=i2; i>=i1; i--) {
                a[i][j1] = dem;
                dem++;
            }
            j1++;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += a[i][i];
        }

        int phu = n-1;
        for (int i=0; i<n; i++) {
            sum += a[i][phu];
            phu--;
        }
        System.out.println("Tổng các phần tử chéo chính và phụ là: " + sum);
    }
}
