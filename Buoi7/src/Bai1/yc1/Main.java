package Bai1.yc1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = {new Circle(4), new Rectangle(4,2)};

        System.out.println("Diện tích hình tròn: " + shape[0].area());
        System.out.println("Diện tích hình chữ nhật: " + shape[1].area());
    }
}