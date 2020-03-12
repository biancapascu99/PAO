package com.company;

import java.util.Arrays;

public class Problema9 {
    public static int[] findIndex(int[] array, int x) {

        int pozitie = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                pozitie = i;
                break;
            }
        }
        return Arrays.copyOfRange(array, pozitie, array.length);
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 9, 12, 22, 7, 20};
        int x = 9;
        int[] result = findIndex(array, x);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }
}
