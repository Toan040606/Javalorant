package BaiTapTrenLop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pet petA1 = new Pet("Mèo", 20, "dog");
        Pet petA2 = new Pet("Chim", 4, "bird");
        Pet petA3 = new Pet("Đại Bàng", 14, "pig");

        Pet petB1 = new Pet("Chó", 10, "cat");
        Pet petB2 = new Pet("Bro", 5, "chicken");
        Pet petB3 = new Pet("Chó", 3, "snake");

        ArrayList<Pet> petsA = new ArrayList<>();
        ArrayList<Pet> petsB = new ArrayList<>();

        petsA.add(petA1);
        petsA.add(petA2);
        petsA.add(petA3);

        petsB.add(petB1);
        petsB.add(petB2);
        petsB.add(petB3);

        Cage cageA = new Cage("WTF", petsA);
        Cage cageB = new Cage("WTH", petsB);

        System.out.println("Số lồng đã tạo: " + Cage.getTotalCages());
        System.out.println("Danh sách thú trong từng lồng: ");
        cageA.printAllPets();
        cageB.printAllPets();
        System.out.println("Danh sách thú nặng hơn 10kg: ");
        cageA.printOverWeightPets();
        cageB.printOverWeightPets();
    }
}