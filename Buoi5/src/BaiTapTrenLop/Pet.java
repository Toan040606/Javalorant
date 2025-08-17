package BaiTapTrenLop;

public class Pet {
    private final int overWeight = 10;
    private String name;
    private double weight;
    private String species;

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public Pet() {

    }

    public void printInfo() {
        System.out.println(this.name + " " + this.weight + " " + this.species);
    }

    public boolean isOverWeight() {
        return this.weight > overWeight;
    }


    public void getBasicInfo() {
        System.out.println(this.name + " " + this.weight);
    }

    @Override
    public String toString() {
        return "Tên: " + name + ' ' +
                ", Cân nặng: " + weight +
                ", Loài: " + species + ' ';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
