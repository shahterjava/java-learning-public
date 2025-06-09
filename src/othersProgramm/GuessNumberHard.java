package OthersProgramm;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberHard {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(0,11);
        System.out.println("Программа загадала число в интервале от 0 до 10," +
                " попробуйте угадать это число!");

        for (int i = 0; i <3 ; i++) {
            System.out.println("Введите число!");
            Scanner scanner = new Scanner(System.in);
            int userValue = scanner.nextInt();
            if(userValue == value){
                System.out.println("Поздравляю, вы угадали число!");
                break;
            }else if(userValue<value) {
                System.out.println("Повторите попытку! Загаданное число больше того," +
                        " что вы ввели!");
            }else{
                System.out.println("Повторите попытку! Загаданное число меньше того," +
                        " что вы ввели!");
            }
        }
        System.out.println("Загаданное программой число было: "+value+ "!");
    }
}
