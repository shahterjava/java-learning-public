import java.util.Random;
import java.util.Scanner;

public class GuessUtilWin {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int value = random.nextInt(1,11);
        System.out.println("Программа загадала число в диапозоне от 1 до 10, " +
                "ваша задача угадать, что это за число!");
        int count = 0;
        while(true){
            count = count;
            count++;
            System.out.println("Введите число:");
            int userValue = scanner.nextInt();
            if(userValue == value){
                System.out.println("Поздравляю, вы угадали! Количество попыток:"+ count);
                break;
            } else if (userValue < value) {
                System.out.println("Ваше число меньше, чем загаданное!");
            }else{
                System.out.println("Ваше число больше, чем загаданное!");
            }

        }
    }
}
