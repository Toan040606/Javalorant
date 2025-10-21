public class Main {
    public static void reversedPrint() {
        for (int i = 4; 0 <= i; i--) {
            System.out.println(Mang.sArr[i]);
        }
    }

    public static void main(String[] args) {
        Mang.print();
        System.out.println();
        reversedPrint();
    }
}
