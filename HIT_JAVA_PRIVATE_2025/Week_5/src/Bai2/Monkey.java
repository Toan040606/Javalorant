package Bai2;

public class Monkey  extends Animal{
    private String favoriteFruit;

    public Monkey() {
    }

    public Monkey(String id, String name, int age) {
        super(id, name, age);
    }

    public Monkey(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }

    public Monkey(String id, String name, int age, String favoriteFruit) {
        super(id, name, age);
        this.favoriteFruit = favoriteFruit;
    }

    @Override
    public String makeSound() {
        return "Chít chít!";
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", Monkey{" +
                "favoriteFruit='" + favoriteFruit + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "favoriteFruit='" + favoriteFruit + '\'' +
                '}';
    }

    public String getFavoriteFruit() {
        return favoriteFruit;
    }

    public void setFavoriteFruit(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }
}
