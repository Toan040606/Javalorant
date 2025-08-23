package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        char[] chars = string.toCharArray();

        String vowels = "aeiouAEIOU";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int vowelsCount = 0;
        int uppercaseCount = 0;
        for (char c : chars) {
            if (vowels.indexOf(c) >= 0) {
                vowelsCount++;
            }
            if (uppercase.indexOf(c) >= 0) {
                uppercaseCount++;
            }
        }
        System.out.println("Số ký tự nguyên âm: " + vowelsCount);
        System.out.println("Số ký tự in hoa: " + uppercaseCount);
    }
}
