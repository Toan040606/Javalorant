//Cần lắm cứu bài 2 ;-;
//HELP ME!!!
import Students.Student;
import manager.managerStudent;
import java.util.Scanner;

public class Bai2_Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        managerStudent manager = new managerStudent();
        int n = 5;
        manager.StudentsHere();
        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-18s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");

        for (int i=0; i<n; i++) {
            System.out.printf("%-10s%-10d%-15s%-12.1f%-12.1f%-15.1f%-10.2f%-18d\n",
                    s[i].getName(), s[i].getAge(), s[i].getAddress(), s[i].getPoint1(), s[i].getPoint2(), s[i].getFinalPoint(), s[i].getGPA(), s[i].getOffSchool());
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
                    manager.addStudent();
                    break;
                case 2:

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
                    String address = sc.next();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
