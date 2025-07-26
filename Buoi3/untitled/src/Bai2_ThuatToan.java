import java.util.Scanner;

public class Bai2_ThuatToan {
    public static void isPalindrome(String bruh) {
        boolean check = true;
        int length = bruh.length();

        for (int i=0; i<length/2; i++) {
            String leftChar = bruh.substring(i, i+1);
            String rightChar = bruh.substring(length - i - 1, length - i);

            if (!leftChar.equalsIgnoreCase(rightChar)) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(bruh.toUpperCase());
            System.out.println("Chuỗi đối xứng");
        } else {
            System.out.println(bruh.toLowerCase());
            System.out.println("Chuỗi không đối xứng");
        }
    }

    public static void solve(Scanner sc) {
        String string = sc.nextLine();
        isPalindrome(string.trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
