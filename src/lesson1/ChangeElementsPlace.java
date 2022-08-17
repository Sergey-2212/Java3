package lesson1;

import java.util.Arrays;

public class ChangeElementsPlace {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        System.out.println("Исходный массив - " + Arrays.toString(array));
        moving(array);
        System.out.println("Измененый массив - " + Arrays.toString(array));

    }

    public static void moving(Integer[] array) {
        if (array.length >= 2) {
            Integer temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        } else {
            System.out.println("Переданный массив содержит менее 2-х элементовю");
        }
    }

}
