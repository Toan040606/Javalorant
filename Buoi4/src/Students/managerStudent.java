package Students;

import Students.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class managerStudent {
    private Scanner sc = new Scanner(System.in);

    public void addStudent(ArrayList<Student> s) {
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

        s.add(new Student(newName, newBirth, newAddress, newPoint1, newPoint2, newFinalPoint, newOffSchool));
        System.out.println("Đã thêm sinh viên.");
    }

    public void getList(ArrayList<Student> s, int n) {
        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-18s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");

        for (int i=0; i<n; i++) {
            System.out.printf("%-10s%-10d%-15s%-12.1f%-12.1f%-15.1f%-10.2f%-18d\n",
                    s.get(i).getName(), s.get(i).getAge(), s.get(i).getAddress(), s.get(i).getPoint1(), s.get(i).getPoint2(), s.get(i).getFinalPoint(), s.get(i).getGPA(), s.get(i).getOffSchool());
        }
    }
}
