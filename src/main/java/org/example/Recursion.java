package org.example;

import java.util.Arrays;
import java.util.Random;

/*
Задан массив чисел A. Разработать рекурсивную функцию, которая находит сумму элементов массива.
При решении этой задачи нельзя использовать строки, списки, циклы.
Разрешена только рекурсия и целочисленная арифметика.
 */
public class Recursion {


    public static void main(String[] args) {
        int[] array = fillArray();
        System.out.println(getSumArray(array, array.length - 1));
    }

    static int[] fillArray(){
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    static int getSumArray(int[] array, int i){
        if (i == 0){
            return array[i];
        } else {
            return array[i] + getSumArray(array, i - 1);
        }
    }
}
