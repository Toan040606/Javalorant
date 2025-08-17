package Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> nv = new ArrayList<>();
        nv.add(new NhanVienFullTime("124", "b", 12, "asdko@gmail.com", "0123123213", 12, 5));
        nv.add(new NhanVienPartTime("125", "c", 12, "asdko@gmail.com", "0123123213", 3, 5));
        nv.add(new NhanVienPartTime("126", "d", 12, "asdko@gmail.com", "0123123213", 5, 5));

        QuanLyNhanVien ql = new QuanLyNhanVien(nv);

        ql.themNhanVien(new NhanVienFullTime("123", "a", 12, "asdko@gmail.com", "0123123213", 12, 5));

        ql.hienThiTatCa();
        ql.tinhTongLuong();
    }
}
