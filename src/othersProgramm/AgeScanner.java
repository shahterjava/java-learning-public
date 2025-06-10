package othersProgramm;

import java.util.Scanner;

public class AgeScanner {
    public static void main(String[] args) {
        System.out.println("Введите текущий год:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("Введите ваш год рождения:");
        Scanner scanner2 = new Scanner(System.in);
        int yearOfBirth = scanner2.nextInt();
        System.out.println("Ваш возраст: " + (year-yearOfBirth) + "!");

    }
}
