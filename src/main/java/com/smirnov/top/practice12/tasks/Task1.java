package com.smirnov.top.practice12.tasks;

public class Task1 {
    public static int sum (int[] array) {
        int result = 0;

        /*for (int num : array) {
            result += num;
        }*/

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }
}
