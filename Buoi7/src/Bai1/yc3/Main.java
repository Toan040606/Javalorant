package Bai1.yc3;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};

        for (int i=0; i<3; i++)
            animals[i].makeSound();
    }
}
