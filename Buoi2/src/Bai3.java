import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int number1 = input.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int number2 = input.nextInt();

        int tong = number1+number2;
        int hieu = number1-number2;
        int tich = number1*number2;
        int thuong, du;
        if (number2!=0) {
            thuong = number1/number2;
            du = number1%number2;
        } else {
            thuong = 0;
            du = 0;
        }

        System.out.println(number1 + " + " + number2 + " = " + tong);
        System.out.println(number1 + " - " + number2 + " = " + hieu);
        System.out.println(number1 + " x " + number2 + " = " + tich);
        System.out.println(number1 + " / " + number2 + " = " + thuong);
        System.out.println(number1 + " % " + number2 + " = " + du);


        if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println(number1 + " != " + number2);
        }
    }
}
