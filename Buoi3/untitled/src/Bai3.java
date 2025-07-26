import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        String trimmedString = string.trim();

        boolean check = true;
        int length = trimmedString.length();

        for (int i=0; i<length/2; i++) {
            String leftChar = trimmedString.substring(i, i+1);
            String rightChar = trimmedString.substring(length - i - 1, length - i);

            if (!leftChar.equalsIgnoreCase(rightChar)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Chuỗi đối xứng");
        } else {
            System.out.println("Chuỗi không đối xứng");
        }
    }
}
