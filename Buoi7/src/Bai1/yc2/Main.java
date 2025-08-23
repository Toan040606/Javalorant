package Bai1.yc2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movable> moveable = new ArrayList<>();
        moveable.add(new Car());
        moveable.add(new Bike());

        moveable.get(0).move();
        moveable.get(1).move();
    }
}
