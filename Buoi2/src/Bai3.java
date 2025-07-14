import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int number1 = input.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int number2 = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
        System.out.println(number1 + " x " + number2 + " = " + (number1*number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1%number2));

        if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println(number1 + " != " + number2);
        }
    }
}
