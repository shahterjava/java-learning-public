package exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        try{
            int firstValue = scanner.nextInt();
            System.out.print("Введите второе число:");
            int secondValue = scanner.nextInt();
            System.out.println(firstValue/secondValue);
        }catch (InputMismatchException e){
            System.out.println("Вы ввели не число!");
        } catch(ArithmeticException e){
            System.out.println("Нельзя делить на ноль!");
        }finally {
            System.out.println("Программа завершена!");
        }
    }
}
