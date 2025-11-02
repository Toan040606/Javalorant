import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Nhập dãy số nguyên: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("--- Menu ---\n1. Tính tổng các phẩn tử trong mảng \n2. In ra phần tử lớn nhất, nhỏ nhất trong mảng \n3. Sắp xếp lại mảng theo chiều tăng dần \n4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra \"Không có\") \nNhập lựa chọn: ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println(Utils.sumOfArray(n, a));
                break;
            case 2:
                Utils.printMinMax(n, a);
                break;
            case 3:
                Utils.arrange(n, a);
                break;
            case 4:
                Utils.printPrime(a);
                break;
        }

}

