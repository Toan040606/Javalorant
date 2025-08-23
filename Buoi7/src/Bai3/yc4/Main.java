package Bai3.yc4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Playable> playable = new ArrayList<>();
        playable.add(new Piano());
        playable.add(new Guitar());

        playable.get(0).play();
        playable.get(1).play();
    }
}
