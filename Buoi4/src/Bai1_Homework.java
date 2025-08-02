import Students.Student;

public class Bai1_Homework {
    public static void main(String[] args) {
        int n = 5;
        Student[] s = new Student[n];
        s[0] = new Student("Nam", 2002, "Thái Bình", 8.3, 8.6, 6, 0);
        s[1] = new Student("Hà", 2003, "Hải Dương", 7.3, 8.9, 7.3, 2);
        s[2] = new Student("Thảo", 2004, "Bắc Giang", 8.3, 8.6, 6, 3);
        s[3] = new Student("Thư", 2005, "Hà Nội", 8.1, 9.3, 6.7, 1);
        s[4] = new Student("Thuỷ", 2006, "Tuyên Quang", 10, 10, 10, 0);

        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-18s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");

        for (int i=0; i<n; i++) {
            System.out.printf("%-10s%-10d%-15s%-12.1f%-12.1f%-15.1f%-10.2f%-18d\n",
                s[i].getName(), s[i].getAge(), s[i].getAddress(), s[i].getPoint1(), s[i].getPoint2(), s[i].getFinalPoint(), s[i].getGPA(), s[i].getOffSchool());
        }
    }
}
