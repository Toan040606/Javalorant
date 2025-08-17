import Students.Student;
import Students.managerStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1_Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        managerStudent manager = new managerStudent();
        int n = 5;
        ArrayList<Student> s = new ArrayList<>();

        s.add(new Student("Nam", 2002, "Thái Bình", 8.3, 8.6, 6, 0));
        s.add(new Student("Hà", 2003, "Hải Dương", 7.3, 8.9, 7.3, 2));
        s.add(new Student("Thảo", 2004, "Bắc Giang", 8.3, 8.6, 6, 3));
        s.add(new Student("Thư", 2005, "Hà Nội", 8.1, 9.3, 6.7, 1));
        s.add(new Student("Thuỷ", 2006, "Tuyên Quang", 10, 10, 10, 0));

        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-18s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");

        for (int i=0; i<n; i++) {
            System.out.printf("%-10s%-10d%-15s%-12.1f%-12.1f%-15.1f%-10.2f%-18d\n",
                s.get(i).getName(), s.get(i).getAge(), s.get(i).getAddress(), s.get(i).getPoint1(), s.get(i).getPoint2(), s.get(i).getFinalPoint(), s.get(i).getGPA(), s.get(i).getOffSchool());
        }

        while (true) {
            System.out.println();
            System.out.println("------ MENU ------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xem danh sách");
            System.out.println("3. Sắp xếp theo tuổi");
            System.out.println("4. Sắp xếp theo GPA");
            System.out.println("5. Sắp xếp theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    n++;
                    manager.addStudent(s);
                    break;
                case 2:
                    manager.getList(s, n);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.print("Nhập tên, tuổi, địa chỉ của sinh viên cần xóa: ");
                    String name = sc.next();
                    int age = sc.nextInt();
                    String address = sc.nextLine();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
