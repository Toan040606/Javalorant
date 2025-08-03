package Students;

import Students.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class managerStudent {
    public ArrayList<Student> Students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Nhập tên: ");
        String newName = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        int newBirth = sc.nextInt(); sc.nextLine();
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

    public void getList() {
        for (Student student : Students) {
            System.out.print(student + " ");
        }
    }

}
