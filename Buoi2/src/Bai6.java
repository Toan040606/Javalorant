import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int numberOfStudents = sc.nextInt();

        String[] nameArr = new String[numberOfStudents];
        int[] ageArr = new int[numberOfStudents];
        double[] gpaArr = new double[numberOfStudents];

        System.out.println("Nhập thông tin sinh viên theo thứ tự Tên - Tuổi - Điểm Trung Bình: ");
        for (int i=0; i<numberOfStudents; i++) {
            nameArr[i] = sc.next();
            ageArr[i] = sc.nextInt();
            gpaArr[i] = sc.nextDouble();
        }

        double max = 0;
        double sum = 0;
        for (int i=0; i<numberOfStudents; i++) {
            System.out.println("Sinh viên thứ " + (i+1) + ":");
            System.out.print("Tên: " + nameArr[i]);
            System.out.println();
            System.out.print("Tuổi: " + ageArr[i]);
            System.out.println();
            System.out.print("GPA: " + gpaArr[i]);
            System.out.println();

            sum += gpaArr[i];

            if (max < gpaArr[i]) {
                max = gpaArr[i];
            }
        }
        System.out.println("Điểm trung bình của cả lớp: " + (sum/numberOfStudents));

        for (int i=0; i<numberOfStudents; i++) {
            if (gpaArr[i] == max) {
                System.out.println("Sinh viên có điểm cao nhất là bạn: " + nameArr[i] + ", Tuổi: " + ageArr[i] + ", GPA: " + gpaArr[i]);
            }
        }
    }
}
