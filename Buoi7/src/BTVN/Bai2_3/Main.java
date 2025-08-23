package BTVN.Bai2_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("1", "nam", 8.4, 6, "nam@gmail.com", "ktpm01", "aa"));
        students.add(new Student("2", "hà", 6.7, 6, "ha@gmail.com", "ktpm02", "aa"));
        students.add(new Student("3", "khánh", 10, 6, "khanh@gmail.com", "ktpm03", "aa"));
        students.add(new Student("4", "Châu", 2, 6, "chau@gmail.com", "ktpm04", "aa"));
        students.add(new Student("5", "Sơn", 5.7, 6, "son@gmail.com", "ktpm05", "aa"));

        StudentManager studentManager = new StudentManager(students);

        System.out.println("===== QUẢN LÝ HỌC SINH =====");
        System.out.println("1. In danh sách học sinh");
        System.out.println("2. Sắp xếp theo điểm giảm dần");
        System.out.println("3. Sắp xếp theo điểm tăng dần");
        System.out.println("4. Tìm học sinh theo tên");
        System.out.println("5. Thoát");

        while (true) {
            System.out.print("Chọn chức năng: "); int cn = sc.nextInt(); sc.nextLine();
            switch (cn) {
                case 1:
                    studentManager.printStudents();
                    break;
                case 2:
                    studentManager.sortByScoreDesc();
                    break;
                case 3:
                    studentManager.sortByScoreAsc();
                    break;
                case 4:
                    System.out.print("Nhập tên học sinh: "); String name = sc.nextLine();
                    studentManager.findByName(name);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
