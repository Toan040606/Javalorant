package BTVN.Bai2;

import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May() {

    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã máy: "); this.maMay = sc.nextLine();
        System.out.print("Nhập tên máy: "); this.tenMay = sc.nextLine();
        System.out.print("Nhập tình trạng máy: "); this.tinhTrang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Mã máy: " + this.maMay);
        System.out.println("Tên máy: " + this.tenMay);
        System.out.println("Tình trạng: " + this.tinhTrang);
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
