package com.smirnov.top.practice12;

import com.smirnov.top.practice12.tasks.Task1;
import com.smirnov.top.practice12.tasks.Task2;
import com.smirnov.top.practice12.tasks.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -5, 14};
        System.out.println(Task1.sum(array));

        System.out.println(Task2.max(array));

        System.out.println(Arrays.toString(Task3.element(array)) );
    }


}
