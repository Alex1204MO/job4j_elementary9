package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        int dlina = array.length;
        for (int i = 0; i < dlina / 2; i++) {
            int v = array[i];
            int j = dlina - 1 - i;
            array[i] = array[j];
            array[j] = v;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5};
        int[] rsl = back(arry);
        for (int index = 0; index < 1; index++) {
            System.out.println(Arrays.toString(arry));
        }
    }
}
