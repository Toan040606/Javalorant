package Bai1;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<SinhVien> sv = new ArrayList<>();
        sv.add(new SinhVien("2024606366", "Trần Khánh Toàn", 3.2, new LopHoc("2024DHKTPM03", "KTPM03")));
        sv.add(new SinhVien("2024604234", "Trần Mạnh Dũng", 3.9, new LopHoc("2024DHKTPM03", "KTPM03")));
        sv.add(new SinhVien("2024606346", "Trần Tiến Khánh", 2.86, new LopHoc("2024DHKTPM03", "KTPM03")));

        double max = sv.getFirst().getDiemTB();

        for (int i=0; i<3; i++) {
            sv.get(i).inThongTin();
            if (max < sv.get(i).getDiemTB()) {
                max = sv.get(i).getDiemTB();
            }
        }

        System.out.println();

        for (int i=0; i<3; i++) {
            if (max == sv.get(i).getDiemTB()) {
                sv.get(i).inThongTin();
                break;
            }
        }
    }
}