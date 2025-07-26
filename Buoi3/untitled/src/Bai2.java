import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159265;
        System.out.print("Nhập bán kính r: ");
        double r = sc.nextDouble();
        System.out.print("Nhập số mũ k: ");
        int k = sc.nextInt();

        System.out.println("Chu vi hình tròn: " + 2*PI*r);
        System.out.println("Diện tích hình tròn: " + PI*Math.pow(r, 2));
        System.out.println("r mũ k bằng " + Math.pow(r, k));
        System.out.println("Căn bậc 2 của (r + k) bằng "+ Math.sqrt(r + k));
        System.out.println("Trị tuyệt đối của (r - k) bằng " + Math.abs(r - k));
    }
}
