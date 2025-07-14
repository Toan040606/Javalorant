// File này file ghi chép, không phận sự miễn thay đổi :v
import java.util.Scanner;

public class vidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Ten ban la gi: ");
//        String name = sc.nextLine();
//        System.out.println("Xin chao " + name);
//
//        int number1 = sc.nextInt();
//        double number2 = sc.nextDouble();
//        boolean trueOrFalse = sc.nextBoolean();

        String input = "";
        System.out.println("Nhập dữ liệu (gõ 'exit' để thoát chương trình)");

        while (true) {
            System.out.print("Nhập: ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                System.out.println(input);
            }

        }


    }
}
