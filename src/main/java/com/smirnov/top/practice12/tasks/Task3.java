package com.smirnov.top.practice12.tasks;

import javax.swing.*;

public class Task3 {
    public static int[] element (int[] array) {

        int[] result = new int [4];
        int even = 0;
        int odd = 0;
        int plus = 0;
        int minus = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
            if (array[i] >= 0) {
                plus++;
            }
            else {
                minus++;
            }
        }
        result[0] = even;
        result[1] = odd;
        result[2] = plus;
        result[3] = minus;
        return result;
    }
}
