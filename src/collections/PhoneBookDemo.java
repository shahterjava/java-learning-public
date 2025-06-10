package collections;

import java.util.*;


public class PhoneBookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.putIfAbsent("Дмитрий", new ArrayList<>());
        phoneBook.get("Дмитрий").add("+7 923 411 23 32");
        phoneBook.get("Дмитрий").add("+7 906 424 23 22");
        phoneBook.putIfAbsent("Андрей", new ArrayList<>());
        phoneBook.get("Андрей").add("+7 911 425 23 22");
        phoneBook.putIfAbsent("Федор", new ArrayList<>());
        phoneBook.get("Федор").add("+7 945 414 23 22");
        phoneBook.get("Федор").add("+7 943 414 23 22");
        phoneBook.putIfAbsent("Мария", new ArrayList<>());
        phoneBook.get("Мария").add("+7 932 624 23 22");
        phoneBook.putIfAbsent("Елена", new ArrayList<>());
        phoneBook.get("Елена").add("+7 916 424 23 22");



        for (Map.Entry<String,List<String>> map: phoneBook.entrySet()) {
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
