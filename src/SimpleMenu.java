import java.time.LocalDate;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        System.out.println("Выберите действие:");
        System.out.println("1.Сказать привет.");
        System.out.println("2.Показать дату.");
        System.out.println("3.Выход.");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if(value == 1){
            System.out.println("Привет");
        }else if (value == 2) {
            System.out.println(LocalDate.now());
        }else if (value == 3){
            System.out.println("Выход из программы...");
        }
    }
}
