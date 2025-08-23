package Bai3.yc3;

public class Circle extends Shape {
    private double banKinh;
    private final double PI = 3.14;

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double area(){
        return PI*banKinh*banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
}
