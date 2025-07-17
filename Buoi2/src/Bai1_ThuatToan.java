import java.util.Scanner;

public class Bai1_ThuatToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;

        double r = sc.nextDouble();

        double P = 2*pi*r;
        double S = pi*r*r;

        if (0<r && r<1000) {
            System.out.printf("%1.3f", P);
            System.out.printf(" %1.3f", S);
        }
    }
}
