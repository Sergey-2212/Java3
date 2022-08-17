package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> box = new ArrayList<>();
    private float weight = 0;
    private String typeOfBox;

    public void add(T a) {
        box.add(a);
        weight += a.getWeight();
        typeOfBox = a.getClass().getSimpleName();
        System.out.printf("Добавлен %s весом %s.\n", typeOfBox, a.getWeight());
    }

    public float getWeight() {
        return weight;
    }

    public boolean compare(Box<? extends Fruit> another) {
        if (this.weight == another.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void replaceItems(Box<? extends Fruit> another) {
        if (another.getWeight() == 0) {
            System.out.println("Ты принес пустую коробку!");
            return;
        } else if (this.typeOfBox.compareTo(another.typeOfBox) == 0) {
            for(Fruit fruit : another.box) {
                this.box.add((T) fruit);
                this.weight += fruit.getWeight();
            }
            another.box.clear();
            another.weight = 0;
            System.out.println("Фрукты перемещены.");
        } else {
            System.out.println("Этот ящик не подходит.");
        }
    }
}
