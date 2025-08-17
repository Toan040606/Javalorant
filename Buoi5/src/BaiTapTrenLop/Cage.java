package BaiTapTrenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cage {
    Scanner sc = new Scanner(System.in);
    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    private static int totalCages = 0;
    private final int MAX_CAPACITY = 3;

    public Cage(String cageCode, ArrayList<Pet> pets) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = this.pets.size();
        Cage.totalCages++;
    }

    public Cage() {
        Cage.totalCages++;
    }

    public void addPet(Pet pet) {
        currentPetCount = pets.size();
        if (currentPetCount < MAX_CAPACITY) {
            System.out.print("Nhập tên: "); String name = sc.nextLine();
            System.out.print("Nhập cân nặng: "); double weight = sc.nextDouble();
            System.out.print("Nhập loài: "); String species = sc.nextLine();
            pets.add(new Pet(name, weight, species));
        } else {
            System.out.println("Lồng đã đầy. ");
        }
    }

    public void printAllPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    public void printOverWeightPets(){
        for (Pet pet : pets) {
            if (pet.isOverWeight()) {
                System.out.println(pet);
            }
        }
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public void setCurrentPetCount(int currentPetCount) {
        this.currentPetCount = currentPetCount;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }
}
