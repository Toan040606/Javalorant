public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương của số 5: ");
        int i;
//      Bảng cửu chương của số 5 với vòng lặp while
//      while(i <= 10) {
//          System.out.print("5 x " + i + " = " + 5*i);
//          System.out.println();
//          i++;
//      }

//      Bảng cửu chương của số 5 với vòng lặp for
        for (i = 1; i<=10; i++) {
            System.out.print("5 x " + i + " = " + 5*i);
            System.out.println();
        }


        System.out.println();
//        Tổng các số chẵn từ 1-100 với vòng lặp while
//        int sum = 0;
//        int i = 1;
//        while(i<=100) {
//            if (i%2==0) {
//                sum += i;
//            }
//        }

//      Tổng các số chẵn từ 1-100 với vòng lặp for
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i%2==0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn từ 1-100 là: " + sum);
    }
}
