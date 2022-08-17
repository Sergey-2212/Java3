package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    List<T> box = new ArrayList<>();
    Float weight;

    public void add(Fruit a) {

        weight += a.getWeight();
    }

    public  Float getWeight() {
        return weight;
    }
}
