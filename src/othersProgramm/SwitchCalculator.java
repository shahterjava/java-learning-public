package othersProgramm;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор!");
        System.out.println("Введите первое число:");
        int operandOne = scanner.nextInt();
        System.out.println("Введите второе число:");
        int operandTwo = scanner.nextInt();
        System.out.println("Выберите операцию от 1 до 4");
        System.out.println("Где:");
        System.out.println("1. Сложить.");
        System.out.println("2. Вычесть.");
        System.out.println("3. Умножить.");
        System.out.println("4. Разделить.");
        int operation = scanner.nextInt();
        switch (operation){
            case 1 -> System.out.println("Готовый результат:"+ (operandOne+ operandTwo));
            case 2 -> System.out.println("Готовый результат:"+ (operandOne- operandTwo));
            case 3 -> System.out.println("Готовый результат:"+ (operandOne* operandTwo));
            case 4 -> System.out.println("Готовый результат:"+ (operandOne/ operandTwo));
            default -> System.out.println("Вы ввели некорректное значение для операции!");

        };
    }
}
