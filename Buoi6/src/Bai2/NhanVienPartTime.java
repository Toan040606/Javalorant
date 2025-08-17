package Bai2;

public class NhanVienPartTime extends NhanVien{
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(String maNV, String ten, int tuoi, String email, String soDienThoai, int soGioLam, double luongTheoGio) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public NhanVienPartTime(int soGioLam, double luongTheoGio) {
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong() {
        return this.soGioLam * this.luongTheoGio;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin1();
        System.out.println(", Loại: Part Time");
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }
}
