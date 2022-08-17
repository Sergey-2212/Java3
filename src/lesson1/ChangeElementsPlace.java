package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeElementsPlace {
    private static Integer[] array;

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        System.out.println("Исходный массив - " + Arrays.toString(array));
        moving(array);
        System.out.println("Измененый массив - " + Arrays.toString(array));
        List<Integer> list= arrayToArrayList(array);
        System.out.println("Созданный ArrayList - " + Arrays.toString(list.toArray()));

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

    public static ArrayList arrayToArrayList(Integer[] array) {
        if (array.length >= 1) {
           ArrayList<Integer> list = new ArrayList<>();
            for (Integer a : array) {
                list.add(a);
            }
            return list;
        } else {
            return new ArrayList<Integer>();
        }
    }
}
