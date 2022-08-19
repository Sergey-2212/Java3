package lesson1;

import java.util.Random;

public class Apple implements Fruit {
    private float weight;

    public Apple() {
        this.weight = (float) Math.random()*5;
    }

    public float getWeight() {
        return weight;
    }
}
