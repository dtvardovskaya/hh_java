package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное положительное число:");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.err.println("Число должно быть целое положительное");
            return;
        }

        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int units = number % 10;
        if (number > 500) {
            number = units * 100 + tens * 10 + hundreds;
        } else {
            number = hundreds * 100 + units * 10 + tens;
        }
        System.out.println(number);
    }
}