package org.example;

/*
Напишите программу, которая выводит на экран все трехзначные числа, для которых соблюдаются два условия:
• само число заканчивается на 0;
• сумма нечетных делителей этого числа тоже заканчивается на 0.

 */
public class Main {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int sumOfDivisors = getSumOfDivisors(i);
            if (i % 10 == 0 && sumOfDivisors % 10 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getSumOfDivisors(int number) {
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0 && i % 2 != 0) {
                sum += i;
            }
        }
        if (number % 2 != 0) {
            sum += number;
        }
        return sum;
    }
}