package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> todos = new ArrayList<>();
        todos.add("Выучить List");
        todos.add("Сделать commit");
        todos.add("Отправить репозиторий.");

        System.out.println("Все задачи:");
        for (String todo : todos) {
            System.out.println("- " + todo );
        }

        todos.remove("Сделать commit");
        System.out.println("\nПосле удаления:");
        for (String todo : todos) {
            System.out.println("- " + todo );
        }
    }
}
