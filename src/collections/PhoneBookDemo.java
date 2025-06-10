package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PhoneBookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("Дмитрий", "+7 900 332 1233");
        phoneBook.put("Андрей", "+7 901 221 2322");
        phoneBook.put("Федор", "+7 996 121 1311");
        phoneBook.put("Мария", "+7 923 112 2311");
        phoneBook.put("Елена", "+7 905 113 4552");

        for (Map.Entry<String,String> map: phoneBook.entrySet()) {
            System.out.println(map);
        }
        System.out.print("Введите имя пользователя: ");
        String name = scanner.nextLine();
        if(phoneBook.containsKey(name)){
            System.out.println(name + " Номер телефона:"+ phoneBook.get(name));
        }else{
            System.out.println("Аккаунт не найден.");
        }

    }
}
