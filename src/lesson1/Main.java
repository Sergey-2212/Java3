package lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Box<Orange> box1 = new Box<>();
    Box<Apple> box2 = new Box<>();
    Box<Orange> box3 = new Box<>();
    box1.add(new Orange());
    box1.add(new Orange());
    box2.add(new Apple());
    box2.add(new Apple());
    box3.add(new Orange());
    box3.add(new Orange());
        System.out.println(box1.compare(box2));
        System.out.println(box2.compare(box3));
        box1.replaceItems(box2);
        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());
        box1.replaceItems(box3);
        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());



    }
}
