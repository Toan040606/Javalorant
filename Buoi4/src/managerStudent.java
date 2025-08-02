package manager;

import Students.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class managerStudent {
    private ArrayList<Student> Students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void StudentsHere() {
        Students.add(new Student("Nam", 2002, "Thái Bình", 8.3, 8.6, 6, 0));
        Students.add(new Student("Hà", 2003, "Hải Dương", 7.3, 8.9, 7.3, 2));
        Students.add(new Student("Thảo", 2004, "Bắc Giang", 8.3, 8.6, 6, 3));
        Students.add(new Student("Thư", 2005, "Hà Nội", 8.1, 9.3, 6.7, 1));
        Students.add(new Student("Thuỷ", 2006, "Tuyên Quang", 10, 10, 10, 0));
    }

    public void addStudent() {
        System.out.print("Nhập tên: ");
        String newName = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        int newBirth = sc.nextInt();
        System.out.print("Nhập địa chỉ: ");
        String newAddress = sc.nextLine();
        System.out.print("Nhập điểm TX1: ");
        double newPoint1 = sc.nextDouble();
        System.out.print("Nhập điểm TX2: ");
        double newPoint2 = sc.nextDouble();
        System.out.print("Nhập điểm KTHP: ");
        double newFinalPoint = sc.nextDouble();
        System.out.print("Nhập số tiết nghỉ: ");
        int newOffSchool = sc.nextInt();

        Students.add(new Student(newName, newBirth, newAddress, newPoint1, newPoint2, newFinalPoint, newOffSchool));
        System.out.println("Đã thêm sinh viên.");
    }
}
