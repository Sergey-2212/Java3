package lesson1;

public class Orange implements Fruit {
    private float weight;

    public Orange() {
        this.weight = (float) Math.random()*5;
    }

    public float getWeight() {
        return weight;
    }
}


