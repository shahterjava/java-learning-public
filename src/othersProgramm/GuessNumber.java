package othersProgramm;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(0,11);
        System.out.println("Программа загадала число, угадайте!");
        Scanner scanner = new Scanner(System.in);
        int userValue = scanner.nextInt();
        if(userValue == value){
            System.out.println("Поздравляю, вы угадали!");
        }else{
            System.out.println("Вы не угадали, попробуйте в следующий раз!");
        }
    }
}
