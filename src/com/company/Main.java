package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {1.1, -32.2, 45.7, 27.6, -9.1, 32.2, 45.4, -27.5, 9.1, 32.2, -45.4, 27.9, -7.7, 8.8, -9, 4};
        double res = 0;
        int b = 0;
        boolean c = false;

        for (double j : array) {
            if (j > 0 && c) {
                res += j;
                b++;
                System.out.println(j);
            } else {
                c = true;
                continue;
            }

        }
        System.out.println(res / b);

        System.out.println();
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double num = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = num;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
        System.out.println(Arrays.toString(array));


    }
}
