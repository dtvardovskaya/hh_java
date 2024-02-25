package org.example;
/*
В инструкции по пользованию лифтом в торговом центре написано: «Не более 6 человек или не более 450 кг».
Перед входом в лифт установлен прибор, который подсчитывает входящих в лифт и определяет вес до входа в лифт.
Прибор автоматически прекращает доступ к лифту, если вход очередного человека может нарушить инструкцию. Напишите программу,
которая принимает с клавиатуры значения, каждое из которых - вес очередного человека, входящего в лифт.
Ввод данных продолжается до тех пор, пока соблюдается требование, указанное в инструкции.
Программа должна выводить на экран следующую итоговую информацию:
• количество людей, вошедших в лифт;
• общий их вес;
• причина, по которой прекращен вход людей в лифт.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfPeople = 0;
        int totalWeight = 0;
        String error;
        while (true) {
            System.out.println("Введите вес:");
            int weight = scanner.nextInt();
            if (weight < 0) {
                System.out.println("Вес должен быть положительным");
                continue;
            }

            if (totalWeight + weight > 450) {
                error = "Превышен общий вес!";
                break;
            } else if (amountOfPeople + 1 > 6) {
                error = "Превышено общее допустимое количество людей";
                break;
            } else {
                amountOfPeople++;
                totalWeight += weight;
            }
        }
        System.out.printf("количество людей, вошедших в лифт: %d \n", amountOfPeople);
        System.out.printf("общий вес: %d \n", totalWeight);
        System.out.printf("причина, по которой прекращен вход людей в лифт: \n%s", error);
    }
}