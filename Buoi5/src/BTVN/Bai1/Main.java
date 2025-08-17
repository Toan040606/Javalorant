package BTVN.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số học sinh: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Nhập tên học sinh thứ " + (i+1) + ": "); String name = sc.nextLine(); name = sc.nextLine();
            System.out.print("Nhập lớp: "); String Class = sc.nextLine();
            System.out.print("Nhập điểm: "); double score = sc.nextDouble();
            student.add(new Student(name, Class, score));
            student.get(i).input();
        }

        for (int i=0; i<n; i++) {
            System.out.print(student.get(i).toString());
            student.get(i).output();
        }
    }
}
