package Bai2;

import java.util.ArrayList;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> nv;

    public QuanLyNhanVien(ArrayList<NhanVien> nv) {
        this.nv = nv;
    }

    public QuanLyNhanVien() {

    }

    public void themNhanVien(NhanVien nv) {
        this.nv.add(nv);
    }

    public void hienThiTatCa() {
        for (NhanVien a : nv) {
            a.hienThiThongTin();
        }
    }

    public void tinhTongLuong() {
        double sum = 0;
        for (NhanVien a : nv) {
            sum += a.tinhLuong();
        }
        System.out.println(sum);
    }

    public ArrayList<NhanVien> getNv() {
        return nv;
    }

    public void setNv(ArrayList<NhanVien> nv) {
        this.nv = nv;
    }
}
