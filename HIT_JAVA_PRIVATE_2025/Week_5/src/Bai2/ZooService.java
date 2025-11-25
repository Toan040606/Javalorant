package Bai2;

import java.util.ArrayList;

public class ZooService {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void showAllAnimals() {
        animals.forEach(s -> System.out.println(s.showInfo() + '\n' + s.makeSound()));
    }

    public void findAnimalByName(String name){
        animals.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .forEach(s -> System.out.println(s.showInfo()));
    }

    public void ageAt10() {
        animals.stream()
                .filter(s -> s.getAge() >= 10)
                .forEach(s -> System.out.println(s.showInfo()));
    }


}
