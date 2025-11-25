package Bai2;

public class Lion extends Animal{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Lion() {

    }

    public Lion(String id, String name, int age) {
        super(id, name, age);
    }

    public Lion(double weight) {
        this.weight = weight;
    }

    public Lion(String id, String name, int age, double weight) {
        super(id, name, age);
        this.weight = weight;
    }

    @Override
    public String makeSound() {
        return "Gào!!!";
    }

    @Override
    public String toString() {
        return "Lion{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", Lion{" +
                "weight=" + weight +
                '}';
    }
}
