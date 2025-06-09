package OthersProgramm;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<18){
            System.out.println("Вы несовершеннолетний.");
        }else System.out.println("Вы совершеннолетний.");
    }
}
