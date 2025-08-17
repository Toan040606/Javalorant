package BTVN.Bai2;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {

    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("----Nhập thông tin phòng máy---- ");
        System.out.print("Nhập mã phòng: "); this.maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: "); this.tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích phòng: "); this.dienTich = sc.nextDouble();

        x = new QuanLy();
        System.out.println("\n----Nhập thông tin quản lý----");
        x.nhap();

        System.out.print("\nNhập số lượng máy trong phòng: "); this.n = sc.nextInt();

        y = new May[n];

        for (int i=0; i<n; i++) {
            System.out.println("\n----Nhập thông tin máy thứ " + (i+1) + "----");
            y[i] = new May();
            y[i].nhap();
        }
    }

    public void xuat() {
        System.out.println("----Thông tin phòng máy----");
        System.out.println("Mã phòng: " + this.maPhong);
        System.out.println("Tên phòng: " + this.tenPhong);
        System.out.println("Diện tích: " + this.dienTich + " m2");

        System.out.println("\n----Thông tin quản lý:----");
        x.xuat();

        for (int i = 0; i < n; i++) {
            System.out.println("\n----Thông tin máy thứ " + (i + 1) + "----");
            y[i].xuat();
        }
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
