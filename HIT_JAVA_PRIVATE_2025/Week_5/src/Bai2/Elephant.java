package Bai2;

public class Elephant extends Animal{
    private double trunkLength;

    public Elephant() {
    }

    public Elephant(String id, String name, int age) {
        super(id, name, age);
    }

    public Elephant(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    public Elephant(String id, String name, int age, double trunkLength) {
        super(id, name, age);
        this.trunkLength = trunkLength;
    }

    @Override
    public String makeSound() {
        return "Ù ò ò!!";
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", Elephant{" +
                "trunkLength=" + trunkLength +
                '}';
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "trunkLength=" + trunkLength +
                '}';
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }
}
