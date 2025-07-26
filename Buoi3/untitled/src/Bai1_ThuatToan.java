import java.util.Scanner;

public class Bai1_ThuatToan {
    public static final String square = "Square";
    public static final String triangle = "Triangle";
    public static final String circle = "Circle";

    public static void ifSquare(Scanner sc) {
        System.out.print("Nhập độ dài cạnh hình vuông: ");
        int dai = sc.nextInt();
        System.out.println("Diện tích hình vuông: " + Math.pow(dai, 2));
    }

    public static void ifTriangle(Scanner sc) {
        System.out.print("Nhập dãy độ dài của 3 cạnh tam giác: ");
        double[] canh = new double[3];
        double p = 0;
        for (int i=0; i<3; i++) {
            canh[i] = sc.nextInt();
            p += canh[i];
        }
        p /= 2;
        System.out.println("Diện tích hình tam giác: " + Math.sqrt(p*(p-canh[0])*(p-canh[1])*(p-canh[2])));
    }

    public static void ifCircle(Scanner sc) {
        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();
        final double PI = 3.14;
        System.out.println("Diện tích hình tròn: " + PI*Math.pow(r, 2));
    }

    public static void checkType(Scanner sc) {
        System.out.print("Nhập loại gạch (square, triangle, circle): ");
        String type = sc.nextLine();
        if (type.equalsIgnoreCase(square)) {
            ifSquare(sc);
        } else if (type.equalsIgnoreCase(triangle)) {
            ifTriangle(sc);
        } else if (type.equalsIgnoreCase(circle)) {
            ifCircle(sc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkType(sc);
    }
}
